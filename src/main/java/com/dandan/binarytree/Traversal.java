package com.dandan.binarytree;

import java.util.*;

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
    //后序遍历（不递归）
    //中序遍历（不递归）
    //层序遍历
    //求二叉树的最大宽度
    public static int widthOfBinaryTree(TreeNode root) {

        //定义一个queue记录每一层宽度结果
        Queue<RecordTree> level = new LinkedList<>();
        level.offer(new RecordTree(root,0,0));
        int ans  = 0 ;
        int curlevel = 0;
        RecordTree left = new RecordTree();
        while(!level.isEmpty()){
                RecordTree cur = level.poll();
                if(cur.tree!=null){
                    level.offer(new RecordTree(cur.tree.left,cur.level+1,cur.position*2));
                    level.offer(new RecordTree(cur.tree.right,cur.level+1,cur.position*2+1));
                    if(curlevel!=cur.level){
                        curlevel = cur.level;
                        left = cur;
                    }
                    ans = Math.max(ans, cur.position - left.position + 1);
            }
        }
        return ans;
    }

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
       // preorderTraversal(root);
        //preorderTraversalRoot(root);
        int width = widthOfBinaryTree(root);
        System.out.println(width);
    }
}
