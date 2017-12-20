/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xconvert;

import java.text.DecimalFormat;

/**
 *
 * @author Cormac
 */
public class convertForm extends javax.swing.JFrame {

    /**
     * Creates new form convertForm
     */
    DecimalFormat df = new DecimalFormat("#,###.###");
    public convertForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jWeightIn = new javax.swing.JComboBox<>();
        jWeightOut = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        jConvertButton = new javax.swing.JButton();
        jSelect = new javax.swing.JComboBox<>();
        jLengthIn = new javax.swing.JComboBox<>();
        jLengthOut = new javax.swing.JComboBox<>();
        jTempIn = new javax.swing.JComboBox<>();
        jTempOut = new javax.swing.JComboBox<>();
        jInField = new javax.swing.JTextField();
        jOutField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(311, 251));
        setMinimumSize(new java.awt.Dimension(311, 251));
        setResizable(false);

        jWeightIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ounce", "pound", "stone" }));
        jWeightIn.setToolTipText("");

        jWeightOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gram", "kilogram", "tonne" }));

        label.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        label.setText("xConvert");

        jConvertButton.setText("Convert");
        jConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertButtonActionPerformed(evt);
            }
        });

        jSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weight", "Length", "Temperature" }));
        jSelect.setSelectedItem(null);
        jSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jSelectItemStateChanged(evt);
            }
        });

        jLengthIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "inches", "feet", "miles" }));

        jLengthOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "centimeters", "meters", "kilometers" }));

        jTempIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fahrenheit", "celsius" }));

        jTempOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gram", "kilogram", "tonne" }));

        jInField.setText("jTextField1");

        jOutField.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jConvertButton)
                .addGap(114, 120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInField)
                    .addComponent(jWeightIn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLengthIn, 0, 100, Short.MAX_VALUE)
                    .addComponent(jTempIn, 0, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jWeightOut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLengthOut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTempOut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jOutField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWeightIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWeightOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLengthIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLengthOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTempIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jConvertButton)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertButtonActionPerformed
        
        if(jSelect.getSelectedItem().equals("Weight")){
            weightCalc();
        }
        else if(jSelect.getSelectedItem().equals("Length")){
            lengthCalc();
        }
        else if(jSelect.getSelectedItem().equals("Temperature")){
            tempCalc();
        }
        
    }//GEN-LAST:event_jConvertButtonActionPerformed

    private void jSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jSelectItemStateChanged
        
        if(jSelect.getSelectedItem().equals("Weight")){
            jWeightIn.setEnabled(true);
            jWeightOut.setEnabled(true);
            jLengthIn.setEnabled(false);
            jLengthOut.setEnabled(false);
            jTempIn.setEnabled(false);
            jTempOut.setEnabled(false);
            
        }else if(jSelect.getSelectedItem().equals("Length")){
            jWeightIn.setEnabled(false);
            jWeightOut.setEnabled(false);
            jLengthIn.setEnabled(true);
            jLengthOut.setEnabled(true);
            jTempIn.setEnabled(false);
            jTempOut.setEnabled(false);
            
        }else if(jSelect.getSelectedItem().equals("Temperature")){
            jWeightIn.setEnabled(false);
            jWeightOut.setEnabled(false);
            jLengthIn.setEnabled(false);
            jLengthOut.setEnabled(false);
            jTempIn.setEnabled(true);
            jTempOut.setEnabled(true);
        }
          
    }//GEN-LAST:event_jSelectItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(convertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertForm().setVisible(true);
                
                jConvertButton.setEnabled(false);
                jTempIn.setEnabled(false);
                jTempOut.setEnabled(false);
                jWeightIn.setEnabled(false);
                jWeightOut.setEnabled(false);
                jLengthIn.setEnabled(false);
                jLengthOut.setEnabled(false);
                new convertForm().setVisible(true);
            }
        });
    }
    
    private void weightCalc(){
        Weight w = new Weight();
        
        int leftType = jWeightIn.getSelectedIndex()+1;
        int rightType = jWeightOut.getSelectedIndex()+1;
        
        double value = Double.parseDouble(jInField.getText());
        double ans = w.insertWeight(leftType, rightType, value);
        
        jOutField.setText(df.format(ans));
    }
    
    private void lengthCalc(){
        Length l = new Length();
        
        int leftType = jLengthIn.getSelectedIndex()+1;
        int rightType = jLengthOut.getSelectedIndex()+1;
        
        double value = Double.parseDouble(jInField.getText());
        double ans = l.insert(leftType, rightType, value);
        
        jOutField.setText(df.format(ans));
    }
    
    private void tempCalc(){
        Temperature t = new Temperature();
        
        int leftType = jTempIn.getSelectedIndex()+1;
        int rightType = jTempOut.getSelectedIndex()+1;
        
        double value = Double.parseDouble(jInField.getText());
        double ans = t.insert(leftType, rightType, value);
        
        jOutField.setText(df.format(ans));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jConvertButton;
    private javax.swing.JTextField jInField;
    private static javax.swing.JComboBox<String> jLengthIn;
    private static javax.swing.JComboBox<String> jLengthOut;
    private javax.swing.JTextField jOutField;
    private javax.swing.JComboBox<String> jSelect;
    private static javax.swing.JComboBox<String> jTempIn;
    private static javax.swing.JComboBox<String> jTempOut;
    private static javax.swing.JComboBox<String> jWeightIn;
    private static javax.swing.JComboBox<String> jWeightOut;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
