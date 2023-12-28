
class Matrix {
    private int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix multiply(Matrix other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MultiMatix {
    public static void main(String[] args) {
        int[][] data1 = { { 1, 2 }, { 3, 4 } };
        int[][] data2 = { { 5, 6 }, { 7, 8 } };
        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);
        Matrix result = m1.multiply(m2);
        System.out.println("Matrix 1:");
        m1.print();
        System.out.println("Matrix 2:");
        m2.print();
        System.out.println("Result of multiplication:");
        result.print();
    }
}
