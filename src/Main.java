import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, array.length/2, valueStart);
            Arrays.fill(array, array.length/2, array.length, valueEnd);
        }
        else {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (counter < array.length/2) {
                    counter++;
                }
            }
            Arrays.fill(array, 0, counter + 1, valueStart);
            Arrays.fill(array, counter + 1, array.length, valueEnd);
        }
        //
        System.out.println(Arrays.toString(array));
    }
}