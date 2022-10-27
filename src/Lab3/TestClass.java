package Lab3;

import java.util.Calendar;
public class TestClass {
    private static long timeInMillis;
    private static int counter = 0;
    public TestClass() {
        counter++;
        timeInMillis = Calendar.getInstance().getTimeInMillis();
        System.out.println((counter + ". " + "[" + timeInMillis + "]"));
    }
    public static void main(String[] args) {
        if (args.length == 0){
            return;
        }
        int num = Integer.parseInt(args[0]);
        TestClass [] objects = new TestClass[num];
        for (int i=0; i<num; i++) {
            objects[i] = new TestClass();
        }
        System.out.println("Liczba obiektów: " + objects.length);
    }
}
