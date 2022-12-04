import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột:");
        int colum = scanner.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng hai chiều tạo ra là");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        if (colum == row) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    if (i == j) {
                        sum += array[i][j];
                    }
                }
            }
            System.out.println("Tổng của đường chéo chính là: " + sum);
        }else {
            System.out.println("Không phải ma trận vuông. Hãy nhập lại");
        }
    }
}
