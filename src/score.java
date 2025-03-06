import java.util.Scanner;

public class score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap diem toan: ");
        double toan = scanner.nextDouble();
        System.out.println("nhap he so toan: ");
        int hesotoan = scanner.nextInt();

        System.out.println(" nhap diem ly: ");
        double ly = scanner.nextDouble();
        System.out.println("nhap he so ly: ");
        int hesoly = scanner.nextInt();

        System.out.println("nhap diem hoa: ");
        double hoa = scanner.nextDouble();
        System.out.println("nhap he so hoa: ");
        int hesohoa = scanner.nextInt();

        int tongheso = hesotoan + hesoly + hesohoa;
        double diemtrungbinh = ( toan * hesotoan + ly * hesoly + hoa * hesohoa ) /tongheso;

        System.out.println("Diem trung binh 3 mon la: " + diemtrungbinh);


    }

}
