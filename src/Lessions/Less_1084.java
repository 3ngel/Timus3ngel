package Lessions;

import java.util.Scanner;

public class Less_1084 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] data = userInput.split(" ");
        double sideOfSquare = Double.parseDouble(data[0]);
        double ropeLength = Double.parseDouble(data[1]);
        double areaOfGrass = 0;
        double pi = Math.PI;
        double sqrOfRopeLength = ropeLength * ropeLength;
        if (ropeLength <= sideOfSquare / 2)
            areaOfGrass = pi * sqrOfRopeLength;
        else if (Math.sqrt(2) * 0.5 * sideOfSquare <= ropeLength)
            areaOfGrass = sideOfSquare * sideOfSquare;
        else {
            double angle = 2 * Math.acos(sideOfSquare / (2 * ropeLength));
            areaOfGrass = pi * sqrOfRopeLength - 4 * (0.5 * sqrOfRopeLength * (angle - Math.sin(angle)));
        }
        areaOfGrass = Math.round(areaOfGrass * 1000.0) / 1000.0;
        System.out.print(areaOfGrass);
    }
}
