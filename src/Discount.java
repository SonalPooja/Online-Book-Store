/**
 * Interface providing a method for applying discounts to book prices
 */
public interface Discount {

    //Applies a discount and returns the new price
    public double applyDiscount(double price);

}
