import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem");
        int point=scanner.nextInt();
        if(point>=8&&point<=10){
            System.out.println("Xep loai gioi");
        }if(point>=5&&point<=7){
            System.out.println("Xep loai kha");
        }if(point<5&&point>=0){
            System.out.println("Xep loai yeu");
        }
    }
}
