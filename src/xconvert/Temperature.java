/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xconvert;

/**
 *
 * 
 */
public class Temperature
{   
    //constants
    private final double KELVIN = 0.00;
    private final double CELSIUS = -273.15;
    private final double FAHRENHEIT = -459.67;
    
    private double output = 0;
     
    //insert inputs
    public double insert(int type, int sType, double value)
    {
        //local variables
        double left = 0;
        double right = 0;
        
        //left input
        switch(type)
        {
            case 1:
                left = KELVIN;
                break;
            
            case 2:
                left = FAHRENHEIT;
                break;
            
            case 3:
                left = CELSIUS;
                break;
            default:
                left = KELVIN;
        }
        //right input
        switch(sType)
        {
            case 1:
                right = KELVIN;
                break;
            
            case 2:
                right = FAHRENHEIT;
                break;
            
            case 3:
                right = CELSIUS;
                break;
                
            default:
                right = KELVIN;
            
        }
        
        double output = convert(left, right, value);
        
        return output;
    }//insert
    
    //conversion formulas
    public double convert(double left, double right, double input) 
    {
        //kelvin formulas
        if (left == KELVIN && right == KELVIN)
        {
            output = input;
        }
        else if (left == KELVIN && right == FAHRENHEIT)
        {
            output = (input * 1.8) - 459.67;
        }
        else if (left == KELVIN && right == CELSIUS)
        {
            output = (input - 273.15);
        }
        //celsius formulas
        else if (left == CELSIUS && right == KELVIN)
        {
            output = (input + 273.15);
        }
        else if (left == CELSIUS && right == FAHRENHEIT)
        {
            output = (input * 1.8) + 32;
        }
        else if (left == CELSIUS && right == CELSIUS)
        {
            output = input;
        }
        // fahrenheit formulas
        else if (left == FAHRENHEIT && right == KELVIN)
        {
            output = (input + 459.67) * 0.5556;
        }
        else if (left == FAHRENHEIT && right == FAHRENHEIT)
        {
            output = input;
        }
        else if (left == FAHRENHEIT && right == CELSIUS)
        {
            output =  (input - 32) * 0.5556;
        }
        else
        {
            output = 0; //add error dialog
        }
            
        return output;
    } //convert
} //Temperature