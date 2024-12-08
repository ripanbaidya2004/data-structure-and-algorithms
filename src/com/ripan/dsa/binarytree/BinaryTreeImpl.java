package com.ripan.dsa.binarytree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class BinaryTreeImpl {
    public static void main(String[] args) {
        /**
         *          10
         *        /   \
         *       20   30
         */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

    }
}
