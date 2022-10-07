import java.util.Scanner;
import java.util.regex.Pattern;

public class Main7 {
    //khai báo hàm Regex
    //Định dạng Regex cho mail
    public static  Pattern EMAIL_REGEX = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
    //định dạng Regex cho số  điện thoại
    public static  Pattern PHONE_REGEX = Pattern.compile("^\\d{10}$");
    //khai báo hàm void main
    public static void main(String[] args) {
        //khai báo hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập email");
        String email = sc.nextLine();
        //sử dụng vòng lặp while để nhập email
        while(!isEmail(email)){
            System.out.println("email không hợp lệ! vui long nhập lại: ");
            email = sc.nextLine();
        }
        System.out.println("mời nhập phone number: ");
        String phoneNumber = sc.nextLine();
        //sử dụng vòng lặp while để nhập sdt
        while(!isPhoneNumber(phoneNumber)){
            System.out.println("phone number phải có 10 số ! vui lòng nhập lại: ");
            phoneNumber = sc.nextLine();
        }
        System.out.println("chương trình kết thúc");
    }

    private static boolean isPhoneNumber(String phoneNumber) {
        return PHONE_REGEX.matcher(phoneNumber).matches();
    }

    private static boolean isEmail(String email) {
        return EMAIL_REGEX.matcher(email).matches();
    }
}