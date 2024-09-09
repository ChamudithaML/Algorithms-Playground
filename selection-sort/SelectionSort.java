import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {30, 82, 78, 25, 39, 62, 78, 34, 75, 15, 86, 56, 9, 24, 83, 89, 20, 6, 29, 93};

        int[] numbers2 = dynamicArray();
        System.out.println("Unsorted: "+Arrays.toString(numbers2));

        selectionSort(numbers2);
    }

    public static void selectionSort(int[] numbers){
        int maxIndex;
        int arrLength = numbers.length;
        int temp;

        for(int j=0; j<arrLength-1; j++){
            maxIndex=0;
            for(int i=0; i<arrLength-j; i++){
                if(numbers[i]>numbers[maxIndex]){
                    maxIndex = i;
                }
            }

            temp = numbers[arrLength-j-1];
            numbers[arrLength-j-1] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }

        System.out.println("Sorted: "+Arrays.toString(numbers));
    }

    public static int[] dynamicArray(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int arrSize;

        System.out.print("Enter Value: ");
        arrSize = input.nextInt();

        int[] numbers = new int[arrSize];

        for(int i=0; i<arrSize; i++){
            numbers[i] = rand.nextInt(100);
        }

        return numbers;
    }
}
