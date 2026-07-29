import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MyStack {
    private Queue<Integer> queue;

    // Constructor
    public MyStack() {
        queue = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        queue.offer(x);

        // Rotate the queue
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    // Remove top element
    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return queue.poll();
    }

    // Return top element
    public int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return queue.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }

    // Display stack elements
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.print("Stack: ");
        for (int x : queue) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class stack3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        while (true) {
            System.out.println("\n===== STACK USING QUEUE =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Check Empty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed into stack.");
                    break;

                case 2:
                    int removed = stack.pop();
                    if (removed != -1)
                        System.out.println("Popped Element: " + removed);
                    break;

                case 3:
                    int top = stack.top();
                    if (top != -1)
                        System.out.println("Top Element: " + top);
                    break;

                case 4:
                    if (stack.empty())
                        System.out.println("Stack is Empty.");
                    else
                        System.out.println("Stack is Not Empty.");
                    break;

                case 5:
                    stack.display();
                    break;

                case 6:
                    System.out.println("Program Terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}