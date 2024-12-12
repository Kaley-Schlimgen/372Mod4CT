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
        //return (Math.PI * Math.pow(radius, 2));
        //4*pi*r^2
        double surfaceArea = 4 * Math.PI * (Math.pow(radius, 2));
        
        //get two decimal places...
//String formattedResult = String.format("%.2f", surfaceArea);
//return Double.parseDouble(formattedResult);

        return (surfaceArea);
    }
    
    @Override
    public double volume() {
        //(4/3)*pi*r^3
        double volume = (4/3) * Math.PI * (Math.pow(radius, 3));
        return (volume);
    }
    
    //implement a toString method that prints out the surgace area and volume
    @Override
    public String toString() {
 //get two decimal places here?
        //String formattedArea = String.format(%.2f, surfaceArea);
        //return "Surface Area: " + formattedArea() +
          //      "\nVolume: " + volume() + "\n";
        //return "Surface Area: " + String.format(%.2f, surface_area()) +
        
        //System.out.println("Sphere Surf A" + surface_area());
        return "Sphere Surface Area: " + surface_area() +
                "\nSphere Volume: " + volume() + "\n";
        
    }
}

