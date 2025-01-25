import Graph.Graph;
import Graph.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        long res=binpow(3,13);
        System.out.println(res);
    }
    public static long binpow(long a,long n){
        if(n==0) return 1;
        long res= binpow(a,n/2);
        if(n>0 && n%2==0){
            return res * res;
        }else{
            return res * res * a;
        }
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
        graph.print();
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
    public static void dfs(List<List<Node>> graph,Node source){
        boolean[] visited=new boolean[graph.size()];
        List<Node> list=new ArrayList<Node>();
        visited[source.to]=true;
        list.add(source);
        while (!list.isEmpty()){
            Node des=list.removeLast();
            System.out.println(des.toString());
            for(int i=0;i<graph.get(des.to).size();i++){
                if(!visited[graph.get(des.to).get(i).to]){
                    visited[graph.get(des.to).get(i).to]=true;
                    list.add(graph.get(des.to).get(i));
                }
            }
        }
    }
    public static void dfsRecursive(List<List<Node>> graph,Node source){
        boolean [] visited =new boolean[graph.size()];
        dfsHelper(graph,source,visited);
    }
    public static void dfsHelper(List<List<Node>> graph,Node source,boolean [] visited){
        visited[source.to]=true;
        System.out.println(source.toString());
        for(int i = 0;i<graph.get(source.to).size();i++){
            if(!visited[graph.get(source.to).get(i).to]){
                dfsHelper(graph,graph.get(source.to).get(i),visited);
            }
        }
    }
}


