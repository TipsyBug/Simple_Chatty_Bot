import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine().replaceAll(" ", "");
        String st2 = scanner.nextLine().replaceAll(" ", "");
        System.out.println(st1.equals(st2));
    }
}
