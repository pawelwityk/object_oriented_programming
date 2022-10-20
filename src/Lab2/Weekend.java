package Lab2;
import java.util.Date;

public class Weekend {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("Do weekendu pozostało: " + Math.max((5 - date.getDay()), 0) + " dni.");
    }
}
