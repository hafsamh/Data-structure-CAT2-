
package Stack;

public class StackOperations {
    stack stack;

    public StackOperations(stack stack) {
        this.stack = stack;
    }

    public void insert(int data) {
        stack.push(data);
    }

    public void delete(int data) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int temp = stack.pop();
            while (temp != data && !stack.isEmpty()) {
                temp = stack.pop();
            }
            if (temp != data) {
                System.out.println("Element not found");
            }
        }
    }

    public void traverse() {
        stack.show();
    }

    public boolean search(int data) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return false;
        } else {
            int temp = stack.pop();
            while (temp != data && !stack.isEmpty()) {
                temp = stack.pop();
            }
            if (temp == data) {
                return true;
            } else {
                System.out.println("Element not found");
                return false;
            }
        }
    }
}

