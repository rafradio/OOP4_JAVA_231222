package HW_isGood;

public class BeginsWithA <T extends String>  implements isGood<T> {

    @Override
    public boolean isGood(T item) {
        
        return item.startsWith("A");
    }
    
}
