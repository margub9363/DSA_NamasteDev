package linkedList;

public class MainMethod {
    public static void main(String[] args) {
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node current = node1;
        while (current!= null) {
            System.out.println(current.value);
            current = current.next;
        }
        */
        System.out.println("This is my Main method");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(0);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);


        int index = 3;
        System.out.println("Value at Index: " + index + " is: " + myLinkedList.get(index));

        myLinkedList.addAtIndex(3, 3);
        index = 3;
        System.out.println("Value at Index: " + index + " is: " + myLinkedList.get(index));

        System.out.println("Before Deleting ...");
        printMyLinkedLists(myLinkedList);
        index = 0;
        System.out.println("\nDeleting At index: " + index);
        myLinkedList.deleteAtIndex(index);
        printMyLinkedLists(myLinkedList);

        System.out.println("\n\n\n\n-------------------");
        System.out.println("Before Deleting ...");
        printMyLinkedLists(myLinkedList);
        index = 2;
        System.out.println("\nDeleting At index: " + index);
        myLinkedList.deleteAtIndex(index);
        printMyLinkedLists(myLinkedList);


    }

    private static void printMyLinkedLists(MyLinkedList myLinkedList) {
        Node current = myLinkedList.head;
        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
    }
}
