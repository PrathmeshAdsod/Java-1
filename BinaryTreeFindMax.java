
import java.util.*;

public class BinaryTreeFindMax {

    static Node root ;

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
 

    static int findMaximum(Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMaximum(root.left);
        int right = findMaximum(root.right);

        if(left > right){
            result = left;
        }
        if(right > left){
            result = right;
        }

        return result;
    }

    public static void main(String[] args) {
            
        root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(6);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
 

         System.out.println("Maximum Element is " +findMaximum(root));
        
    }
}
