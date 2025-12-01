import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root=null;

    //inserting nodes to a BST
    public Node insertIntoBST(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(data<root.data)
        {
            root.left=insertIntoBST(root.left, data);
        }
        else if(data>root.data)
        {
            root.right=insertIntoBST(root.right, data);
        }
        return root;
    }

    //traversal to print data in the tree
    //Inorder traversal in the tree(left,root,right)
    public void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    //preorder traversal in tree(root,left,right)
    public void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //postorder traversal in tree(left,right,root)
    public void postOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    //method searching in BST
    public boolean search(Node node,int key)
    {
        if(node==null)
        {
            return false;
        }
        else if(node.data==key)
        {
            return true;
        }
        else if(key<node.data){
           return search(node.left, key);
        }
        else
        {
            return search(node.right, key);
        }
    }

    //finding minimum value in a BST
    public void minimumvalue(Node root)
    {
        if(root==null)
        {
            System.out.println("empty");
        }
        while(root.left!=null)
        {
            root=root.left;
        }
        System.out.println(root.data);
    }
    //method to find smallest node
        public Node findmin(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }

    //finding maximum value in the BST
    public void maxvalue(Node root)
    {
        if(root==null)
        {
            System.out.println("empty");
        }
        while(root.right!=null)
        {
            root=root.right;
        }
        System.out.println(root.data);
    }

    // Helper recursive method to disconnect nodes
    private void delete(Node node) {
    if (node == null) {
        return;
    }
    delete(node.left);
    delete(node.right);
    node.left = null;
    node.right = null;
    }
    // Public method to delete the entire tree
    public void deleteTree() {
    delete(root); // disconnect all nodes
    root = null;  // remove reference from BST object
    }


    //method to delete particular value in bst
    public Node deletebyValue(Node root,int value)
    {
        if(root==null)
        {
            System.out.println("null");
            return null;
        }
        // if(root.data==value)
        // {
        //     root=null;
        // }
        if(value>root.data)
        {
            root.right=deletebyValue(root.right, value);
        }
        else if(value<root.data)
        {
            root.left=deletebyValue(root.left, value);
        }
        else{
            //node found
        //if node has no children
        if(root.left==null && root.right==null)
        {
            return null;
        }
        //if node has single children
        else if(root.left==null)
        {
            return root.right;
        }
        else if(root.right==null)
        {
            return root.left;
        }
        //if nodes has two children
        //replace with inorder successor
       Node temp=findmin(root.right);
       root.data=temp.data;
       root.right=deletebyValue(root.right, temp.data);
    }
        return root;
}

    // printing tree in mirror format (means right=left and left=right)
        public void mirrortree(Node root)
        {
            if(root==null)
            {
                return;
            }
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
            mirrortree(root.left);
            mirrortree(root.right);
        }
}
public class binary_search_tree_BST{
    public static void main(String args[])
    {
        BST ob=new BST();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j:arr)
        {
            ob.root=ob.insertIntoBST(ob.root, j);
        }
        // ob.root=ob.insertIntoBST(ob.root, 12);
        // ob.root=ob.insertIntoBST(ob.root, 20);
        // ob.root=ob.insertIntoBST(ob.root, 32);
        // ob.root=ob.insertIntoBST(ob.root, 9);

        System.out.println("Inorder traversal........");
        ob.inOrder(ob.root);
        System.out.println("\n");

        System.out.println("preorder traversal........");
        ob.preOrder(ob.root);
        System.out.println("\n");

        System.out.println("postorder traversal........");
        ob.postOrder(ob.root);
        System.out.println("\n");

        System.out.println("searching......"+ob.search(ob.root, 6)+"\n");

        System.out.println("minimum element in the tree :");
        ob.minimumvalue(ob.root);

        System.out.println("maximum element in the tree :");
        ob.maxvalue(ob.root);

        ob.root = ob.deletebyValue(ob.root, 20);

        System.out.println("mirror tree:");
        ob.mirrortree(ob.root);

        System.out.println("Inorder traversal........");
        ob.inOrder(ob.root);
        System.out.println("\n");
      

    }
}

