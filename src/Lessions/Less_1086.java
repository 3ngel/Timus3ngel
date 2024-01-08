package Lessions;
import java.util.Scanner;
public class Less_1086 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] simpleNumbers = new int[n];
        simpleNumbers[0] = 2;
        simpleNumbers[1] = 3;
        int index = 2;
        while (index < n) {
            simpleNumbers[index] = FindNextSimpleNumber(simpleNumbers[index-1], simpleNumbers, index);
            index++;
        }
        for (int i : numbers) {
            System.out.println(simpleNumbers[i-1]);
        }
    }
    public static int FindNextSimpleNumber(int number, int[] simpleNumbers,int index){
        int nextNumber = number + 2;
        boolean stop = true;
        while (stop) {
            for (int i = 0; i < index; i++) {
                if (nextNumber % simpleNumbers[i] == 0) {
                    nextNumber += 2;
                    break;
                } else if (i == index - 1) {
                    stop = false;
                    break;
                }
            }
        }
        return nextNumber;
    }
}
