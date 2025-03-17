import java.util.Scanner;

public class Sum1tren2ntru1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so nguyen n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j < (2 * i - 1); j++) {
                fact *= j;
            }
            sum += 1.0 / fact;
        }

        System.out.print(" ket qua la: " + sum);
    }
}
