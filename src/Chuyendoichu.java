import java.util.Scanner;

public class Chuyendoichu {
    public static void main(String[] args) {

        /**
         * Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo đã nhập sai.
         * Nếu đúng thì đi kiểm tra nếuđó đang là chữ cái thường thì biến nó thành chữ cái hoa,
         * nếu nó là chữ cái hoa thì biến nó thành chữ cái thường.
         * Gợiý: Ký tự chữ cái thường và hoa có mã ASCII cách nhau 32 đơn vị. Vd: 'a' là 97, 'A' là 65
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhap chu cai vao: ");
        char character = scanner.next() .charAt(0);

        if (( character >= 'A' && character <= 'Z') || ( character >= 'a' && character <= 'z')){

            if( character >= 'a' && character <= 'z'){

                character -= 32;
            }
            else {
                character += 32;
            }
            System.out.println(" Gia tri sau khi chuyen doi: " + character);
        }

        else{
            System.out.println("nhap sai gia tri, yeu cau nhap lai");
        }
    }
}
