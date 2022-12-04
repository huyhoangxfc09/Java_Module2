import java.util.Scanner;

public class MaxTwoArray {
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
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (max<array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là: "+max);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (max==array[i][j]){
                    System.out.println("Vị trí thứ [" + i + ", " + j + "] ");
                }
            }
        }
    }
}
