import java.util.Scanner;

public class IndaysoDemKhCach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int count = 0;
        int distance = 1;

        for( int i=2; i<=n; i +=2){

            if( count == distance){
                System.out.print(-i + " ");
                count = 0;
                distance ++;
            }
            else{
                System.out.print(+i + " ");
                count ++;
            }
        }
    }
}
