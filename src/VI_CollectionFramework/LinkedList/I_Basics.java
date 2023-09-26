package VI_CollectionFramework.LinkedList;

import java.util.LinkedList;

class Node {
    private String game;
    private double rating;
    private String genreu;

    public Node(String game, double rating, String genreu) {
        this.game = game;
        this.rating = rating;
        this.genreu = genreu;
    }

    public String getGame() {
        return game;
    }

    public double getRating() {
        return rating;
    }

    public String getGenreu() {
        return genreu;
    }
}

public class I_Basics {
    public static void main(String[] args) {
        LinkedList<Node> linkedList = new LinkedList<>();

        //THIS WILL GIVE ERROR
        //System.out.println(linkedList.getFirst());
        //System.out.println(linkedList.getLast());

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.add(new Node("Halo 3", 4.8, "FPS"));
        linkedList.add(new Node("Steralise", 4.4, "Strategic Management"));
        linkedList.add(new Node("GTA V", 4.9, "Open World RPG"));
        linkedList.add(new Node("Hitman: Blood Money", 5, "Stealth"));
        linkedList.add(new Node("Outlast", 4.2, "Psychological Horror"));

        System.out.println();

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println();

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println();

        for (Node node : linkedList)
            System.out.println(node.getGame() + ", " + node.getRating() + ", " + node.getGenreu());

        linkedList.remove(2);

        System.out.println();

        for (Node node : linkedList)
            System.out.println(node.getGame() + ", " + node.getRating() + ", " + node.getGenreu());

        //Add at specific index
        linkedList.add(2, new Node("Mass Effect", 4.2, "FPS"));

        System.out.println();

        for (Node node : linkedList)
            System.out.println(node.getGame() + ", " + node.getRating() + ", " + node.getGenreu());
    }
}
