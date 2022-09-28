import java.util.Scanner;

public class demKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi các ký tự: ");
        String chuoiBanDau = scanner.nextLine();
        System.out.printf("Chuỗi ban đầu là: %s\n",chuoiBanDau);
        System.out.println("Nhập 1 ký tự bất kỳ: ");
        char kyTu = scanner.nextLine().charAt(0);
        int cnt = 0;
        for (int i = 0; i < chuoiBanDau.length(); i++) {
            if (chuoiBanDau.charAt(i)==kyTu) {
                cnt++;
            }
        }
        System.out.printf("Số ký tự %s trong chuỗi là: %d",kyTu,cnt);
    }
}
