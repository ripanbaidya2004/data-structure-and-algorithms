package com.ripan.dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

// leetcode 145
// left -> right -> root
public class PostOrderTraversal {

    public void postorder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }

}
