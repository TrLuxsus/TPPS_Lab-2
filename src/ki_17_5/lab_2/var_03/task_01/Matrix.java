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
}
