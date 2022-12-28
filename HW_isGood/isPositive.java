package HW_isGood;

public class isPositive<T extends Number & Comparable<T>> implements isGood<T> {
    T nullElement;

    public isPositive(T nullElement) {
        this.nullElement = nullElement;
    }

    @Override
    public boolean isGood(T item) {
        // try {
        //     if (item > 0) {

        //     }
        // } catch(ClassCastException ex) {}
        // if (item > 0) {
            
        // }
        // Object temp = 0;
        return (item.compareTo(this.nullElement) >= 0);
    }
    
}
