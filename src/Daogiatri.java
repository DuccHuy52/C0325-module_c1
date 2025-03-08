import java.util.Scanner;

public class Daogiatri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap bien a: ");
        int a = scanner.nextInt();

        System.out.println("nhap bien b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("sau khi dao gia tri, ket qua a la: " +a);
        System.out.println("sau khi dao gia tri, ket qua b la: " +b);
    }
}
