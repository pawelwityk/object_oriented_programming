package Lab4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class LineCounterPane {
    public static void main(String[] args){
        FileReader file = null;
        String fileToRead = JOptionPane.showInputDialog("Podaj nazwę pliku:");
        try{
            file = new FileReader(fileToRead); // reading file
        }
        catch(FileNotFoundException exception){
            JOptionPane.showMessageDialog(null, "Plik nie istnieje !", "BŁĄD !" ,JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        Scanner readFile = new Scanner(file); //
        int i = 0;
        while(readFile.hasNextLine()){
            readFile.nextLine();
            i++;
        }
        JOptionPane.showMessageDialog(null, "Liczba wierszy w pliku " + fileToRead + " wynosi: " + i, "Informacja" ,JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
