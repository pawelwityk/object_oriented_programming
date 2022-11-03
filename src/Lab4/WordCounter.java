package Lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
        FileReader file = null;

        try{
            file = new FileReader(args[0]); // reading file
        }
        catch(FileNotFoundException exception){
            System.out.println("Plik nie istnieje !");
            System.exit(1);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Nie podano pliku, bądź podano kilka plików naraz !");
            System.exit(1);
        }

        Scanner readFile = new Scanner(file); //
        int i = 0, j = 0;
        while(readFile.hasNextLine()){
            readFile.nextLine();
            i++;
        }
        System.out.println("Liczba wierszy w pliku " + args[0] +  " wynosi: " + i);
    }
}
