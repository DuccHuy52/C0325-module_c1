import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class PTbac2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap he so b: ");
        int b = scanner.nextInt();
        System.out.println("nhap he so c: ");
        int c = scanner.nextInt();

        if ( a!= 0)
        {
            double delta = b * b - 4 * a * c;
            if (delta < 0){
                System.out.println(" PT vo nghiem");
            }
            if( delta == 0){

                double x = -b / ( 2 * a );
                System.out.println(" ket qua cua x: " + x);
            }
            if (delta > 0){
                System.out.println(" PT co  2 nghiem phan biet: ");
                double x1 = (-b -Math.sqrt(delta))/ (2 * a);
                double x2 = (-b +Math.sqrt(delta))/ (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);



            }
        }

    }
}
