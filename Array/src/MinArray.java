import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] Array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            Array[i] = scanner.nextInt();
        }
        System.out.println("Mảng tạo mới là:");
        for (int element : Array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        int min = Array[0];
        for (int i = 0; i < size; i++) {
            if(min>Array[i]){
                min = Array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
