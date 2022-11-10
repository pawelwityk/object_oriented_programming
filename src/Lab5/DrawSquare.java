package Lab5;

public class DrawSquare {
    private static void drawSquare(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("\n#");
        }
    }

    public static void main(String[] args) {
        drawSquare(Integer.parseInt(args[0]));
    }
}
