/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weekone;

//Defines a square matrix of order 3

/**
 *
 * @author mac
 */
public class SquareMatrix3 {
    double[][] matrix;
    
    public SquareMatrix3(
            double a, double b, double c,
            double d, double e, double f,
            double g, double h, double i) {
        this.matrix = new double[][] {{a, b, c}, {d, e, f}, {g, h, i}};
    }
    
    public SquareMatrix3(double[] values) {
        if(values.length == 9) {
            this.matrix = new double[][] {
                {values[0], values[1], values[2]},
                {values[3], values[4], values[5]},
                {values[6], values[7], values[8]},
            };
        } else {
            this.matrix = new double[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            };
        }
    }
    
    public static SquareMatrix3 identity() {
        return new SquareMatrix3(1, 0, 0, 0, 1, 0, 0, 0, 1);
    }
    
    public double[][] asArray() {
        return this.matrix;
    }
    
    public double[] getRow(int row) {
        return this.matrix[row];
    }
    
    public double[] getColumn(int col) {
        return new double[] {
            this.matrix[0][col],
            this.matrix[1][col],
            this.matrix[2][col],
        };
    }
    
    public SquareMatrix3 add(SquareMatrix3 other) {
        double a = this.matrix[0][0] + other.matrix[0][0];
        double b = this.matrix[0][1] + other.matrix[0][1];
        double c = this.matrix[0][2] + other.matrix[0][2];
        double d = this.matrix[1][0] + other.matrix[1][0];
        double e = this.matrix[1][1] + other.matrix[1][1];
        double f = this.matrix[1][2] + other.matrix[1][2];
        double g = this.matrix[2][0] + other.matrix[2][0];
        double h = this.matrix[2][1] + other.matrix[2][1];
        double i = this.matrix[2][2] + other.matrix[2][2];
        
        return new SquareMatrix3(a, b, c, d, e, f, g, h, i);
    }
    
    public SquareMatrix3 subtract(SquareMatrix3 other) {
        double a = this.matrix[0][0] - other.matrix[0][0];
        double b = this.matrix[0][1] - other.matrix[0][1];
        double c = this.matrix[0][2] - other.matrix[0][2];
        double d = this.matrix[1][0] - other.matrix[1][0];
        double e = this.matrix[1][1] - other.matrix[1][1];
        double f = this.matrix[1][2] - other.matrix[1][2];
        double g = this.matrix[2][0] - other.matrix[2][0];
        double h = this.matrix[2][1] - other.matrix[2][1];
        double i = this.matrix[2][2] - other.matrix[2][2];
        
        return new SquareMatrix3(a, b, c, d, e, f, g, h, i);
    }
    
    public SquareMatrix3 multiply(double scalar) {
        double a = this.matrix[0][0] * scalar;
        double b = this.matrix[0][1] * scalar;
        double c = this.matrix[0][2] * scalar;
        double d = this.matrix[1][0] * scalar;
        double e = this.matrix[1][1] * scalar;
        double f = this.matrix[1][2] * scalar;
        double g = this.matrix[2][0] * scalar;
        double h = this.matrix[2][1] * scalar;
        double i = this.matrix[2][2] * scalar;
        
        return new SquareMatrix3(a, b, c, d, e, f, g, h, i);
    }
    
    public SquareMatrix3 divide(double scalar) {
        double a = this.matrix[0][0] / scalar;
        double b = this.matrix[0][1] / scalar;
        double c = this.matrix[0][2] / scalar;
        double d = this.matrix[1][0] / scalar;
        double e = this.matrix[1][1] / scalar;
        double f = this.matrix[1][2] / scalar;
        double g = this.matrix[2][0] / scalar;
        double h = this.matrix[2][1] / scalar;
        double i = this.matrix[2][2] / scalar;
        
        return new SquareMatrix3(a, b, c, d, e, f, g, h, i);
    }
    
    public SquareMatrix3 multiply(SquareMatrix3 other) {
        //Just multiply the rows of the first one by the colums of the second one
        //This is probably horribly inefficient!
        double[] values = new double[9];
        
        for(int i = 0; i < 9; i++) {
            double valueAtCell = 0;
            double[] row = this.getRow(i / 3);
            double[] col = other.getColumn(i % 3);
            for(int j = 0; j < 2; j++) {
                valueAtCell += row[j] * col[j];
            }
            values[i] = valueAtCell;
        }
        
        return new SquareMatrix3(values);
    }
    
    public double trace() {
        double trace = 0;
        for (int i = 0; i < 3; i++) {
            trace += this.matrix[i][i];
        }
        return trace;
    }
    
    public double determinant() {
        double x = this.matrix[1][1] * this.matrix[2][2];
        x -= this.matrix[2][1] * this.matrix[1][2];
        
        double y = this.matrix[1][0] * this.matrix[2][2];
        y -= this.matrix[2][0] * this.matrix[1][2];
        
        double z = this.matrix[1][0] * this.matrix[2][1];
        z -= this.matrix[2][0] * this.matrix[1][1];
        
        return this.matrix[0][0] * x - this.matrix[0][1] * y + this.matrix[0][2] * z;
    }
}
