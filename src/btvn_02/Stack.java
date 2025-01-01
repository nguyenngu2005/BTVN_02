
package btvn_02;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
    
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public Node pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }
}
