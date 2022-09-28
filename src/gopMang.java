import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phanTuMang1;
        do {
            System.out.println("Nhập số phần tử N cho mảng 1 ( N >=0): ");
            phanTuMang1 = scanner.nextInt();
        } while (phanTuMang1 < 0);

        int[] mang1 = new int[phanTuMang1];
        System.out.print("Nhập các phần tử của mảng 1: \n");
        for (int i = 0; i < phanTuMang1; i++) {
            System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
            mang1[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1 là: ");
        for (int i = 0; i < phanTuMang1; i++) {
            System.out.printf("%d\t", mang1[i]);
        }

        int phanTuMang2;
        do {
            System.out.println("\nNhập số phần tử N cho mảng 2 ( N >=0): ");
            phanTuMang2 = scanner.nextInt();
        } while (phanTuMang2 < 0);

        int[] mang2 = new int[phanTuMang2];
        System.out.print("Nhập các phần tử của mảng 2: \n");
        for (int i = 0; i < phanTuMang2; i++) {
            System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
            mang2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 2 là: ");
        for (int i = 0; i < phanTuMang2; i++) {
            System.out.printf("%d\t", mang2[i]);
        }

        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang3.length; i++) {
            if (i < mang1.length) {
                mang3[i] = mang1[i];
            } else {
                mang3[i] = mang2[i - mang1.length];
            }
        }

        System.out.println("\nMảng sau khi gộp là: ");
        for (int i = 0; i < mang3.length; i++) {
            System.out.printf("%d\t", mang3[i]);
        }
    }
}
