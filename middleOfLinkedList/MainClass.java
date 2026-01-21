package middleOfLinkedList;

/* find the middle element of the LinkedList
1,2,3,4,5,6,7 -> 4
1,2,3,4,5,6,7,8 -> 5
 */
public class MainClass {
    public static void main(String[] args) {
        NodeOfLinkedList nodeOfLinkedList = new NodeOfLinkedList(1);
        nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(2);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(3);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(4);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(5);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(6);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(7);
        nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList.nodeOfLinkedList = new NodeOfLinkedList(8);

        System.out.println("hello world!");
        NodeOfLinkedList slowPointer = nodeOfLinkedList;
        NodeOfLinkedList fastPointer = nodeOfLinkedList;
        while (fastPointer!=null && fastPointer.nodeOfLinkedList!=null) {
            slowPointer = slowPointer.nodeOfLinkedList;
            fastPointer = fastPointer.nodeOfLinkedList.nodeOfLinkedList;
        }
        System.out.println("Middle Element is: " + slowPointer.value );
    }
}
