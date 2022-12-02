import java.util.Scanner;

public class DemoIfElseIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap nhiet do");
        int temp=scanner.nextInt();
        if(temp>70){
            System.out.println("Giam nhiet do");
        }else if(temp<70&&temp>0) {
            System.out.println("Nhiet do trung binh");
        }else {
            System.out.println("That khong?");
        }
    }
}
