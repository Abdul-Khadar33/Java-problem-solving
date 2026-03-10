import java.util.*;

public class Task6_4 {

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String goal = sc.nextLine();

        boolean result = rotateString(s, goal);

        System.out.println(result);

        sc.close();
    }
}
