package Lab3;
public class ArithmeticMean {
    public static void main(String[] args) {
        if (args.length == 0){
            return;
        }
        try {
            int sum = Integer.parseInt(args[0]);
            System.out.printf("Średnia arytmetyczna liczb: " + sum);
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                System.out.printf(", " + args[i]);
            }
            System.out.printf(" wynosi: " + (sum % args.length == 0 ? sum/args.length : sum/args.length + ", reszta: " + sum % args.length));
        }
        catch(NumberFormatException exception){
            System.out.println("Zostały wprowadzone znaki zamiast cyfr !");
        }
    }
}