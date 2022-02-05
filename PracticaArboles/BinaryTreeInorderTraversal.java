package PracticaArboles;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list=new ArrayList<>();

        if(root==null) return list;

        inOrder(root, list);

        return list;
    }

    private void inOrder(TreeNode root, List<Integer> list){
        if(root.left!=null) inOrder(root.left, list);
        list.add(root.val);
        if(root.right!=null) inOrder(root.right, list);
    }
}
