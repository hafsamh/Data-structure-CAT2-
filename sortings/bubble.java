
package sortings;


public class bubble {
 
    public static void main(String[] args) {

        int size = 100000;
        int[] nums = new int[size];
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(1000000); 
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("... (shortened)");

        long startTime = java.lang.System.currentTimeMillis();

        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        long endTime = java.lang.System.currentTimeMillis();
        long sortingTime = endTime - startTime;

        System.out.println();
        System.out.println("After sorting:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("... (shortened)");
        System.out.println("Sorting time: " + sortingTime + " milliseconds");
    }
}