import java.util.Scanner;

public class LuongNV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tham nien cong tac: ");
        int TNCT = scanner.nextInt();
        int luongcanban = 650000;
        double hesoluong ;

        if (TNCT < 12){
            hesoluong = 1.92;
        }
        else if (TNCT < 36) {
            hesoluong = 2.34;
        }
        else if (TNCT<60) {
            hesoluong = 3;
        }
        else{
            hesoluong=4.5;
        }

        double luongNV = hesoluong * luongcanban;
        System.out.println("luon NV: " + luongNV);

    }
}
