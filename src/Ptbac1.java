import java.util.Scanner;

public class Ptbac1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap gia tri a: ");
        int a = scanner.nextInt();
        System.out.println("nhap gia tri b: ");
        int b = scanner.nextInt();
        double x;

        if( a == 0 ){
            if (b == 0){
                System.out.println("PT vo so nghiem");
            }
            else{
                System.out.println("PT vo nghiem");
            }
        }
        else{
            x = -b / a;
            System.out.println("ket qua x la: " + x);
        }
    }
}
