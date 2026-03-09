import java.util.*;

public class Task6_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            boolean found = false;

            for (int i = 0; i < s1.length(); i++) {

                char ch = s1.charAt(i);

                if (s2.indexOf(ch) != -1) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
