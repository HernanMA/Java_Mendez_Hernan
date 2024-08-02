/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package baloncesto;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hernan
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Menu2() {
        initComponents();
        setTitle("Create Team");
        setSize(464, 340);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Create your team!");
        panel.add(label);
    }
    
    public class Partido {
    protected String Fecha;
    protected int Equipo_Local_Id;
    protected int Equipo_Visitante_Id;
    protected int Cestas_Local;
    protected int Cestas_Visitante;
    protected boolean Finalizado;
    protected String Tipo;
    protected int Jornada;
    protected String Ronda;
    protected String Ganador;
    
    public Partido() {
    }
    
    public Partido (String Fecha, int Equipo_Local_Id, int Equipo_Visitante_Id, int Cestas_Local,int Cestas_Visitante, boolean Finalizado, String Tipo, int Jornada, String Ronda, String Ganador) {
        this.Fecha = Fecha;
        this.Equipo_Local_Id = Equipo_Local_Id;
        this.Equipo_Visitante_Id = Equipo_Visitante_Id;
        this.Cestas_Local = Cestas_Local;
        this.Cestas_Visitante = Cestas_Visitante;
        this.Finalizado = Finalizado;
        this.Tipo = Tipo;
        this.Jornada = Jornada;
        this.Ronda = Ronda;
        this.Ganador = Ganador;
    }
    
    
    public String getfecha() {
        return Fecha;
    }
    
    public void setfecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    public int getequipo_Local_Id() {
        return Equipo_Local_Id;
    }
    
    public void setequipo_Local_Id(int Equipo_Local_Id) {
        this.Equipo_Local_Id = Equipo_Local_Id ;
    }
    
    
    public int getequipo_Visitante_Id() {
        return Equipo_Visitante_Id;
    }
    
    public void setquipo_Visitante_Id(int Equipo_Visitante_Id) {
        this.Equipo_Visitante_Id = Equipo_Visitante_Id;
    }
    
    
    public int getcestas_Local() {
        return Cestas_Local;
    }
    
    public void setcestas_Local(int Cestas_Local) {
        this.Cestas_Local = Cestas_Local;
    }
    
    
    public int getcestas_Visitante() {
        return Cestas_Visitante;
    }
    
    public void setcestas_Visitante(int Cestas_Visitante) {
        this.Cestas_Visitante = Cestas_Visitante;
    }
    
    
    public boolean getfinalizado() {
        return Finalizado;
    }
    
    public void setfinalizado(boolean Finalizado) {
        this.Finalizado = Finalizado;
    }
    
    
    public String gettipo() {
        return Tipo;
    }
    
    public void settipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    public int getjornada() {
        return Jornada;
    }
    
    public void setjornada(int Jornada) {
        this.Jornada = Jornada;
    }
    
    
    public String getronda() {
        return Ronda;
    }
    
    public void setronda(String Ronda) {
        this.Ronda = Ronda;
    }
    
    
    public String getganador() {
        return Ganador;
    }
    
    public void set(String Ganador) {
        this.Ganador = Ganador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TeamName = new javax.swing.JTextField();
        Place = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel5.setText("Set Score of your local team?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Marker Felt", 2, 36)); // NOI18N
        jLabel1.setText("ADD YOUR TEAM");

        jLabel2.setFont(new java.awt.Font("Marker Felt", 2, 24)); // NOI18N
        jLabel2.setText("COMPLETE THIS INFORMATION!!");

        jLabel3.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel3.setText("Team name:");

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel4.setText("Place:");

        jButton1.setFont(new java.awt.Font("Marker Felt", 2, 24)); // NOI18N
        jButton1.setText("Add Your Team!!");

        Back.setFont(new java.awt.Font("Kefa", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Place;
    private javax.swing.JTextField TeamName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
