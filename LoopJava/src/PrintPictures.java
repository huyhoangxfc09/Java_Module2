public class PrintPictures {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i <=5 ; i++) {
            for (int j = 5;i<j ; j--) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 1; i <=5; i++) {
            // vòng lặp để in số khoảng trắng trước dấu sao
            for (int j =5; j >= i; j--) {
                System.out.print(" ");
            }
            // vòng lặp để in số ngôi sao trong mỗi hàng
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // cho dòng mới sau khi in từng hàng
            System.out.println();
        }
    }
}
