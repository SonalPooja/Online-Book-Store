/**
 * Class creating custom error for when there is not enough stock
 */
public class InsufficientStockException extends Exception{

    // Creates an error message for insufficient stock
    public InsufficientStockException(String message){
        super(message);
    }

}
