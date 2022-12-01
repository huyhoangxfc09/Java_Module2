import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 999:\n");
        int number = scanner.nextInt();
        if ((0 < number) && (number < 1000)) {
            System.out.println("Hundreds:\n");
            int hundreds = scanner.nextInt();
            System.out.println("Dozens:\n");
            int dozens = scanner.nextInt();
            System.out.println("Units:\n");
            int units = scanner.nextInt();
            String read = " ";
            String readHunders = " ";
            String readDozens = " ";
            String readUnist = " ";
            switch (hundreds) {
                case 1:
                    readHunders = "one hundred";
                    break;
                case 2:
                    readHunders = "two hundred";
                    break;
                case 3:
                    readHunders = "three hundred";
                    break;
                case 4:
                    readHunders = "for hundred";
                    break;
                case 5:
                    readHunders = "five hundred";
                    break;
                case 6:
                    readHunders = "six hundred";
                    break;
                case 7:
                    readHunders = "seven hundred";
                    break;
                case 8:
                    readHunders = "eight hundred";
                    break;
                case 9:
                    readHunders = "nine hundred";
                    break;
            }
            switch (dozens) {
                case 2:
                    readDozens = "twenty";
                    break;
                case 3:
                    readDozens = "thirty";
                    break;
                case 4:
                    readDozens = "fourty";
                    break;
                case 5:
                    readDozens = "fifty";
                    break;
                case 6:
                    readDozens = "sixty";
                    break;
                case 7:
                    readDozens = "seventy";
                    break;
                case 8:
                    readDozens = "eighty";
                    break;
                case 9:
                    readDozens = "ninety";
                    break;
            }
            switch (units) {
                case 1:
                    readUnist = "one";
                    break;
                case 2:
                    readUnist = "two";
                    break;
                case 3:
                    readUnist = "three";
                    break;
                case 4:
                    readUnist = "four";
                    break;
                case 5:
                    readUnist = "five";
                    break;
                case 6:
                    readUnist = "six";
                    break;
                case 7:
                    readUnist = "seven";
                    break;
                case 8:
                    readUnist = "eight";
                    break;
                case 9:
                    readUnist = "nine";
                    break;
            }
            if ((0 < number) && (number < 10)) {
                read = readUnist;
                System.out.printf(number + " = " + read);
            }
            if ((10 <= number) && (number < 20)) {
                switch (number) {
                    case 10:
                        read = "ten";
                        System.out.print(read);
                    case 11:
                        read = "elven";
                        System.out.print(read);
                    case 12:
                        read = "twelve";
                        System.out.print(read);
                    case 13:
                        read = "thirteen";
                        System.out.print(read);
                    case 14:
                        read = "fourteen";
                        System.out.print(read);
                    case 15:
                        read = "fifteen";
                        System.out.print(read);
                    case 16:
                        read = "sixteen";
                        System.out.print(read);
                    case 17:
                        read = "seventeen";
                        System.out.print(read);
                    case 18:
                        read = "eighteen";
                        System.out.print(read);
                    case 19:
                        read = "nineteen";
                        System.out.print(read);
                }
            }
            if ((20 <= number) && (number < 100)) {
                if (units == 0) {
                    read = readDozens;
                    System.out.printf(number + " = " + read);
                } else {
                    read = readDozens + " " + readUnist;
                    System.out.printf(number + " = " + read);
                }
            }
            if ((100 <= number) && (number < 1000)) {
                if ((dozens == 0) && (units == 0)) {
                    read = readHunders;
                    System.out.printf(number + " = " + read);
                } else if (dozens == 0) {
                    read = readHunders + " and " + readUnist;
                    System.out.printf(number + " = " + read);
                } else if ((dozens != 0) && (units == 0)) {
                    read = readHunders + " and " + readDozens;
                    System.out.printf(number + " = " + read);
                } else if ((dozens != 0) && (units != 0)) {
                    read = readHunders + " and " + readDozens + "-" + readUnist;
                    System.out.printf(number + " = " + read);
                }
            }
        }else System.out.print("Over limit please re-enter");
    }
}
