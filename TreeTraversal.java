import java.util.Scanner;


public class TreeTraversal {
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

    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);      // for left

        System.out.print(root.data+" ");   // for main data
        
        inOrder(root.right);     // for right
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");

        preOrder(root.left);

        preOrder(root.right);
        
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);

        postOrder(root.right);

        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
       
        Node root = createTree();

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.err.println();
        postOrder(root);
        System.out.println();
        
    }
}
