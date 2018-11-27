
package pryconjuntos;

public class WinClsConjunto extends javax.swing.JFrame {

    /**
     * Creates new form WinClsConjunto
     */
    public WinClsConjunto() {
        initComponents();
        this.setTitle("***CONJUNTOS*** ");//encabezado para la ventana principal
    }
    int card;
    int ne, codigo;
      
    ClsConjunto a,b;
    String dat [];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BtnCard = new javax.swing.JButton();
        BtnElemento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnUnion = new javax.swing.JButton();
        BtnInterseccion = new javax.swing.JButton();
        BtnDiferencia = new javax.swing.JButton();
        BtnDifSimetrica = new javax.swing.JButton();
        BtnProdCarteciano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnLimpiar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnCard.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnCard.setText("CARDINALIDAD");
        BtnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCardActionPerformed(evt);
            }
        });

        BtnElemento.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        BtnElemento.setText("ELEMENTO[ i ]");
        BtnElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(BtnElemento)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCard)
                    .addComponent(BtnElemento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnUnion.setText("UNION");
        BtnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnionActionPerformed(evt);
            }
        });

        BtnInterseccion.setText("INTERSECCION");
        BtnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterseccionActionPerformed(evt);
            }
        });

        BtnDiferencia.setText("DIFERENCIA");
        BtnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiferenciaActionPerformed(evt);
            }
        });

        BtnDifSimetrica.setText("DIF.SIMETRICA");
        BtnDifSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDifSimetricaActionPerformed(evt);
            }
        });

        BtnProdCarteciano.setText("PROD.CARTESIANO");
        BtnProdCarteciano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdCartecianoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInterseccion)
                    .addComponent(BtnUnion)
                    .addComponent(BtnDiferencia)
                    .addComponent(BtnDifSimetrica)
                    .addComponent(BtnProdCarteciano))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnUnion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInterseccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnDiferencia)
                .addGap(18, 18, 18)
                .addComponent(BtnDifSimetrica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(BtnProdCarteciano)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLimpiar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnIgual)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnIgual)
                        .addGap(37, 37, 37)
                        .addComponent(BtnSalir)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElementoActionPerformed
        dat[ne-1]=TxtPantalla.getText();
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        ne++;
        BtnElemento.setText("ELEMENTO [ "+(ne)+" ]"); 
           
        if (ne>=card) {
            b=new ClsConjunto(card,dat);
            BtnElemento.setText("ELEMENTO [ i ]");
            BtnCard.setEnabled(true);           
            
        }

        
         
    }//GEN-LAST:event_BtnElementoActionPerformed

    private void BtnCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCardActionPerformed

        card =Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
        ne=1;
        b= new ClsConjunto (card);
        BtnElemento.setText("ELEMENTO [ "+(ne)+" ]");
        BtnCard.setEnabled(false);
        dat = new String [card];
        TxtPantalla.requestFocus();


    }//GEN-LAST:event_BtnCardActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnionActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a= new ClsConjunto(b);//clona el objeto todo lo de a esta en b
        codigo=1;
    }//GEN-LAST:event_BtnUnionActionPerformed

    private void BtnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterseccionActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a= new ClsConjunto(b);//clona el objeto todo lo de a esta en b
        codigo=2;
    }//GEN-LAST:event_BtnInterseccionActionPerformed

    private void BtnDifSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDifSimetricaActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a= new ClsConjunto(b);//clona el objeto todo lo de a esta en b
        codigo=4;
    }//GEN-LAST:event_BtnDifSimetricaActionPerformed

    private void BtnProdCartecianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdCartecianoActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a= new ClsConjunto(b);//clona el objeto todo lo de a esta en b
        codigo=5;
    }//GEN-LAST:event_BtnProdCartecianoActionPerformed

    private void BtnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiferenciaActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a= new ClsConjunto(b);//clona el objeto todo lo de a esta en b
        codigo=3;
        
    }//GEN-LAST:event_BtnDiferenciaActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        switch(codigo){
            case 1://UNION CONJUNTOS
                b=new ClsConjunto (a.union(b));
                break;
            case 2://INTERSECCION CONJUNTOS
                b=new ClsConjunto (a.interseccion(b));
                break;
            case 3://DIFERENCIA CONJUNTOS
                b=new ClsConjunto (a.diferencia(b));
                break;
            case 4://DIFERENCIA SIMETRICA CONJUNTOS
                b=new ClsConjunto (a.difsimetrica(b));
                break;
            case 5://PRODUCTO CARTESIANO CONJUNTOS
                b=new ClsConjunto (a.prodCartesiano(b));
                break;
            default:
        }
        TxtPantalla.setText(b.ver());
        
    }//GEN-LAST:event_BtnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(WinClsConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinClsConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinClsConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinClsConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinClsConjunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCard;
    private javax.swing.JButton BtnDifSimetrica;
    private javax.swing.JButton BtnDiferencia;
    private javax.swing.JButton BtnElemento;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnInterseccion;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnProdCarteciano;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnUnion;
    private javax.swing.JTextField TxtPantalla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
