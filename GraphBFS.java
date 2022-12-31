
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

    public int BFS(int source,int destination){
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == destination) break;

            for(int colony : adj[cur]){
                if(!vis[colony]){
                    vis[colony] = true;
                    q.add(colony);
                    parent[colony] = cur;
                }
            }
        }

        int cur = destination;
        int distance = 0;

        while(parent[cur] != -1){
            System.out.println(cur+" -> ");
            cur = parent[cur];
            distance++;
        }
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

        graph.BFS(source, destination);
    }
}
