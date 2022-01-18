import groovy.test.GroovyTestCase;

public class MovingAverageTest {

    private GroovyTestCase Assert;
    public void test()
    {

        MovingAverage movingAverage = new MovingAverage(2);
        Assert.assertEquals(String.valueOf(0), movingAverage.getAverage(), 0.00001);
        movingAverage.add(0.5);
        Assert.assertEquals(String.valueOf(0.5), movingAverage.getAverage(), 0.00001);
        movingAverage.add(1.5);
        Assert.assertEquals(String.valueOf(1.0), movingAverage.getAverage(), 0.00001);
        movingAverage.add(1.5);
        Assert.assertEquals(String.valueOf(1.5), movingAverage.getAverage(), 0.00001);
    }


    public void test2()
    {
        MovingAverage movingAverage = new MovingAverage(3);
        Assert.assertEquals(String.valueOf(0), movingAverage.getAverage(), 0.00001);
        movingAverage.add(123);
        Assert.assertEquals(String.valueOf(123), movingAverage.getAverage(), 0.00001);
        movingAverage.add(123);
        Assert.assertEquals(String.valueOf(123), movingAverage.getAverage(), 0.00001);
        movingAverage.add(123);
        Assert.assertEquals(String.valueOf(123), movingAverage.getAverage(), 0.00001);
        movingAverage.add(123);
        Assert.assertEquals(String.valueOf(123), movingAverage.getAverage(), 0.00001);
        movingAverage.add(123);
        Assert.assertEquals(String.valueOf(123), movingAverage.getAverage(), 0.00001);
    }
}
