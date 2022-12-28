package HW_isGood;

public class BeginsWith <T extends String> implements isGood<T> {
    private T startWith;

    public BeginsWith (T start) {
        this.startWith = start;
    }
    @Override
    public boolean isGood(T item) {
        
        return item.startsWith(this.startWith);
    }
    
}
