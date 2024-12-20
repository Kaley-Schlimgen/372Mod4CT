/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapearray;

/**
 *
 * @author kaleyschlimgen
 */
public class ShapeArray {

    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
    
        //store class instances into an array named "shapeArray"
        //and istantiate one sphere, cylinder, and cone
        shapeArray[0] = new Sphere(3.0);
        shapeArray[1] = new Cylinder(3.0, 5.0);
        shapeArray[2] = new Cone(3.0, 5.0);
        
        //loop through array and print out the instance data of each object
        //using the object instance's "toString" method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
        
    }
}

