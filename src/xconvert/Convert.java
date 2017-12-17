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
    
    double output = 0;
    
    public void start(){
        
        JOptionPane.showMessageDialog(null, "Welcome to xConvert");
        
        int option = Integer.parseInt(JOptionPane.showInputDialog("Select conversion type:\n"
                + "1 - Weight\n"
                + "2 - Length\n"
                + "3 - Temp\n"
                + "4 - EXIT"));
        
        switch(option){
            case 1 : 
                break;
            
            case 2 : 
                Length l = new Length();
                int select = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                        + "1 - Imperial\n"
                        + "2 - Metric\n"
                        + "3 - BACK"));
                
                if(select == 1){
                    int type = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inches\n"
                            + "2 - feet\n"
                            + "3 - miles\n"
                            + "4 - BACK"));
                    
                    double value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    
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
                    
                    double value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    
                    int sType = Integer.parseInt(JOptionPane.showInputDialog("Select:\n"
                            + "1 - inches\n"
                            + "2 - feet\n"
                            + "3 - miles\n"
                            + "4 - BACK"));
                    
                    output = l.insert2(type,sType,value);
                }
                
        }
        
        JOptionPane.showMessageDialog(null, "Answer is: " + output);
    }
}
