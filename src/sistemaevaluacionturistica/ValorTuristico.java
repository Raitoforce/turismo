
package sistemaevaluacionturistica;

import java.awt.event.KeyEvent;

public class ValorTuristico extends javax.swing.JFrame {
    
    FuncionesEvaluacion fe;
    VentanaInicio vi;
    String name;

    public ValorTuristico(FuncionesEvaluacion fe,VentanaInicio vi,String name){
        initComponents();
        this.fe=fe;
        this.vi=vi;
        this.name=name;
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        label_vpatrimonial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt_5 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_9 = new javax.swing.JTextField();
        txt_10 = new javax.swing.JTextField();
        txt_11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Valor Turistico");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 20, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Jerarquia");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Grado de Explotación");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Potencialidades");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Coherencia");
        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor Patrinomial");
        jLabel5.setToolTipText("");
        jPanel4.add(jLabel5);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(5, 0, 20, 30));

        txt_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txt_1);

        txt_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txt_2);

        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txt_3);

        txt_4.setColumns(3);
        txt_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_4FocusLost(evt);
            }
        });
        txt_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_4KeyTyped(evt);
            }
        });
        txt_4.setFocusTraversalKeysEnabled(false);
        jPanel5.add(txt_4);

        label_vpatrimonial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(label_vpatrimonial);

        jPanel1.add(jPanel5);

        jTabbedPane1.addTab("Valor Patrimonial", jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jPanel6.setLayout(new java.awt.GridLayout(7, 0, 20, 20));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Jerarquia");
        jLabel7.setToolTipText("");
        jPanel6.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Grado de Explotación");
        jLabel8.setToolTipText("");
        jPanel6.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Potencialidades");
        jLabel9.setToolTipText("");
        jPanel6.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Coherencia");
        jLabel10.setToolTipText("");
        jPanel6.add(jLabel10);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Coherencia");
        jLabel13.setToolTipText("");
        jPanel6.add(jLabel13);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Coherencia");
        jLabel14.setToolTipText("");
        jPanel6.add(jLabel14);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Valor Patrinomial");
        jLabel11.setToolTipText("");
        jPanel6.add(jLabel11);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(7, 0, 20, 20));

        txt_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txt_5);

        txt_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txt_6);

        txt_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txt_7);

        txt_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txt_9);

        txt_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txt_10);

        txt_11.setColumns(3);
        txt_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_11FocusLost(evt);
            }
        });
        txt_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_11KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_11KeyTyped(evt);
            }
        });
        txt_11.setFocusTraversalKeysEnabled(false);
        jPanel7.add(txt_11);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel12);

        jPanel2.add(jPanel7);

        jTabbedPane1.addTab("Valor de Uso", jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel8.setLayout(new java.awt.GridLayout(3, 2));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Valor Patrimonial");
        jPanel8.add(jLabel15);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Valor Explotación");
        jPanel8.add(jLabel17);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Valor del Recurso");
        jPanel8.add(jLabel19);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("55%");
        jPanel8.add(jLabel16);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("45%");
        jPanel8.add(jLabel21);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel18);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel22);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel23);

        jPanel3.add(jPanel8);

        jButton1.setText("Grafica VS");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setText("Guardar");

        jButton3.setText("Cancelar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(35, 35, 35))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel3.add(jPanel9);

        jTabbedPane1.addTab("Valor Turistico", jPanel3);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if(name.compareTo("4")==0){
            vi.txt_5.requestFocus();
        }else{
            vi.jTabbedPane2.setSelectedIndex(1);
            vi.txt_6.requestFocus();
        }
        VentanaInicio.vro=false;
        VentanaInicio.vco=false;
    }//GEN-LAST:event_formWindowClosed

    private void txt_4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_4FocusLost
        // TODO add your handling code here:
        try {
            fe.val2_4 = Integer.parseInt(txt_4.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_4FocusLost

    private void txt_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                //fe.val2_4 = Integer.parseInt(txt_4.getText());
            } catch (Exception e) {
            }

            jTabbedPane1.setSelectedIndex(1);
            txt_5.requestFocus();
        }
    }//GEN-LAST:event_txt_4KeyPressed

    private void txt_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_4.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_4KeyTyped

    private void txt_11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_11FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_11FocusLost

    private void txt_11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_11KeyPressed
        // TODO add your handling code here:
         if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                //fe.val2_4 = Integer.parseInt(txt_4.getText());
            } catch (Exception e) {
            }

            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_txt_11KeyPressed

    private void txt_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_11KeyTyped
        // TODO add your handling code here:
         char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_11.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_11KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_vpatrimonial;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_10;
    private javax.swing.JTextField txt_11;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    private javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_9;
    // End of variables declaration//GEN-END:variables
}
