package Practica;

import java.util.*;

public class Test {
    public static void main(String[] args) {

       CountAndSay ejercicio= new CountAndSay();

       HashSet<Integer> set=new HashSet<>();

       HashMap<Integer,Integer> map=new HashMap<>();

       Queue<Integer> queue = new LinkedList<>();


       ArrayList<int[]> list=new ArrayList<>();

       List<Integer> list2 = new LinkedList<>();

       StringBuilder ans= new StringBuilder();

       int[] array = new int[] {20, 2, 10, 3, 10, 20};

       MaxOcurrencesMaxValue ej= new MaxOcurrencesMaxValue();

       System.out.println(ej.maxOcurrenceMaxValue(array));


    }
}
