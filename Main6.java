import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // khai báo biến toàn cục
        int sum = 0;
        int d2, c2;
        // khai báo hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        // người dùng nhập số cột và số dòng của mảng 1
        System.out.println("Nhập số dòng mảng 1 và mảng 2");
        int d = d2 = sc.nextInt();
        System.out.println("Nhập số cột mảng 1 và mảng 2");
        int c = c2 = sc.nextInt();
        // nhập phần tử trong mảng 1
        int mang [][] = new int[d][c];
        // nhập phần tử trong mảng 2
        int mang2 [][] = new int[d2][c2];
        // nhập dữ liệu cho mảng 1
        System.out.println("Mời bạn nhập dữ liệu phần tử vào mảng 1:");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.println("Mời bạn nhập giá tr của array["+i+"]["+j+"]");
                mang[i][j] = sc.nextInt();
                System.out.println("array["+i+"]["+j+"]");
            }
        }
        System.out.println("\n");
        System.out.println("Mời bạn nhập dữ liệu phần tử vào mảng 2:");
        // nhập dữ liệu cho mảng 2
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.println("Mời bạn nhập giá tr của array["+i+"]["+j+"]");
                mang2[i][j] = sc.nextInt();
                System.out.println("array["+i+"]["+j+"]");
            }
        }
        System.out.println("\n");
        // in ra bảng dữ liệu mảng 1
        System.out.println("Phần tử mảng 1 là: ");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.print(mang[i][j]+" ");
                sum += mang[i][j];
            }
            System.out.println();
        }
        System.out.println();
        // in ra dữ liệu mảng 2
        System.out.println("Phần tử mảng 2 là: ");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.print(mang2[i][j]+" ");
                sum += mang2[i][j];
            }
            System.out.println();
        }
        System.out.println("\n");
        //liệt kê các phần tử trên đường chéo chính của mảng 1
        System.out.println("Các phần tử nằm trên đường chéo chính của mảng 1 là: ");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                if (i == j){
                    System.out.print(mang[i][j]+" ");
                }
            }
        }
        System.out.println("\n");
        //liệt kê các phần tử trên đường chéo chính của mảng 2
        System.out.println("Các phần tử nằm trên đường chéo chính của mảng 2 là: ");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                if (i == j){
                    System.out.print(mang2[i][j]+" ");
                }
            }
        }
        System.out.println("\n");
        //tổng phép cộng 2 mảng với nhau
        System.out.println("Tổng 2 mảng là: "+sum);
    }
}