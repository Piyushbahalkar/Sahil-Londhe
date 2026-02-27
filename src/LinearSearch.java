public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;

            }
        }
        return -1;

    }
}