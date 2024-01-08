package Lessions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Less_1001 {
    public static void main(String[] args) {
        List<Character> numbers = new ArrayList<>(128);
        char[] delimiters = {' ', '\r', '\n'};
        List<Double> output = new ArrayList<>(128);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 256 * 1024; i++) {
            int symbolInt = scanner.nextInt();
            if (symbolInt == -1)
                break;
            char symbolCh = (char) symbolInt;
            while (!contains(delimiters, symbolCh)) {
                numbers.add(symbolCh);
                symbolInt = scanner.nextInt();
                if (symbolInt == -1)
                    break;
                symbolCh = (char) symbolInt;
            }
            if (!numbers.isEmpty()) {
                String n = toString(numbers);
                double d = Double.parseDouble(n);
                output.add(Double.valueOf(Math.round(Math.sqrt(d))));
                numbers = new ArrayList<>(128);
            }
        }
        reverse(output);
        for (double numb : output) {
            System.out.println(numb);
        }
    }

    private static boolean contains(char[] array, char value) {
        for (char element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    private static String toString(List<Character> list) {
        StringBuilder sb = new StringBuilder(list.size());
        for (Character ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static void reverse(List<Double> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Double temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
