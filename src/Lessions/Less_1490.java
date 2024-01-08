package Lessions;

import java.util.Scanner;

public class Less_1490 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        long count = 0;
        for (double x = 0; x < r; x++) {
            count += (long) Math.ceil(Math.sqrt((double) r * r - x * x));
        }
        System.out.println(4 * count);
    }
}
