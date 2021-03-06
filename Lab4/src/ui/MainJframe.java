/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.EncounterHistory;
import model.Person;
import model.PersonDirectory;
import model.PatientDirectory;
/**
 *
 * @author Neha
 */


public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    PatientDirectory abnormalPatients;
    EncounterHistory abnormalEncounters;
    public MainJframe() {
        initComponents();
        //personDirectory = new PersonDirectory();
        personDirectory = getDataFromCSV();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        abnormalPatients = new PatientDirectory();
        abnormalEncounters = new EncounterHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanel = new javax.swing.JSplitPane();
        ControlArea = new javax.swing.JPanel();
        btnPersonDatabase = new javax.swing.JButton();
        btnPatientDatabase = new javax.swing.JButton();
        btnAbnormalCases = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        ControlArea.setBackground(new java.awt.Color(255, 255, 255));

        btnPersonDatabase.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonDatabase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPersonDatabase.setText("Person Database");
        btnPersonDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDatabaseActionPerformed(evt);
            }
        });

        btnPatientDatabase.setBackground(new java.awt.Color(255, 255, 255));
        btnPatientDatabase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPatientDatabase.setText("Patient Database");
        btnPatientDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDatabaseActionPerformed(evt);
            }
        });

        btnAbnormalCases.setBackground(new java.awt.Color(255, 255, 255));
        btnAbnormalCases.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAbnormalCases.setText("Abnormal Cases");
        btnAbnormalCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalCasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlAreaLayout = new javax.swing.GroupLayout(ControlArea);
        ControlArea.setLayout(ControlAreaLayout);
        ControlAreaLayout.setHorizontalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGroup(ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPersonDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatientDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbnormalCases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        ControlAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPatientDatabase, btnPersonDatabase});

        ControlAreaLayout.setVerticalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnPersonDatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPatientDatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbnormalCases)
                .addContainerGap())
        );

        SplitPanel.setLeftComponent(ControlArea);

        WorkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SplitPanel.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDatabaseActionPerformed
        // TODO add your handling code here:
        viewPersonDirectory viewDirectory = new viewPersonDirectory(personDirectory,patientDirectory,encounterHistory);
        System.out.println("1");
        SplitPanel.setRightComponent(viewDirectory);
        System.out.println("visible");
    }//GEN-LAST:event_btnPersonDatabaseActionPerformed

    private void btnPatientDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDatabaseActionPerformed
        // TODO add your handling code here:
        viewPatientDirectory viewPatDirectory = new viewPatientDirectory(patientDirectory, encounterHistory,abnormalPatients,abnormalEncounters);
        SplitPanel.setRightComponent(viewPatDirectory);
    }//GEN-LAST:event_btnPatientDatabaseActionPerformed

    private void btnAbnormalCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalCasesActionPerformed
        // TODO add your handling code here:
        viewAbnormalCases abnormalCases = new viewAbnormalCases(abnormalPatients,abnormalEncounters,personDirectory);
        SplitPanel.setRightComponent(abnormalCases);
    }//GEN-LAST:event_btnAbnormalCasesActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlArea;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnAbnormalCases;
    private javax.swing.JButton btnPatientDatabase;
    private javax.swing.JButton btnPersonDatabase;
    // End of variables declaration//GEN-END:variables

    private PersonDirectory getDataFromCSV() {
       PersonDirectory csvData = new PersonDirectory();
        Path pathToFile = Paths.get("/Users/vinithiteshharsora/desktop/PERSONDATA.csv");
        try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
            String line = br.readLine();
            while(line!= null){
            String[] attributes = line.split(",");
            Person person = addPerson(attributes);
            csvData.addNewPerson(person);
            line = br.readLine();
            
            }
        }catch(IOException ioe){
        ioe.printStackTrace();
        }
        return csvData;
    }

    private Person addPerson(String[] attributes) {
        Person person = new Person();
        person.setFirstname(attributes[0]);
        person.setLastname(attributes[1]);
        person.setPersonage(Integer.parseInt(attributes[2]));
        person.setPersoncityname(attributes[3]);
        person.setPersoncommunityname(attributes[4]);
        person.setPersonhouseno(Integer.parseInt(attributes[5]));
        return person;
    }
}
