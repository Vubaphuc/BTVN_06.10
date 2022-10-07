public class Main5 {
    public static void main(String[] args) {
        // 10 số nguyên tố đầu tiên
        System.out.println("10 số nguyên tố đầu tiên là: ");
        int dem = 0; // đếm số số nguyên tố
        int i = 3;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println("\n");
        // số nguyên tố nhỏ hơn 10
        System.out.println("Tất cả các số nguyên tố nhỏ hơn 10 là: ");
        for (int j = 3; j < 10; j+=2) {
            if (isPrimeNumber(j)) {
                System.out.print(j+" ");
            }
        }

    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}