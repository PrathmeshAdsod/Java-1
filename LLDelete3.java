/* Something is Wrong in this CODE */

// Delete the consequetive elements in an linked list whose sum is equal to zero


class LLDelete3{

    Node head;

    /*  Node Class */
    public static class Node{
        int data;
        Node next;

        /*  Constructor  */
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteSumZeroElement(){
        Node temp = head;
       Node current = head; 
        while(temp.next != null){
            if((temp.data - temp.next.data) == 0){
                current = temp.next.next;
                temp = temp.next;
                temp.next = null;
                temp = current;
                head = current;
               
            }else{
                temp = temp.next;
                current = current.next;
            }
          //  System.out.println(temp.data);
            
        }
        
        
    } 

    public static void main(String[] args) {
        LLDelete3 ll = new LLDelete3();

        ll.head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(3);
        Node fourth = new Node(6);
        Node fifth = new Node(7);
        Node six = new Node(7);
        Node sev = new Node(8);
        Node eight = new Node(9);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = sev;
        sev.next = eight;
        eight.next = null;

        ll.deleteSumZeroElement();
        ll.display();
       
    }
}