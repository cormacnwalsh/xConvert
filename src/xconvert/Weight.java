package xconvert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package xconvert;

import javax.swing.JOptionPane;

/**
 *
 * @author Cormac, Darragh, Anthony
 */
public class Weight
{
    
    private final double ounce = 35.274;
    private final double pound = 2.20462;
    private final double stone = 0.157473;
    
    private final double g = 1000;
    private final double kg = 1; //common unit
    private final double tonne = .001;
        
    public double insertWeight(int type, int sType, double value)
    {
        double l=0;
        double r=0;
        switch(type)
        {
            case 1:
                l = ounce;
                break;
            case 2:
                l = pound;
                break;
            case 3 :
                l = stone;
                break;
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        switch(sType)
        {
            case 1:
                r = g;
                break;
            case 2:
                r = kg;
                break;
            case 3 :
                r = tonne;
                break;
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        
        double output = convert(l, r, value);
        
        return output;
    }//insertWeight
    
    public double insertWeight2(int type, int sType, double value)
    {
        double l=0;
        double r=0;
        switch(type)
        {
            case 1:
                l = g;
                break;
            case 2:
                l = kg;
                break;
            case 3 :
                l = tonne;
                break;
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);         
        }//switch
        switch(sType)
        {
            case 1:
                r = ounce;
                break;
            case 2:
                r = pound;
                break;
            case 3 :
                r = stone;
                break;
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        
        double output = convert(l, r, value);
        
        return output;
    }//insertWeight2
    

    public double convert(double l, double r, double input)
    {
        double ratio = r/l;
        double output = input*ratio;        
        return output;
    } //convert
}//weight
