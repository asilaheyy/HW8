public class Main {
    public static void main(String[] args) {
        //ДЗ
        // 1.
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};
        int[] myArray = {20, 25, 30, 35};

        // 2.
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
                break;
            }
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (int j = 0; j < numbers.length; j++) {
            if (j == numbers.length - 1) {
                System.out.print(numbers[j]);
                break;
            }
            System.out.print(numbers[(int) j] + ",");
        }
        System.out.println();
        for (int k = 0; k < myArray.length; k++) {
            if (k == myArray.length - 1) {
                System.out.print(myArray[k]);
                break;
            }
            System.out.print(myArray[k] + ",");
        }
        System.out.println();
        // 3.
        for (int i = nums.length - 1; i >= 0; i--) {
            if (0 == i) {
                System.out.print(nums[i]);
                break;
            }
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (int j = numbers.length - 1; j >= 0; j--) {
            if (0 == j) {

                System.out.print(numbers[j]);
                break;
            }
            System.out.print(numbers[j] + ",");
        }
        System.out.println();
        for (int k = myArray.length - 1; k >= 0; k--) {
            if (0 == k) {
                System.out.print(myArray[k]);
                break;
            }
            System.out.print(myArray[k] + ",");
        }
        System.out.println();
        // 4.
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] % 2 != 0) {
                nums[a] = nums[a] + 1;
            }
            if (a == nums.length - 1) {
                System.out.print(nums[a]);
                break;
            }
            System.out.print(nums[a] + ",");

        }

    }
}