package Finals_Practice_Uzair;

import java.util.Arrays;

public class Graph {
    Object[] members;
    int[][] adjacencyMatrix;

    public Graph(Object[] a) {
        members = a;
        adjacencyMatrix = new int[a.length][a.length];
    }

    public void insertEdges(int a, int b) {
        adjacencyMatrix[a][b] = adjacencyMatrix[b][a] = 1;
    }

    public void insertEdge(Object a, Object b) {
        int x = getIndex(a);
        int y = getIndex(b);
        if (x == -1 || y == -1) {
            System.out.println("One of the elements doen't exist");
            return;
        }
        insertEdges(x, y);
    }

    public int getIndex(Object a) {
        int i = 0;
        while (i < members.length) {
            if (a.equals(members[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void display() {
        System.out.println("  " + Arrays.toString(members));

        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i] + " ");
            System.out.println(Arrays.toString(adjacencyMatrix[i]));
        }
    }

    public static void main(String[] args) {
        Object[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "J" };
        Graph g = new Graph(a);
        g.insertEdge("A", "B");
        g.insertEdge("A", "C");
        g.insertEdge("B", "D");
        g.insertEdge("C", "E");
        g.insertEdge("C", "F");
        g.insertEdge("D", "G");
        g.insertEdge("D", "H");
        g.insertEdge("E", "H");
        g.insertEdge("E", "J");
        g.insertEdge("F", "J");
        g.insertEdge("G", "H");
        g.insertEdge("H", "J");

        g.display();
    }
}