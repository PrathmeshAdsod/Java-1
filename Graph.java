
// Making Graph


import java.util.*;

// Adjacenty LinkedList

public class Graph {

    private LinkedList<Integer> adj[];

    // Constructor
    private Graph(int v){
       adj = new LinkedList[v];
       for(int i=0; i<v; i++){
           adj[i] = new LinkedList<Integer>();
       }
    }

    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Vertices and Egdes");

        int v = sc.nextInt();
        int e = sc.nextInt();

        Graph graph = new Graph(v);

        System.out.println("Enter "+e+" edges");
        for(int i=0; i < e; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();

            graph.addEdge(source, destination);
        }
    }
}
