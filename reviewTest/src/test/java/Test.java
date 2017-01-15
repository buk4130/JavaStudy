import static org.junit.Assert.assertEquals;

/**
 * Created by seonghohong on 2017. 1. 14..
 */
public class Test {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
