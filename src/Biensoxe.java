import java.util.Scanner;

public class Biensoxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so thu nhat: ");
        int A = scanner.nextInt();

        System.out.println("nhap so thu hai: ");
        int B = scanner.nextInt();

        System.out.println("nhap so thu ba: ");
        int C = scanner.nextInt();

        System.out.println("nhap so thu tu: ");
        int D = scanner.nextInt();

        System.out.println("nhap so thu nam: ");
        int E = scanner.nextInt();


        int sum = A + B + C + D + E;
        System.out.println("tong diem bien so: " + sum);


    }
}
