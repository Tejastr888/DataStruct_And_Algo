import Graph.Graph;
import Graph.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Graph graph=createGraph();
        bfs(graph.graph,new Node(0,0));
    }
    private static Graph createGraph() {
        Graph graph=new Graph();
        graph.addVertices(5);
        graph.addNode(0,1,10);
        graph.addNode(0,2,8);
        graph.addNode(1,2,9);
        graph.addNode(1,3,5);
        graph.addNode(3,2,3);
        graph.addNode(2,4,1);
        graph.addNode(4,3,6);
        graph.addNode(4,0,7);
        return graph;
    }
    public static void bfs(List<List<Node>> graph, Node source){
        boolean[] visited=new boolean[graph.size()];
        Queue<Node> queue=new LinkedList<>();
        visited[source.to]=true;
        queue.add(source);
        while (!queue.isEmpty()){
            Node des=queue.poll();
            System.out.println(des.toString());
            for(int i=0;i<graph.get(des.to).size();i++){
                if(!visited[graph.get(des.to).get(i).to]){
                    visited[graph.get(des.to).get(i).to]=true;
                    queue.add(graph.get(des.to).get(i));
                }
            }
        }
    }
}


