package sistemaevaluacionturistica;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class ValorTuristico extends javax.swing.JFrame {

    FuncionesEvaluacion fe;
    VentanaInicio vi;
    String name;

    public void FormatoCampo(JTextField txt, int contenido) {
        if (contenido != -1) {
            txt.setText(String.valueOf(contenido));
        } else {
            txt.setText("");
        }
    }

    public void Refrescar() {
        if (name.compareTo("4") == 0) {
            FormatoCampo(txt_1, fe.val1_41);
            FormatoCampo(txt_2, fe.val1_42);
            FormatoCampo(txt_3, fe.val1_43);
            FormatoCampo(txt_4, fe.val1_44);
            FormatoCampo(txt_5, fe.val1_45);
            FormatoCampo(txt_6, fe.val1_46);
            FormatoCampo(txt_7, fe.val1_47);
            FormatoCampo(txt_8, fe.val1_48);
            FormatoCampo(txt_9, fe.val1_49);
            FormatoCampo(txt_10, fe.val1_410);
        } else {
            FormatoCampo(txt_1, fe.val1_51);
            FormatoCampo(txt_2, fe.val1_52);
            FormatoCampo(txt_3, fe.val1_53);
            FormatoCampo(txt_4, fe.val1_54);
            FormatoCampo(txt_5, fe.val1_55);
            FormatoCampo(txt_6, fe.val1_56);
            FormatoCampo(txt_7, fe.val1_57);
            FormatoCampo(txt_8, fe.val1_58);
            FormatoCampo(txt_9, fe.val1_59);
            FormatoCampo(txt_10, fe.val1_510);
        }

    }

    public ValorTuristico(FuncionesEvaluacion fe, VentanaInicio vi, String name) {
        initComponents();
        this.fe = fe;
        this.vi = vi;
        this.name = name;
        this.Refrescar();
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
        jPanel5 = new javax.swing.JPanel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt_5 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_8 = new javax.swing.JTextField();
        txt_9 = new javax.swing.JTextField();
        txt_10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_vpatrimonial = new javax.swing.JLabel();
        lbl_vexplotacion = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
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

        jPanel4.setLayout(new java.awt.GridLayout(4, 0, 20, 40));

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

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(4, 0, 20, 40));

        txt_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_1FocusLost(evt);
            }
        });
        txt_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_1KeyTyped(evt);
            }
        });
        jPanel5.add(txt_1);

        txt_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_2FocusLost(evt);
            }
        });
        txt_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_2KeyTyped(evt);
            }
        });
        jPanel5.add(txt_2);

        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_3FocusLost(evt);
            }
        });
        txt_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3KeyTyped(evt);
            }
        });
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

        jPanel1.add(jPanel5);

        jTabbedPane1.addTab("Valor Patrimonial", jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jPanel6.setLayout(new java.awt.GridLayout(6, 0, 20, 15));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Accesos");
        jLabel7.setToolTipText("");
        jPanel6.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Señalización");
        jLabel8.setToolTipText("");
        jPanel6.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Interpretación");
        jLabel9.setToolTipText("");
        jPanel6.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Relación act-pot");
        jLabel10.setToolTipText("");
        jPanel6.add(jLabel10);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Actividad Turistica");
        jLabel13.setToolTipText("");
        jPanel6.add(jLabel13);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Facilidades");
        jLabel14.setToolTipText("");
        jPanel6.add(jLabel14);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(6, 0, 20, 15));

        txt_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_5FocusLost(evt);
            }
        });
        txt_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_5KeyTyped(evt);
            }
        });
        jPanel7.add(txt_5);

        txt_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_6FocusLost(evt);
            }
        });
        txt_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_6KeyTyped(evt);
            }
        });
        jPanel7.add(txt_6);

        txt_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_7FocusLost(evt);
            }
        });
        txt_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_7KeyTyped(evt);
            }
        });
        jPanel7.add(txt_7);

        txt_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_8FocusLost(evt);
            }
        });
        txt_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_8KeyTyped(evt);
            }
        });
        jPanel7.add(txt_8);

        txt_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_9FocusLost(evt);
            }
        });
        txt_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_9KeyTyped(evt);
            }
        });
        jPanel7.add(txt_9);

        txt_10.setColumns(3);
        txt_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_10FocusLost(evt);
            }
        });
        txt_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_10KeyTyped(evt);
            }
        });
        txt_10.setFocusTraversalKeysEnabled(false);
        jPanel7.add(txt_10);

        jPanel2.add(jPanel7);

        jTabbedPane1.addTab("Valor de Uso", jPanel2);

        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });
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

        lbl_vpatrimonial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbl_vpatrimonial);

        lbl_vexplotacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbl_vexplotacion);

        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbl_total);

        jPanel3.add(jPanel8);

        jButton1.setText("Grafica VS");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
        if (name.compareTo("4") == 0) {
            vi.txt_5.requestFocus();
        } else {
            vi.jTabbedPane2.setSelectedIndex(1);
            vi.txt_6.requestFocus();
        }
        VentanaInicio.vro = false;
        VentanaInicio.vco = false;
    }//GEN-LAST:event_formWindowClosed

    private void txt_4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_4FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_44 = Integer.parseInt(txt_4.getText());
            } else {
                fe.val1_54 = Integer.parseInt(txt_4.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_4FocusLost

    private void txt_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                if (name.compareTo("4") == 0) {
                    fe.val1_44 = Integer.parseInt(txt_4.getText());
                } else {
                    fe.val1_54 = Integer.parseInt(txt_4.getText());
                }
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

    private void txt_10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_10FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_410 = Integer.parseInt(txt_10.getText());
            } else {
                fe.val1_510 = Integer.parseInt(txt_10.getText());
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_10FocusLost

    private void txt_10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_10KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                if (name.compareTo("4") == 0) {
                fe.val1_410 = Integer.parseInt(txt_10.getText());
            } else {
                fe.val1_510 = Integer.parseInt(txt_10.getText());
            }
            } catch (Exception e) {
            }

            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_txt_10KeyPressed

    private void txt_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_10KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_10.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_10KeyTyped

    private void txt_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_1FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_41 = Integer.parseInt(txt_1.getText());
            } else {
                fe.val1_51 = Integer.parseInt(txt_1.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_1FocusLost

    private void txt_2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_2FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_42 = Integer.parseInt(txt_2.getText());
            } else {
                fe.val1_52 = Integer.parseInt(txt_2.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_2FocusLost

    private void txt_3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_3FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_43 = Integer.parseInt(txt_3.getText());
            } else {
                fe.val1_53 = Integer.parseInt(txt_3.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_3FocusLost

    private void txt_5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_5FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_45 = Integer.parseInt(txt_5.getText());
            } else {
                fe.val1_55 = Integer.parseInt(txt_5.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_5FocusLost

    private void txt_6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_6FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_46 = Integer.parseInt(txt_6.getText());
            } else {
                fe.val1_56 = Integer.parseInt(txt_6.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_6FocusLost

    private void txt_7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_7FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_47 = Integer.parseInt(txt_7.getText());
            } else {
                fe.val1_57 = Integer.parseInt(txt_7.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_7FocusLost

    private void txt_8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_8FocusLost
        // TODO add your handling code here:
        try {
           if (name.compareTo("4") == 0) {
                fe.val1_48 = Integer.parseInt(txt_8.getText());
            } else {
                fe.val1_58 = Integer.parseInt(txt_8.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_8FocusLost

    private void txt_9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_9FocusLost
        // TODO add your handling code here:
        try {
            if (name.compareTo("4") == 0) {
                fe.val1_49 = Integer.parseInt(txt_9.getText());
            } else {
                fe.val1_59 = Integer.parseInt(txt_9.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_9FocusLost

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        // TODO add your handling code here:
        if (name.compareTo("4") == 0) {
            lbl_vpatrimonial.setText(String.valueOf(fe.vPatrimonio4()));
            lbl_vexplotacion.setText(String.valueOf(fe.vUso4()));
            lbl_total.setText(String.valueOf(fe.vTuristico4()));
        } else {
            lbl_vpatrimonial.setText(String.valueOf(fe.vPatrimonio5()));
            lbl_vexplotacion.setText(String.valueOf(fe.vUso5()));
            lbl_total.setText(String.valueOf(fe.vTuristico5()));
        }
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (name.compareTo("4") == 0) {
            fe.val1_4 = Math.round(fe.vTuristico4());
            vi.txt_4.setText(String.valueOf(fe.val1_4));
        } else {
            fe.val1_5 = Math.round(fe.vTuristico5());
            vi.txt_5.setText(String.valueOf(fe.val1_5));
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_5KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_5.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_5KeyTyped

    private void txt_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_1.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_1KeyTyped

    private void txt_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_2KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_2.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_2KeyTyped

    private void txt_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_3.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_3KeyTyped

    private void txt_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_6KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_6.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_6KeyTyped

    private void txt_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_7KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_7.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_7KeyTyped

    private void txt_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_8KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_8.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_8KeyTyped

    private void txt_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_9KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_9.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_9KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (name.compareTo("4") == 0)
            fe.CrearGraficaVS("4");
        else
            fe.CrearGraficaVS("5");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_vexplotacion;
    private javax.swing.JLabel lbl_vpatrimonial;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_10;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    private javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_8;
    private javax.swing.JTextField txt_9;
    // End of variables declaration//GEN-END:variables
}
