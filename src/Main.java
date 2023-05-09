import java.util.Scanner;

public class Main {
    public static String[] strings;
    public static void main(String[] args) {
            //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
            for (int i = 0; i < strings.length; i++) {
                    strings[i] = scanner.nextLine();
            }
        for (int i = 0; i < strings.length; i++) {
            for (int ii = 1; ii < strings.length; ii++) {
                if (strings[i] != null && strings[i].equalsIgnoreCase(strings[ii]) && i!= ii) {
                    strings[i] = null;
                    strings[ii] = null;
                    break;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}