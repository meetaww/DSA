import java.util.*;

public class BellmanFord {
   class Graph{
    int s, dis, w;

    Graph()
    {
        s=dis=w=0;

    }

}
int v, e;
Graph g[];

BellmanFord(int v, int e){
    this.v = v;
    this.e = e;

    g = new Graph[e];
;
for (int i = 0; i <e ; i++) {
    g[i] = new Graph();
}    
   }

   void bellmanFord(BellmanFord graph, int src) {
    int V = graph.v;
    int E = graph.e;

    // Distance array which will store distance from source to each vertex
    int[] dist = new int[V];

    for (int i = 0; i < V; ++i) {
        dist[i] = Integer.MAX_VALUE;
    }
    dist[src] = 0;

    for (int i = 1; i < V; ++i) {
        for (int j = 0; j < E; ++j) {
            int u = graph.g[j].s;
            int v = graph.g[j].dis;
            int w = graph.g[j].w;
            if (dist[u] != Integer.MAX_VALUE && (dist[u] + w) < dist[v]) {
                dist[v] = dist[u] + w;
            }
        }
    }

    // For negative cycle
    for (int i = 0; i < dist.length; ++i) {
        int u = graph.g[i].s;
        int v = graph.g[i].dis;
        int w = graph.g[i].w;
        if (dist[u] != Integer.MAX_VALUE && (dist[u] + w) < dist[v]) {
            System.out.println("Graph contains negative weight cycle");
            return;
        }
    }
    // Print each vertex distance from source
    printCost(dist, V);
}

static void printCost(int dist[], int n) {
    System.out.println("Vertex \t\t Distance from source");
    for (int i = 0; i < n; ++i) {
        System.out.println(i + "\t\t" + dist[i]);
    }
}

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter total no of vertex and edges");
    int vertex = s.nextInt();
    int edges = s.nextInt();
    BellmanFord graph = new BellmanFord(vertex, edges);

    for (int i = 0; i < edges; i++) {
        System.out.println("Enter source, destination and weight for " + i + " edge");
        int sc = s.nextInt();
        int de = s.nextInt();
        int we = s.nextInt();
        graph.g[i].s = sc;
        graph.g[i].dis = de;
        graph.g[i].w = we;
    }

    graph.bellmanFord(graph, 0);
    s.close();
}
}
