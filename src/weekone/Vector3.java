/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weekone;

//Defines a Vector in 3 dimensions

/**
 *
 * @author mac
 */
public class Vector3 {
    
    double x;
    double y;
    double z;
    
    public Vector3() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    
    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public void setX(double newX) {
        this.x = newX;
    }
    
    public void setY(double newY) {
        this.y = newY;
    }
    
    public void setZ(double newZ) {
        this.z = newZ;
    }
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }
    
    public Vector3 unit() {
        return new Vector3(this.getX()/this.magnitude(), this.getY()/this.magnitude(), this.getY()/this.magnitude());
    }
    
    public Vector3 add(Vector3 a) {
        double cx = this.getX() + a.getX();
        double cy = this.getY() + a.getY();
        double cz = this.getZ() + a.getZ();
        
        return new Vector3(cx, cy, cz);
    }
    
    public Vector3 subtract(Vector3 a) {
        double cx = this.getX() - a.getX();
        double cy = this.getY() - a.getY();
        double cz = this.getZ() - a.getZ();
        
        return new Vector3(cx, cy, cz);
    }
    
    public Vector3 multiply(double a) {
        double cx = this.getX() * a;
        double cy = this.getY() * a;
        double cz = this.getZ() * a;
        
        return new Vector3(cx, cy, cz);
    }
    
    public Vector3 divide(double a) {
        double cx = this.getX() / a;
        double cy = this.getY() / a;
        double cz = this.getZ() / a;
        
        return new Vector3(cx, cy, cz);
    }
    
    public static double dotProduct(Vector3 a, Vector3 b) {
        double dotProduct = a.getX() * b.getX();
        dotProduct += a.getY() * b.getY();
        dotProduct += a.getZ() * b.getZ();
        return dotProduct;
    }
    
    public static Vector3 crossProduct(Vector3 a, Vector3 b) {
        double cx = a.getY() * b.getZ() - a.getZ() * b.getY();
        double cy = a.getZ() * b.getX() - a.getX() * b.getZ();
        double cz = a.getX() * b.getY() - a.getY() * b.getX();
        return new Vector3(cx, cy, cz);
    }
    
    public String toString() {
        return "Vector3 (" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
}
