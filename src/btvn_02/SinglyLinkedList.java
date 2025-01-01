
package btvn_02;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public SinglyLinkedList() {
        this.head = null;
    }

    //add
    public void addNodeByIndex(int data, int index) {
        if (index < 0) {
            System.out.println("Index must be greater or equal to 0");
            return;
        } else if (index == 0) {
            this.addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        Node prev = null;
        int currIndex = 0;

        while (temp != null && currIndex < index) {
            prev = temp;
            temp = temp.next;
            currIndex++;
        }
        if (currIndex < index) {
            System.out.println("Index is invalid");
            System.out.println("Currently, the list has " + currIndex
                    + " elements");
            return;
        }

        newNode.next = temp;
        prev.next = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Tìm node cuoi cung
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // temp chinh thuc la node cuoi cung hien tai
        temp.next = newNode;
        // Lay node cuoi cung hien tai noi voi newnode

    }

    //remove
    public Node removeNodeByIndex(int index) {
        if (index < 0) {
            System.out.println("Index must be greater or equal to 0");
            return null;
        } else if (head == null) {
            System.out.println("Empty list");
            return null;
        } else if (index == 0) {
            return this.removeFirst();
        }

        Node temp = head;
        Node prev = null;
        int currIndex = 0;

        while (temp != null && currIndex < index) {
            prev = temp;
            temp = temp.next;
            currIndex++;
        }
        if (temp == null) {
            System.out.println("Index is invalid");
            System.out.println("Currently, the list has " + currIndex
                    + " elements");
            return null;
        }

        prev.next = temp.next;
        return temp;
    }

    public Node removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        Node delNode = head;
        head = head.next;
        return delNode;
    }

    public Node removeLast() {
        if (head == null) {
            System.out.println("Empty list");
            return null;
        } else if (head.next == null) {
            Node delNode = head;
            head = null;
            return delNode;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }

    // In ra link list
    public void printListNode() {
        if (head == null) {
            System.out.println("Nothing to print");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // getNodeByPosition()
    public Node getNodeByPosition(int index) {
        if (index < 0 || head == null) {
            return null;
        }
        Node temp = head;
        int currIndex = 0;
        while (temp != null && currIndex < index) {
            temp = temp.next;
            currIndex++;
        }
        return temp;
    }
}
