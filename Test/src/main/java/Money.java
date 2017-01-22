/**
 * Created by seonghohong on 2017. 1. 7..
 */
public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) { return new Money(amount, "USD"); }
    public static Money franc(int amount) { return new Money(amount, "CHF"); }

    public String toString() {
        return amount + " " + currency;
    }

    protected Money times(int multiple) {
        return new Money(amount*multiple, currency);
    }

    protected String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }


    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);

        return new Money(amount / rate, to);
    }
}
