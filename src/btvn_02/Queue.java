
package btvn_02;

/**
 *
 * @author Nguyen
 */
public class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    public Node dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return null;
        }
        Node temp = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return temp;
    }
}
