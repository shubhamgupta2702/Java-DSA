import java.util.HashMap;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take array size input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Input array elements and build frequency map
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        
        System.out.print("Enter the number to find its frequency: ");
        int num = scanner.nextInt();

        int frequency = freqMap.getOrDefault(num, 0);
        System.out.println("The number " + num + " appears " + frequency + " time(s) in the array.");
        
        scanner.close();
    }
}
