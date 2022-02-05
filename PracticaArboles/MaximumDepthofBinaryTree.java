package PracticaArboles;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        return depth(root,1);

    }

    private int depth(TreeNode root, int actualDepth){

        int maxDepthLeft=0;
        int maxDepthRight=0;

        if(root.left!=null) maxDepthLeft=depth(root.left,actualDepth+1);
        if(root.right!=null) maxDepthRight=depth(root.right,actualDepth+1);

        if(maxDepthLeft==0 && maxDepthRight==0) return actualDepth;
        return Math.max(maxDepthLeft,maxDepthRight);

    }

}
