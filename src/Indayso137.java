import java.util.Scanner;

public class Indayso137 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        int a=1;

        while ( a <= n){

            System.out.print( +a + " " );
            a = 2*a + 1;

        }
    }
}
