import java.util.Scanner;

public class Datemonth {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println(" Nhap thang: ");
        int month = scaner.nextInt();
        System.out.println(" Nhap nam: ");
        int year = scaner.nextInt();

        int dayInMonth;
        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
         dayInMonth = 30;
         break;
            case 2:
                // Năm nhuận là năm chia hết cho 4 nhưng k chia hết cho 100 hoặc chia hết cho
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    dayInMonth = 29;
                }
                else {
                    dayInMonth = 28;
                }
          break;
                default:
                    dayInMonth = 31;
                    break;
        }

        System.out.printf(" So ngay trong thang %d nam %d la %d ngay." , month,year,dayInMonth);
    }
}
