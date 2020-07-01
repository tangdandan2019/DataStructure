package com.dandan.binarytree;

import java.util.Stack;

/**
 * @Author: tangdandan
 * @Date: 2020/7/1 16:09
 *  遍历
 */
public class Traversal {
    //先序遍历（递归）
    public static void preorderTraversal(TreeNode root){
        //如果父节点为空
        if(root==null) {
            return ;
        }
        //先访问中间节点
        System.out.print(root.value);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    //先序遍历（不递归）
    public static void preorderTraversalRoot(TreeNode root){

    }
    //后序遍历(递归）
    //后序遍历（不递归）
    public static void main(String[] args) {
        //构建二叉树
        TreeNode root = new TreeNode();
        root.value = 5;
        TreeNode right = new TreeNode();
        right.value = 4;
        TreeNode left = new TreeNode();
        left.value = 3;
        root.left = left;
        root.right = right;
        TreeNode rightLeft = new TreeNode();
        rightLeft.value = 9;
        TreeNode rightRight = new TreeNode();
        rightRight.value = 10;
        right.right=rightRight;
        right.left = rightLeft;
        //先序遍历
        preorderTraversal(root);
        preorderTraversalRoot(root);
    }
}
