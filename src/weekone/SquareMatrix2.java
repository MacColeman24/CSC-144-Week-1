/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weekone;

//Defines a square matrix of order 2

/**
 *
 * @author mac
 */
public class SquareMatrix2 {
    
    double[][] matrix;
    
    public SquareMatrix2() {
        //Row-major order
        this.matrix = new double[][] {{0, 0}, {0, 0}};
    }
    
    public SquareMatrix2(double aA, double aB, double bA, double bB) {
        this.matrix = new double[][] {{aA, aB}, {bA, bB}};
    }
    
    public static SquareMatrix2 identity() {
        return new SquareMatrix2(1, 0, 0, 1);
    }
    
    public double[][] asArray() {
        return this.matrix;
    }
    
    public double[] getRow(int row) {
        //0-indexed
        return this.matrix[row];
    }
    
    public double[] getColumn(int column) {
        //0-indexed
        return new double[] {this.matrix[0][column], this.matrix[1][column]};
    }
    
    public SquareMatrix2 add(SquareMatrix2 other) {
        double a = this.matrix[0][0] + other.matrix[0][0];
        double b = this.matrix[0][1] + other.matrix[0][1];
        double c = this.matrix[1][0] + other.matrix[1][0];
        double d = this.matrix[1][1] + other.matrix[1][1];
        return new SquareMatrix2(a, b, c, d);
    }
    
    public SquareMatrix2 subtract(SquareMatrix2 other) {
        double a = this.matrix[0][0] - other.matrix[0][0];
        double b = this.matrix[0][1] - other.matrix[0][1];
        double c = this.matrix[1][0] - other.matrix[1][0];
        double d = this.matrix[1][1] - other.matrix[1][1];
        return new SquareMatrix2(a, b, c, d);
    }
    
    public SquareMatrix2 multiply(double scalar) {
        double a = this.matrix[0][0] * scalar;
        double b = this.matrix[0][1] * scalar;
        double c = this.matrix[1][0] * scalar;
        double d = this.matrix[1][1] * scalar;
        
        return new SquareMatrix2(a, b, c, d);
    }
    
    public SquareMatrix2 divide(double scalar) {
        double a = this.matrix[0][0] / scalar;
        double b = this.matrix[0][1] / scalar;
        double c = this.matrix[1][0] / scalar;
        double d = this.matrix[1][1] / scalar;
        
        return new SquareMatrix2(a, b, c, d);
    }
    
    public SquareMatrix2 multiply(SquareMatrix2 other) {
        //Just multiply the rows of the first one by the colums of the second one
        //This is probably horribly inefficient!
        double[] values = new double[4];
        
        for(int i = 0; i < 4; i++) {
            double valueAtCell = 0;
            double[] row = this.getRow(i / 2);
            double[] col = other.getColumn(i % 2);
            System.out.println("Processing "  + row[0] + " " + row[1]);
            System.out.println("And "  + col[0] + " " + col[1]);
            for(int j = 0; j < 2; j++) {
                valueAtCell += row[j] * col[j];
            }
            values[i] = valueAtCell;
        }
        
        return new SquareMatrix2(values[0], values[1], values[2], values[3]);
    }
    
    public double trace() {
        double trace = 0;
        for (int i = 0; i < 2; i++) {
            trace += this.matrix[i][i];
        }
        return trace;
    }
    
    public double determinant() {
        double result = this.matrix[0][0] * this.matrix[1][1];
        result -= this.matrix[0][1] * this.matrix[1][0];
        return result;
    }
    
    public String toString() {
        String result = "[[" + this.matrix[0][0] + ", " + this.matrix[0][1];
        result += "], [" + this.matrix[1][0] + ", " + this.matrix[1][1] + "]]";
        return result;
    }
}
