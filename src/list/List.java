package list;

import adt.Adt;
import node.Node;

public class List implements Adt {

    private Node head;
    private int size;


    public List (int data) {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getsize() {
        return size;
    }

    public void addFirst(int data) {
        this.head = new Node(data, this.head);
        size++;
    }

    public void add(int data) {
        if (this.isEmpty()) {
            this.addFirst(data);
        } else {
            Node currentNode = head;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data);
            size++;
        }
    }


    public int remove(int data) {
        Node currentNode = this.head;
        if (this.head != null) {
            this.head = this.head.nextNode;
        }
        if (currentNode != null) {
            size--;
            return currentNode.data;
        } else return Integer.MIN_VALUE;
    }


    public Node search(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode; // Node with the given data found
            }
            currentNode = currentNode.nextNode;
        }
        return null; // Node with the given data not found
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return ;
        }
        System.out.print("[");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.nextNode != null) {
                System.out.print("=>");
            }
            currentNode = currentNode.nextNode;
        }
        System.out.println("]");


    }
}