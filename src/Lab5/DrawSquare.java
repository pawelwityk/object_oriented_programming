package Lab5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DrawSquare {
    private static void printSquare(int size) {
        if (size == 1) {
            System.out.println("#");
            System.exit(0);
        }
        System.out.println("#".repeat(size));
        for(int i = 0; i < size - 2; i++) {
            System.out.printf("#%"+(size-1)+"c\n",'#');
        }
        System.out.println("#".repeat(size));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("Podaj rozmiar kwadratu: ");
        try {
            size = scanner.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Błąd ! Wprowadź poprawną liczbę.");
            System.exit(1);
        }
        if (size <= 0) {
            System.out.println("Błąd ! Wprowadź liczbę większą od zera.");
        }
        printSquare(size);
    }
}