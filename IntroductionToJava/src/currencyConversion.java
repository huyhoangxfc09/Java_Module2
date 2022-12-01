import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input USD:\n");
        int usd = scanner.nextInt();
        final int RATE = 23000;
        int vnd = usd*RATE;
        System.out.printf(usd+" usd = "+vnd+" vnd");
    }
}
