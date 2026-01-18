package DoublyLinkedList;

public class MainDoublyLinkedList {
        public static void main(String[] args) {
            DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
            dlist.addFirst(1);
            dlist.addFirst(2);
            dlist.addLast(3);
            dlist.addLast(4);
            dlist.addLast(5);
            dlist.removeFirst();
            dlist.removeLast();
            dlist.display();
        }
    }

