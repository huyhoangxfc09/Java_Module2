import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Số phần tử trong mảng");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi chèn là:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println("Nhập vị trí cần chèn:");
        int index = scanner.nextInt();
        System.out.println("Nhập giá trị cần chèn:");
        int value = scanner.nextInt();
        if ((index < 0) || (index > arr.length)) {
            System.out.println("Quá độ dài của mảng. Hãy nhập lại.");
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
            System.out.println("Mảng sau khi chèn là:");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }
}
