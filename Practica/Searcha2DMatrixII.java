package Practica;

public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left=0;
        int right=matrix.length;
        int mid=0;

        int i=0; int j=0;

        while(i<matrix.length && j<matrix[0].length){

            left=j;
            right=matrix[0].length-1;

            while(left<=right){
                mid=left+(right-left)/2;

                if(matrix[i][mid]==target) return true;
                else{

                    if(matrix[i][mid]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }

                }
            }


            left=i;
            right=matrix.length-1;

            while(left<=right){
                mid=left+((right-left)/2);

                if(matrix[mid][j]==target) return true;
                else{

                    if(matrix[mid][j]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }

                }
            }


            i++;
            j++;

        }

        return false;

    }
}
