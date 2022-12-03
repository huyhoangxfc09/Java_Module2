import java.util.Scanner;

public class Display20NumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        int tempt =0;
        while (count!=number){
            for (int i = 2 ; i <=N ; i++) {
                for (int j = 1; j <=N ; j++) {
                    if(N%j==0){
                        tempt+=1;
                    }
                }
                if (tempt==2){
                    count+=1;
                    System.out.println("Số thứ "+count+" = "+N);
                }
            }
            tempt=0;
            N+=1;
        }
    }
}
