import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phanTuMang;
        do {
            System.out.println("Nhập số phần tử N cho mảng ( N >=0): ");
            phanTuMang = scanner.nextInt();
        } while (phanTuMang < 0);

        int[] arrInt = new int[phanTuMang];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < phanTuMang; i++) {
            System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
            arrInt[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi thêm là: ");
        for (int i = 0; i < phanTuMang; i++) {
            System.out.printf("%d\t", arrInt[i]);
        }

        System.out.println("\nNhập vào giá trị số muốn thêm: ");
        int value = scanner.nextInt();
        System.out.println("Nhập vào chỉ số muốn thêm: ");
        int index = scanner.nextInt();

        int [] arrIntNew = new int[arrInt.length+1];
        for (int i = 0; i < arrIntNew.length; i++) {
            if (i<index){
                arrIntNew[i] = arrInt[i];
            } else if (i==index) {
                arrIntNew[i]=value;
            } else if (i>index) {
                arrIntNew[i] = arrInt[i-1];
            }
        }

        System.out.println("Mảng sau khi thêm là: ");
        for (int i = 0; i < arrIntNew.length; i++) {
            System.out.printf("%d\t",arrIntNew[i]);
        }
    }
}
