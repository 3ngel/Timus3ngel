package Lessions;

import java.util.Scanner;

public class Less_1885 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] data = userInput.split(" ");
        double h = Double.parseDouble(data[0]);
        double t = Double.parseDouble(data[1]);
        double v = Double.parseDouble(data[2]);
        double x = Double.parseDouble(data[3]);
        double minTime = 0;
        double maxTime = 0;
        double minSpeed = h / t;
        if (minSpeed < x) {
            System.out.print(minTime);
            maxTime = Math.round((h / x) * 1000000.0) / 1000000.0;
            System.out.print(' ');
            System.out.print(maxTime);
        } else {
            minTime = Math.round(((h - t * x) / (v - x)) * 1000000.0) / 1000000.0;
            maxTime = Math.round((h / minSpeed) * 1000000.0) / 1000000.0;
            System.out.print(minTime);
            System.out.print(' ');
            System.out.print(maxTime);
        }
    }
}
