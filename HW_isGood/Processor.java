package HW_isGood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Processor<T> {

    public Iterable<T> filter(Iterable<T> array, isGood<T> isgood) {
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
