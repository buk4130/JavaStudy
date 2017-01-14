/**
 * Created by seonghohong on 2017. 1. 7..
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int multiple);

    protected String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) { return new Dollar(amount, "USD"); }

    public static Money franc(int amount) { return new Franc(amount, "CHF"); }
}
