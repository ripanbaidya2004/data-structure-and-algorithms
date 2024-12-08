package com.ripan.dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

// leetcode 144
// root -> left -> right
public class PreOrderTraversal {

    public void preorder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

}
