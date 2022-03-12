public class ReverseString {

    public static void main(String[] args) {
        String str = "My name is Arvind";
//        //System.out.println(str.length);
          String [] str1 = str.split(" " );

        for (int i = str1.length - 1; i >= 0; i--) {
           System.out.print(" "+str1[i]);
            //System.out.print(str.charAt(i));


            // with Array index



        }
    }
}
