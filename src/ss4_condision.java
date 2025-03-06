public class ss4_condision {
    public static void main(String[] args) {
        // Nhap vao diem => xep loại sv
        /*
        diem <5 : yeu
        diem [5-7): kha
        diem [7-8.5): gioi
        diem (7.5-10]; xuat xac

        ||:  sai khi ca 2 deu sai
        &&: dung khi ca 2 deu dung

         */

        int a = 3;
        int b = 5;


        int max = a > b ? a : b;
        int max2 = Math.max(a , b);

        System.out.println("so lon nhat: " + max);
        System.out.println("so lon nhat: " + max2);



        }



}
