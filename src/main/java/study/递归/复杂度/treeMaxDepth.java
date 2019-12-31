package study.递归.复杂度;

import study.model.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @fileName: treeMaxDepth
 * @author: WangChen
 * @date: 2019/12/31 11:18
 * @description:
 */
public class treeMaxDepth {
    @Test
    public  void main() {

    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.getLeft());
            int right = maxDepth(root.getRight());
            return java.lang.Math.max(left,right)+1;
        }
    }

}
