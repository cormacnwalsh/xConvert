/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xconvert;

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
    
    public Length(){
        
    }
    
    public double insert(int type, int sType, double value){
        double l = 0;
        double r = 0;
        switch(type){
            case 1:
                l = inches;
            case 2:
                l = feet;
            case 3 :
                l = miles;
        }
        switch(sType){
            case 1:
                r = cm;
            case 2:
                r = mt;
            case 3 :
                r = km;
        }
        
        double output = convert(l, r, value);
        
        return output;
    }
    

    public double convert(double l, double r, double input) {
        double ratio = r/l;
        double output = input*ratio;        
        return output;
    } 
}