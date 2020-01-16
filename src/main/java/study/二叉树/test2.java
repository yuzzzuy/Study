package study.二叉树;

import org.junit.jupiter.api.Test;
import study.model.TreeNode;

/**
 * @author WangChen
 * @filename test2
 * @date 2020/1/14 14:33
 * @description 自顶而下和自底向上
 */
public class test2 {
    @Test
    void topDown() {
        TreeNode treeNode = init();
        System.out.println(maximumDepth(treeNode, 0));
    }

    @Test
    void downTop() {
        TreeNode treeNode = init();
        System.out.println(maximumDepth(treeNode));

    }

    @Test
    void test1() {
//        TreeNode treeNode = buildTree(, );
//        System.out.println(treeNode.toString());
    }


//

    //从中序与后序遍历序列构造二叉树
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode();

        //中序
//        root.setLeft(new TreeNode(9));
//        root.setVal(3);
//        root.setRight(new TreeNode(15));
//        //后序
//        root.setLeft();
//        root.setRight();
//        root.setVal();
        return root;
    }


    //自顶而下思路
    private int answer;

    private int maximumDepth(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            answer = Math.max(answer, depth);
        }
        maximumDepth(root.getLeft(), depth + 1);
        maximumDepth(root.getRight(), depth + 1);
        return answer;
    }

    //自底向上思路
    public int maximumDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maximumDepth(root.getLeft());
        int rightDepth = maximumDepth(root.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }


    //二叉树初始化
    public TreeNode init() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        root.setLeft(treeNode1);
        treeNode1.setLeft(treeNode2);
        treeNode2.setRight(treeNode3);
        treeNode2.setLeft(null);
        root.setRight(treeNode4);
        treeNode4.setLeft(treeNode5);
        return root;
    }
}
