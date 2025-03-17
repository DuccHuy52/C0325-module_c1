import java.util.Scanner;

public class Sum1trenN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so nguyen n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for ( int i = 1; i<=n; i++ ){

            sum = sum + 1.0/  i;
        }
        System.out.println(" ket qua cua tong la: " + sum);

    }
}
