import java.util.Arrays;

public class MoveZerostoEnd {
  public static void main(String[] args) {
    
    int[] arr = {10,20,0,1,2,0,4,0,5,0,8,0,9,0};
    int n = arr.length;
    
      // optimal approach using two pointer and o(n) TC and O(1) SC.

    int j = -1;
    for (int i = 0; i < n; i++) {
        if(arr[i] == 0){
          j = i;
          break;
        }
    }
    for(int i = j+1;i < n;i++){
      if(arr[i] != 0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }


    System.out.println(Arrays.toString(arr));
  }
}
