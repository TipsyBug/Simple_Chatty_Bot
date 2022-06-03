import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Math.round(scanner.nextDouble() / 2);
        double n2 = Math.round(scanner.nextDouble() / 2);
        double n3 = Math.round(scanner.nextDouble() / 2);
        int n = (int)(n1 + n2 + n3);
        System.out.println(n);
    }
}