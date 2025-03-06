import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        int a = scaner.nextInt();

        System.out.println("Nhap so thu hai: ");
        int b = scaner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;

        System.out.println("tong cua a va b: " + tong);
        System.out.println("hieu cua a va b: " + hieu);
        System.out.println("tich cua a va b: " + tich);
        System.out.println("thuong cua a va b: " + thuong);
    }
}
