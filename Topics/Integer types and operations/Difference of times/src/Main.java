import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] time = new int[6];
        for (int i = 0; i < 6; i++) {
            time[i] = scanner.nextInt();
        }
        int sec1 = time[0] * 3600 + time[1] * 60 + time[2];
        int sec2 = time[3] * 3600 + time[4] * 60 + time[5];
        System.out.println(sec2 - sec1);
    }
}
