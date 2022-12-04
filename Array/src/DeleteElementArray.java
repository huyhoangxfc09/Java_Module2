import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] array = {8, 9, 8, 5, 4, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index delete:");
        int index = scanner.nextInt();
        System.out.println("Mảng trước khi xóa");
       for (int element : array){
           System.out.println(element+" ");
       }
        System.out.println("\n");
        for (int i = index; i <array.length-1 ; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        System.out.println("Mảng sau khi xóa");
        for (int element : array){
            System.out.println(element+" ");
        }
    }
}
