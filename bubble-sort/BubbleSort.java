import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {47, 38, 50, 39, 80, 81, 99, 64, 16, 48};
        // sorted:  [16, 38, 39, 47, 48, 50, 64, 80, 81, 99]

        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] numbers){
        int temp;
        int swapCount=1;
        int arrLength = numbers.length;

        while (swapCount>0){
            swapCount=0;
            for(int i=0; i<arrLength-1; i++){
                if(numbers[i]>numbers[i+1]){
                    swapCount++;
                    temp = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i] = temp;
                }
            }
            arrLength--;
        }

        System.out.println(Arrays.toString(numbers));
    }
}