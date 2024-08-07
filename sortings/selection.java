
package sortings;

public class selection {
 

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

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        long endTime = System.currentTimeMillis();
        long sortingTime = endTime - startTime;

        System.out.println();
        System.out.println("After sorting:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("... (shortened)");
     
    }
}
