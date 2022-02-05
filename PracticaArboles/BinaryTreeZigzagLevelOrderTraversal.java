package PracticaArboles;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result= new LinkedList<>();

        if(root==null) return result;

        Queue<TreeNode> queue= new LinkedList<>();

        boolean inverse=false;

        queue.add(root);

        TreeNode temp;

        while(!queue.isEmpty()){

            List<Integer> list=new LinkedList();
            int cant=queue.size();

            for(int i=0;i<cant;i++){

                temp=queue.poll();

                if(!inverse)
                    list.add(temp.val);
                else{
                    list.add(0,temp.val);
                }

                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }

            inverse=!inverse;

            result.add(list);
        }

        return result;
    }
}
