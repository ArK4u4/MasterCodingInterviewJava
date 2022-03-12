
import java.util.HashSet;
import java.util.Scanner;
public class SearchPairSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array ::");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
//       if (findPair(arr, 10)){
//           System.out.println("The pair exist");
//       }
//       else{
//           System.out.println("The Pair does not exist");
//       }
        if (fastFindPair(arr,10)){
            System.out.println("The pair exist");
        }
        else{
            System.out.println("The Pair does not exist");
        }

    }
    // This method has high time complexity O(n^2)
   /* public static boolean findPair(int[] array, int target_sum) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length-1 ; j++) {
                if (array[i] + array[j] == target_sum) {
                    return true;
                }

            }

        }
        return false;
        }
*/
    // new Approch with Hash table for same Problem
    public static boolean fastFindPair(int[] array, int target_sum){
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < array.length ; i++) {
            int temp = target_sum - array[i];

            if(s.contains(temp)){
                return true;
            }
            s.add(array[i]);

        }
        return false;
    }

}


