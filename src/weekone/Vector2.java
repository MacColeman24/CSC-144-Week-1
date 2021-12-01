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
    
    public Vector2 add(Vector2 a) {
        double cx = this.getX() + a.getX();
        double cy = this.getY() + a.getY();
        
        return new Vector2(cx, cy);
    }
    
    public Vector2 subtract(Vector2 other) {
        double cx = this.x - other.x;
        double cy = this.y - other.y;
        
        return new Vector2(cx, cy);
    }
    
    public Vector2 multiply(double a) {
        double cx = this.getX() * a;
        double cy = this.getY() * a;
        
        return new Vector2(cx, cy);
    }
    
    public Vector2 divide(double a) {
        double cx = this.getX() / a;
        double cy = this.getY() / a;
        
        return new Vector2(cx, cy);
    }
    
    public double dotProduct(Vector2 other) {
        return this.x * other.x + this.y * other.y;
    }
    
    public Vector3 crossProduct(Vector2 other) {
        
        return new Vector3(0, 0, this.pseudoscalarCrossProduct(other));
    }
    
    public double pseudoscalarCrossProduct(Vector2 other) {
        return this.x * other.y - this.y * other.x;
    }
    
    public String toString() {
        return "Vector2 (" + this.getX() + ", " + this.getY() + ")";
    }
}
