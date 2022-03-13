//THIS CODE TELL YOU HOW TO PLAY WITH ARRAYS (1D)



import java.util.Arrays;

public class ArrayFirst {
    public static void main(String[] args) {
       // System.out.println(chalaDeArray()); //    ****** 1 ******
          chalaDeArray();                     //     ****** 2 ******
        
        }

  /*  private static int chalaDeArray() {  1. // Declare the array name and type.Create the array.Initialize the array values.
        int[] a;
        a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = 0;
            System.out.println(a[i]);

        }

        return 0;
    */
 /* private static void chalaDeArray(){ // 2. Direct

      int[] a = {1,2,3,4,5};
      System.out.println(Arrays.toString(a));
}
*/
  private static void chalaDeArray(){
      int [] a = new int[4];
      a[0] = 1 ;
      a[1] = 12 ;
      a[2] = a[1];
      a[3] = 1234 ;
      System.out.println(Arrays.toString(a));
      System.out.println(a.length);
  }

}
