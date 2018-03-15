package sistemaevaluacionturistica;

import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValorTuristico extends javax.swing.JDialog {

    FuncionesEvaluacion fe;
    String name;
    int seleccionado=0;
    int val1=-1,val2=-1,val3=-1,val4=-1,val5=-1,val6=-1,val7=-1,val8=-1,val9=-1,val10=-1;
    private final VentanaRecursos vr;
    
    public float vPatrimonio(){
        return (float) (((float) val1 * 0.4) + ((float) val2 * 0.3) + ((float) val3 * 0.1) + ((float) val4 * 0.2));
    }
    
    public float vUso() {
        return (float) (((float) val5 * 0.1) + ((float) val6 * 0.1) + ((float) val7 * 0.2) + ((float) val8 * 0.3) + ((float) val9 * 0.2) + ((float) val10 * 0.1));
    }
    
    public float vTuristico() {
        return (float) ((vPatrimonio() * 0.55) + (vUso() * 0.45));
    }
    
    public boolean checar(){
        boolean band= true;
        if(val1==-1) band=false;
        if(val2==-1) band=false;
        if(val3==-1) band=false;
        if(val4==-1) band=false;
        if(val5==-1) band=false;
        if(val6==-1) band=false;
        if(val7==-1) band=false;
        if(val8==-1) band=false;
        if(val9==-1) band=false;
        if(val10==-1) band=false;
        return band;
    }

    public void FormatoCampo(JTextField txt, int contenido) {
        if (contenido != -1) {
            txt.setText(String.valueOf(contenido));
        } else {
            txt.setText("");
        }
    }

    public void Refrescar(){
        try{
            if (name.compareTo("4") == 0){
                val1=fe.recursosNaturales.get(seleccionado).getCriterio1();
                val2=fe.recursosNaturales.get(seleccionado).getCriterio2();
                val3=fe.recursosNaturales.get(seleccionado).getCriterio3();
                val4=fe.recursosNaturales.get(seleccionado).getCriterio4();
                val5=fe.recursosNaturales.get(seleccionado).getCriterio5();
                val6=fe.recursosNaturales.get(seleccionado).getCriterio6();
                val7=fe.recursosNaturales.get(seleccionado).getCriterio7();
                val8=fe.recursosNaturales.get(seleccionado).getCriterio8();
                val9=fe.recursosNaturales.get(seleccionado).getCriterio9();
                val10=fe.recursosNaturales.get(seleccionado).getCriterio10();
            }else{
                val1=fe.recursosCulturales.get(seleccionado).getCriterio1();
                val2=fe.recursosCulturales.get(seleccionado).getCriterio2();
                val3=fe.recursosCulturales.get(seleccionado).getCriterio3();
                val4=fe.recursosCulturales.get(seleccionado).getCriterio4();
                val5=fe.recursosCulturales.get(seleccionado).getCriterio5();
                val6=fe.recursosCulturales.get(seleccionado).getCriterio6();
                val7=fe.recursosCulturales.get(seleccionado).getCriterio7();
                val8=fe.recursosCulturales.get(seleccionado).getCriterio8();
                val9=fe.recursosCulturales.get(seleccionado).getCriterio9();
                val10=fe.recursosCulturales.get(seleccionado).getCriterio10();
            }
            FormatoCampo(txt_1,val1);
            FormatoCampo(txt_2,val2);
            FormatoCampo(txt_3,val3);
            FormatoCampo(txt_4,val4);
            FormatoCampo(txt_5,val5);
            FormatoCampo(txt_6,val6);
            FormatoCampo(txt_7,val7);
            FormatoCampo(txt_8,val8);
            FormatoCampo(txt_9,val9);
            FormatoCampo(txt_10,val10);
              
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    
    public void guardar(){
        if(name.compareTo("4")==0){
            fe.recursosNaturales.get(seleccionado).setCriterio1(val1);
            fe.recursosNaturales.get(seleccionado).setCriterio2(val2);
            fe.recursosNaturales.get(seleccionado).setCriterio3(val3);
            fe.recursosNaturales.get(seleccionado).setCriterio4(val4);
            fe.recursosNaturales.get(seleccionado).setCriterio5(val5);
            fe.recursosNaturales.get(seleccionado).setCriterio6(val6);
            fe.recursosNaturales.get(seleccionado).setCriterio7(val7);
            fe.recursosNaturales.get(seleccionado).setCriterio8(val8);
            fe.recursosNaturales.get(seleccionado).setCriterio9(val9);
            fe.recursosNaturales.get(seleccionado).setCriterio10(val10);
        }else{
            fe.recursosCulturales.get(seleccionado).setCriterio1(val1);
            fe.recursosCulturales.get(seleccionado).setCriterio2(val2);
            fe.recursosCulturales.get(seleccionado).setCriterio3(val3);
            fe.recursosCulturales.get(seleccionado).setCriterio4(val4);
            fe.recursosCulturales.get(seleccionado).setCriterio5(val5);
            fe.recursosCulturales.get(seleccionado).setCriterio6(val6);
            fe.recursosCulturales.get(seleccionado).setCriterio7(val7);
            fe.recursosCulturales.get(seleccionado).setCriterio8(val8);
            fe.recursosCulturales.get(seleccionado).setCriterio9(val9);
            fe.recursosCulturales.get(seleccionado).setCriterio10(val10);
        }
    }

    public ValorTuristico(int seleccionado,String titulo,FuncionesEvaluacion fe, String name, VentanaRecursos vr) {
        super(vr);
        initComponents();
        this.fe = fe;
        this.name = name;
        this.vr=vr;
        this.seleccionado=seleccionado;
        this.setTitle(titulo);
        this.setLocationRelativeTo(null);
        Refrescar();
        this.setModal(true);
        this.setVisible(true);
        this.txt_1.requestFocusInWindow();
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
        jButton2 = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Valor Turistico");
        setLocationByPlatform(true);
        setResizable(false);

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

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jButton4.setText("Anterior");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(btn_guardar))
                .addGap(21, 21, 21))
        );

        jPanel3.add(jPanel9);

        jTabbedPane1.addTab("Valor Turistico", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        // TODO add your handling code here:
        try {
            lbl_vpatrimonial.setText(String.valueOf(vPatrimonio()));
            lbl_vexplotacion.setText(String.valueOf(vUso()));
            lbl_total.setText(String.valueOf(vTuristico()));   
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (name.compareTo("4") == 0) {
            fe.val1_4 = Math.round(fe.vTuristico4());
        } else {
            fe.val1_5 = Math.round(fe.vTuristico5());
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void txt_10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_10KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                val10 = Integer.parseInt(txt_10.getText());
            } catch (Exception e) {
            }

            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_txt_10KeyPressed

    private void txt_10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_10FocusLost
        // TODO add your handling code here:
        try {
            val10 = Integer.parseInt(txt_10.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_10FocusLost

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

    private void txt_9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_9FocusLost
        // TODO add your handling code here:
        try {
            val9 = Integer.parseInt(txt_9.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_9FocusLost

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

    private void txt_8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_8FocusLost
        // TODO add your handling code here:
        try {
            val8 = Integer.parseInt(txt_8.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_8FocusLost

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

    private void txt_7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_7FocusLost
        // TODO add your handling code here:
        try {
            val7 = Integer.parseInt(txt_7.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_7FocusLost

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

    private void txt_6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_6FocusLost
        // TODO add your handling code here:
        try {
            val6 = Integer.parseInt(txt_6.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_6FocusLost

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

    private void txt_5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_5FocusLost
        // TODO add your handling code here:
        try {
            val5 = Integer.parseInt(txt_5.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_5FocusLost

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

    private void txt_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                val4 = Integer.parseInt(txt_4.getText());
            } catch (Exception e) {
            }

            jTabbedPane1.setSelectedIndex(1);
            txt_5.requestFocus();
        }
    }//GEN-LAST:event_txt_4KeyPressed

    private void txt_4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_4FocusLost
        // TODO add your handling code here:
        try {
            val4 = Integer.parseInt(txt_4.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_4FocusLost

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

    private void txt_3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_3FocusLost
        // TODO add your handling code here:
        try {
            val3 = Integer.parseInt(txt_3.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_3FocusLost

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

    private void txt_2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_2FocusLost
        // TODO add your handling code here:
        try {
            val2 = Integer.parseInt(txt_2.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_2FocusLost

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

    private void txt_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_1FocusLost
        // TODO add your handling code here:
        try {
            val1 = Integer.parseInt(txt_1.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_1FocusLost

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if(checar()){
            guardar();
            vr.ActualizarLista();
            this.dispose();
        }else
             JOptionPane.showMessageDialog(this, "Llene todos los campos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
