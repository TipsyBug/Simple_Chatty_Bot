import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (input.length() == 1) {
            System.out.println(0);
        } else {
            System.out.println(input.charAt(input.length() - 2));
        }
    }
}