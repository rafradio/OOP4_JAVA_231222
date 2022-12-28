package HW_isGood;

public class isPositive2<T extends Number & Comparable<T>> implements isGood<T> {

    @Override
    public boolean isGood(T item) {
        
        // return (((Comparable<T>) item).compareTo(((Comparable<T>) 0)) >= 0);
        return true;
    }
    
}
