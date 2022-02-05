package Practica;

public class MaxOcurrencesMaxValue {

    public int maxOcurrenceMaxValue(int[] array){

        int cant=1, max=array[0];

        for(int i=1;i<array.length;i++){
            if(max==array[i]) cant++;
            else if (max < array[i]) {
                max = array[i];
                cant = 1;
            }
        }

        return cant;
    }
}
