package Practica;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        //SOLUCION EPICA EN:  https://www.youtube.com/watch?v=Pl7mMcBm2b8


        //MI SOLUCION:

        HashSet<Character> hashSet;

        for(int i=0;i<9;i++){
           hashSet=new HashSet<Character>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.')
                if(!hashSet.add(board[i][j])){
                    System.out.println("False en i: "+i+" j: "+j+" board: "+board[i][j]);
                    return false;
                }
            }
        }

        for(int j=0;j<9;j++){
            hashSet=new HashSet<Character>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.')
                if(!hashSet.add(board[i][j])){
                    System.out.println("False en i: "+i+" j: "+j+" board: "+board[i][j]);
                    return false;
                }
            }
        }

        for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                hashSet=new HashSet<Character>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(board[k][l]!='.')
                            if(!hashSet.add(board[k][l])){
                                System.out.println("False en i "+i+"  j: "+j+"  k: "+k+" l: "+l+" board: "+board[k][l]);
                                return false;
                            }
                    }
                }
            }
        }

        return true;
    }
}
