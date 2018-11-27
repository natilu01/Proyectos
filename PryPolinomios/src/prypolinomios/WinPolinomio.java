/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypolinomios;

/**
 *
 * @author Estudiante
 */
public class WinPolinomio extends javax.swing.JFrame {

    /**
     * Creates new form WinPolinomio
     */
    public WinPolinomio() {
        initComponents();
        this.setTitle("***POLINOMIOS*** ");//encabezado para la ventana principal
    }
    int g,k;
    ClsPolinomio p,q;
    float c[];
    int b=1;
    float vi,vf,dx;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrado = new javax.swing.JButton();
        BtnCoef = new javax.swing.JButton();
        TxtPantalla = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEvaluar = new javax.swing.JButton();
        BtnRango = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnGrado.setBackground(new java.awt.Color(204, 204, 204));
        BtnGrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnGrado.setForeground(new java.awt.Color(51, 102, 255));
        BtnGrado.setText("Grado");
        BtnGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGradoActionPerformed(evt);
            }
        });

        BtnCoef.setBackground(new java.awt.Color(204, 204, 204));
        BtnCoef.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCoef.setForeground(new java.awt.Color(51, 102, 255));
        BtnCoef.setText("Coeficiente [i]");
        BtnCoef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoefActionPerformed(evt);
            }
        });

        TxtPantalla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnLimpiar.setBackground(new java.awt.Color(255, 204, 0));
        BtnLimpiar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        BtnSalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEvaluar.setBackground(new java.awt.Color(204, 204, 204));
        BtnEvaluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEvaluar.setForeground(new java.awt.Color(51, 102, 255));
        BtnEvaluar.setText("Evaluar");
        BtnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEvaluarActionPerformed(evt);
            }
        });

        BtnRango.setBackground(new java.awt.Color(204, 204, 204));
        BtnRango.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRango.setForeground(new java.awt.Color(51, 102, 255));
        BtnRango.setText("Rango: Valor Inicial");
        BtnRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEvaluar)
                    .addComponent(BtnGrado))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnRango)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCoef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrado)
                    .addComponent(BtnCoef)
                    .addComponent(BtnLimpiar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnEvaluar)
                    .addComponent(BtnRango))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGradoActionPerformed
        g=Integer.parseInt(TxtPantalla.getText());
        k=g;
        c=new float [k+1];
        BtnCoef.setText("Coeficiente["+k+"]");
        BtnGrado.setEnabled(false);
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnGradoActionPerformed

    private void BtnCoefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoefActionPerformed
        c[k]=Float.parseFloat(TxtPantalla.getText());
        k-=1;
        BtnCoef.setText("Coeficiente["+k+"]");
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        if (k<0) {
            q=new ClsPolinomio(g,c);
            TxtPantalla.setText(q.ver());
            BtnCoef.setText("Coeficiente[i]");
            BtnGrado.setEnabled(true);
           
        }
    }//GEN-LAST:event_BtnCoefActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed

        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEvaluarActionPerformed
        float a;
        a= Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(q.Fx(a)+"");
        TxtPantalla.requestFocus();
        System. out. println(a);
        
    }//GEN-LAST:event_BtnEvaluarActionPerformed

    private void BtnRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRangoActionPerformed
        float []r;
        String resp;
        int n;
        TxtPantalla.setText(null);
        switch(b){
            case 1:
                vi=Float.parseFloat(TxtPantalla.getText());
                b=2;
                BtnRango.setText("Rango: Valor Final");
                break;
            case 2:
                vf=Float.parseFloat(TxtPantalla.getText());
                b=3;
                BtnRango.setText("Rango: Valor Incremento");
                break;    
            case 3:
                dx=Float.parseFloat(TxtPantalla.getText());
                b=1;
                BtnRango.setText("Rango: Valor Inicial");
                
                r=q.evalua(vi, vf, dx);
                resp="["; 
                n=0;
                for (float i = vi; i <=vf; i+=dx) {
                    resp+="("+i+","+r[n]+")"+",";
                    n++;
                }
                TxtPantalla.setText(resp);
                break;
                default:
        }
        TxtPantalla.requestFocus();
        
    }//GEN-LAST:event_BtnRangoActionPerformed

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
            java.util.logging.Logger.getLogger(WinPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPolinomio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCoef;
    private javax.swing.JButton BtnEvaluar;
    private javax.swing.JButton BtnGrado;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRango;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
