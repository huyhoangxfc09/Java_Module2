import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int size = scanner.nextInt();
        int[] point = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập điểm thi sinh viên thứ " + (i + 1)+" : ");
            point[i] = scanner.nextInt();
        }
        System.out.println("Danh sách điểm của sinh viên là: ");
        for (int element : point) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        int count =0;
        for (int i = 0; i < size; i++) {
            if(point[i]>=5){
                count+=1;
            }
        }
        System.out.println("Số sinh viên thi đỗ là: "+count);
    }
}
