package Lessions;

import java.util.Scanner;

public class Less_1330{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrayOfValues = new int[n];
        int[] sumArray = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOfValues[i] = Integer.parseInt(scanner.nextLine());
            if (i != 0)
                sumArray[i] = sumArray[i - 1] + arrayOfValues[i];
            else
                sumArray[i] = arrayOfValues[i];
        }
        int q = Integer.parseInt(scanner.nextLine());
        int[][] qArray = new int[q][];
        for (int i = 0; i < q; i++) {
            String[] qPair = scanner.nextLine().split(" ");
            qArray[i] = new int[2];
            qArray[i][0] = Integer.parseInt(qPair[0]);
            qArray[i][1] = Integer.parseInt(qPair[1]);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(sumArray[qArray[i][1] - 1] - sumArray[qArray[i][0] - 1] + arrayOfValues[qArray[i][0] - 1]);
        }
    }
}
