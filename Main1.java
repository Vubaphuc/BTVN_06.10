public class Main1 {
    public static void main(String[] args) {
        // khai báo mảng 2 chiều + dữ liệu
        String [][] bang = new String[][]{{"*"," "," "," "},{"*","*"," "," "},{"*","*","*"," "},{"*","*","*","*"}};
        // in ra hình ta giác
        for (int i = 0; i < bang.length; i++){
            for (int j = 0; j < bang[0].length; j++){
                // in ra hình * và khoảng cách
                System.out.print(bang[i][j]+"  ");
            }
            //hết 1 hàng xuống dòng
            System.out.println();
        }
    }
}