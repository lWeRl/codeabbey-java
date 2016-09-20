import java.util.Scanner;

public class Current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0, n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                b += sc.nextInt();
            }
        }
        System.out.println(b);
    }
}