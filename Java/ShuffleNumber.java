import java.util.*;

public class ShuffleNumber{
    public static void main(String[] args) {
        int[] arr = {11,25,35,470,57,67,75};
        shuffleArray(arr);
    }
    public static void shuffleArray(int[] arr){
        int n = arr.length;
        Random random = new Random();
        for(int i = 0; i < n; i++){
            int randomIndex = i + random.nextInt(n - i);
            swap(arr, i, randomIndex);
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void swap(int[] arr, int i, int randomIndex){
        int temp = arr[i];
        arr[i] = arr[randomIndex];
        arr[randomIndex] = temp;
    }
}
