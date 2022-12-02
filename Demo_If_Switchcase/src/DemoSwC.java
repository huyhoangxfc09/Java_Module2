import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoSwC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month= scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 2:
                System.out.println("Thang nay co 28 ngay");
                break;
            case 3:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 7:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 8:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 9:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 10:
            case 11:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 12:
                System.out.println("Thang nay co 31 ngay");
                break;
        }
    }
}
