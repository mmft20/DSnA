package ZadditionalPracticePackage;

public class BinarySearchTree {

    Node root;

    public void insertNode(int data){
        root = insertNodeHelper(new Node(data));
    }

    private Node insertNodeHelper(Node node){

        if(root == null){
            root = node;
            return root;
        }else if(node.data < root.data){
            root.left = insertNodeHelper(root.left);
        }else{
            root.right = insertNodeHelper(root.right);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node node){
        if(node!=null){
            displayHelper(node.left);
            System.out.println(node.data);
            displayHelper(node.right);
        }
    }
}
