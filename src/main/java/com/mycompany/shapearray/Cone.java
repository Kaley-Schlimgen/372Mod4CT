/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapearray;

/**
 *
 * @author kaleyschlimgen
 */
class Cone extends Shape {
    //Sphere attributes
    private double radius;
    private double height;
    
    //implement a parameterized constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double surface_area() {
        double surfaceArea = Math.PI * radius * (radius + 
                (Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2)))));
        return (surfaceArea);
    }
    
    @Override
    public double volume() {
        double volume = Math.PI * (Math.pow(radius, 2)) * (height/3);
        return (volume);
    }
    
    @Override
    public String toString() {
        return "Cone Surface Area: " + surface_area() +
                "\nCone Volume: " + volume() + "\n";
        
    }
    
}
