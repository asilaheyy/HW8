public class Main {
    public static void main(String[] args) {
        //ДЗ
        // 1.
        int[] nums = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        int[] myArray = {20, 25, 30, 35};

        // 2.
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (double j = 0; j < numbers.length; j++) {
            System.out.print(numbers[(int) j] + ",");
        }
        System.out.println();
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + ",");
        }
        System.out.println();
        // 3.
        for (int i = 2; i >= 0; i--) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (double j = 2; j >= 0; j--) {
            System.out.print(numbers[(int) j] + ",");
        }
        System.out.println();
        for (int k = 3; k >= 0; k--) {
            System.out.print(myArray[k] + ",");
        }
        System.out.println();
        // 4.
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] * 2 + ",");
        }

    }
}