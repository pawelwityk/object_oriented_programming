package Lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class WordCounter {
    private static String getArgs(String[] args) {
        String argString = "";
        for (String arg : args) {
            if (!arg.startsWith("-")) continue;

            for (int i = 1; i < arg.length(); ++i) {
                argString += arg.charAt(i);
            }
        }
        return argString;
    }

    private static String getFilename(String[] args) {
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }

    private static int[] getData(FileReader file) throws IOException {
        BufferedReader readFile = new BufferedReader(file);
        int lineCount = 0, charCount = 0, wordCount = 0;
        String line = "";

        while((line = readFile.readLine()) != null) {
            lineCount++;
            wordCount += line.split("\\s+").length;
            charCount += line.length();
        }
        int[] result  = {lineCount, charCount, wordCount};
        return result;
    }
    public static void main(String[] args) throws IOException {
        FileReader file = null;
        int[] result = null;
        String filename = getFilename(args);
        try{
            file = new FileReader(filename); // reading file
            result = getData(file);
        }
        catch(FileNotFoundException exception){
            System.out.println("Plik nie istnieje !");
            System.exit(1);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Nie podano pliku, bądź podano kilka plików naraz !");
            System.exit(1);
        }
        catch(IOException e){
            System.out.println("Błąd IO !");
            System.exit(1);
        }

        String arguments = getArgs(args);

        boolean isL = arguments.contains("l");
        boolean isC = arguments.contains("c");
        boolean isW = arguments.contains("w");

        if(isL) {
            System.out.println("wierszy: "  + result[0]);
        }
        if(isC) {
            System.out.println("znaków: "  + result[1]);
        }
        if(isW) {
            System.out.println("słów: "  + result[2]);
        }
        if(!isL && !isC && !isW) {
            System.out.println("wierszy: "  + result[0]);
            System.out.println("znaków: "  + result[1]);
            System.out.println("słów: "  + result[2]);
        }

    }

}
