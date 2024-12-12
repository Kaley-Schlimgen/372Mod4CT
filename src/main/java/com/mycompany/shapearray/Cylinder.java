/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapearray;

/**
 *
 * @author kaleyschlimgen
 */
class Cylinder extends Shape {
        //Sphere attributes
    private double radius;
    private double height;
    
    //implement a parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double surface_area() {
//2pirh + 2pir^2
        double surfaceArea = (2 * Math.PI * radius * height) + 
                (2 * Math.PI * (Math.pow(radius, 2)));
        return (surfaceArea);
    }
    
    @Override
    public double volume() {
//pi*r^2*h
        double volume = Math.PI * (Math.pow(radius, 2)) * height;
        return (volume);
    }
    
    @Override
    public String toString() {
        return "Cylinder Surface Area: " + surface_area() +
                "\nCylinder Volume: " + volume() + "\n";
        
    }
    


    
}

