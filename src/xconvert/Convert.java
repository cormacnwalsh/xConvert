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
public class Convert {
    
    private double output;
    private int select;
    private double value;
    
    public void start(){
        
        JOptionPane.showMessageDialog(null, "Welcome to xConvert");
        
        int option = Integer.parseInt(JOptionPane.showInputDialog("Select conversion type:\n"
                + "1 - Weight\n"
                + "2 - Length\n"
                + "3 - Temp\n"
                + "4 - Area\n"
                + "5 - EXIT"));
        
        switch(option){
            case 1 :
                Weight w = new Weight();
                select = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                        + "1 - Imperial\n"
                        + "2 - Metric\n"
                        + "3 - BACK"));
                
                if(select == 1){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - ounce\n"
                            + "2 - pound\n"
                            + "3 - stone\n"
                            + "4 - BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - gram\n"
                            + "2 - kilogram\n"
                            + "3 - tonne\n"
                            + "BACK"));
                            
                    output = w.insertWeight(type,sType,value);
                    
                }
                else if(select == 2){
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - gram\n"
                            + "2 - kilogram\n"
                            + "3 - tonne\n"
                            + "BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - ounce\n"
                            + "2 - pound\n"
                            + "3 - stone\n"
                            + "4 - BACK"));
                    
                    output = w.insertWeight2(type,sType,value);
                }
                break;
            
            case 2 : 
                Length l = new Length();
                select = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                        + "1 - Imperial\n"
                        + "2 - Metric\n"
                        + "3 - BACK"));
                
                if(select == 1){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inches\n"
                            + "2 - feet\n"
                            + "3 - miles\n"
                            + "4 - BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - Centimeters\n"
                            + "2 - Meters\n"
                            + "3 - Kilometers\n"
                            + "BACK"));
                            
                    output = l.insert(type,sType,value);
                    
                }else if(select == 2){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - Centimeters\n"
                            + "2 - Meters\n"
                            + "3 - Kilometers\n"
                            + "BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inches\n"
                            + "2 - feet\n"
                            + "3 - miles\n"
                            + "4 - BACK"));
                    
                    output = l.insert2(type,sType,value);
                }
                break;
                
            case 3:
                Temperature t = new Temperature();
                int left = Integer.parseInt(JOptionPane.showInputDialog("Select\n"
                        + "1 - Kelvin\n"
                        + "2 - Fahrenheit\n"
                        + "3 - Celsius\n"
                        + "4 - BACK"));
                
                value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                
                int right = Integer.parseInt(JOptionPane.showInputDialog("Select\n"
                        + "1 - Kelvin\n"
                        + "2 - Fahrenheit\n"
                        + "3 - Celsius\n"
                        + "4 - BACK"));
                        
                output = t.insert(left, right, value);
                
                break;
                
            case 4:
                Area a = new Area();
                select = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                        + "1 - Imperial\n"
                        + "2 - Metric\n"
                        + "3 - BACK"));
                
                if(select == 1){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inch Sq\n"
                            + "2 - feet Sq\n"
                            + "3 - miles Sq\n"
                            + "4 - BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - Centimeters Sq\n"
                            + "2 - Meters Sq\n"
                            + "3 - Kilometers Sq\n"
                            + "BACK"));
                            
                    output = Double.parseDouble(a.insertArea(type,sType,value));
                    
                }else if(select == 2){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - Centimeters Sq\n"
                            + "2 - Meters Sq\n"
                            + "3 - Kilometers Sq\n"
                            + "BACK"));
                    
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inches Sq\n"
                            + "2 - feet Sq\n"
                            + "3 - miles Sq\n"
                            + "4 - BACK"));
                    
                    output = Double.parseDouble(a.insertArea2(type,sType,value));
                }
                break;
                
            case 5: 
                System.exit(0);
        }//switch
        
        JOptionPane.showMessageDialog(null, "Answer is: " + output);
    }
}
