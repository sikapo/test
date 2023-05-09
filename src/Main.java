public class Main {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int [10][10];
        for (int i = 1; i < MULTIPLICATION_TABLE.length; i++) {
            for (int ii = 1; ii < MULTIPLICATION_TABLE.length; ii++) {
                MULTIPLICATION_TABLE[i][ii] = i * ii;
                System.out.print(MULTIPLICATION_TABLE[i][ii]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}