import jdk.jshell.SourceCodeAnalysis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhap vao tuoi cua ban: ");
        int age = scanner.nextInt();// 18 enter

        System.out.print(" Nhap vao ten cua ban: ");
        scanner.nextLine();// xóa hết toàn bộ dữ liệu ở trong bộ nhớ đệm
        String name = scanner.nextLine();

        System.out.println(" tuoi cua ban: " + age);
        System.out.println("ten cua ban: " + name);


    }
}
