package Lab2;

import java.util.Calendar;

public class Weekend2 {
    public static void main(String[] args){
        switch (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                System.out.println("Mamy weekend !");
                break;
            case Calendar.MONDAY:
                System.out.println("Dziś jest poniedziałek. Do weekendu pozostało: " + (7 - Calendar.MONDAY) + " dni");
                break;
            case Calendar.TUESDAY:
                System.out.println("Dziś jest wtorek. Do weekendu pozostało: " + (7 - Calendar.TUESDAY) +  " dni");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Dziś jest środa. Do weekendu pozostało: " + (7 - Calendar.WEDNESDAY) +  " dni");
                break;
            case Calendar.THURSDAY:
                System.out.println("Dziś jest czwartek. Do weekendu pozostało: " + (7 - Calendar.THURSDAY) + " dni");
                break;
            case Calendar.FRIDAY:
                System.out.println("Dziś jest piątek. Do weekendu pozostało: " + (7 - Calendar.FRIDAY) +  " dzień");
                break;
            case Calendar.SATURDAY:
                System.out.println("Mamy weekend !");
                break;
        }
    }
}

