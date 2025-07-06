package dataStructures.binarySearchTree;

public class TestBinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(9);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);


        System.out.println("Default Display ---------------------- ");
        tree.display();
        System.out.println("Ascending Display -------------------- ");
        tree.displayAscending();
        System.out.println("Descending Display ------------------- ");
        tree.displayDescending();

/*        System.out.println(tree.search(8));
        System.out.println(tree.search(13));
        tree.remove(0);
        tree.remove(5);
        tree.display();*/
    }
}
