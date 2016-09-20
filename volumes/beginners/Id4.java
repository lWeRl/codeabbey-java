import java.util.Scanner;

public class Current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (sc.hasNextInt()) {
                a = sc.nextInt();
            }
            if (sc.hasNextInt()) {
                b = sc.nextInt();
            }
            if (a < b) {
                System.out.print(a + " ");
            } else {
                System.out.print(b + " ");
            }
        }
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        if (a < b) {
            System.out.print(a + " ");
        } else {
            System.out.print(b + " ");
        }
    }
}