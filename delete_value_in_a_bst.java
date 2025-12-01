import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root = null;

    // Inserting nodes into BST
    public Node insertIntoBST(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertIntoBST(root.left, data);
        } else if (data > root.data) {
            root.right = insertIntoBST(root.right, data);
        }
        return root;
    }

    // Inorder traversal
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Delete a particular value in the BST
    public Node deleteValue(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteValue(root.left, key);
        } else if (key > root.data) {
            root.right = deleteValue(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteValue(root.right, root.data);
        }
        return root;
    }

    // Helper method to find the minimum value in a subtree
    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}

public class delete_value_in_a_bst{
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to insert:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            bst.root = bst.insertIntoBST(bst.root, val);
        }

        System.out.println("Inorder traversal before deletion:");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.println("Enter the value to delete:");
        int key = sc.nextInt();
        bst.root = bst.deleteValue(bst.root, key);

        System.out.println("Inorder traversal after deletion:");
        bst.inOrder(bst.root);
        System.out.println();

        sc.close();
    }
}
