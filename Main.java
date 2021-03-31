package converter;
import java.lang.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberA = scanner.nextInt();
        switch (numberA) {
            case 2:
                System.out.println("0b" + Integer.toBinaryString(number));
                break;
            case 16:
                System.out.println("0x" + Integer.toHexString(number));
                break;
            case 8:
                System.out.println("0" + Integer.toOctalString(number));
                break;
            default :
                System.out.println("ERROR");
        }
    }
}
