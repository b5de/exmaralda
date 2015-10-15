/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CHATExportAccessoryPanel.java
 *
 * Created on 03.05.2010, 16:17:07
 */

package org.exmaralda.partitureditor.jexmaraldaswing.fileDialogs;

import java.awt.event.ActionEvent;
import org.exmaralda.partitureditor.jexmaralda.convert.TEIConverter;

/**
 *
 * @author thomas
 */
public class TEIExportAccessoryPanel extends javax.swing.JPanel {

    /** Creates new form CHATExportAccessoryPanel */
    public TEIExportAccessoryPanel() {
        initComponents();
    }

    public int getMethod(){
        if (azmRadioButton.isSelected()) return TEIConverter.AZM_METHOD;
        if (hiatSegmentationRadioButton.isSelected() && hiatOldRadioButton.isSelected()) return TEIConverter.HIAT_METHOD;
        if (hiatSegmentationRadioButton.isSelected() && hiatNewRadioButton.isSelected()) return TEIConverter.HIAT_NEW_METHOD;
        if (hiatSegmentationRadioButton.isSelected() && hiatISORadioButton.isSelected()) return TEIConverter.HIAT_ISO_METHOD;
        if (cGatSegmentationRadioButton.isSelected()) return TEIConverter.CGAT_METHOD;
        if (genericRadioButton.isSelected()) return TEIConverter.GENERIC_METHOD;
        if (isoGenericRadioButton.isSelected()) return TEIConverter.ISO_GENERIC_METHOD;
        if (modenaMethodRadioButton.isSelected()) return TEIConverter.MODENA_METHOD;
        return TEIConverter.GENERIC_METHOD;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        genericRadioButton = new javax.swing.JRadioButton();
        isoGenericRadioButton = new javax.swing.JRadioButton();
        modenaMethodRadioButton = new javax.swing.JRadioButton();
        azmRadioButton = new javax.swing.JRadioButton();
        hiatSegmentationRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        hiatOldRadioButton = new javax.swing.JRadioButton();
        hiatNewRadioButton = new javax.swing.JRadioButton();
        hiatISORadioButton = new javax.swing.JRadioButton();
        cGatSegmentationRadioButton = new javax.swing.JRadioButton();
        wordIDsCheckBox = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder("TEI Export Method"));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonGroup1.add(genericRadioButton);
        genericRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        genericRadioButton.setText("Generic");
        genericRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericRadioButtonActionPerformed(evt);
            }
        });
        add(genericRadioButton);

        buttonGroup1.add(isoGenericRadioButton);
        isoGenericRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        isoGenericRadioButton.setForeground(new java.awt.Color(0, 0, 102));
        isoGenericRadioButton.setSelected(true);
        isoGenericRadioButton.setText("ISO - Generic");
        isoGenericRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isoGenericRadioButtonActionPerformed(evt);
            }
        });
        add(isoGenericRadioButton);

        buttonGroup1.add(modenaMethodRadioButton);
        modenaMethodRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        modenaMethodRadioButton.setText("Modena method");
        modenaMethodRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modenaMethodRadioButtonActionPerformed(evt);
            }
        });
        add(modenaMethodRadioButton);

        buttonGroup1.add(azmRadioButton);
        azmRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        azmRadioButton.setText("AZM method");
        azmRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azmRadioButtonActionPerformed(evt);
            }
        });
        add(azmRadioButton);

        buttonGroup1.add(hiatSegmentationRadioButton);
        hiatSegmentationRadioButton.setText("HIAT segmentation...");
        hiatSegmentationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiatSegmentationRadioButtonActionPerformed(evt);
            }
        });
        add(hiatSegmentationRadioButton);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 1));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        buttonGroup2.add(hiatOldRadioButton);
        hiatOldRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        hiatOldRadioButton.setText("... old style");
        hiatOldRadioButton.setEnabled(false);
        hiatOldRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiatOldRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hiatOldRadioButton);

        buttonGroup2.add(hiatNewRadioButton);
        hiatNewRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        hiatNewRadioButton.setText("... new style");
        hiatNewRadioButton.setEnabled(false);
        hiatNewRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiatNewRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hiatNewRadioButton);

        buttonGroup2.add(hiatISORadioButton);
        hiatISORadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hiatISORadioButton.setForeground(new java.awt.Color(0, 0, 102));
        hiatISORadioButton.setSelected(true);
        hiatISORadioButton.setText("... ISO style");
        hiatISORadioButton.setEnabled(false);
        hiatISORadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiatISORadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hiatISORadioButton);

        add(jPanel1);

        buttonGroup1.add(cGatSegmentationRadioButton);
        cGatSegmentationRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cGatSegmentationRadioButton.setForeground(new java.awt.Color(0, 0, 102));
        cGatSegmentationRadioButton.setText("ISO - cGAT segmentation");
        cGatSegmentationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGatSegmentationRadioButtonActionPerformed(evt);
            }
        });
        add(cGatSegmentationRadioButton);

        wordIDsCheckBox.setSelected(true);
        wordIDsCheckBox.setText("Generate Word IDs");
        wordIDsCheckBox.setEnabled(false);
        add(wordIDsCheckBox);
    }// </editor-fold>//GEN-END:initComponents

    void checkEnable(ActionEvent evt){
        hiatOldRadioButton.setEnabled(hiatSegmentationRadioButton.isSelected());
        hiatNewRadioButton.setEnabled(hiatSegmentationRadioButton.isSelected());
        hiatISORadioButton.setEnabled(hiatSegmentationRadioButton.isSelected());
        wordIDsCheckBox.setEnabled(hiatSegmentationRadioButton.isSelected() && hiatNewRadioButton.isSelected());        
    }
    
    private void hiatSegmentationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiatSegmentationRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_hiatSegmentationRadioButtonActionPerformed

    private void genericRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_genericRadioButtonActionPerformed

    private void modenaMethodRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modenaMethodRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_modenaMethodRadioButtonActionPerformed

    private void azmRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azmRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_azmRadioButtonActionPerformed

    private void cGatSegmentationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGatSegmentationRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_cGatSegmentationRadioButtonActionPerformed

    private void hiatOldRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiatOldRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_hiatOldRadioButtonActionPerformed

    private void hiatNewRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiatNewRadioButtonActionPerformed
        checkEnable(evt);
    }//GEN-LAST:event_hiatNewRadioButtonActionPerformed

    private void isoGenericRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isoGenericRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isoGenericRadioButtonActionPerformed

    private void hiatISORadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiatISORadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiatISORadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton azmRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cGatSegmentationRadioButton;
    private javax.swing.JRadioButton genericRadioButton;
    private javax.swing.JRadioButton hiatISORadioButton;
    private javax.swing.JRadioButton hiatNewRadioButton;
    private javax.swing.JRadioButton hiatOldRadioButton;
    private javax.swing.JRadioButton hiatSegmentationRadioButton;
    private javax.swing.JRadioButton isoGenericRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton modenaMethodRadioButton;
    private javax.swing.JCheckBox wordIDsCheckBox;
    // End of variables declaration//GEN-END:variables

    public boolean getGenerateWordIDs() {
        return wordIDsCheckBox.isSelected();
    }

}