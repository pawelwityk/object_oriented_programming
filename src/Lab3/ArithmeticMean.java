package Lab3;

import java.util.ArrayList;
import java.util.List;
public class ArithmeticMean {
    public static void main(String[] args) {
        if (args.length == 0){
            return;
        }
        try {
            List<String> numbers = new ArrayList<String>();
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                numbers.add(args[i]);
            }
            System.out.println("Średnia arytmetyczna liczb " + numbers + " wynosi " + (sum % args.length == 0 ? sum/args.length : sum/args.length + ", reszta " + sum % args.length));
        }
        catch(NumberFormatException exception){
            System.out.println("Zostały wprowadzone znaki zamiast cyfr !");
        }
    }
}