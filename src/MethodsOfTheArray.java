import java.util.Scanner;

public class MethodsOfTheArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array.");
        int size = sc.nextInt();
        int[] array = new int[size];
        fillArray(array);
        printArray(array);
        bubbleSorter(array);
        System.out.println();
        printArray(array);
    }

    public static void fillArray(int[] array) {
        int elem;
        for (int i = 0; i < array.length; i++) {
            elem = sc.nextInt();
            array[i] = elem;
            System.out.println(i + " added " + elem);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSorter(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
