package sistemaevaluacionturistica;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import ConexionBD.conexionBD;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        bd=new conexionBD(fe);
    }
   public FuncionesEvaluacion fe= new FuncionesEvaluacion();
   
   public static boolean vro=false;
   public static boolean vco=false;
   public conexionBD bd;
   public void FormatoCampo(JTextField txt,int contenido){
       if(contenido!=-1)
        txt.setText(String.valueOf(contenido));
       else
           txt.setText("");
   }
   
   public void CargarDatos(){
       lbl_estado.setText(fe.estado);
       lbl_municipio.setText(fe.municipio);
       
       btn_1.doClick();
   }
   
    File f;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        label_foto = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl_estado = new javax.swing.JTextField();
        lbl_municipio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_ayuda1 = new javax.swing.JButton();
        btn_ayuda2 = new javax.swing.JButton();
        btn_ayuda3 = new javax.swing.JButton();
        btn_ayuda4 = new javax.swing.JButton();
        btn_ayuda5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_coment_1 = new javax.swing.JButton();
        btn_coment_2 = new javax.swing.JButton();
        btn_coment_3 = new javax.swing.JButton();
        btn_coment_4 = new javax.swing.JButton();
        btn_coment_5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_calcular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuBorrar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluación Turistica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btn_1.setText("Patrimonio Natural y Cultural");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1);

        btn_2.setText("Potencial de Vinculacion");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2);

        btn_3.setText("Diversidad de Oportunidades");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3);

        btn_4.setText("Legalidad e Institucionalidad");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del municipio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

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

        jPanel13.setLayout(new java.awt.GridLayout(3, 0, 0, 35));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");
        jPanel13.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Municipio");
        jPanel13.add(jLabel6);

        jPanel11.add(jPanel13);

        jPanel12.setLayout(new java.awt.GridLayout(3, 0, 0, 45));
        jPanel12.add(lbl_estado);

        lbl_municipio.setNextFocusableComponent(txt_1);
        jPanel12.add(lbl_municipio);

        jPanel11.add(jPanel12);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aspectos a Evaluar"));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel8.setLayout(new java.awt.GridLayout(5, 0, 0, 1));

        btn_ayuda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ayuda1);

        btn_ayuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda2ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ayuda2);

        btn_ayuda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda3ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ayuda3);

        btn_ayuda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda4ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ayuda4);

        btn_ayuda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        btn_ayuda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda5ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ayuda5);

        jPanel9.setLayout(new java.awt.GridLayout(5, 0));

        label_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_1.setText(" Conservación Ambiental");
        label_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(label_1);

        label_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_2.setText("Singularidad del Destino");
        label_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(label_2);

        label_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_3.setText(" Diversidad del Entorno");
        label_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(label_3);

        label_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_4.setText(" Atractivos Naturales");
        label_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(label_4);

        label_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_5.setText("Atractivos Culturales");
        jPanel9.add(label_5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setLayout(new java.awt.GridLayout(5, 0, 0, 10));

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
        jPanel6.add(txt_1);

        txt_2.setColumns(3);
        txt_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_2.setNextFocusableComponent(txt_3);
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
        jPanel6.add(txt_2);

        txt_3.setColumns(3);
        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_3.setNextFocusableComponent(txt_4);
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
        jPanel6.add(txt_3);

        txt_4.setColumns(3);
        txt_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_4.setNextFocusableComponent(txt_5);
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
        jPanel6.add(txt_4);

        txt_5.setColumns(3);
        txt_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_5FocusLost(evt);
            }
        });
        txt_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_5KeyTyped(evt);
            }
        });
        txt_5.setFocusTraversalKeysEnabled(false);
        jPanel6.add(txt_5);

        jPanel7.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btn_coment_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_1.setText("Comentario");
        btn_coment_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_1.setName("1"); // NOI18N
        btn_coment_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_coment_1);

        btn_coment_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_2.setText("Comentario");
        btn_coment_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_2.setName("2"); // NOI18N
        btn_coment_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_coment_2);

        btn_coment_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_3.setText("Comentario");
        btn_coment_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_3.setName("3"); // NOI18N
        btn_coment_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_coment_3);

        btn_coment_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_4.setText("Comentario");
        btn_coment_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_4.setName("4"); // NOI18N
        btn_coment_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_4ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_coment_4);

        btn_coment_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comentario.png"))); // NOI18N
        btn_coment_5.setText("Comentario");
        btn_coment_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coment_5.setName("5"); // NOI18N
        btn_coment_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coment_5ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_coment_5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_calcular.setText("Calcular Total");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(150, 150, 150)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_calcular)
                    .addContainerGap()))
        );

        jMenuBar1.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuBar.highlight"));

        jMenu1.setText("Archivo");
        jMenu1.setContentAreaFilled(false);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem5.setMnemonic('a');
        jMenuItem5.setText("Nuevo");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem5);

        menuAbrir.setText("Abrir");
        menuAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuGuardar.setText("Guardar");
        menuGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuCerrar.setText("Cerrar");
        menuCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        menuBorrar.setText("Borar Base de Datos");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        jMenu2.add(menuBorrar);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_ayuda_24.png"))); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        fe.state=2;
         label_1.setText("Accesibilidad");
        label_2.setText("Proximidad");
        label_3.setText("Inserción a la oferta turística");
        label_4.setText("Atractividad");
        label_5.setVisible(false);
        txt_5.setVisible(false);
        btn_coment_5.setVisible(false);
        
        btn_ayuda5.setVisible(false);
        
      FormatoCampo(txt_1,fe.val2_1);
      FormatoCampo(txt_2,fe.val2_2);
      FormatoCampo(txt_3,fe.val2_3);
      FormatoCampo(txt_4,fe.val2_4);
        
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        fe.state=1;
        label_1.setText("Conservación Ambiental");
        label_2.setText("Singularidad del Destino");
        label_3.setText("Diversidad del Entorno");
        label_4.setText("Atractivos Naturales");
        label_5.setText("Atractivos Culturales");
        
        btn_coment_5.setVisible(true);
        
        label_5.setVisible(true);
        txt_5.setVisible(true);
        btn_ayuda5.setVisible(true);
        
      FormatoCampo(txt_1,fe.val1_1);
      FormatoCampo(txt_2,fe.val1_2);
      FormatoCampo(txt_3,fe.val1_3);
      FormatoCampo(txt_4,fe.val1_4);
      FormatoCampo(txt_5,fe.val1_5);
      
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        fe.state=3;
        label_1.setText("Estacionalidad");
        label_2.setText("Tipo de Turista");
        label_3.setText("Número de Actividades");
        label_4.setText("Servicios Básicos");
        btn_coment_5.setVisible(false);
        label_5.setVisible(false);
        txt_5.setVisible(false);
        
        btn_ayuda5.setVisible(false);
        
        FormatoCampo(txt_1,fe.val3_1);
        FormatoCampo(txt_2,fe.val3_2);
        FormatoCampo(txt_3,fe.val3_3);
        FormatoCampo(txt_4,fe.val3_4);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        fe.state=4;
         label_1.setText("Compromiso de Autoridades");
        label_2.setText("Tenencia de la Tierra");
        label_3.setText("Conflictos en la región");
        label_4.setText("Seguridad del Turista");
        btn_coment_5.setVisible(false);
        label_5.setVisible(false);
        txt_5.setVisible(false);
        btn_ayuda5.setVisible(false);
        
        FormatoCampo(txt_1,fe.val4_1);
        FormatoCampo(txt_2,fe.val4_2);
        FormatoCampo(txt_3,fe.val4_3);
        FormatoCampo(txt_4,fe.val4_4);
        
    }//GEN-LAST:event_btn_4ActionPerformed

    private void txt_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_1.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_1KeyTyped

    private void txt_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_2KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }else{
            try{
        if(fe.state==1 && txt_2.getText()!=null){
            fe.val1_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==2 && txt_2.getText()!=null){
            fe.val2_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==3 && txt_2.getText()!=null){
            fe.val3_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==4 && txt_2.getText()!=null){
            fe.val4_2=Integer.getInteger(txt_1.getText());
        }
        }catch(Exception e){}
        
        }
        
        if(txt_2.getCaretPosition()>0)
            evt.consume();
        
    }//GEN-LAST:event_txt_2KeyTyped

    private void txt_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_3.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_3KeyTyped

    private void txt_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_4.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_4KeyTyped

    private void txt_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_5KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || 
                c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_5.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_5KeyTyped

    private void txt_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_1FocusLost
        // TODO add your handling code here:
         try {
           if(fe.state==1)
                fe.val1_1=Integer.parseInt(txt_1.getText());
           if(fe.state==2)
                fe.val2_1=Integer.parseInt(txt_1.getText());
           if(fe.state==3)
                fe.val3_1=Integer.parseInt(txt_1.getText());
           if(fe.state==4)
                fe.val4_1=Integer.parseInt(txt_1.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_1FocusLost

    private void txt_2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_2FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_2=Integer.parseInt(txt_2.getText());
           if(fe.state==2)
                fe.val2_2=Integer.parseInt(txt_2.getText());
           if(fe.state==3)
                fe.val3_2=Integer.parseInt(txt_2.getText());
           if(fe.state==4)
                fe.val4_2=Integer.parseInt(txt_2.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_2FocusLost

    private void txt_3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_3FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_3=Integer.parseInt(txt_3.getText());
           if(fe.state==2)
                fe.val2_3=Integer.parseInt(txt_3.getText());
           if(fe.state==3)
                fe.val3_3=Integer.parseInt(txt_3.getText());
           if(fe.state==4)
                fe.val4_3=Integer.parseInt(txt_3.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_3FocusLost

    private void txt_4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_4FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_4=Integer.parseInt(txt_4.getText());
           if(fe.state==2){
                fe.val2_4=Integer.parseInt(txt_4.getText());
           }
           if(fe.state==3){
                fe.val3_4=Integer.parseInt(txt_4.getText());
           }
           if(fe.state==4){
               fe.val4_4=Integer.parseInt(txt_4.getText());
           }
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_4FocusLost

    private void txt_5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_5FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1){
                fe.val1_5=Integer.parseInt(txt_5.getText());
           }
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_5FocusLost

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,String.valueOf(fe.Ptotal())+"%","Calculo",JOptionPane.PLAIN_MESSAGE);
        if(!vro){
            fe.estado=lbl_estado.getText();
            fe.municipio=lbl_municipio.getText();
            if(fe.checarCampos() && fe.checarDatos()){
                fe.MostrarResultado();
                vro=true;
            }
            else{
                if(!fe.checarCampos())
                JOptionPane.showMessageDialog(this,"Por favor llene todos los campos de Aspectos a Evaluar","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                if(!fe.checarDatos())
                JOptionPane.showMessageDialog(this,"Por favor llene todos los campos de Datos del Municipio","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_coment_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(btn_coment_1.getName());
        if(!vco){
            CapturaComentario cm=new CapturaComentario(fe,btn_coment_1.getName());
            cm.setVisible(true);
            vco=true;
        }
    }//GEN-LAST:event_btn_coment_1ActionPerformed

    private void btn_ayuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda1ActionPerformed
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1_1,label_1.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==2){
            JOptionPane.showMessageDialog(this,fe.ayuda2_1,label_1.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==3){
            JOptionPane.showMessageDialog(this,fe.ayuda3_1,label_1.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==4){
            JOptionPane.showMessageDialog(this,fe.ayuda4_1,label_1.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ayuda1ActionPerformed

    private void btn_ayuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda2ActionPerformed
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1_2,label_2.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==2){
            JOptionPane.showMessageDialog(this,fe.ayuda2_2,label_2.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==3){
            JOptionPane.showMessageDialog(this,fe.ayuda3_2,label_2.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==4){
            JOptionPane.showMessageDialog(this,fe.ayuda4_2,label_2.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ayuda2ActionPerformed

    private void btn_ayuda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda3ActionPerformed
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1_3,label_3.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==2){
            JOptionPane.showMessageDialog(this,fe.ayuda2_3,label_3.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==3){
            JOptionPane.showMessageDialog(this,fe.ayuda3_3,label_3.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==4){
            JOptionPane.showMessageDialog(this,fe.ayuda4_3,label_3.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ayuda3ActionPerformed

    private void btn_ayuda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda4ActionPerformed
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1_4,label_4.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==2){
            JOptionPane.showMessageDialog(this,fe.ayuda2_4,label_4.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==3){
            JOptionPane.showMessageDialog(this,fe.ayuda3_4,label_4.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==4){
            JOptionPane.showMessageDialog(this,fe.ayuda4_4,label_4.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ayuda4ActionPerformed

    private void btn_ayuda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda5ActionPerformed
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1_5,label_5.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ayuda5ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if(fe.state==1){
            JOptionPane.showMessageDialog(this,fe.ayuda1,btn_1.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==2){
            JOptionPane.showMessageDialog(this,fe.ayuda2,btn_2.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==3){
            JOptionPane.showMessageDialog(this,fe.ayuda3,btn_3.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
        if(fe.state==4){
            JOptionPane.showMessageDialog(this,fe.ayuda4,btn_4.getText(),JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void label_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fotoMouseClicked
        // TODO add your handling code here:
        int resultado;
        
        CargarFoto ventana= new CargarFoto();
        FileNameExtensionFilter filtro= new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.jcargafoto.setFileFilter(filtro);
        resultado = ventana.jcargafoto.showOpenDialog(null);
        try{
            f =ventana.jcargafoto.getSelectedFile();
            if(JFileChooser.APPROVE_OPTION == resultado){
                System.out.println(f.toString());
                ImageIcon icon = new ImageIcon(f.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label_foto.getHeight()
                        ,label_foto.getWidth(),Image.SCALE_DEFAULT));
                label_foto.setText(null);
                label_foto.setIcon(icono);
            }
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
        }
        
    }//GEN-LAST:event_label_fotoMouseClicked

    private void txt_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_5KeyPressed
        // TODO add your handling code here:
        try {
            if(!evt.isShiftDown() && evt.getKeyCode()==KeyEvent.VK_TAB){
                if(fe.state==1)
                        fe.val1_5=Integer.parseInt(txt_5.getText());
                        txt_1.requestFocus();
                        btn_2.doClick();
            }   
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_txt_5KeyPressed

    private void txt_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyPressed
        // TODO add your handling code here:
        try{
            if(!evt.isShiftDown() && evt.getKeyCode()==KeyEvent.VK_TAB){
                if(fe.state!=1){
                    switch (fe.state) {
                        case 2:
                            fe.val2_4=Integer.parseInt(txt_4.getText());
                            btn_3.doClick();
                            break;
                        case 3:
                            fe.val3_4=Integer.parseInt(txt_4.getText());
                            btn_4.doClick();
                            break;
                        case 4:
                            fe.val4_4=Integer.parseInt(txt_4.getText());
                            btn_1.doClick();
                            break;
                    }
                    txt_1.requestFocus();
                }else{
                        txt_5.requestFocus();
                }
            }   
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_4KeyPressed

    private void btn_coment_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_2ActionPerformed
        // TODO add your handling code here:
        if(!vco){
            CapturaComentario cm=new CapturaComentario(fe,btn_coment_2.getName());
            cm.setVisible(true);
            vco=true;
        }    
    }//GEN-LAST:event_btn_coment_2ActionPerformed

    private void btn_coment_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_3ActionPerformed
        // TODO add your handling code here:
        if(!vco){    
            CapturaComentario cm=new CapturaComentario(fe,btn_coment_3.getName());
            cm.setVisible(true);
            vco=true;
        }
    }//GEN-LAST:event_btn_coment_3ActionPerformed

    private void btn_coment_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_4ActionPerformed
        // TODO add your handling code here:
        if(!vco){    
            CapturaComentario cm=new CapturaComentario(fe,btn_coment_4.getName());
            cm.setVisible(true);
            vco=true;
        }
    }//GEN-LAST:event_btn_coment_4ActionPerformed

    private void btn_coment_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coment_5ActionPerformed
        // TODO add your handling code here:
        if(!vco){
            CapturaComentario cm=new CapturaComentario(fe,btn_coment_5.getName());
            cm.setVisible(true);
            vco=true;
        }
    }//GEN-LAST:event_btn_coment_5ActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        // TODO add your handling code here:
        if(!vro && !vco){
            fe.estado=lbl_estado.getText();
            fe.municipio=lbl_municipio.getText();
            if(fe.checarCampos() && fe.checarDatos()){
                if(!bd.inTable(fe.estado,fe.municipio)){
                    bd.Guardar();
                    JOptionPane.showMessageDialog(this,"Municipio Guardado");
                }else{
                    int option= JOptionPane.showConfirmDialog(null,"¿Deseas Sobreescribir?","Municipio Existente",JOptionPane.YES_NO_OPTION);
                    if(option==JOptionPane.YES_OPTION){
                        bd.Actualizar(fe.estado,fe.municipio);
                    }
                }
            }
            else{
                if(!fe.checarCampos())
                JOptionPane.showMessageDialog(this,"Por favor llene todos los campos de Aspectos a Evaluar","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                if(!fe.checarDatos())
                JOptionPane.showMessageDialog(this,"Por favor llene todos los campos de Datos del Municipio","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        // TODO add your handling code here:
        VentanaAbrir va=new VentanaAbrir(fe,this);
        va.setVisible(true);
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuCerrarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        // TODO add your handling code here:
        bd.BorrarBD();
    }//GEN-LAST:event_menuBorrarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_ayuda1;
    private javax.swing.JButton btn_ayuda2;
    private javax.swing.JButton btn_ayuda3;
    private javax.swing.JButton btn_ayuda4;
    private javax.swing.JButton btn_ayuda5;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_coment_1;
    private javax.swing.JButton btn_coment_2;
    private javax.swing.JButton btn_coment_3;
    private javax.swing.JButton btn_coment_4;
    private javax.swing.JButton btn_coment_5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_foto;
    private javax.swing.JTextField lbl_estado;
    private javax.swing.JTextField lbl_municipio;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenuItem menuCerrar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    // End of variables declaration//GEN-END:variables
}
