import java.util.Scanner;

public class Indaysochan6 {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println(" Nhap so nguyen n: ");
        int n = scaner.nextInt();

        for( int i=2; i<=n ; i += 2)
        {
            if ( i % 6 ==0){
                System.out.print(-i + " ");
            }
            else{
                System.out.print(+i + " ");
            }
        }
    }
}
