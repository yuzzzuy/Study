package study.二叉树;

import org.junit.jupiter.api.Test;
import study.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @fileName: test1
 * @author: WangChen
 * @date: 2020/1/2 16:14
 * @description: 二叉树的遍历
 */
public class test1 {

    @Test
    public void test1() {
        TreeNode root = init();
        //TreeNode root = null;
        System.out.println(levelOrder(root));

    }

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
//        //自己的写法
//        //会存在BUG-> 如果传进来的根节点为空就会导致空指针异常
//        list.add(root.getVal());
//        //System.out.println("节点："+root.getVal());
//        if (root.getLeft()!=null){
//            preorderTraversal(root.getLeft());
//        }
//        if (root.getRight()!=null) {
//            preorderTraversal(root.getRight());
//        }
//        return list;

//        //优化写法
        if (root == null) {
            return list;
        }
        preorderTraversal(root.getLeft());
        list.add(root.getVal());
        preorderTraversal(root.getRight());
        return list;
    }

    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        inorderTraversal(root.getLeft());
        list.add(root.getVal());
        inorderTraversal(root.getRight());
        return list;

    }

    //后续遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        postorderTraversal(root.getLeft());
        postorderTraversal(root.getRight());
        list.add(root.getVal());
        return list;
    }

    //二叉树的层次遍历  广度优先搜索
    //非递归
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentRes = new ArrayList<>();
            while (size > 0) {
                TreeNode current = queue.poll();
                if (current == null) {
                    continue;
                }
                currentRes.add(current.getVal());
                // 左子树和右子树入队.
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
                size--;
            }
            res.add(currentRes);
        }
        return res;
    }
    //二叉树的层次遍历  广度优先搜索
    //递归
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        levelOrderHelper(res, root, 0);
        return res;
    }

    /**
     * @param depth 二叉树的深度
     */
    private void levelOrderHelper(List<List<Integer>> res, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (res.size() <= depth) {
            // 当前层的第一个节点,需要new 一个list来存当前层.
            res.add(new LinkedList<>());
        }
        // depth 层,把当前节点加入
        res.get(depth).add(root.getVal());
        // 递归的遍历下一层.
        levelOrderHelper(res, root.getLeft(), depth + 1);
        levelOrderHelper(res, root.getRight(), depth + 1);
    }


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
