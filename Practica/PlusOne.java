package Practica;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        if(digits.length==0) return digits;

        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }else {

            boolean plusOne=true;

            for (int i = digits.length - 1; i >= 0; i--) {
                if(digits[i]==9){
                    digits[i]=0;
                }else{
                    digits[i]=digits[i]+1;

                    return digits;
                }
            }

            int[] digitsNew= new int[digits.length+1];

            digitsNew[0]=1;

            return digitsNew;

        }

    }
}
