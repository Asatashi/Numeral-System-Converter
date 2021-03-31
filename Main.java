package converter;
import java.lang.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        String second = scanner.next();
        int third = Integer.parseInt(second);
        int fourth = scanner.nextInt();
        int count = 0;
        int a;
        if (Integer.toString(4, 1).equals(String.valueOf(10))) {
            System.out.println(Integer.toString(third, fourth));
        } else if (first == fourth) {
            System.out.println(third);
        }else if (first == 1) {
            while (third != 0) {
                third = third /10;
                count++;
            }
            System.out.println(Integer.toString(count, fourth));
        } else {
            a = Integer.parseInt(second,first);
            if (fourth == 1) {
                a = Integer.parseInt(second,first);
                for (int i = 0; i < a; i++) {
                    int j = 1;
                    System.out.print(j);
                }
            } else {
                System.out.println(Integer.toString(a,fourth));
            }
        }
    }
}