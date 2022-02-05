package PracticaArboles;

import java.util.Stack;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {


        if(root==null) return true;

        if(root.left==null && root.right==null) return true;

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode l, TreeNode r){

        if(l==null && r==null) return true;

        if(l==null || r==null) return false;

        if(l.val!=r.val) return false;

        return isMirror(l.right, r.left) && isMirror(l.left, r.right);
    }
}

