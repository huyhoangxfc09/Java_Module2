import java.util.Scanner;

public class CreatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input element "+(i+1)+" : ");
            array[i]= scanner.nextInt();
        }
        System.out.println("Creat new array:");
        for (int element : array) {
            System.out.println(element+" ");
        }
    }
}
