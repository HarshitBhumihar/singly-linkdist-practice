package node;

public class Node {
    public int data;
    public Node nextNode;
    public Node(int data) {
        this.data = data;
    }
    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }



    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                ", nextNode=" + nextNode +
                '}';
    }



    }