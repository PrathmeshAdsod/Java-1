// Nth node from end of linked list 


public class LLSearchFromLast {
    Node head;

    public static class Node{
         int data;
         Node next;
 
         Node(int data){
             this.data = data;
             this.next = null;
         }
     }

     void searchFromLast(int k,int N){
          Node temp = head;
          int count = 1;

          while(temp != null && count < N-k+1){
             temp = temp.next;
             
             count++;
          }
          System.out.println(temp.data);
     }


    public static void main(String[] args) {

        LLSearchFromLast ll = new LLSearchFromLast();
        
        ll.head = new Node(20);
        Node sec = new Node(30);
        Node thi = new Node(40);
        Node fou = new Node(50);
        Node fif = new Node(60);
        Node sec2 = new Node(70);
        Node thi2 = new Node(80);
        Node fou2 = new Node(90);
        Node fif2 = new Node(100);

        ll.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fif;
        fif.next = sec2;
        sec2.next = thi2;
        thi2.next = fou2;
        fou2.next = fif2;
        fif2.next = null;

        ll.searchFromLast(4, 9);
    }
}
