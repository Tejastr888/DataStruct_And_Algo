package Graph;

public class Node {
    public int to;
    public int weight;
    public Node(int to,int weight){
        this.to=to;
        this.weight=weight;
    }
    @Override
    public String toString() {
        return "Node{" + "to=" + to + ", weight=" + weight + '}';
    }
}