package JavaMarathone2020.JavaMarathon2020.src.main.java.day10;

public class Task1 {
    public static void main(String[] args) {
        Tree root = new Tree();

        root.insetNode(20);
        root.insetNode(57);
        root.insetNode(12);
        root.insetNode(8);
        root.insetNode(9);
        root.insetNode(58);
        root.insetNode(21);
        root.insetNode(123);
        root.insetNode(17);
        root.insetNode(1);
        root.insetNode(3);
        root.insetNode(66);
        root.insetNode(29);

        root.printTree();

        root.deleteNode(9);
        root.printTree();

        Node foundNode = root.findNodeByValue(66);
        foundNode.printNode();
    }
}
