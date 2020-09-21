package ki_17_5.lab_2.var_03.task_01;

import org.junit.Assert;

public class MatrixTest {
    private Matrix matrix;

    @org.junit.Before
    public void setUp() {
        float[][] testData = {{1, 2, 3}, {4, 5, 6}};
        matrix = new Matrix(testData);
    }

    @org.junit.Test
    public void sumMaxInRows() {
        Assert.assertEquals(9.0,matrix.sumMaxInRows(),0.0);
    }
}