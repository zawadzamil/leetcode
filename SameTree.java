import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        getInorderTraversal(root, result);
        return result;
    }

    void getInorderTraversal(TreeNode root, List<Integer> inorder){
        if(root == null) return;

        getInorderTraversal(root.left, inorder);
        inorder.add(root.val);
        getInorderTraversal(root.right, inorder);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return  false;
    }
}
