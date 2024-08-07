
package Stack;

public class Test {
    public static void main(String[] args) {
           stack nums = new stack();
          //   System.out.println("Empty = "+ nums.isEmpty());

    nums.push(15);
        nums.show();
    nums.push(8);
        nums.show();
    nums.push(10);
        nums.show();
    nums.push(7);
        nums.show();
    nums.push(17);
        nums.show();
    nums.push(77);
        nums.show();
       //System.out.println(nums.peek());
  // System.out.println("size is "+nums.size());
    // System.out.println("Empty = "+ nums.isEmpty());
   System.out.println(nums.pop());
   System.out.println(nums.pop());
   System.out.println(nums.pop());
   System.out.println(nums.size());
   
   
   
        StackOperations operations = new StackOperations(nums);

        operations.insert(15);
        operations.traverse();
        operations.insert(8);
        operations.traverse();
        operations.insert(10);
        operations.traverse();
        operations.insert(7);
        operations.traverse();
        operations.insert(17);
        operations.traverse();
        operations.insert(77);
        operations.traverse();

        System.out.println("Searching for 10: " + operations.search(10));
        System.out.println("Searching for 20: " + operations.search(20));

        operations.delete(10);
        operations.traverse();
        operations.delete(77);
        operations.traverse();

        System.out.println("Size: " + nums.size());
        System.out.println("Empty: " + nums.isEmpty());

 }
}