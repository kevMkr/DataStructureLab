    public class SimpleListNode {
        static class Node{
            String data;
            Node next;

            //constructor
            Node(String newData){
                data = newData;
                next = null;
            }
        }

        public static void main(String[] args){
            SimpleListNode list = new SimpleListNode(); //empty linked list
            //inserting 4 nodes with data
            Node bill = new Node("Bill");
            Node tom = new Node("Tom");
            Node dick = new Node("Dick");
            Node harry = new Node("Harry");
            Node sue = new Node("Sue");
            Node sam = new Node("Sam");

            Node head = bill;

            bill.next = tom;
            tom.next = dick; // linked list to the 2nd node
            dick.next = sue; // linked 2nd node to the 3rd node
            sue.next = harry;
            harry.next = sam; // linked 3rd node to the 4th node

            System.out.println(bill.data);
            System.out.println(bill.next.data);
            System.out.println(bill.next.next.data);
            System.out.println(bill.next.next.next.data);
            System.out.println(bill.next.next.next.next.data);

            System.out.println("\nOther way to print by using head");
            System.out.println(head.data);
            System.out.println(head.next.data);
            System.out.println(head.next.next.data);
            System.out.println(head.next.next.next.data);
            System.out.println(head.next.next.next.next.data);
        }
    }
    class SimpleDoublyListNode {
        static class DNode {
            String data;
            DNode next;
            DNode prev;
    
            // Constructor
            DNode(String newData) {
                data = newData;
                next = null;
                prev = null;
            }
        }
    
        public static void main(String[] args) {
            SimpleDoublyListNode list = new SimpleDoublyListNode(); // empty doubly linked list
            // inserting nodes with data
            DNode bill = new DNode("Bill");
            DNode tom = new DNode("Tom");
            DNode dick = new DNode("Dick");
            DNode harry = new DNode("Harry");
            DNode sue = new DNode("Sue");
            DNode sam = new DNode("Sam");
    
            DNode head = bill;
            DNode tail = sam;
    
            bill.next = tom;
            tom.prev = bill;
            tom.next = dick;
            dick.prev = tom;
            dick.next = sue;
            sue.prev = dick;
            sue.next = harry;
            harry.prev = sue;
            harry.next = sam;
            sam.prev = harry;
    
            System.out.println(bill.data);
            System.out.println(bill.next.data);
            System.out.println(bill.next.next.data);
            System.out.println(bill.next.next.next.data);
            System.out.println(bill.next.next.next.next.data);
    
            System.out.println("\nOther way to print by using head");
            System.out.println(head.data);
            System.out.println(head.next.data);
            System.out.println(head.next.next.data);
            System.out.println(head.next.next.next.data);
            System.out.println(head.next.next.next.next.data);
    
            System.out.println("\nPrinting in reverse using tail");
            System.out.println(tail.data);
            System.out.println(tail.prev.data);
            System.out.println(tail.prev.prev.data);
            System.out.println(tail.prev.prev.prev.data);
            System.out.println(tail.prev.prev.prev.prev.data);
        }
    }