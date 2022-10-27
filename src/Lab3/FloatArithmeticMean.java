package Lab3;

public class FloatArithmeticMean {
    public static void main(String[] args) {
        if (args.length == 0){
            return;
        }
        float sum = 0;
        for (int i =0; i<args.length; i++) {
            sum += Float.parseFloat(args[i]);
            System.out.printf("%10.2f\n", Float.parseFloat(args[i]));
        }
        System.out.printf("---------- %n%10.2f%n%nŚrednia arytmetyczna: %4.2f", sum, sum / args.length);
    }
}