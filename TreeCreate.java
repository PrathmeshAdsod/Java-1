import java.util.Scanner;

public class TreeCreate {

    static class Node{
        Node left,right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    static Node createTree(){

        // Recursive Leaf of Faith

        Node root = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data ");
        int data = sc.nextInt();
        
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for data " +data);
        root.left = createTree();

        System.out.println("Enter Right for data " +data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        
       

        createTree();
        
    }
}
