/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relu_pointsandunitsvisualization;

import processing.core.PApplet;

/**
 *
 * @author 320-15ISK 80XH
 */
public class ReLU_pointsAndUnitsVisualization extends PApplet{

    @Override
    public void settings(){
        size(400,400);
    }
    @Override
    public void setup(){
        
    }
    @Override
    public void draw(){
        background(255);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PApplet.main(new String[]{relu_pointsandunitsvisualization.ReLU_pointsAndUnitsVisualization.class.getCanonicalName()});
    }
    
}
