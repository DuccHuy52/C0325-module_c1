import java.util.Scanner;

public class Indayso1am37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap so nguyen n: ");
        int n = scanner.nextInt();

        int a=1;
        int d=1;

        while ( a <= n){

            System.out.print(a * d + " ");
            a = a*2 +1;
            d=-d;
        }
    }
}
