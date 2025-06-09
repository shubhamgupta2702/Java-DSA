
import java.util.ArrayList;

public class MergeSort {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(12);
    nums.add(7);
    nums.add(35);
    nums.add(35);
    nums.add(25);

     mergeSort(nums, 0, nums.size() -1);
     System.out.println(nums);
  }

  public static void mergeSort(ArrayList<Integer> arr, int low, int high){
    if(low >= high) return;
    int mid = (low+high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr,low,mid,high);
  }
  public static void merge(ArrayList<Integer> arr, int low, int mid, int high){
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid+1;

    while(left <= mid && right <= high){
      if(arr.get(left) <= arr.get(right)){
        temp.add(arr.get(left));
        left++;
      }
      else{
        temp.add(arr.get(right));
        right++;
      }
      
    }
    while(left <= mid){
      temp.add(arr.get(left));
        left++;
    }
    while(right <= high){
      temp.add(arr.get(right));
        right++;
    }
    for (int i = low; i <= high; i++) {
        arr.set(i, temp.get(i-low));
    }

  }
}
