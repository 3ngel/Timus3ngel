package Lessions;
import java.util.Arrays;
import java.util.Scanner;
public class Less_1025 {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int k = in.nextInt();
        int[] mass= new int[k];
        for(int i=0; i<k; i++) {
            System.out.println("Введите число "+i);
            mass[i]=in.nextInt();
        }
        int kV=k/2+1;
        int count = 0;
        Arrays.sort(mass);
        for(int i=0; i<kV;i++) {
            int m =mass[i]/2+1;
            count=count+m;
        }

        System.out.println("Итоговое число"+count);
    }
}
