import java.util.Scanner;

public class inputName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên của bạn:\n");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
