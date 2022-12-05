import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 999:");
        int number = scanner.nextInt();
        if ((0 < number) && (number < 1000)) {
            int hundreds = number/100;
            int dozens = (number%100)/10;
            int units = number%10;
            String read ;
            String readHunderds = "";
            String readDozens = "";
            String readUnist = "";
            switch (hundreds) {
                case 1:
                    readHunderds = "one hundred";
                    break;
                case 2:
                    readHunderds = "two hundred";
                    break;
                case 3:
                    readHunderds = "three hundred";
                    break;
                case 4:
                    readHunderds = "for hundred";
                    break;
                case 5:
                    readHunderds = "five hundred";
                    break;
                case 6:
                    readHunderds = "six hundred";
                    break;
                case 7:
                    readHunderds = "seven hundred";
                    break;
                case 8:
                    readHunderds = "eight hundred";
                    break;
                case 9:
                    readHunderds = "nine hundred";
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
                    readDozens = "forty";
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
            if ((number < 10)) {
                read = readUnist;
                System.out.printf(number + " = " + read);
            }else if (number < 20) {
                switch (number) {
                    case 10:
                        read = "ten";
                        System.out.print(read);
                        break;
                    case 11:
                        read = "elven";
                        System.out.print(read);
                        break;
                    case 12:
                        read = "twelve";
                        System.out.print(read);
                        break;
                    case 13:
                        read = "thirteen";
                        System.out.print(read);
                        break;
                    case 14:
                        read = "fourteen";
                        System.out.print(read);
                        break;
                    case 15:
                        read = "fifteen";
                        System.out.print(read);
                        break;
                    case 16:
                        read = "sixteen";
                        System.out.print(read);
                        break;
                    case 17:
                        read = "seventeen";
                        System.out.print(read);
                        break;
                    case 18:
                        read = "eighteen";
                        System.out.print(read);
                        break;
                    case 19:
                        read = "nineteen";
                        System.out.print(read);
                        break;
                }
            }else if (number < 100) {
                if (units == 0) {
                    read = readDozens;
                    System.out.printf(number + " = " + read);
                } else {
                    read = readDozens + " " + readUnist;
                    System.out.printf(number + " = " + read);
                }
            }else {
                if ((dozens == 0) && (units == 0)) {
                    read = readHunderds;
                    System.out.printf(number + " = " + read);
                } else if (dozens == 0) {
                    read = readHunderds + " and " + readUnist;
                    System.out.printf(number + " = " + read);
                } else if (units == 0) {
                    read = readHunderds + " and " + readDozens;
                    System.out.printf(number + " = " + read);
                } else{
                    read = readHunderds + " and " + readDozens + "-" + readUnist;
                    System.out.printf(number + " = " + read);
                }
            }
        }else System.out.print("Over limit please re-enter");
    }
}
