/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weekone;

/**
 *
 * @author mac
 */
public class WeekOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vector testing:");
        
        HomogeneousVector a = new HomogeneousVector(10, 0);
        HomogeneousVector b = new HomogeneousVector(0, -15);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Dot product: " + a.dotProduct(b));
        System.out.println("Cross product: " + a.crossProduct(b));
        
        System.out.println("Addition: " + a.add(b));
        System.out.println("Subtraction: " + a.subtract(b));
        System.out.println("Multiply: " + a.multiply(5.0));
        System.out.println("Divide: " + a.divide(5.0));
        
        SquareMatrix2 c = new SquareMatrix2(0, 1, 2, 3);
        SquareMatrix2 d = new SquareMatrix2(10, 6, 2, 9);
        SquareMatrix2 i = SquareMatrix2.identity();
        
        System.out.println("C:\n" + c);
        System.out.println("D:\n" + d);
        System.out.println("I:\n" + i);
        System.out.println(c.add(d));
        
        System.out.println(c.multiply(i));
        System.out.println(d.multiply(i));
        System.out.println(c.multiply(d));
        
        System.out.println("Determinants!:");
        System.out.println("C: " + c.determinant());
        System.out.println("D: " + d.determinant());
        System.out.println("I: " + i.determinant());
        
        System.out.println("Traces!:");
        System.out.println("C: " + c.trace());
        System.out.println("D: " + d.trace());
        System.out.println("I: " + i.trace());
    }
    
}
