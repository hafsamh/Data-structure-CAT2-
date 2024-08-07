
package sortings;


public class insertion {
  

    public static void main(String[] args) {
        int size = 100000;
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = (int) (Math.random() * 1000000);
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("... (shortened)");

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        long endTime = System.currentTimeMillis();
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

