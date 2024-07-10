/**
 * Class provides a 10% discount for members
 */
public class MemberDiscount implements Discount{

    // Reduces the price by 10%
    @Override
    public double applyDiscount(double price) {
        return price - price * 10 / 100;
    }

}
