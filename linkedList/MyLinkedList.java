package linkedList;

public class MyLinkedList {
    public Node head;
    public int size;

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // Add at head
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size++;
    }

    // Add at specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Not Possible to add");
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Not Possible to delete");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}
