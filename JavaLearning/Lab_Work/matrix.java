package JavaLearning.Lab_Work;

 class Matrix {
    int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a.data[i][0] * b.data[0][j] + a.data[i][1] * b.data[1][j];
            }
        }
        return new Matrix(result);
    }
}

public class matrix {
    public static void main(String[] args) {
        int[][] dataA = { { 1, 2 }, { 3, 4 } };
        int[][] dataB = { { 5, 6 }, { 7, 8 } };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);
        Matrix c = Matrix.multiply(a, b);

        for (int i = 0; i < c.data.length; i++) {
            for (int j = 0; j < c.data[i].length; j++) {
                System.out.print(c.data[i][j] + " ");
            }
            System.out.println();
        }
    }
}