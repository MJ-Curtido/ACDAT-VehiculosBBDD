/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dam.vehiculosBBDD.vista;

import dam.vehiculosBBDD.clases.Vehiculo;
import dam.vehiculosBBDD.gestion.Gestion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manu1
 */
public class PanelCRUD extends javax.swing.JPanel {

    private VentanaVehiculo miVentana;
    private Gestion gestion;
    private Boolean editar;
    private Vehiculo vehiculoAEditar;
    /**
     * Creates new form PanelCRUD
     */
    public PanelCRUD(VentanaVehiculo miVentana) {
        initComponents();
        
        this.miVentana = miVentana;
        gestion = new Gestion();
        editar = false;                                                                                                                                        
        
        cargarTabla(tablaVehiculos);
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
        tbModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tbMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbMatricula = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Marca");
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Modelo");
        jLabel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Matricula");
        jLabel3.setName(""); // NOI18N

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (editar) {
            if (gestion.editarVehiculo(vehiculoAEditar, tbMarca.getText().toString(), tbModelo.getText().toString(), tbMatricula.getText().toString())) {
                JOptionPane.showMessageDialog(null, "Vehículo editado correctamente.");
                cargarTabla(tablaVehiculos);
            }
            else {
                JOptionPane.showMessageDialog(null, "Ese vehículo ya existe.");
            }
            
            btnRegistrar.setText("Registrar");
            editar = false;
        }
        else {
            if (tbMarca.getText().equals("") || tbModelo.getText().equals("") || tbMatricula.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debes introducir todos los valores para poder registrar un vehículo.");
            }
            else {
                insertarVehiculo(tablaVehiculos);
                cargarTabla(tablaVehiculos);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tablaVehiculos.getSelectedRowCount() == 1) {
            gestion.eliminarVehiculo(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 2).toString());
            cargarTabla(tablaVehiculos);
        }
        else if (tablaVehiculos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar mínimo un vehículo para poder eliminarlo.");
        }
        else {
            int[] filas = tablaVehiculos.getSelectedRows();
            
            List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
            
            for (int i = 0; i < filas.length; i++) {
                vehiculos.add(new Vehiculo(tablaVehiculos.getValueAt(filas[i], 2).toString()));
            }
            
            gestion.eliminarVehiculos(vehiculos);
            cargarTabla(tablaVehiculos);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        if (tablaVehiculos.getSelectedRowCount() == 1) {
            vehiculoAEditar = new Vehiculo(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 2).toString());
        
            tbMarca.setText(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 0).toString());
            tbModelo.setText(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 1).toString());
            tbMatricula.setText(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 2).toString());

            btnRegistrar.setText("Editar");
            editar = true;
        }
        else if (tablaVehiculos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar mínimo un vehículo para poder editarlo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "No puedes editar más de un vehículo a la vez.");
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    public void cargarTabla(JTable tablaVehiculos) { //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
        List<Vehiculo> lstVehiculos = gestion.getListaVehiculos();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Marca");

        modelo.addColumn("Modelo");

        modelo.addColumn("Matricula");

        for (Vehiculo vehiculo : lstVehiculos) {

            Object[] registroLeido
                    = {
                        vehiculo.getMarca(),
                        vehiculo.getModelo(),
                        vehiculo.getMatricula()

                    };

            modelo.addRow(registroLeido);

        }

        tablaVehiculos.setModel(modelo);
    }
    
    public void insertarVehiculo(JTable tablaVehiculos) {
        if (gestion.anyadirVehiculo(tbMarca.getText().toString(), tbModelo.getText().toString(), tbMatricula.getText().toString())) {
            cargarTabla(tablaVehiculos);
        }
        else {
            JOptionPane.showMessageDialog(null, "El vehículo que se intenta añadir ya existe en nuestra base de datos.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTextField tbMarca;
    private javax.swing.JTextField tbMatricula;
    private javax.swing.JTextField tbModelo;
    // End of variables declaration//GEN-END:variables
}