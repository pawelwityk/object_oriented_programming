package Lab4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class LineCounterPane {
    public static void main(String[] args){
        try{
            String fileToRead = JOptionPane.showInputDialog("Podaj nazwę pliku:");
            FileReader file = new FileReader(fileToRead); // reading file
            Scanner readFile = new Scanner(file); //
            int i = 0;
            while(readFile.hasNextLine()){
                readFile.nextLine();
                i++;
            }
            System.out.println("Liczba wierszy w pliku " + fileToRead +  " wynosi: " + i);

        }
        catch(FileNotFoundException exception){
            System.out.println("Plik nie istnieje !");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Nie podano pliku, bądź podano kilka plików naraz !");
        }
    }
}
