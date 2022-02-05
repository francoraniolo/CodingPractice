package PracticaArboles;

import java.math.BigInteger;
import java.util.Stack;

public class ValidateBinarySearchTree {

    private Integer prev;

    public boolean isValidBST(TreeNode root) {

        prev=null;

        return inOrder(root);
    }


    private boolean inOrder(TreeNode root){

        if(root==null) return true;

        if(!inOrder(root.left)){
            return false;
        }

        if(prev!=null && root.val<=prev) return false;

        prev=root.val;

        return inOrder(root.right);
    }



}
