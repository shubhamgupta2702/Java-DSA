
import java.util.Arrays;

public class BubbleSort {
  public static void bubblesort(int[] arr, int n){
    for(int i = n-1;i>= 1; i--){
          int didSwap = 0;
        for (int j = 0; j <= i-1; j++) {
            if(arr[j] > arr[j+1]){
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
              didSwap = 1;
            }
          }
          if(didSwap == 0) break;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,3,5,8,12,34};
    int n = arr.length;
    bubblesort(arr, n);
    System.out.println(Arrays.toString(arr));
    
    
  }

}
