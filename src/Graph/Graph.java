package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph{
    public List<List<Node>> graph;
    public Graph(){
        graph=new ArrayList<>();
    }
    public void addVertices(int num){
        for(int i=0;i<num;i++){
            graph.add(new ArrayList<>());
        }
    }
    public void addNode(int source,int to,int weight){
        graph.get(source).add(new Node(to,weight));
    }
    public void print(){
        for (List<Node> nodes : graph) {
            System.out.println(nodes);
        }
    }
    @Override
    public String toString() {
        return graph.toString();
    }
}