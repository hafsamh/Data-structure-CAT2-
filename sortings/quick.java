
package sortings;


public class quick {
  
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

        quickSort(nums, 0, size - 1);

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

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
