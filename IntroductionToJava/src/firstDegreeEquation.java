import java.util.Scanner;

public class firstDegreeEquation {
    public static void main(String[] args) {
        System.out.print("Giải phương trình bậc nhất\n");
        System.out.print("Phương trình bậc nhất có dạng a*x + b = c\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b= scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("Ngiệm của phương trình x = %f!\n",answer);
        }else {
            if (b==c){
                System.out.print("Phương trình có vô số nghiệm x");
            }else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }
}
