import java.util.Scanner;

public class CreateTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner =new  Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột:");
        int colum = scanner.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Mảng hai chiều tạo ra là");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <colum; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
