/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weekone;

/**
 *
 * @author mac
 */
public class HomogeneousVector extends Vector2 {
    
    private final double h = 1.0;
    
    public HomogeneousVector(double x, double y) {
        super(x, y);
    }
    
    public HomogeneousVector(Vector2 vector) {
        super(vector.getX(), vector.getY());
    }
    
    @Override
    public HomogeneousVector unit() {
        return new HomogeneousVector(((Vector2) this).unit());
    }
    
    public HomogeneousVector add(HomogeneousVector other) {
        return new HomogeneousVector((Vector2) this.add((Vector2) other));
    }
    
    public double dotProduct(HomogeneousVector other) {
        return this.getX() * other.getX() + this.getY() * other.getY();
    }
    
    public double pseudoscalarCrossProduct(HomogeneousVector other) {
        return this.getX() * other.getY() - this.getY() * other.getX();
    }
   
    
    @Override
    public String toString() {
        return "HomogenousVector (" + this.getX() + ", " + this.getY() + ")";
    }
    
    public static void main(String[] args) {
        System.out.println(new HomogeneousVector(10, 2).magnitude());
        System.out.println(new HomogeneousVector(10, 2).unit());
    }
}
