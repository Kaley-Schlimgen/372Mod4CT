/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapearray;

/**
 *
 * @author kaleyschlimgen
 */
class Sphere extends Shape {
    //Sphere attributes
    private double radius;
    
    //implement a parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {

        double surfaceArea = 4 * Math.PI * (Math.pow(radius, 2));
        return (surfaceArea);
    }
    
    @Override
    public double volume() {
        double volume = (4.0/3.0) *  (Math.PI * (Math.pow(radius, 3)));
        return (volume);
    }
    
    //implement a toString method that prints out the surface area and volume
    @Override
    public String toString() {
        return "Sphere Surface Area: " + surface_area() +
                "\nSphere Volume: " + volume() + "\n";
    }
}

