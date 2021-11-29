/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weekone;

import java.lang.Math;

//Defines a vector in 2 dimensions

/**
 *
 * @author mac
 */
public class Vector2 {
    
    private double x;
    private double y;
    
    public Vector2() {
        this.x = 0;
        this.y = 0;
    }
    
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setX(double newX) {
        this.x = newX;
    }
    
    public void setY(double newY) {
        this.y = newY;
    }
    
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    public Vector2 unit() {
        return new Vector2(this.getX()/this.magnitude(), this.getY()/this.magnitude());
    }
    
    public Vector2 add(Vector3 a) {
        double cx = this.getX() + a.getX();
        double cy = this.getY() + a.getY();
        
        return new Vector2(cx, cy);
    }
    
    public Vector2 multiply(double a) {
        double cx = this.getX() * a;
        double cy = this.getY() * a;
        
        return new Vector2(cx, cy);
    }
    
    public static double dotProduct(Vector2 a, Vector2 b) {
        return a.getX() * b.getX() + a.getY() * b.getY();
    }
    
    public static Vector3 crossProduct(Vector2 a, Vector2 b) {
        
        return new Vector3(0, 0, pseudoscalarCrossProduct(a, b));
    }
    
    public static double pseudoscalarCrossProduct(Vector2 a, Vector2 b) {
        return a.getX() * b.getY() - a.getY() * b.getX();
    }
    
    public String toString() {
        return "Vector2 (" + this.getX() + ", " + this.getY() + ")";
    }
}
