import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++){
            array[i] = scanner.nextInt();
        }
        int counter = 99999999;
        for (int i = 0; i < sizeOfArray; i++){
            for (int ii = 1; ii < sizeOfArray; ii++){
                if (array[i] < array[ii] && array[i] <= counter){
                    counter = array[i];
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}