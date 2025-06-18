public class LinearSearch {
  public static void main(String[] args) {
    
    int[] arr = {10,20,0,1,2,0,4,0,5,0,8,0,9,0};
    int n = arr.length;
    int num = 5;

    // System.out.println(linearSearch(arr, n, num));
    System.out.println(linearSearch(arr, n, num));

    
  }
  public static int linearSearch(int[] arr, int n, int num){
    for (int i = 0; i < n; i++) {
        if(arr[i] == num) return i;

    }
    return -1;
  }
}
