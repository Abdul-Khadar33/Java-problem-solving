import java.util.*;

public class Task6_7 {

    public static boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static int palindromeIndex(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                if(isPalindrome(s, left + 1, right))
                    return left;
                else
                    return right;
            }
            left++;
            right--;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();   // consume newline

        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            System.out.println(palindromeIndex(s));
        }
    }
}
