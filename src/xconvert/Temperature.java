/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xconvert;

/**
 *
 * @author Cormac, Darragh, Anthony
 */
public class Temperature
{   
    //constants
    private final double KELVIN = 0.00;
    private final double CELSIUS = -273.15;
    private final double FAHRENHEIT = -459.67;
    
    private double output = 0;
     
    public double insert(int type, int sType, double value)
    {
        double left = 0;
        double right = 0;
        switch(type)
        {
            case 1:
                left = KELVIN;
                break;
            
        }
        switch(sType)
        {
            case 1:
                right = CELSIUS;
                break;
            case 2:
                right = FAHRENHEIT;
                break;
            
        }
        
        output = convert(left, right, value);
        
        return output;
    }
    

    public double convert(double left, double right, double input) 
    {
        if (left == KELVIN && right == FAHRENHEIT)
        {
            output = (input * (9 / 5) - 459.67);
        }
        else if (left == KELVIN && right == CELSIUS)
        {
            output = (input * (9 / 5) - 273);
        }
        else
        {
            output = 0; //error dialog
        }
            
        return output;
    } 
}