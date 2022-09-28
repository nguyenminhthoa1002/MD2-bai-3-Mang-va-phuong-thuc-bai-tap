import java.util.Scanner;

public class tinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soHang, soCot;
        do {
            System.out.println("Nhập số hàng N cho mảng ( N >=0): ");
            soHang = scanner.nextInt();
            System.out.println("Nhập số cột N cho mảng ( N >=0): ");
            soCot = scanner.nextInt();
        } while (soHang < 0 || soCot < 0 || soHang !=soCot);

        int[][] mang2Chieu = new int[soHang][soCot];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Giá trị phần tử tại hàng %d và cột %d là: ", i + 1, j + 1);
                mang2Chieu[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều là: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%d\t", mang2Chieu[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Tổng các số ở đường chéo chính là: ");
        int sum = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i==j) {
                    sum += mang2Chieu[i][j];
                }
            }
        }
        System.out.printf("%d",sum);
    }
}
