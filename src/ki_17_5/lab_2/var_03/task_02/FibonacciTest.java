package ki_17_5.lab_2.var_03.task_02;

import org.junit.Assert;

import static org.junit.Assert.fail;

public class FibonacciTest {

    @org.junit.Test
    public void firstBiggerThen() {
        Assert.assertEquals(Fibonacci.firstBiggerThen(1),2,0);
    }

    @org.junit.Test
    public void sumMembersLessThen() {
        fail();
    }
}
