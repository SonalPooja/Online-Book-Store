public class MemberDiscount implements Discount{

    @Override
    public double applyDiscount(double price) {
        return price - price * 10 / 100;
    }

}
