import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after the integer input
        while (t-- > 0) {
            String s = scanner.nextLine();
            String ti = scanner.nextLine();
            String m = "";
            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == ti.charAt(i)) {
                    m += "G";
                }
                else {
                    m += "B";
                }
            }
            System.out.println(m);
        }
    }
}
