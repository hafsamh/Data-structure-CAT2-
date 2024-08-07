
package sortings;


public class merge {
  
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

  

        long endTime = System.currentTimeMillis();
        long sortingTime = endTime - startTime;

        System.out.println();
       
}
}
