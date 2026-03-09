import java.util.*;

public class Task6_2 {

    public static boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {

                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < n / i; j++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean result = repeatedSubstringPattern(s);

        System.out.println(result);

        sc.close();
    }
}
