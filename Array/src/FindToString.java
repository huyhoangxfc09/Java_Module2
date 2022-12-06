import java.util.Scanner;

public class FindToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Tran Huy Hoang";
        System.out.println("Enter char find:");
        char sys = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==sys){
                count++;
            }
        }
        System.out.println(sys+" find: "+count);
    }
}
