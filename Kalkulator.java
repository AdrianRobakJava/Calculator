/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;

/**
 *
 * @author kurs
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
        this.setLocation(300, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        dzialanie = new javax.swing.JComboBox<>();
        policz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator ");

        field1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        field2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        dzialanie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dzialanie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", "^", "v-" }));
        dzialanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dzialanieActionPerformed(evt);
            }
        });

        policz.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        policz.setText("Policz");
        policz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policzActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(policz, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(field1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(dzialanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dzialanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(policz)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dzialanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dzialanieActionPerformed
       
    }//GEN-LAST:event_dzialanieActionPerformed

    private void policzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policzActionPerformed
       double argument1 = 0.0;
       double argument2 = 0.0;
        
        try {
            argument1 = Double.parseDouble(field1.getText());
            argument2 = Double.parseDouble(field2.getText()); 
                String dzialanie = this.dzialanie.getSelectedItem().toString();

                double result = 0.0;
                switch (dzialanie){
                    case "+":
                        result = argument1 + argument2;
                        showResult(result);
                        break;
                    case "-":
                        result = argument1 - argument2;
                        showResult(result);
                        break;
                    case "*":
                        result = argument1 * argument2;
                        showResult(result);
                        break;
                    case "/":
                        result = argument1 / argument2;
                        showResult(result);
                        break;
                    case "^":
                        result = Math.pow(argument1, argument2) ;
                        showResult(result);
                        break;
                    case "v-":
                        int arg2 = (int) argument2;
                        if (argument1 < 0){
                            area.setForeground(Color.RED);
                            area.setText("W tym kalkulatorze nie da się pierwiastkować liczb ujemnych!");
                            break;
                        }
                        if (arg2 >= 1){  
                        result = Math.pow(argument1,(1.0/arg2)) ;
                        showResult(result);   
                        } else {
                            area.setForeground(Color.RED);
                            area.setText("Pierwiastkowanie w tym kalkulatorze jest możliwe,\ntylko przez liczby naturalne.\nW razie wpisania liczby nie całkowitej zostanie ona zaokrąglona w dół.");
                        }
                        break;
                }
        } catch (NumberFormatException e){
            area.setForeground(Color.RED);
            area.setText("Wprowadzono niepoprawne dane!");
        }
        
        
        
    }//GEN-LAST:event_policzActionPerformed
    public void showResult(double result){
        area.setForeground(Color.BLACK);
        area.setText(String.format("%.2f", result));
    }
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JComboBox<String> dzialanie;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton policz;
    // End of variables declaration//GEN-END:variables
}
