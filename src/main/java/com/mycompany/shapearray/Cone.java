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
    
    @Override
    public double surface_area() {
        //return (Math.PI * Math.pow(radius, 2));
        return (6);
    }
    
    @Override
    public double volume() {
        return (7);
    }
    
}
