import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendBrotherOrSister(Person p1, Person p2) {
        if (p1.gender == "male") {
            if (p2.gender == "female") {
                tree.add(new Node(p1, Relationship.brother, p2));
                tree.add(new Node(p2, Relationship.sister, p1));
            }
            else if (p2.gender == "male") {
                tree.add(new Node(p1, Relationship.brother, p2));
                tree.add(new Node(p2, Relationship.brother, p1));
            }
        }
        if (p1.gender == "female") {
            if (p2.gender == "female") {
                tree.add(new Node(p1, Relationship.sister, p2));
                tree.add(new Node(p2, Relationship.sister, p1));
            }
            else if (p2.gender == "male") {
                tree.add(new Node(p1, Relationship.sister, p2));
                tree.add(new Node(p2, Relationship.brother, p1));
            }
        }
    }

}
