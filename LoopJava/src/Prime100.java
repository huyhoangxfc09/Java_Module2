import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các số nguyên tố từ 1 đến 100 là:");
        int count = 0;
        for (int i = 2; i < 100; i++) {
            int j = 2;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check){
                count+=1;
                System.out.println("Số thứ "+count+" = "+i);
            }
        }
    }
}
