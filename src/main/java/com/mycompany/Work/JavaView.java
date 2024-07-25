package com.mycompany.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Hashtable;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hernan
 */
public class JavaView extends javax.swing.JFrame {

    /**
     * Creates new form JavaView
     */
    public JavaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        loadData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Acudiente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Telefono_celular = new javax.swing.JTextField();
        Telefono_fijo = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        Riesgo = new javax.swing.JTextField();
        Cargar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campuslands IU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 450));

        jLabel1.setFont(new java.awt.Font("Kannada Sangam MN", 2, 24)); // NOI18N
        jLabel1.setText("PERFIL COORDINADOR");

        jLabel2.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel2.setText("Id:");

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel6.setText("Dirección:");

        loadData.setFont(new java.awt.Font("Kannada Sangam MN", 2, 18)); // NOI18N
        loadData.setText("¡Crear!");
        loadData.setActionCommand("loadData");
        loadData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadDataMouseClicked(evt);
            }
        });
        loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel7.setText("Identificacion");

        jLabel8.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel8.setText("Acudiente");

        jLabel9.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel9.setText("Telefono Fijo:");

        jLabel10.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel10.setText("Celular:");

        jLabel11.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel11.setText("Riesgo:");

        jLabel12.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel12.setText("Estado:");

        Cargar.setFont(new java.awt.Font("Kannada Sangam MN", 2, 18)); // NOI18N
        Cargar.setText("Ver");
        Cargar.setActionCommand("loadData");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Kannada Sangam MN", 2, 18)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setActionCommand("loadData");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Actualizar.setFont(new java.awt.Font("Kannada Sangam MN", 2, 18)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setActionCommand("loadData");
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel13.setText("Buscar por Id:");

        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Kannada Sangam MN", 2, 18)); // NOI18N
        Search.setText("Buscar");
        Search.setActionCommand("loadData");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Hiragino Sans", 2, 18)); // NOI18N
        jLabel14.setText("Ver datos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Id)
                                    .addComponent(Nombre)
                                    .addComponent(Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Direccion)
                                    .addComponent(Acudiente))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(86, 86, 86))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(Telefono_fijo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Telefono_celular, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Riesgo))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(68, 68, 68))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(loadData, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(355, 355, 355)
                                .addComponent(Actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Telefono_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Telefono_fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadData, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Identificacion", "Nombre", "Apellidos", "Direccion", "Acudiente", "Telefono_celular", "Telefono_fijo", "Estado", "Riesgo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class Camper {
    private int Id;
    private String Identificacion;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Acudiente;
    private String Telefono_celular;
    private String Telefono_fijo;
    private String Estado;
    private String Riesgo;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getAcudiente() {
        return Acudiente;
    }

    public void setAcudiente(String Acudiente) {
        this.Acudiente = Acudiente;
    }

    public String getTelefono_celular() {
        return Telefono_celular;
    }

    public void setTelefono_celular(String Telefono_celular) {
        this.Telefono_celular = Telefono_celular;
    }

    public String getTelefono_fijo() {
        return Telefono_fijo;
    }

    public void setTelefono_fijo(String Telefono_fijo) {
        this.Telefono_fijo = Telefono_fijo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRiesgo() {
        return Riesgo;
    }

    public void setRiesgo(String Riesgo) {
        this.Riesgo = Riesgo;
    }
}
    
    
    
    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        
    }//GEN-LAST:event_IdActionPerformed

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        int id = Id.getColumns();
                String identificacion = Identificacion.getText();
		String nombre = Nombre.getText();
		String apellidos = Identificacion.getText();
		String direccion = Direccion.getText();
                String acudiente = Acudiente.getText();
                String telefono_celular = Telefono_celular.getText();
                String telefono_fijo = Telefono_fijo.getText();
                String estado = Estado.getText();
                String riesgo = Riesgo.getText();
		String query;	
                
                System.out.println(id);
                System.out.println(nombre);
                System.out.println(apellidos);
                System.out.println(direccion);
                System.out.println(identificacion);
                System.out.println(telefono_celular);
                System.out.println(telefono_fijo);
                System.out.println(estado);
                System.out.println(riesgo);

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:MySQL://localhost:3306/Camper";
        String user = "root";
        String password = "1101685607";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        if ("".equals(Nombre.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            
        } else if("".equals(Identificacion.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);

        } else if("".equals(Identificacion.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);

        } else if("".equals(Direccion.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Adress is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            
        } else if("".equals(Estado.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Status is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);    
            
            
        

        } else {
    id = Id.getColumns(); 
    nombre = Nombre.getText();
    apellidos = Identificacion.getText();
    direccion = Direccion.getText();
    acudiente = Acudiente.getText();
    telefono_celular = Telefono_celular.getText();
    telefono_fijo = Telefono_fijo.getText();
    estado = Estado.getText();
    riesgo = Riesgo.getText();
    
    query = "INSERT INTO camper (Id, Identificacion, Nombre, Apellidos, Direccion, Acudiente, Telefono_celular, Telefono_fijo, Estado, Riesgo) "
            + "VALUES ('"+id+"', '"+identificacion+"', '"+nombre+"', '"+apellidos+"', '"+direccion+"', '"+acudiente+"', '"+telefono_celular+"', '"+telefono_fijo+"', '"+estado+"', '"+riesgo+"')";
    
    statement.executeUpdate(query);
    Id.setText("");
    Identificacion.getText();
    Nombre.setText("");
    Apellidos.setText("");
    Direccion.setText("");
    Acudiente.setText("");
    Telefono_celular.setText("");
    Telefono_fijo.setText("");
    Estado.setText("");
    Riesgo.setText("");
    showMessageDialog(null, "Successfully registered");
    connection.close();
    
}


    }catch(Exception e){
        System.out.println("Error " + e.getMessage());
        

    }
    }//GEN-LAST:event_loadDataActionPerformed

    private void loadDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadDataMouseClicked
                
    }//GEN-LAST:event_loadDataMouseClicked

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarMouseClicked

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        Cargar();
    }//GEN-LAST:event_CargarActionPerformed

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarMouseClicked

    
    
    public void Cargar() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/Camper";
        String user = "root";
        String pass = "1101685607";

        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement statement = connection.createStatement();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{
            "Id", "Identificacion", "Nombre", "Apellidos", "Direccion", "Acudiente", "Telefono_celular", "Telefono_fijo", "Estado", "Riesgo"}, 0);
      
        Table1.setModel(model);
        String sql = "SELECT * FROM Camper";
        
        ResultSet results = statement.executeQuery(sql);
        Integer id;
        String identificacion, nombre, apellidos, direccion, acudiente, telefono_celular, telefono_fijo, estado, riesgo;
        
        while (results.next()) {
            id = results.getInt("Id");
            identificacion = results.getString("Identificacion");
            nombre = results.getString("Nombre");
            apellidos = results.getString("Apellidos");
            direccion = results.getString("Direccion");
            acudiente = results.getString("Acudiente");
            telefono_celular = results.getString("Telefono_celular");
            telefono_fijo = results.getString("Telefono_fijo");
            estado = results.getString("Estado");
            riesgo = results.getString("Riesgo");
            model.addRow(new Object[]{id, identificacion, nombre, apellidos, direccion, acudiente, telefono_celular, telefono_fijo, estado, riesgo});
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
   
// TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        String Id;
        int notFound = 0;
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/Camper";
        String user = "root";
        String pass = "1101685607";

        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement statement = connection.createStatement();
        
        Id  = Busqueda.getText();
        if ("".equals(Id)) {
            JOptionPane.showMessageDialog(new JFrame(), "Id is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }else {
            String sql = "SELECT * FROM Camper WHERE Id = " + Id;
            ResultSet results = statement.executeQuery(sql);
            while(results.next()) {
                Identificacion.setText(results.getString("Identificacion"));
                Nombre.setText(results.getString("Nombre"));
                Apellidos.setText(results.getString("Apellidos"));
                Direccion.setText(results.getString("Direccion"));
                Acudiente.setText(results.getString("Acudiente"));
                Telefono_celular.setText(results.getString("Telefono_celular"));
                Telefono_fijo.setText(results.getString("Telefono_fijo"));
                Estado.setText(results.getString("Estado"));
                Riesgo.setText(results.getString("Riesgo")); 
                notFound = 1;
                results.getInt("Id");
            }
            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    
    // System.out.println("holiii");
    }//GEN-LAST:event_SearchActionPerformed
    
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
            java.util.logging.Logger.getLogger(JavaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JavaView javaView2 = new JavaView();
                javaView2.Cargar();
                javaView2.setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    private javax.swing.JTextField Acudiente;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Busqueda;
    public javax.swing.JButton Cargar;
    private javax.swing.JTextField Direccion;
    public javax.swing.JButton Eliminar;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Riesgo;
    public javax.swing.JButton Search;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField Telefono_celular;
    private javax.swing.JTextField Telefono_fijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton loadData;
    // End of variables declaration//GEN-END:variables

    private void loadDataloadDataMouseClicked() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
