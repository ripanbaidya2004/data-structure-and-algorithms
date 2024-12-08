package com.ripan.dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

// leetcode 94
// left -> root -> right
public class InOrderTraversal {

    public void inorder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        // left
        inorder(root.left, ans);
        // add the root node
        ans.add(root.val);
        // right
        inorder(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

}
