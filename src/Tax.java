import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten san pham: ");
        String name = scanner.nextLine();

        System.out.println("nhap so luong: ");
        int number = scanner.nextInt();

        System.out.println("nhap don gia: ");
        double price = scanner.nextDouble();

        double sum = number * price;
        System.out.println("tong tien san pham: " + sum);

        double VAT = sum * 0.1;
        System.out.println("ten san pham: " + name);
        System.out.println("tien thue la: " + VAT);







    }
}
