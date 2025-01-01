package btvn_02;
public class Main {

    public static void main(String[] args) {
        // Stack
        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Popped from stack: " + stack.pop().data);

        // Queue
        Queue queue = new Queue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Dequeued from queue: " + queue.dequeue().data);
    }
    
}
