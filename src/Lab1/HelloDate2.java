package Lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloDate2 {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println("Witaj ! Dzisiaj jest: " + formatter.format(date));
    }
}
