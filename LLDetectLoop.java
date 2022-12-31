
//  Floyd’s Cycle-Finding Algorithm:  

public class LLDetectLoop {

    Node head;

   public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("Null");

    }

     void detectLoop(){
        Node slow = head;
        Node fast = head;
        int flag = 0;

        while(slow != null && fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;

              if(slow == fast){
                  flag = 1;
                  break;
              }
        }
        if(flag == 1){
            System.out.println("Loop Found");
        }else{
            System.out.println("Loop is not Found");
        }
    }

    public static void main(String[] args) {
        LLDetectLoop ll = new LLDetectLoop();

       
        ll.head = new Node(2);
        Node sec = new Node(3);
        Node thi = new Node(4);
        Node fou = new Node(5);
        Node fif = new Node(6);

        ll.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fif;
        fif.next = sec;

        ll.detectLoop();

    }
}
