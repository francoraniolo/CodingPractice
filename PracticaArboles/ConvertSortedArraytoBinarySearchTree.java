package PracticaArboles;

public class ConvertSortedArraytoBinarySearchTree {

    //EXPLICACION: https://www.youtube.com/watch?v=12omz-VAyRk

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length==0) return null;

        if(nums.length==1) return new TreeNode(nums[0]);

        return constructTree(nums, 0, nums.length-1);

    }

    private TreeNode constructTree(int[] nums, int left, int right){
        if(left>right) return null;
        int midpoint=left+(right-left)/2;
        TreeNode node=new TreeNode(nums[midpoint]);
        node.left=constructTree(nums, left, midpoint-1);
        node.right=constructTree(nums, midpoint+1, right);

        return node;
    }
}
