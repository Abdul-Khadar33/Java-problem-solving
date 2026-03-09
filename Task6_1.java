import java.util.*;

public class Task6_1 {

    public static int stringSimilarity(String s) {

        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {

            int j = 0;

            while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
                j++;
            }

            total += j;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            String s = sc.nextLine();

            int result = stringSimilarity(s);

            System.out.println(result);
        }

        sc.close();
    }
}
