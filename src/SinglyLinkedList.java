public class SinglyLinkedList {

    private ListNode head;

    public static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        if(head == null){
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null){
           count++;
           current = current.next;
        }

        return count;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(10);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

//        ListNode current = sll.head;
//        while (current != null){
//            System.out.print(current.data + "-->");
//            current = current.next;
//        }
//        System.out.println("null");
//        System.out.println(sll.length());
    }
    
}
