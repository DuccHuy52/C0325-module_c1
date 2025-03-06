import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ban kinh duong tron: ");
        double r  = scanner.nextDouble();

        double Pi = 3.14;

        double c  = 2 * r * Pi;
        double a = Pi * r * r ;

        System.out.println("chu vi hinh tron: " + c );
        System.out.println("dien tich hinh tron: " + a );


    }
}
