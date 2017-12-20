

package xconvert;

import javax.swing.JOptionPane;

public class XConvert 
{

    public static void main(String[] args) 
    {
        Object [] options = {"Shite way","Fancy way","Neither way"};
        int choice = JOptionPane.showOptionDialog(null,
                "Select shite way or fancy way.",
                "How?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        
        boolean open = true;
        
        while(open){
            if(choice == 0){
                Convert c = new Convert();
                c.start();
                
            }else if(choice == 1){
                convertForm f = new convertForm();
                f.setVisible(true);
                
            }else if(choice == 2){
                open = false;
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "Shutting down");

        JOptionPane.showMessageDialog(null, "Douchecanoe!");
        
    } //End Main
    
}//End Class


