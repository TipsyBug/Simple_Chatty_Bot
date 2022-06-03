import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        System.out.println(word.substring(c1, c2 + 1));
    }
}
