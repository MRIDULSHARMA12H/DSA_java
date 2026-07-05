package BinaryTreeConcepts;

import java.util.*;

public class Build {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
       static int idx = -1;
        public  static Node BuildTree(int[] node){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = BuildTree(node);
            newnode.right = BuildTree(node);
            return newnode;
        }
        public static void preorder(Node root){
            if(root == null){
//                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null ){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }
        public  static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public static void levelorder(Node root){
            if(root == null ){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int maxhight = Math.max(lh, rh) + 1;
            return maxhight;
        }
        public static int CountNode(Node root){
            if(root == null){
                return 0;
            }
            int cl = CountNode(root.left);
            int cr = CountNode(root.right);
            int count = (cl + cr) +1;
            return count;
        }
        public static int NodeSum(Node root){
            if(root == null ){
                return 0;
            }
            int leftsum = NodeSum(root.left);
            int rightsum = NodeSum(root.right);
            int treeSum = leftsum + rightsum + root.data;
            return  treeSum;
        }
        public static int Diameter(Node root){
            if(root == null){
                return 0;
            }
            int ldiam = Diameter(root.left);
            int rdiam = Diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfdiam = lh + rh + 1;
            int maxDiameter = Math.max(selfdiam , Math.max(ldiam, rdiam));
            return maxDiameter;
        }
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diameter(Node root){
            if(root == null){
                return new Info(0,0);
            }
            Info leftdiam = diameter(root.left);
            Info rightdiam = diameter(root.right);
            int diam = Math.max(Math.max(leftdiam.diam , rightdiam.diam) , leftdiam.ht + rightdiam.ht + 1);
            int ht = Math.max(leftdiam.ht , rightdiam.ht) +1;
            return new Info(diam , ht);
        }
//        kth level of tree
        public static  void klevel(Node root , int k , int l){
            if(root == null){
                return;
            }
            if(l == k){
                System.out.print(root.data + " ");
                return;
            }
            klevel(root.left,k,l+1);
            klevel(root.right,k,l+1);
        }
    }
    public static void main(String[] args) {
        int [] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree bt = new binaryTree();
        Node root = bt.BuildTree(node);
//        System.out.println(root.data);
//        bt.preorder(root);
//        bt.inorder(root);
//        bt.postorder(root);
//        bt.levelorder(root);
//        System.out.print(bt.height(root));
//        System.out.println(bt.CountNode(root));
//        System.out.println(bt.NodeSum(root));
//        System.out.println(bt.diameter(root).diam);
        int k = 3;
        int l =1;
        bt.klevel(root,k,l);
    }
}
