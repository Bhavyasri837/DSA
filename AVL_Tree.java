//self balancing binary search tree 
import java.util.*;
class Node {
    int data;
    int height;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.height = 1;
    }
}
class BinaryBalanced {
    Node root;
    int height(Node n) {
        if (n == null) return 0;
        return n.height;
    }
    int getbalance(Node n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }
    Node rightrotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;
        // Rotate
        x.right = y;
        y.left = t2;
        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x; // New root
    }
    Node leftrotate(Node y) {
        Node x = y.right;
        Node t2 = x.left;
        // Rotate
        x.left = y;
        y.right = t2;
        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x; // New root
    }
    Node inserting(Node root, int key) {
        // 1. Normal BST insert
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = inserting(root.left, key);
        else if (key > root.data)
            root.right = inserting(root.right, key);
        else
            return root; // duplicate keys not allowed
        // 2. Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));
        // 3. Get balance factor
        int balance = getbalance(root);
        // 4. ROTATION CASES
        // Case 1: LL (Left-Left)
        if (balance > 1 && key < root.left.data)
            return rightrotate(root);
        // Case 2: RR (Right-Right) `   
        if (balance < -1 && key > root.right.data)
            return leftrotate(root);
        // Case 3: LR (Left-Right)
        if (balance > 1 && key > root.left.data) 
        {
            root.left = leftrotate(root.left);
            return rightrotate(root);
        }
        // Case 4: RL (Right-Left)
        if (balance < -1 && key < root.right.data) 
        {
            root.right = rightrotate(root.right);
            return leftrotate(root);
        }
        // 5. return the (unchanged) root pointer
    return root;
    }
    //inorder traversal
     public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    //pre order traversal
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    //post order traversal
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

}
public class AVL_Tree { 
public static void main(String[] args) {

    BinaryBalanced tree = new BinaryBalanced();

        int[] arr = {5, 6, 7, 8, 3, 2, 1};

        // Insert values into AVL Tree
        for (int key : arr) 
        {
            tree.root = tree.inserting(tree.root, key);
        }

        // Print height of the final AVL Tree
        System.out.println("Height of AVL Tree: " + tree.height(tree.root));

        // Print balance factor of root
        System.out.println("Balance Factor of root: " + tree.getbalance(tree.root));

        // Traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}
