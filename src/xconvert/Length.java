/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xconvert;

import javax.swing.JOptionPane;

/**
 *
 * @author Cormac
 */
public class Length{
    //Base unit for ratio is meter
    private final double inches = 39.3701;
    private final double feet = 3.28084;
    private final double miles = .0016093;
    
    private final double cm = 100;
    private final double mt = 1;
    private final double km = .001;
    
    public double insert(int type, int sType, double value){
        double l = 0;
        double r = 0;
        switch(type){
            case 1:
                l = inches;
                break;
            case 2:
                l = feet;
                break;
            case 3 :
                l = miles;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Do it right asshole");
        }
        switch(sType){
            case 1:
                r = cm;
                break;
            case 2:
                r = mt;
                break;
            case 3 :
                r = km;
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Do it right asshole");
        }
        
        double output = convert(l, r, value);
        
        return output;
    }
    
    public double insert2(int type, int sType, double value){
        double l = 0;
        double r = 0;
        switch(type){
            case 1:
                l = cm;
                break;
            case 2:
                l = mt;
                break;
            case 3 :
                l = km;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Do it right asshole");
        }
        
        switch(sType){
            case 1:
                r = inches;
                break;
            case 2:
                r = feet;
                break;
            case 3 :
                r = miles;
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Do it right asshole");
        }
        
        double output = convert(l, r, value);
        
        return output;
    }
    

    private double convert(double l, double r, double input) {
        double ratio = r/l;
        double output = input*ratio;        
        return output;
    } 
}