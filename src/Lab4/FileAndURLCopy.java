package Lab4;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.net.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileAndURLCopy{
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Za mało argumentów wywołania programu !\n" +  "Przykład użycia: 'java FileCopy <żródło> <cel>'.");
            System.exit(1);
        }

        if (args[0].startsWith("http")) {

            URLConnection conn;
            InputStream in1 = null;
            URL url = null;

            try {
                url = new URL(args[0]);
                conn = url.openConnection();
                in1 = conn.getInputStream();
            }
            catch(UnknownHostException e) {
                System.out.println("Podany adres " + url + " jest nieprawidłowy");
                System.exit(1);
            }
            catch(AccessDeniedException e) {
                System.out.println("Brak dostępu do " + url);
                System.exit(1);
            }

            try {
                FileOutputStream dstFile = new FileOutputStream(args[1]);
                byte[] array = in1.readAllBytes();
                dstFile.write(array);
                dstFile.close();
            }
            catch(IOException e) {
                System.out.println("Błąd kopiowania");
                System.exit(1);
            }

        }
        else {

            File srcFile = new File(args[0]);
            File dstFile = new File(args[1]);

            if (!srcFile.exists()) {
                System.out.println("Plik " + srcFile.getName() + " nie istnieje !");
                System.exit(1);
            }
            if (srcFile.isDirectory()) {
                System.out.println(srcFile.getName() + " jest katalogiem !");
                System.exit(1);
            }
            if (!srcFile.canRead()) {
                System.out.println("Brak dostępu do pliku " + srcFile.getName() + " !");
                System.exit(1);
            }
            if (dstFile.exists() && !dstFile.canWrite()) {
                System.out.println("Nie można nadpisać pliku " + srcFile.getName() + " !");
                System.exit(1);
            }
            if (dstFile.isFile() && !dstFile.canWrite()) {
                System.out.println("Brak wymaganych uprawnień do zapisu pliku " + dstFile.getName() + " !");
                System.exit(1);
            }
            if (dstFile.isDirectory()) {
                if(!dstFile.canWrite()) {
                    System.out.println("Brak uprawnień do katalogu " + dstFile.getName() + " !");
                    System.exit(1);
                }
                dstFile = new File(Paths.get(dstFile.getName()) + "/" + srcFile.getName());
            }

            try {
                Files.copy(srcFile.toPath(), dstFile.toPath(), REPLACE_EXISTING);
            }
            catch (IOException e) {
                System.out.println("Błąd związany z: " + e.getMessage());
                System.exit(1);
            }
        }
    }
}
