import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao nam sinh cua ban: ");
        int year = scanner.nextInt();
        int age = Year.now().getValue() - year;

        System.out.println("tuoi cua ban la: " + age);
    }

}
