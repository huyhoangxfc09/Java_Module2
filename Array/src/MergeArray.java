import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[7];
        System.out.println("Nhập các phần tử mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1:");
        for (int element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println("Nhập các phần tử mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 2:");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        int[] Array = new int[12];
        for (int i = 0; i <arr1.length; i++) {
            Array[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length; i++) {
            Array[i+5]=arr2[i];
        }
        System.out.println("Mảng 1+2 = ");
        for (int element : Array) {
            System.out.print(element + " ");
        }
    }
}
