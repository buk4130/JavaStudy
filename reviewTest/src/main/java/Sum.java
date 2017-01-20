/**
 * Created by seonghohong on 2017. 1. 18..
 */
public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum (Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
}
