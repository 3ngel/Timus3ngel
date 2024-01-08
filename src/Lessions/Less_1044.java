package Lessions;
import java.util.Scanner;
public class Less_1044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a=in.nextInt();
        int[] m = {10, 670, 55252, 4816030};
        int c = a/2-1;
        System.out.println(m[c]);
    }
}
