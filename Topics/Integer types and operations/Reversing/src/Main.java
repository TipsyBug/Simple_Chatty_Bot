import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int d1 = num / 100;
        int d2 = (num % 100) / 10;
        int d3 = (num % 100) % 10;
        if (d3 == 0) {
            System.out.print(d2);
            System.out.print(d1);
        } else {
            System.out.print(d3);
            System.out.print(d2);
            System.out.print(d1);
        }
    }
}