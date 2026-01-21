package linkedList.reverseTheLinkedList;

public class MainMethod {
    public static void main(String[] args) {
        Node_ForReversingLinkedList myLinkedList = new Node_ForReversingLinkedList(1);
        // we are just adding like next next << because we don't want to spend time on implementing a method like addToHead....
        myLinkedList.next = new Node_ForReversingLinkedList(2);
        myLinkedList.next.next = new Node_ForReversingLinkedList(3);
        myLinkedList.next.next.next = new Node_ForReversingLinkedList(4);
        myLinkedList.next.next.next.next = new Node_ForReversingLinkedList(5);
        System.out.println("LinkedList in the forward Direction");
        printCurrentLinkedList(myLinkedList);

        System.out.println("\nProcessing to reverse the Given LinkedLists");
        Node_ForReversingLinkedList reversedLinkedList = reversingLinkedList(myLinkedList);
        System.out.println("Reversed Linked List---- ");
        printCurrentLinkedList(reversedLinkedList);

    }

    private static void printCurrentLinkedList(Node_ForReversingLinkedList linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.value + "  ");
            linkedList = linkedList.next;
        }
    }

    private static Node_ForReversingLinkedList reversingLinkedList(Node_ForReversingLinkedList myLinkedList) {
        Node_ForReversingLinkedList prev = null;
        Node_ForReversingLinkedList temp = null;
        Node_ForReversingLinkedList current = myLinkedList;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        current = prev;
        return current;
    }
}
