package Lab4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;


public class LineCounter {
    public static void main(String[] args){
        try{
            FileReader file = new FileReader(args[0]); // reading file
            Scanner readFile = new Scanner(file); //
            int i = 0;
            while(readFile.hasNextLine()){
                readFile.nextLine();
                i++;
            }
            System.out.println("Liczba wierszy w pliku " + args[0] +  " wynosi: " + i);

        }
        catch(FileNotFoundException exception){
            System.out.println("Plik nie istnieje !");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Nie podano pliku, bądź podano kilka plików naraz !");
        }
    }
}
