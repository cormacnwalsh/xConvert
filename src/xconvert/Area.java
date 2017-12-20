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
public class Area
{
    //Imperial Variable
    private final double inch = 1150.0;
    private final double inchSq = inch*inch;
    
    private final double foot = 10.7639;
    private final double footSq = foot*foot;
    
    /*private final double mile = 0.157473;
    private final double mileSq = mile*mile; */
   
    //Metric Variables
    private final double cm = 1000;
    private final double cm2 = cm*cm;
     
    private final double metre = 1; //common unit
    private final double metreSq = metre*metre;
   
    /*private final double kilometre = .001;
    private final double kilometreSq = kilometre*kilometre;  */ 
   
    public String insertArea(int type, int sType, double value)
    {
        double l=0;
        double r=0;
        switch(type)
        {
            case 1:
                l = inch;
                break;
            case 2:
                l = foot;
                break;
         /* case 3 :
                l = stone;
                break; */
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        switch(sType)
        {
            case 1:
                r = cm;
                break;
            case 2:
                r = metre;
                break;
         /* case 3 :
                r = tonne;
                break; */
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        
        String output = convert(l, r, value);
        
        return output;
    }//insertWeight
    
    public String insertArea2(int type, int sType, double value)
    {
        double l=0;
        double r=0;
        switch(type)
        {
            case 1:
                r = cm;
                break;
            case 2:
                r = metre;
                break;
         /* case 3 :
                r = tonne;
                break; */
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);         
        }//switch
        switch(sType)
        {
            case 1:
                l = inch;
                break;
            case 2:
                l = foot;
                break;
         /* case 3 :
                l = stone;
                break; */
            default:
                JOptionPane.showMessageDialog(null, " ", "Invalid selection", JOptionPane.ERROR_MESSAGE);
        }//switch
        
        String output = convert(l, r, value);
        
        return output;
    }//insertWeight2
    
    public String convert(double l, double r, double input)
    {
        double ratio = r/l;
        double output = input*ratio;        
        return Double.toString(output);
    } //convert
}//Area