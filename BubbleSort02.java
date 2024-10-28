import java.util.Scanner;
public class BubbleSort02 {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        bubbleSort(numbers);

        System.out.println("Sorted numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
