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
        Sphere sphereEX = new Sphere(2);
        Cylinder cylinderEX = new Cylinder();
        Cone coneEX = new Cone();
        
        
        Shape[] shapeArray = new Shape[1];
 //add others       Shape[] shapeArray = new Shape[3];
    
        //store class instances into an array named "shapeArray"
        //and istantiate one sphere, cylinder, and cone
        shapeArray[0] = new Sphere(1.0);
 //       shapeArray[1] = new Cylinder(1.0);
 //       shapeArray[2] = new Cone(1.0);
        
        //loop through array and print out the instance data of each object
        //using the object instance's "toString" method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
        
        
//System.out.print(sphereEX);
  //sphereEX.toString();
 
 //delete
        System.out.println("Cylinder Area: " + cylinderEX.surface_area());
        System.out.println("Cylinder Volume: " + cylinderEX.volume());
//delete        
        System.out.println("Cone Area: " + coneEX.surface_area());
        System.out.println("Cone Volume: " + coneEX.volume());
       
    }
}

