import java.util.Scanner;

public class Indaysole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = scanner.nextInt();

        for ( int i=1 ; i<=n ; i++){
            if( i % 2 != 0){
                System.out.println( i + " ");
            }
        }
    }
}
