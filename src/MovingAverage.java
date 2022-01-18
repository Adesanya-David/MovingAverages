import groovy.test.GroovyTestCase;

public class MovingAverage {
    private final double[] valuesWindow;
    private int fill;// = 0;

    public MovingAverage(int windowSize)
    {
        valuesWindow = new double[windowSize];
        assert windowSize > 0 : "Window size must be a positive integer";
    }

    public void add(long number)
    {
        add((double) number);
    }

    public void add(double number)
    {
        // Shift all values up 1 position
        System.arraycopy(valuesWindow, 0, valuesWindow, 1, valuesWindow.length - 1);
        valuesWindow[0] = number;
        if (fill < valuesWindow.length) {
            fill++;
        }
    }

    public double getAverage()
    {
        double result = 0;
        for (int i = 0; i < fill; i++) {
            result += valuesWindow[i];
        }

        if (fill == 0) {
            // Fine in most cases
            return 0;
        }
        else {
            return result / fill;
        }
    }
}
