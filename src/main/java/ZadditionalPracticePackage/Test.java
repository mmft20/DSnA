package ZadditionalPracticePackage;

public class Test {

    public static void main(String[] args) {
        BinarySearchTree tree  = new BinarySearchTree();
        tree.insertNode(12);
        tree.display();
        tree.insertNode(15);
        tree.insertNode(11);
        tree.insertNode(12);
        tree.insertNode(14);

        tree.display();
    }
}
