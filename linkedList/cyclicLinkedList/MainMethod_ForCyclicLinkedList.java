package linkedList.cyclicLinkedList;

import java.util.HashSet;
import java.util.Set;

/*
Cyclic Linked list means
    EX: Node 1 is pointing to Node 2
        Node 2 is pointing to Node 3
        Node 3 is pointing to Node 4
        Node 4 is pointing to Node 2 <<< Here its creating a cycle.

In this question the ask is like, we have to validate whether the given linked list is cyclic or not
*/
public class MainMethod_ForCyclicLinkedList {
    public static void main(String[] args) {
        Node_ForCyclicLinkedList linkedList = new Node_ForCyclicLinkedList(1);
        linkedList.next = new Node_ForCyclicLinkedList(2);
        linkedList.next.next = new Node_ForCyclicLinkedList(3);
        linkedList.next.next.next = new Node_ForCyclicLinkedList(4);

        // now i am making this cyclic
        linkedList.next.next.next.next =  linkedList.next;

        // if we try to keep on printing the next node value then it will stuck in infinity
//        while (linkedList.next != null) {
//            System.out.println(linkedList.value);
//            linkedList = linkedList.next;
//        }

        // check whether the give linked list is cyclic or not
        isGivenLinkedListIsStatic(linkedList);
    }

    private static void isGivenLinkedListIsStatic(Node_ForCyclicLinkedList linkedList) {
        Set<Node_ForCyclicLinkedList> uniqueNodes = new HashSet<>();
        while (linkedList != null) {
            if(uniqueNodes.contains(linkedList)) {
                System.out.println("Its a cyclic Linked Lists");
                return;
            }
            uniqueNodes.add(linkedList);
            linkedList = linkedList.next;
        }
    }
}
