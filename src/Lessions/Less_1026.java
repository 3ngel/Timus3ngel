package Lessions;

import java.util.Arrays;
import java.util.Scanner;

public class Less_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[Integer.parseInt(scanner.nextLine()) - 1]);
        }
    }
    public static int[] sort(int[] arr) {
        int i, j;
        int[] radixArr = new int[arr.length];
        int[] radixNumberArr = new int[arr.length];
        int[] counterArr;
        int[] indexArr = new int[256];
        for (int shift = 0; shift < 4; shift++) {
            counterArr = new int[256];
            for (i = 0; i < arr.length; i++) {
                j = (arr[i] >> (shift * 8)) % 256;
                counterArr[j]++;
                radixArr[i] = j;
                radixNumberArr[i] = arr[i];
            }
            indexArr[0] = 0;
            for (i = 1; i < counterArr.length; i++) {
                j = i - 1;
                indexArr[i] = counterArr[j] + indexArr[j];
            }
            for (i = 0; i < arr.length; i++) {
                arr[indexArr[radixArr[i]]] = radixNumberArr[i];
                indexArr[radixArr[i]]++;
            }
        }
        return arr;
    }
}
