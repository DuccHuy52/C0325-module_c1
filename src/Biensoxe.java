import java.util.Scanner;

public class Biensoxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap bien so xe: ");
        int n = scanner.nextInt();

        int sum = n % 10 ;
        n = n / 10;

        sum = sum + n % 10 ;
        n = n / 10 ;

        sum = sum + n % 10 ;
        n = n / 10 ;

        sum = sum + n ;
        int sonut = sum % 10;

        System.out.println("tong diem so nut la: " + sonut);

    }
}
