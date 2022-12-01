package Lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość: ");
        int height = 0;
        try {
            height = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
            System.exit(1);
        }

        if (height <= 1) {
            System.out.println("Wysokość musi być większa niż 1.");
            System.exit(1);
        }

        for (int currentLevel = 1; currentLevel <= height; ++currentLevel) {
            for (int j = 0; j < height-currentLevel; ++j) {System.out.print(" ");}
            for (int j = 0; j < 2*currentLevel-1; ++j) {System.out.print("#");}
            System.out.println();
        }
    }
}