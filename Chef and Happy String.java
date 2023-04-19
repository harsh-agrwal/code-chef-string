import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            String s = scanner.nextLine();
            boolean happy = false;

            for (int i = 0; i < s.length() - 2; i++) {
                if (isVowel(s.charAt(i)) && isVowel(s.charAt(i+1)) && isVowel(s.charAt(i+2))) {
                    happy = true;
                    break;
                }
            }

            System.out.println(happy ? "HAPPY" : "SAD");
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
