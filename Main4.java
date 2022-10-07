import kiemtranguyento.KiemTraNguyenTo;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // khai báo phương thức kiểm tra số nguyên tố
        KiemTraNguyenTo kt = new KiemTraNguyenTo();
        //khai báo hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra số bạn nhập vào có là số nguyên tố không" + "\n");
        System.out.println("Xin mời nhập số cần kiểm tra: " + "\n");
        int n = sc.nextInt();
        //điều kiện
        if (kt.kiemTraNguyenTo(n)) {
            //in ra
            System.out.println("Số " + n + " là số nguyên tố");
        } else {
            //in ra
            System.out.println("Số " + n + " không là số nguyên tố");
        }
    }
}