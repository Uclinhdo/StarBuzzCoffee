/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise;

/**
 *
 * @author linhdo
 */
public class RedShapeDecorator extends ShapeDecorator {

    Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    
    
    @Override
    public void draw() {
        System.out.println("Border Color: Red");
    }

    

    
}
