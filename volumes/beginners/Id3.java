import java.util.Scanner;

public class Current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            a = 0;
            b = 0;
            if (sc.hasNextInt()) {
                a = sc.nextInt();
            }
            if (sc.hasNextInt()) {
                b = sc.nextInt();
            }
            System.out.print(a + b + " ");
        }
        a = 0;
        b = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        System.out.print(a + b);

    }
}