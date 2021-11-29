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
    
    public SquareMatrix2 identity() {
        return new SquareMatrix2(1, 0, 1, 0);
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
    
    public String toString() {
        String result = "[[" + this.matrix[0][0] + ", " + this.matrix[0][1];
        result += "], [" + this.matrix[1][0] + ", " + this.matrix[1][1] + "]]";
        return result;
    }
}
