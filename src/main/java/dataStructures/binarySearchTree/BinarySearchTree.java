package dataStructures.binarySearchTree;

public class BinarySearchTree {

    Node root;

    public void insert(int data){
        Node node = new Node(data);
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node insertNode){

        if(root == null){
            root = insertNode;
            return root;
        }else if (insertNode.data < root.data){
            root.left = insertHelper(root.left , insertNode);
        }else{
            root.right = insertHelper(root.right, insertNode);
        }

        return root;
    }

    // Default DISPLAY method : Ascending Order
    public void display(){
        displayHelper(root);
    }

    // Ascending Order Display
    public void displayAscending(){
        displayHelper(root);
    }

    // Descending Order Display
    public void displayDescending(){
        displayHelperDescending(root);
    }

    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    private void displayHelperDescending(Node root){
        if(root != null){
            displayHelperDescending(root.right);
            System.out.println(root.data);
            displayHelperDescending(root.left);
        }
    }

    public boolean search(int data){
        return searchHelper(root,data);
    }

    private boolean searchHelper(Node root,int data){
        if(root == null){
            return false;
        }else if(root.data == data){
            return true;
        }else if(root.data > data){
            return searchHelper(root.left,data);
        }else{
            return searchHelper(root.right,data);
        }
    }

    public void remove(int data){
            if(search(data)){
                removeHelper(root, data);
            }else{
                System.out.println(data + " Could not be found in the tree.");
            }
    }

    private Node removeHelper(Node root, int data){
        if(root == null){
            return null;
        }else if(root.data > data){
            root.left = removeHelper(root.left , data);
        }else if(root.data < data){
            root.right = removeHelper(root.right, data);
        }else{
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.right != null){
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }else{
                root.data = successor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }
}
