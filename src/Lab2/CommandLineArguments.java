package Lab2;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Liczba argumentów: " + args.length);
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

    }
}