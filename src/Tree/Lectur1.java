package Tree;

import java.util.Scanner;

public class Lectur1 {
    Scanner sc=new Scanner(System.in);
    public class Node {
        int data;
        Node left;
        Node right;
        public Node()
        {
        }
        public Node (int val)
        {
            this.data = val;
        }
    }

    private Node root;

    public void CreateTree()
    {
        this.root = CreateTree(root);
    }
    private Node CreateTree(Node node)
    {
        int val = sc.nextInt();
        Node nn = new Node();
        nn.data = val;
        boolean hlc = sc.nextBoolean();
        if(hlc == true )
        {
            nn.left = CreateTree(nn);
        }
        boolean rhc = sc.nextBoolean();
        if(rhc == true )
        {
            nn.right = CreateTree(nn);
        }

        return nn;
    }
    public void PreOrder()
    {
        preorder(this.root);
    }
    private void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postOrder()
    {
        preorder(this.root);
    }
    private void postorder(Node root)
    {
        if(root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public void inOrder()
    {
        preorder(this.root);
    }
    public void inorder(Node root)
    {
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public int max()
    {
        return max(root);
    }
    public int  max (Node root){
        if(root==null) {
            return 0;
        }
        int val = root.data;
        int left = max(root.left);
        int right = max(root.right);
        return Math.max(val,Math.max(left ,right));
    }
}
