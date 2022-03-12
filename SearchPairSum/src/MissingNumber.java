import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter natural number ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the elements of the array ::");

            System.out.println("missing number is ::" +missingFound(arr));
    }

        private static int missingFound ( int[] arr1){
            int n = arr1.length;
            int sum = (n + 1) * (n + 2) / 2;
            for (int i = 0; i < n; i++) {
                sum = sum - arr1[i];

            }
            return sum;
        }

    }


