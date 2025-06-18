import java.util.*;

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements in a[]
        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        // Remaining elements in b[]
        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}
