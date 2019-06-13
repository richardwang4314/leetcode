package leetcode;

/**
 * Created by Richard on 2019/6/10.
 * <p>
 * 104. Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        Object[] s1 = {3, 9, 20, null, null, 15, 7};
        System.out.println("depth= " + getDepth(s1));
        //TODO
        //TreeNode treeNode=new TreeNode();
        System.out.println("depth= " );
    }

    private static int getDepth(Object[] s) {
        int depth = 0;
        int length = s.length;
        for (int i = 0; i < length; i++) {
            double d = Math.pow(2, i);
            length = length - (int) d;
            depth++;
            if (length == 0) {
                break;
            }
        }
        return depth;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}