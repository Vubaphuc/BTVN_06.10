public class Main3 {
    public static void main(String[] args) {
        //khai báo chuỗi
        String chain = "You only live once, but if you do it right, once is enough";
        //đếm số ký tự trong chuỗi
        System.out.println("Số từ trong chuỗi bao gồm cả khoảng trống là: "+chain.length()+"\n");
        //Đếm và in ra index của các ký tự o
        int soLan = 0;
        for (int i = 0; i < chain.length();i++){
            if ('o'==chain.charAt(i)){
                soLan++;
                // in ra vị trí indexx
                System.out.println("Giá trị Index của o xuất hiện lần lượt là: "+i+"\n");
            }
        }
        //in ra tổng số lần xuất hiện của o
        System.out.println("Tổng số lần của o là: "+soLan);
    }
}