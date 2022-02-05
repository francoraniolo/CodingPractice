package PracticaArboles;

class CountGoodNodes {

    int max;
    int cant;

    public int goodNodes(TreeNode root) {

        if(root==null) return 0;

        max=root.val;
        cant=0;

        preOrder(root);

        return cant;
    }

    private void preOrder(TreeNode root){

        if(root.val>=max){
            max=root.val;
            cant++;
        }

        int localMax=max;

        if(root.left!=null)
            preOrder(root.left);

        max=localMax;

        if(root.right!=null)
            preOrder(root.right);

    }
}
