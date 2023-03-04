package PracticaArboles;

public class VisibleNodes {
    public int goodNodes(TreeNode root) {

        if(root==null) return 0;

        int max=root.val;

        int cant=0;

        return  countGoodNodes(root, max);
    }

    public int countGoodNodes(TreeNode root, int max){

        if(root==null) return 0;

        int curr=0;

        if(root.val>=max){
            max=root.val;
            curr++;
        }

        return countGoodNodes(root.left, max)+countGoodNodes(root.right, max)+curr;
    }

}
