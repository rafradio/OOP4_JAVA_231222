package HW_isGood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.*;  

public class isGoodProg {
    public static void main(String[] args) {
        
        // Integer myType = new Integer(5);
        // Class x = null;
        // try {
        //     x = Class.forName("java.lang.Integer");
        //     ArrayList<x> arrList0 = new ArrayList<x>(Arrays.asList(new x[] {1,2,3,4,5,6,7,8,9}));
        // } catch(ClassNotFoundException ex) {
        // }
        
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));

        // ArrayList<Double> arrList1 = new ArrayList<>(Arrays.asList(new Double[] {1.4,-2.3,3.5,-4.2,5.5,-6.1,7.5,8.5,0.0}));
        ArrayList<Float> arrList1 = new ArrayList<>(Arrays.asList(new Float[] {1.4f,-2.3f,3.5f,-4.2f,5.5f,-6.1f,7.5f,8.5f,0.0f}));
        // ArrayList<Integer> arrList1 = new ArrayList<>(Arrays.asList(new Integer[] {1,-2,3,-4,5,-6,7,8,0}));

        ArrayList<String> arrString = new ArrayList<>(Arrays.asList(new String[] {"Aa", "bb", "cc", "Ad", "ay", "bA"}));
        ArrayList<String> arrStringWith = new ArrayList<>(Arrays.asList(
            new String[] {"Hello", "Bye", "Good day", "New Year", "New Year Tree"}));
       
        isGood<Integer> iseven = new isEven<>();

        // в IsPositive нужен конструктор для нуля: 0; 0.0; 0.0f
        isGood<Float> ispos = new isPositive<>(0.0f);
        isGood<String> isstring = new BeginsWithA<>();
        isGood<String> isStart = new BeginsWith<>("Ne");

        // isGood<Float> ispos2 = new isPositive2<>();

        

        Processor myProc = new Processor();

        System.out.println("Фильтр \"Четное число\": " + myProc.filter(arrList, iseven));

        System.out.println("Фильтр \"Положительное число\": " + myProc.filter(arrList1, ispos));

        System.out.println("Фильтр \"Начинается с буквы А\": " + myProc.filter(arrString, isstring));

        System.out.println("Фильтр \"Начинается с чего-то\" " + myProc.filter(arrStringWith, isStart));
    
    }

    private static <T> Iterable<T> filter(Iterable<T> array, isGood<T> isgood) {
        Collection<T> newArrList = new ArrayList<>();
        newArrList = (ArrayList<T>) newArrList;
        for (T element: array) {
            if (isgood.isGood(element)) {
                newArrList.add(element);
            }
        }
        return newArrList;

    }
}