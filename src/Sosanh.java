import java.util.Scanner;

public class Sosanh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap bien a: " );
        int a = scanner.nextInt();

        System.out.println(" nhap bien b: " );
        int b = scanner.nextInt();

        if ( a > b ) {
            System.out.println("so lon nhat la: " + a);
            System.out.println("so nho nhat la: " + b);
        }

            else{
                System.out.println("so lon nhat la: " + b);
                System.out.println("so nho nhat la: " + a);

            }

    }
}
