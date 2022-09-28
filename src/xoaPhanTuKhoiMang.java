import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phanTuMang;
        do {
            System.out.println("Nhập số phần tử N cho mảng (N >=0): ");
            phanTuMang = scanner.nextInt();
        } while (phanTuMang < 0);

        int[] arrInt = new int[phanTuMang];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < phanTuMang; i++) {
            System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
            arrInt[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi xóa là: ");
        for (int i = 0; i < phanTuMang; i++) {
            System.out.printf("%d\t", arrInt[i]);
        }

        System.out.println("\nNhập vào số muốn xóa");
        int deleteNumber = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == deleteNumber) {
                count++;
            }
        }

        int[] arrIntNew = new int[arrInt.length - count];
        int index = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == deleteNumber) {
                continue;
            } else {
                arrIntNew[index] = arrInt[i];
                index++;
            }
        }

        System.out.println("Mảng sau khi xóa là: ");
        for (int i = 0; i < arrIntNew.length; i++) {
            System.out.printf("%d\t",arrIntNew[i]);
        }
    }
}