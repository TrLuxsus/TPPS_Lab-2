package ki_17_5.lab_2.var_03.task_01;

public class Matrix {
    private float[][] matrix;

    public float[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(float[][] matrix) {
        this.setMatrix(matrix);
    }

    public float sumMaxInRows() {
        float sum = 0;

        for (float[] row : matrix) {
            float maxInRow = row[0];

            for (int j = 1, rowLength = row.length; j < rowLength; j++)
                if (row[j] > maxInRow)
                    maxInRow = row[j];

            sum += maxInRow;
        }
        return sum;
    }
}
