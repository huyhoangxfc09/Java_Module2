import java.util.Scanner;

public class SumColumArrayTwo {
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
        System.out.println("Nhập cột cần tính tổng:");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
                sum+=array[i][index-1];
        }
        System.out.println("Tổng cột "+index+" là: "+sum);
    }
}
