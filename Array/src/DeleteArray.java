import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Số phần tử trong mảng");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi xóa là:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println("Nhập vị trí cần xóa:");
        int index = scanner.nextInt();
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=0;
        System.out.println("Mảng sau khi xóa là:");

        System.out.println("Mảng sau khi xóa là:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
