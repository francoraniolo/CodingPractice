package PracticaArboles;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root==null) return new LinkedList<>();

        Queue<TreeNode> queue= new LinkedList<>();

        queue.add(root);

        List<List<Integer>> result= new LinkedList<>();

        TreeNode temp;

        while(!queue.isEmpty()){

            List<Integer> list=new LinkedList<>();

            int size=queue.size();

            for(int i=0;i<size;i++){
                temp=queue.poll();
                list.add(temp.val);

                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);

            }

            result.add(list);

        }


        return result;
    }
}
