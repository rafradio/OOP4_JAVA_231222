package HW_isGood;

public class isEven<T extends Integer> implements isGood<T>  {

    @Override
    public boolean isGood(T item) {
        
        return (item % 2 == 0);
    }
    
}
