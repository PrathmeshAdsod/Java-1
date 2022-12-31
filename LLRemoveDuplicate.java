// Remove duplicate elements from SORTED linked list

public class LLRemoveDuplicate {

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

    // Wrong code 

    /* void remove(){
         Node temp = head;
         Node current = head;
         while(temp.next != head){

             if(temp.data == temp.next.data){
                // System.out.print(temp.data+" ");
                 current.next = temp;
                 current = temp.next;
                 temp.next = null;
                 temp = current.next;
             }else{
                temp = temp.next;
             }   
             
         }
     }*/


     // Right Code for remove duplicate from sorted LL

     
    void removeDuplicates()
    {
        Node temp = head;
 
        while (temp != null) {
             Node curr = temp;
           
            while (curr!=null && curr.data == temp.data) {
             curr = curr.next;
            }
         temp.next = curr;
         temp = temp.next;
        }
    }

    void Traverse(){
        Node temp = head;
 
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
     }

    public static void main(String[] args) {

        LLRemoveDuplicate ll = new LLRemoveDuplicate();
        
        ll.head = new Node(20);
        Node second = new Node(30);
        Node Third = new Node(40);
        Node Fourth = new Node(40);
        Node Fifth = new Node(50);
        Node Sixth = new Node(60);

        ll.head.next = second;
        second.next = Third;
        Third.next = Fourth;
        Fourth.next = Fifth;
        Fifth.next = Sixth;
        Sixth.next = null;

       // ll.remove();
       ll.Traverse();

       ll.removeDuplicates();

       ll.Traverse();


    }
}
