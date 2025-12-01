//node class
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
//a class for methods of a tree
class tree_methods
{
    Node root;
    tree_methods()
    {
        this.root=null;
    }
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
    //method to find count of nodes
    public int countofnodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
    return 1+countofnodes(node.left)+countofnodes(node.right);
    }
    //method to find height of tree
    public int findHeight(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return 1 +Math.max(findHeight(node.left),findHeight(node.right));
    } 
    //method to find sum of nodes
    public int sumOfNodeData(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return node.data+sumOfNodeData(node.left)+sumOfNodeData(node.right);
    }
    //method to find sum of the leaf nodes
    public int sumOfLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null && node.right==null)
        {
            return node.data;
        }
        return sumOfLeafNodes(node.left)+sumOfLeafNodes(node.right);
    }
    //method to count number of leaf nodes
    public int countOfLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null && node.right==null)
        {
            return 1;
        }
        return countOfLeafNodes(node.left)+countOfLeafNodes(node.right);
    }
    //method to delete a tree(delete root if you want to delete complete tree)
    public void deleteTree(Node node)
    {
        if(node==null)
        {
            return;
        }
        //to delete right and left
        deleteTree(node.left);
        deleteTree(node.right);
        //disconnects nodes
        node.left=null;
        node.right=null;
        root=null;
    }
//     public int deleteTree(Node node)
// {
//     if (node == null)
//         return 0;

//     // delete left subtree and count
//     int left = deleteTree(node.left);

//     // delete right subtree and count
//     int right = deleteTree(node.right);

//     // disconnect current node
//     node.left = null;
//     node.right = null;

//     return 1 + left + right; // return total number of nodes deleted
// }

}
//main class and main method
public class Binary_tree_datastructure {
    public static void main(String args[])
    {
        //creating object for tree_methods class
        tree_methods ob=new tree_methods();
        //creating tree
        ob.root=new Node(1);
        ob.root.left=new Node(2);
        ob.root.right=new Node(3);
        ob.root.left.left=new Node(4);
        ob.root.left.right=new Node(5);
        ob.root.right.left=new Node(6);
        ob.root.right.right=new Node(7);

        System.out.println("Inorder traversal........");
        ob.inOrder(ob.root);
        System.out.println("\n");

        System.out.println("preorder traversal........");
        ob.preOrder(ob.root);
        System.out.println("\n");

        System.out.println("postorder traversal........");
        ob.postOrder(ob.root);
        System.out.println("\n");

        System.out.println("count of nodes........"+ ob.countofnodes(ob.root));
        System.out.println("height of tree........"+ob.findHeight(ob.root));
        System.out.println("sum of nodes data......."+ob.sumOfNodeData(ob.root));
        System.out.println("sum of leaf nodes......."+ob.sumOfLeafNodes(ob.root));
        System.out.println("count of leaf nodes....."+ob.countOfLeafNodes(ob.root));
        
    }
}
