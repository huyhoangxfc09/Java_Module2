import java.util.Scanner;

public class DemoIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number=scanner.nextInt();
        if(number%2==0){
            System.out.println("Day la so chan");
        }else{
            System.out.println("Day la so le");
        }
    }
}