/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import ConexionBD.conexionBD;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaInicio extends javax.swing.JFrame {

    public FuncionesEvaluacion fe;
    public static boolean vro = false;
    public static boolean vco = false;
    public conexionBD bd;
    File f;

    public void FormatoCampo(JTextField txt, int contenido) {
        if (contenido != -1) {
            txt.setText(String.valueOf(contenido));
        } else {
            txt.setText("");
        }
    }

    public void CargarDatos() {
        lbl_estado.setText(fe.estado);
        lbl_municipio.setText(fe.municipio);

        jTabbedPane2.setSelectedIndex(0);
        FormatoCampo(txt_1, fe.val1_1);
        FormatoCampo(txt_2, fe.val1_2);
        FormatoCampo(txt_3, fe.val1_3);
        FormatoCampo(txt_4, fe.val1_4);
        FormatoCampo(txt_5, fe.val1_5);
    }

    public VentanaInicio() {
        initComponents();
        fe = new FuncionesEvaluacion();
        bd = new conexionBD(fe);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        label_foto = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl_estado = new javax.swing.JTextField();
        lbl_municipio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btn_ayuda11 = new javax.swing.JButton();
        btn_ayuda12 = new javax.swing.JButton();
        btn_ayuda13 = new javax.swing.JButton();
        btn_ayuda14 = new javax.swing.JButton();
        btn_ayuda15 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        btn_coment_11 = new javax.swing.JButton();
        btn_coment_12 = new javax.swing.JButton();
        btn_coment_13 = new javax.swing.JButton();
        btn_coment_14 = new javax.swing.JButton();
        btn_coment_15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        btn_ayuda21 = new javax.swing.JButton();
        btn_ayuda22 = new javax.swing.JButton();
        btn_ayuda23 = new javax.swing.JButton();
        btn_ayuda24 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        label_6 = new javax.swing.JLabel();
        label_7 = new javax.swing.JLabel();
        label_8 = new javax.swing.JLabel();
        label_9 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_8 = new javax.swing.JTextField();
        txt_9 = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        btn_coment_21 = new javax.swing.JButton();
        btn_coment_22 = new javax.swing.JButton();
        btn_coment_23 = new javax.swing.JButton();
        btn_coment_24 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        btn_ayuda31 = new javax.swing.JButton();
        btn_ayuda32 = new javax.swing.JButton();
        btn_ayuda33 = new javax.swing.JButton();
        btn_ayuda34 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        label_10 = new javax.swing.JLabel();
        label_11 = new javax.swing.JLabel();
        label_12 = new javax.swing.JLabel();
        label_13 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        txt_10 = new javax.swing.JTextField();
        txt_11 = new javax.swing.JTextField();
        txt_12 = new javax.swing.JTextField();
        txt_13 = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        btn_coment_31 = new javax.swing.JButton();
        btn_coment_32 = new javax.swing.JButton();
        btn_coment_33 = new javax.swing.JButton();
        btn_coment_34 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        btn_ayuda41 = new javax.swing.JButton();
        btn_ayuda42 = new javax.swing.JButton();
        btn_ayuda43 = new javax.swing.JButton();
        btn_ayuda44 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        label_14 = new javax.swing.JLabel();
        label_15 = new javax.swing.JLabel();
        label_16 = new javax.swing.JLabel();
        label_17 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        txt_14 = new javax.swing.JTextField();
        txt_15 = new javax.swing.JTextField();
        txt_16 = new javax.swing.JTextField();
        txt_17 = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        btn_coment_41 = new javax.swing.JButton();
        btn_coment_42 = new javax.swing.JButton();
        btn_coment_43 = new javax.swing.JButton();
        btn_coment_44 = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuBorrar = new javax.swing.JMenuItem();
        menuCerrar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuRecursosNaturales = new javax.swing.JMenuItem();
        menuRecursosCulturales = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Evaluación Turistica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(730, 460));
        setPreferredSize(new java.awt.Dimension(730, 460));
        setSize(new java.awt.Dimension(730, 480));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        label_foto.setBackground(new java.awt.Color(204, 204, 255));
        label_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_foto.setText("Insertar Imagen");
        label_foto.setToolTipText("");
        label_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));
        label_foto.setPreferredSize(new java.awt.Dimension(180, 180));
        label_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fotoMouseClicked(evt);
            }
        });

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setLayout(new java.awt.GridLayout(3, 0, 0, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");
        jPanel13.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Región");
        jPanel13.add(jLabel6);

        jPanel11.add(jPanel13);

        jPanel12.setLayout(new java.awt.GridLayout(3, 0, 0, 100));
        jPanel12.add(lbl_estado);
        jPanel12.add(lbl_municipio);

        jPanel11.add(jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Región", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 380));

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel16.setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        btn_ayuda11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda11ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_ayuda11);
        btn_ayuda11.getAccessibleContext().setAccessibleDescription("");

        btn_ayuda12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda12ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_ayuda12);

        btn_ayuda13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda13ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_ayuda13);

        btn_ayuda14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda14ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_ayuda14);

        btn_ayuda15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda15ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_ayuda15);

        jPanel17.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        label_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_1.setText(" Conservación Ambiental");
        label_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.add(label_1);

        label_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_2.setText("Singularidad del Destino");
        label_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.add(label_2);

        label_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_3.setText(" Diversidad del Entorno");
        label_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.add(label_3);

        label_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_4.setText(" Atractivos Naturales");
        label_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.add(label_4);

        label_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_5.setText("Atractivos Culturales");
        jPanel17.add(label_5);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        txt_1.setColumns(3);
        txt_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_1.setNextFocusableComponent(txt_2);
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
        jPanel18.add(txt_1);

        txt_2.setColumns(3);
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
        jPanel18.add(txt_2);

        txt_3.setColumns(3);
        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_3.setNextFocusableComponent(txt_6);
        txt_3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_3FocusLost(evt);
            }
        });
        txt_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3KeyTyped(evt);
            }
        });
        txt_3.setFocusTraversalKeysEnabled(false);
        jPanel18.add(txt_3);

        txt_4.setEditable(false);
        txt_4.setColumns(3);
        txt_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_4.setName("4"); // NOI18N
        txt_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_4MouseClicked(evt);
            }
        });
        jPanel18.add(txt_4);

        txt_5.setEditable(false);
        txt_5.setColumns(3);
        txt_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_5MouseClicked(evt);
            }
        });
        txt_5.setFocusTraversalKeysEnabled(false);
        jPanel18.add(txt_5);

        jPanel19.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btn_coment_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_11.setText("Comentario");
        btn_coment_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_11.setName("11"); // NOI18N
        btn_coment_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_11ActionPerformed(evt);
            }
        });
        jPanel19.add(btn_coment_11);

        btn_coment_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_12.setText("Comentario");
        btn_coment_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_12.setName("12"); // NOI18N
        btn_coment_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_12ActionPerformed(evt);
            }
        });
        jPanel19.add(btn_coment_12);

        btn_coment_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_13.setText("Comentario");
        btn_coment_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_13.setName("13"); // NOI18N
        btn_coment_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_13ActionPerformed(evt);
            }
        });
        jPanel19.add(btn_coment_13);

        btn_coment_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_14.setText("Comentario");
        btn_coment_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_14.setName("14"); // NOI18N
        btn_coment_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_14ActionPerformed(evt);
            }
        });
        jPanel19.add(btn_coment_14);

        btn_coment_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_15.setText("Comentario");
        btn_coment_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_15.setName("15"); // NOI18N
        btn_coment_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_15ActionPerformed(evt);
            }
        });
        jPanel19.add(btn_coment_15);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Patrimonio Natural y Cultural", jPanel3);

        jPanel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel31.setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        btn_ayuda21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda21ActionPerformed(evt);
            }
        });
        jPanel31.add(btn_ayuda21);

        btn_ayuda22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda22ActionPerformed(evt);
            }
        });
        jPanel31.add(btn_ayuda22);

        btn_ayuda23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda23ActionPerformed(evt);
            }
        });
        jPanel31.add(btn_ayuda23);

        btn_ayuda24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda24ActionPerformed(evt);
            }
        });
        jPanel31.add(btn_ayuda24);

        jPanel32.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        label_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_6.setText("Accesibilidad");
        label_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel32.add(label_6);

        label_7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_7.setText("Proximidad");
        label_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel32.add(label_7);

        label_8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_8.setText("Inserción a la Oferta Turistica");
        label_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel32.add(label_8);

        label_9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_9.setText("Atractividad");
        label_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel32.add(label_9);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel33.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        txt_6.setColumns(3);
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
        jPanel33.add(txt_6);

        txt_7.setColumns(3);
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
        jPanel33.add(txt_7);

        txt_8.setColumns(3);
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
        jPanel33.add(txt_8);

        txt_9.setColumns(3);
        txt_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_9FocusLost(evt);
            }
        });
        txt_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_9KeyTyped(evt);
            }
        });
        txt_9.setFocusTraversalKeysEnabled(false);
        jPanel33.add(txt_9);

        jPanel34.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btn_coment_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_21.setText("Comentario");
        btn_coment_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_21.setName("21"); // NOI18N
        btn_coment_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_21ActionPerformed(evt);
            }
        });
        jPanel34.add(btn_coment_21);

        btn_coment_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_22.setText("Comentario");
        btn_coment_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_22.setName("22"); // NOI18N
        btn_coment_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_22ActionPerformed(evt);
            }
        });
        jPanel34.add(btn_coment_22);

        btn_coment_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_23.setText("Comentario");
        btn_coment_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_23.setName("23"); // NOI18N
        btn_coment_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_23ActionPerformed(evt);
            }
        });
        jPanel34.add(btn_coment_23);

        btn_coment_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_24.setText("Comentario");
        btn_coment_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_24.setName("24"); // NOI18N
        btn_coment_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_24ActionPerformed(evt);
            }
        });
        jPanel34.add(btn_coment_24);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Potencial de Vinculación", jPanel4);

        jPanel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel36.setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        btn_ayuda31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda31ActionPerformed(evt);
            }
        });
        jPanel36.add(btn_ayuda31);

        btn_ayuda32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda32ActionPerformed(evt);
            }
        });
        jPanel36.add(btn_ayuda32);

        btn_ayuda33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda33ActionPerformed(evt);
            }
        });
        jPanel36.add(btn_ayuda33);

        btn_ayuda34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda34ActionPerformed(evt);
            }
        });
        jPanel36.add(btn_ayuda34);

        jPanel37.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        label_10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_10.setText("Estacionalidad");
        label_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel37.add(label_10);

        label_11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_11.setText("Tipo de Turista");
        label_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel37.add(label_11);

        label_12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_12.setText("Número de Actividades");
        label_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel37.add(label_12);

        label_13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_13.setText("Servicios Básicos");
        label_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel37.add(label_13);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel38.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        txt_10.setColumns(3);
        txt_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_10FocusLost(evt);
            }
        });
        txt_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_10KeyTyped(evt);
            }
        });
        jPanel38.add(txt_10);

        txt_11.setColumns(3);
        txt_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_11FocusLost(evt);
            }
        });
        txt_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_11KeyTyped(evt);
            }
        });
        jPanel38.add(txt_11);

        txt_12.setColumns(3);
        txt_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_12FocusLost(evt);
            }
        });
        txt_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_12KeyTyped(evt);
            }
        });
        jPanel38.add(txt_12);

        txt_13.setColumns(3);
        txt_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_13FocusLost(evt);
            }
        });
        txt_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_13KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_13KeyTyped(evt);
            }
        });
        txt_13.setFocusTraversalKeysEnabled(false);
        jPanel38.add(txt_13);

        jPanel39.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btn_coment_31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_31.setText("Comentario");
        btn_coment_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_31.setName("31"); // NOI18N
        btn_coment_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_31ActionPerformed(evt);
            }
        });
        jPanel39.add(btn_coment_31);

        btn_coment_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_32.setText("Comentario");
        btn_coment_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_32.setName("32"); // NOI18N
        btn_coment_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_32ActionPerformed(evt);
            }
        });
        jPanel39.add(btn_coment_32);

        btn_coment_33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_33.setText("Comentario");
        btn_coment_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_33.setName("33"); // NOI18N
        btn_coment_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_33ActionPerformed(evt);
            }
        });
        jPanel39.add(btn_coment_33);

        btn_coment_34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_34.setText("Comentario");
        btn_coment_34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_34.setName("34"); // NOI18N
        btn_coment_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_34ActionPerformed(evt);
            }
        });
        jPanel39.add(btn_coment_34);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Diversidad de Oportunidades", jPanel5);

        jPanel45.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel46.setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        btn_ayuda41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda41ActionPerformed(evt);
            }
        });
        jPanel46.add(btn_ayuda41);

        btn_ayuda42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda42ActionPerformed(evt);
            }
        });
        jPanel46.add(btn_ayuda42);

        btn_ayuda43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda43ActionPerformed(evt);
            }
        });
        jPanel46.add(btn_ayuda43);

        btn_ayuda44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda44ActionPerformed(evt);
            }
        });
        jPanel46.add(btn_ayuda44);

        jPanel47.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        label_14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_14.setText("Compromiso con Autoridades");
        label_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel47.add(label_14);

        label_15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_15.setText("Tenencia de Tierra");
        label_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel47.add(label_15);

        label_16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_16.setText("Conflictos en la Región");
        label_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel47.add(label_16);

        label_17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_17.setText("Seguridad del Turista");
        label_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel47.add(label_17);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel48.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        txt_14.setColumns(3);
        txt_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_14FocusLost(evt);
            }
        });
        txt_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_14KeyTyped(evt);
            }
        });
        jPanel48.add(txt_14);

        txt_15.setColumns(3);
        txt_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_15FocusLost(evt);
            }
        });
        txt_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_15KeyTyped(evt);
            }
        });
        jPanel48.add(txt_15);

        txt_16.setColumns(3);
        txt_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_16FocusLost(evt);
            }
        });
        txt_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_16KeyTyped(evt);
            }
        });
        jPanel48.add(txt_16);

        txt_17.setColumns(3);
        txt_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_17FocusLost(evt);
            }
        });
        txt_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_17KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_17KeyTyped(evt);
            }
        });
        txt_17.setFocusTraversalKeysEnabled(false);
        jPanel48.add(txt_17);

        jPanel49.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btn_coment_41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_41.setText("Comentario");
        btn_coment_41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_41.setName("41"); // NOI18N
        btn_coment_41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_41ActionPerformed(evt);
            }
        });
        jPanel49.add(btn_coment_41);

        btn_coment_42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_42.setText("Comentario");
        btn_coment_42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_42.setName("42"); // NOI18N
        btn_coment_42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_42ActionPerformed(evt);
            }
        });
        jPanel49.add(btn_coment_42);

        btn_coment_43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_43.setText("Comentario");
        btn_coment_43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_43.setName("43"); // NOI18N
        btn_coment_43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_43ActionPerformed(evt);
            }
        });
        jPanel49.add(btn_coment_43);

        btn_coment_44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_44.setText("Comentario");
        btn_coment_44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_44.setName("44"); // NOI18N
        btn_coment_44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_44ActionPerformed(evt);
            }
        });
        jPanel49.add(btn_coment_44);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Legalidad e Institucionalidad", jPanel6);

        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btn_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(283, 283, 283))
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(btn_Calcular)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Aspectos a Evaluar", jPanel2);

        getContentPane().add(jTabbedPane1);

        jMenu1.setText("Región");

        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevo);

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuBorrar.setText("Borrar");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuBorrar);

        menuCerrar.setText("Cerrar");
        menuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Recursos");

        menuRecursosNaturales.setText("Naturales");
        menuRecursosNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecursosNaturalesActionPerformed(evt);
            }
        });
        jMenu3.add(menuRecursosNaturales);

        menuRecursosCulturales.setText("Culturales");
        menuRecursosCulturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecursosCulturalesActionPerformed(evt);
            }
        });
        jMenu3.add(menuRecursosCulturales);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fotoMouseClicked
        // TODO add your handling code here:
        int resultado;

        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.jcargafoto.setFileFilter(filtro);
        resultado = ventana.jcargafoto.showOpenDialog(null);
        try {
            f = ventana.jcargafoto.getSelectedFile();
            if (JFileChooser.APPROVE_OPTION == resultado) {
                System.out.println(f.toString());
                ImageIcon icon = new ImageIcon(f.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label_foto.getHeight(),
                        label_foto.getWidth(), Image.SCALE_DEFAULT));
                label_foto.setText(null);
                label_foto.setIcon(icono);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);
        }

    }//GEN-LAST:event_label_fotoMouseClicked

    private void btn_coment_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_15ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_15.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_15ActionPerformed

    private void btn_coment_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_14ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_14.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_14ActionPerformed

    private void btn_coment_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_13ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_13.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_13ActionPerformed

    private void btn_coment_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_12ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_12.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_12ActionPerformed

    private void btn_coment_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_11ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_11.getName());
            cm.setVisible(true);
            vco = true;
        }

    }//GEN-LAST:event_btn_coment_11ActionPerformed

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

    private void btn_ayuda15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda1_5, label_5.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda15ActionPerformed

    private void btn_ayuda14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda1_4, label_4.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda14ActionPerformed

    private void btn_ayuda13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda13ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda1_3, label_3.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda13ActionPerformed

    private void btn_ayuda12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda1_2, label_2.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda12ActionPerformed

    private void btn_ayuda11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda1_1, label_1.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda11ActionPerformed

    private void btn_ayuda21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda2_1, label_6.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda21ActionPerformed

    private void btn_ayuda22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda22ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda2_2, label_7.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda22ActionPerformed

    private void btn_ayuda23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda23ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda2_3, label_8.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda23ActionPerformed

    private void btn_ayuda24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda24ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda2_4, label_9.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda24ActionPerformed

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

    private void txt_9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_9KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                fe.val2_4 = Integer.parseInt(txt_9.getText());
            } catch (Exception e) {
            }

            jTabbedPane2.setSelectedIndex(2);
            txt_10.requestFocus();
        }
    }//GEN-LAST:event_txt_9KeyPressed

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

    private void btn_coment_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_21ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_21.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_21ActionPerformed

    private void btn_coment_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_22ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_22.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_22ActionPerformed

    private void btn_coment_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_23ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_23.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_23ActionPerformed

    private void btn_coment_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_24ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_24.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_24ActionPerformed

    private void btn_ayuda31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda31ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda3_1, label_10.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda31ActionPerformed

    private void btn_ayuda32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda32ActionPerformed
        // TODO add your handling code he
        JOptionPane.showMessageDialog(this, fe.ayuda3_2, label_11.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda32ActionPerformed

    private void btn_ayuda33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda33ActionPerformed
        JOptionPane.showMessageDialog(this, fe.ayuda3_3, label_12.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda33ActionPerformed

    private void btn_ayuda34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda34ActionPerformed
        JOptionPane.showMessageDialog(this, fe.ayuda3_4, label_13.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda34ActionPerformed

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

    private void txt_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_12KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_12.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_12KeyTyped

    private void txt_13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_13KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                fe.val3_4 = Integer.parseInt(txt_13.getText());
            } catch (Exception e) {
            }
            jTabbedPane2.setSelectedIndex(3);
            txt_14.requestFocus();
        }
    }//GEN-LAST:event_txt_13KeyPressed

    private void txt_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_13KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_13.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_13KeyTyped

    private void btn_coment_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_31ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_31.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_31ActionPerformed

    private void btn_coment_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_32ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_32.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_32ActionPerformed

    private void btn_coment_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_33ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_33.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_33ActionPerformed

    private void btn_coment_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_34ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_34.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_34ActionPerformed

    private void btn_ayuda41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda41ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda4_1, label_14.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda41ActionPerformed

    private void btn_ayuda42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda42ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda4_2, label_15.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda42ActionPerformed

    private void btn_ayuda43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda43ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda4_3, label_16.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda43ActionPerformed

    private void btn_ayuda44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, fe.ayuda4_4, label_17.getText(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda44ActionPerformed

    private void txt_14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_14FocusLost
        // TODO add your handling code here:
        try {
            fe.val4_1 = Integer.parseInt(txt_14.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_14FocusLost

    private void txt_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_14KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_14.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_14KeyTyped

    private void txt_15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_15FocusLost
        // TODO add your handling code here:
        try {
            fe.val4_2 = Integer.parseInt(txt_15.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_15FocusLost

    private void txt_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_15KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_15.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_15KeyTyped

    private void txt_16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_16FocusLost
        // TODO add your handling code here:
        try {
            fe.val4_3 = Integer.parseInt(txt_16.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_16FocusLost

    private void txt_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_16KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_16.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_16KeyTyped

    private void txt_17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_17FocusLost
        // TODO add your handling code here:
        try {
            fe.val4_4 = Integer.parseInt(txt_17.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_17FocusLost

    private void txt_17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_17KeyPressed
        // TODO add your handling code here:
        if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                fe.val4_4 = Integer.parseInt(txt_17.getText());
            } catch (Exception e) {
            }
            jTabbedPane2.setSelectedIndex(0);
            txt_1.requestFocus();
        }
    }//GEN-LAST:event_txt_17KeyPressed

    private void txt_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_17KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
        }
        if (txt_17.getCaretPosition() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_17KeyTyped

    private void btn_coment_41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_41ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_41.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_41ActionPerformed

    private void btn_coment_42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_42ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_42.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_42ActionPerformed

    private void btn_coment_43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_43ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_43.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_43ActionPerformed

    private void btn_coment_44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_44ActionPerformed
        // TODO add your handling code here:
        if (!vco) {
            CapturaComentario cm = new CapturaComentario(fe, btn_coment_44.getName());
            cm.setVisible(true);
            vco = true;
        }
    }//GEN-LAST:event_btn_coment_44ActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
        fe.state = jTabbedPane2.getSelectedIndex() + 1;

        if (fe.state == 1) {
            FormatoCampo(txt_1, fe.val1_1);
            FormatoCampo(txt_2, fe.val1_2);
            FormatoCampo(txt_3, fe.val1_3);
            FormatoCampo(txt_4, fe.val1_4);
            FormatoCampo(txt_5, fe.val1_5);
        }
        if (fe.state == 2) {
            FormatoCampo(txt_6, fe.val2_1);
            FormatoCampo(txt_7, fe.val2_2);
            FormatoCampo(txt_8, fe.val2_3);
            FormatoCampo(txt_9, fe.val2_4);
        }
        if (fe.state == 3) {
            FormatoCampo(txt_10, fe.val3_1);
            FormatoCampo(txt_11, fe.val3_2);
            FormatoCampo(txt_12, fe.val3_3);
            FormatoCampo(txt_13, fe.val3_4);
        }
        if (fe.state == 4) {
            FormatoCampo(txt_14, fe.val4_1);
            FormatoCampo(txt_15, fe.val4_2);
            FormatoCampo(txt_16, fe.val4_3);
            FormatoCampo(txt_17, fe.val4_4);
        }
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        if (fe.state == 1) {
            JOptionPane.showMessageDialog(this, fe.ayuda1, jTabbedPane2.getTitleAt(0), JOptionPane.INFORMATION_MESSAGE);
        }
        if (fe.state == 2) {
            JOptionPane.showMessageDialog(this, fe.ayuda2, jTabbedPane2.getTitleAt(1), JOptionPane.INFORMATION_MESSAGE);
        }
        if (fe.state == 3) {
            JOptionPane.showMessageDialog(this, fe.ayuda3, jTabbedPane2.getTitleAt(2), JOptionPane.INFORMATION_MESSAGE);
        }
        if (fe.state == 4) {
            JOptionPane.showMessageDialog(this, fe.ayuda4, jTabbedPane2.getTitleAt(3), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        // TODO add your handling code here:
        if (!vro) {
            fe.estado = lbl_estado.getText();
            fe.municipio = lbl_municipio.getText();
            if (fe.checarCampos() && fe.checarDatos()) {
                fe.MostrarResultado();
                vro = true;
            } else {
                if (!fe.checarCampos()) {
                    JOptionPane.showMessageDialog(this, "Por favor llene todos los campos de Aspectos a Evaluar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!fe.checarDatos()) {
                    JOptionPane.showMessageDialog(this, "Por favor llene todos los campos de Datos del Municipio", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void txt_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_1FocusLost
        // TODO add your handling code here:
        try {
            fe.val1_1 = Integer.parseInt(txt_1.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_1FocusLost

    private void txt_2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_2FocusLost
        // TODO add your handling code here:
        try {
            fe.val1_2 = Integer.parseInt(txt_2.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_2FocusLost

    private void txt_3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_3FocusLost
        // TODO add your handling code here:
        try {
            fe.val1_3 = Integer.parseInt(txt_3.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_3FocusLost

    private void txt_6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_6FocusLost
        // TODO add your handling code here:
        try {
            fe.val2_1 = Integer.parseInt(txt_6.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_6FocusLost

    private void txt_7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_7FocusLost
        // TODO add your handling code here:
        try {
            fe.val2_2 = Integer.parseInt(txt_7.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_7FocusLost

    private void txt_8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_8FocusLost
        // TODO add your handling code here:
        try {
            fe.val2_3 = Integer.parseInt(txt_8.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_8FocusLost

    private void txt_9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_9FocusLost
        // TODO add your handling code here:
        try {
            fe.val2_4 = Integer.parseInt(txt_9.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_9FocusLost

    private void txt_10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_10FocusLost
        // TODO add your handling code here:
        try {
            fe.val3_1 = Integer.parseInt(txt_10.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_10FocusLost

    private void txt_11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_11FocusLost
        // TODO add your handling code here:
        try {
            fe.val3_2 = Integer.parseInt(txt_11.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_11FocusLost

    private void txt_12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_12FocusLost
        // TODO add your handling code here:}
        try {
            fe.val3_3 = Integer.parseInt(txt_12.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_12FocusLost

    private void txt_13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_13FocusLost
        // TODO add your handling code here:
        try {
            fe.val3_4 = Integer.parseInt(txt_13.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_13FocusLost

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

    private void menuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuCerrarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        // TODO add your handling code here:
        if (!vro || !vco) {
            VentanaAbrir va = new VentanaAbrir(fe, this);
            va.setVisible(true);
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
        fe = new FuncionesEvaluacion();
        CargarDatos();
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        // TODO add your handling code here:
        if (!vro && !vco) {
            fe.estado = lbl_estado.getText();
            fe.municipio = lbl_municipio.getText();
            if (fe.checarCampos() && fe.checarDatos()) {
                if (!bd.inTable(fe.estado, fe.municipio)) {
                    bd.Guardar();
                } else {
                    int option = JOptionPane.showConfirmDialog(null, "¿Deseas Sobreescribir?", "Municipio Existente", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        bd.Actualizar(fe.estado, fe.municipio);
                    }
                }
            } else {
                if (!fe.checarCampos()) {
                    JOptionPane.showMessageDialog(this, "Por favor llene todos los campos de Aspectos a Evaluar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!fe.checarDatos()) {
                    JOptionPane.showMessageDialog(this, "Por favor llene todos los campos de Datos del Municipio", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        // TODO add your handling code here:
         if (!vro || !vco) {
            VentanaBorrar vb = new VentanaBorrar(this,fe);
            vb.setVisible(true);
        }
    }//GEN-LAST:event_menuBorrarActionPerformed

    private void menuRecursosNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecursosNaturalesActionPerformed
        // TODO add your handling code here:
        VentanaRecursos recurso=new VentanaRecursos(fe,"4",this);
        recurso.setVisible(true);
    }//GEN-LAST:event_menuRecursosNaturalesActionPerformed

    private void menuRecursosCulturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecursosCulturalesActionPerformed
        // TODO add your handling code here:
        VentanaRecursos recurso=new VentanaRecursos(fe,"5",this);
        recurso.setVisible(true);
    }//GEN-LAST:event_menuRecursosCulturalesActionPerformed

    private void txt_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_4MouseClicked
        // TODO add your handling code here:
        VentanaRecursos recurso=new VentanaRecursos(fe,"4",this);
        recurso.setVisible(true);
    }//GEN-LAST:event_txt_4MouseClicked

    private void txt_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_5MouseClicked
        // TODO add your handling code here:
        VentanaRecursos recurso=new VentanaRecursos(fe,"5",this);
        recurso.setVisible(true);
    }//GEN-LAST:event_txt_5MouseClicked

    private void txt_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3KeyPressed
        // TODO add your handling code here:
         if (!evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_TAB) {
            try {
                fe.val1_3 = Integer.parseInt(txt_3.getText());
            } catch (Exception e) {
            }
            jTabbedPane2.setSelectedIndex(1);
            txt_6.requestFocus();
        }
    }//GEN-LAST:event_txt_3KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_ayuda11;
    private javax.swing.JButton btn_ayuda12;
    private javax.swing.JButton btn_ayuda13;
    private javax.swing.JButton btn_ayuda14;
    private javax.swing.JButton btn_ayuda15;
    private javax.swing.JButton btn_ayuda21;
    private javax.swing.JButton btn_ayuda22;
    private javax.swing.JButton btn_ayuda23;
    private javax.swing.JButton btn_ayuda24;
    private javax.swing.JButton btn_ayuda31;
    private javax.swing.JButton btn_ayuda32;
    private javax.swing.JButton btn_ayuda33;
    private javax.swing.JButton btn_ayuda34;
    private javax.swing.JButton btn_ayuda41;
    private javax.swing.JButton btn_ayuda42;
    private javax.swing.JButton btn_ayuda43;
    private javax.swing.JButton btn_ayuda44;
    private javax.swing.JButton btn_coment_11;
    private javax.swing.JButton btn_coment_12;
    private javax.swing.JButton btn_coment_13;
    private javax.swing.JButton btn_coment_14;
    private javax.swing.JButton btn_coment_15;
    private javax.swing.JButton btn_coment_21;
    private javax.swing.JButton btn_coment_22;
    private javax.swing.JButton btn_coment_23;
    private javax.swing.JButton btn_coment_24;
    private javax.swing.JButton btn_coment_31;
    private javax.swing.JButton btn_coment_32;
    private javax.swing.JButton btn_coment_33;
    private javax.swing.JButton btn_coment_34;
    private javax.swing.JButton btn_coment_41;
    private javax.swing.JButton btn_coment_42;
    private javax.swing.JButton btn_coment_43;
    private javax.swing.JButton btn_coment_44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_10;
    private javax.swing.JLabel label_11;
    private javax.swing.JLabel label_12;
    private javax.swing.JLabel label_13;
    private javax.swing.JLabel label_14;
    private javax.swing.JLabel label_15;
    private javax.swing.JLabel label_16;
    private javax.swing.JLabel label_17;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_6;
    private javax.swing.JLabel label_7;
    private javax.swing.JLabel label_8;
    private javax.swing.JLabel label_9;
    private javax.swing.JLabel label_foto;
    private javax.swing.JTextField lbl_estado;
    private javax.swing.JTextField lbl_municipio;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenuItem menuCerrar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenuItem menuRecursosCulturales;
    private javax.swing.JMenuItem menuRecursosNaturales;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_10;
    private javax.swing.JTextField txt_11;
    private javax.swing.JTextField txt_12;
    private javax.swing.JTextField txt_13;
    private javax.swing.JTextField txt_14;
    private javax.swing.JTextField txt_15;
    private javax.swing.JTextField txt_16;
    private javax.swing.JTextField txt_17;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    public javax.swing.JTextField txt_4;
    public javax.swing.JTextField txt_5;
    public javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_8;
    private javax.swing.JTextField txt_9;
    // End of variables declaration//GEN-END:variables
}
