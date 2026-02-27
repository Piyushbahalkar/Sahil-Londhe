public class CountNoOfDigits {
   public static void main(String[] args) {
       int[] arr = {1, 12, 256, 1254};
       System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
       int count = 0;
       for (int num : nums){
           if (even(num)){
               count++;
           }
       }
       return count;
    }

    static boolean even(int num){
       int numberOfDigits = digits(num);
       if(numberOfDigits % 2 == 0){
           return true;
       }
       return false;
    }


    static int digits(int num){
      int count = 0;
      while (num > 0){
          count++;
          num = num / 10;
      }
      return count;
    }

}
