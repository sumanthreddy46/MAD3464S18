/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author sumanth
 */
public class Triangle extends Shape {
    
    Triangle(int x,int y)
    {
        super(x,y);
        
    }    
   
    @Override
    void draw(){
      System.out.println("Drawing triangle at " + super.x + " and " + super.y);
    }
    
//     void animate();
    
}
