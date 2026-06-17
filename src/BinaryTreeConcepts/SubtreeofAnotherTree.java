package BinaryTreeConcepts;

public class SubtreeofAnotherTree {
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
    static class binary {
        static int idx = -1;

        public static Build.Node BuildTree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Build.Node newnode = new Build.Node(node[idx]);
            newnode.left = BuildTree(node);
            newnode.right = BuildTree(node);
            return newnode;
        }
        public  static boolean isidedntical(Node node , Node subRoot){
            if(node == null && subRoot == null ){
                return true;
            }else if(node == null || subRoot == null || node.data != subRoot.data){
                return false;
            }
            if(!isidedntical(node.left, subRoot.left )){
                return false;
            }
            if(!isidedntical(node.right, subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubtree(Node root, Node subRoot){
            if (root == null){
                return false;
            }
            if(root.data == subRoot.data){
                if(isidedntical(root,subRoot)){
                    return true;
                }
            }
            boolean leftAns = isSubtree(root.left,subRoot);
            boolean rightAns = isSubtree(root.right,subRoot);
            return leftAns || rightAns;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(binary.isSubtree(root,subRoot));
        }
    }
