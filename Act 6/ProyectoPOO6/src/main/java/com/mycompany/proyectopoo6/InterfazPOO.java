
package com.mycompany.proyectopoo6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InterfazPOO extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPOO
     */
    public InterfazPOO() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        Crearbtn = new javax.swing.JButton();
        Leerbtn = new javax.swing.JButton();
        Actualizarbtn = new javax.swing.JButton();
        Eliminarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setText("Contactos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        Crearbtn.setText("Crear");
        Crearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearbtnActionPerformed(evt);
            }
        });

        Leerbtn.setText("Leer");
        Leerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerbtnActionPerformed(evt);
            }
        });

        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });

        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Crearbtn)
                        .addGap(45, 45, 45)
                        .addComponent(Leerbtn)
                        .addGap(59, 59, 59)
                        .addComponent(Actualizarbtn)
                        .addGap(62, 62, 62)
                        .addComponent(Eliminarbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crearbtn)
                    .addComponent(Leerbtn)
                    .addComponent(Actualizarbtn)
                    .addComponent(Eliminarbtn))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
       
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void CrearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearbtnActionPerformed
   try {
        String newName = txtNombre.getText().trim(); // Usar trim para eliminar espacios
        String numeroTexto = txtNumero.getText().trim();

        // Verificar si los campos están vacíos
        if (newName.isEmpty() || numeroTexto.isEmpty()) {
            System.out.println("El nombre o el número no pueden estar vacíos.");
            return;
        }

        long newNumber = Long.parseLong(numeroTexto);

        File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoPOO6\\src\\main\\java\\com\\mycompany\\proyectopoo6\\Amigos.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        boolean found = false;

        while (raf.getFilePointer() < raf.length()) {
            String nameNumberString = raf.readLine();

            // Verificar que la línea no sea nula o vacía
            if (nameNumberString == null || nameNumberString.trim().isEmpty()) {
                continue; // Saltar líneas vacías
            }
            

            String[] lineSplit = nameNumberString.split("!");

            // Asegurarse de que la división fue exitosa
            if (lineSplit.length < 2) {
                System.out.println("Error: Formato incorrecto en la línea: " + nameNumberString);
                continue; // Saltar líneas con formato incorrecto
            }

            String name = lineSplit[0];
            long number = Long.parseLong(lineSplit[1].trim());

            if (name.equals(newName) || number == newNumber) {
                found = true;
                break;
            }
        }

        if (!found) {
            String nameNumberString = newName + "!" + newNumber;
            raf.writeBytes(nameNumberString);
            raf.writeBytes(System.lineSeparator());
            System.out.println("Amigo agregado.");
        } else {
            System.out.println("El nombre o número ya existe.");
        }

        raf.close();
    } catch (IOException ioe) {
        System.out.println("Error de entrada/salida: " + ioe.getMessage());
    } catch (NumberFormatException nef) {
        System.out.println("Error en el formato del número: " + nef.getMessage());
    }
    }//GEN-LAST:event_CrearbtnActionPerformed

    private void LeerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerbtnActionPerformed
 try {
    String nameNumberString;
    String name;
    long number;

    File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoPOO6\\src\\main\\java\\com\\mycompany\\proyectopoo6\\Amigos.txt");

    if (!file.exists()) {
        file.createNewFile();
    }

    // Use try-with-resources for automatic resource management
    try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
        boolean found = false;

        // Read through the file
        while (raf.getFilePointer() < raf.length()) {
            nameNumberString = raf.readLine();
            String[] lineSplit = nameNumberString.split("!");

            if (lineSplit.length < 2) {
                System.out.println("Formato incorrecto en la línea: " + nameNumberString);
                continue; // Skip malformed lines
            }

            name = lineSplit[0];
            try {
                number = Long.parseLong(lineSplit[1]);
            } catch (NumberFormatException nef) {
                System.out.println("Error al convertir el número para el amigo: " + name);
                continue; // Skip this entry
            }

            // Display the contact information
            System.out.println("Nombre Amigo: " + name);
            System.out.println("Numero Contacto: " + number);
            System.out.println(); // Print an empty line for better readability
        }
    }
} catch (IOException ioe) {
    System.out.println("Error de entrada/salida: " + ioe.getMessage());
}
    }//GEN-LAST:event_LeerbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed
  String newName = txtNombre.getText().trim();
    String numeroTexto = txtNumero.getText().trim();

    // Check if name or number fields are empty
    if (newName.isEmpty() || numeroTexto.isEmpty()) {
        System.out.println("El nombre o el número no pueden estar vacíos.");
        return; // Exit if any field is empty
    }

    long newNumber;
    try {
        newNumber = Long.parseLong(numeroTexto);
    } catch (NumberFormatException nef) {
        System.out.println("Error en el formato del número: " + nef.getMessage());
        return; // Exit if number format is invalid
    }

    File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoPOO6\\src\\main\\java\\com\\mycompany\\proyectopoo6\\Amigos.txt");

    try {
        if (!file.exists()) {
            file.createNewFile();
        }

        // Use try-with-resources for automatic resource management
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            boolean found = false;
            StringBuilder tempContent = new StringBuilder();

            // Search for the contact and update if found
            while (raf.getFilePointer() < raf.length()) {
                String nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");

                if (lineSplit.length < 2) {
                    continue; // Skip malformed lines
                }

                String name = lineSplit[0];
                if (name.equals(newName)) {
                    // Update the number
                    nameNumberString = name + "!" + newNumber;
                    found = true;
                }

                tempContent.append(nameNumberString).append(System.lineSeparator());
            }

            if (found) {
                // Clear the file and write the updated content
                raf.setLength(0); // Clear the original file
                raf.writeBytes(tempContent.toString());
                System.out.println("Amigo actualizado.");
            } else {
                System.out.println("El nombre ingresado no existe.");
            }
        }
    } catch (IOException ioe) {
        System.out.println(ioe);
    }
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
  
    String newName = txtNombre.getText().trim();
    File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoPOO6\\src\\main\\java\\com\\mycompany\\proyectopoo6\\Amigos.txt");

    try {
        if (!file.exists()) {
            file.createNewFile();
        }

        // Use try-with-resources for automatic resource management
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            boolean found = false;
            StringBuilder tempContent = new StringBuilder();

            // Read the file and build a new content without the friend to be deleted
            while (raf.getFilePointer() < raf.length()) {
                String nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");

                if (lineSplit.length < 2) {
                    continue; // Skip malformed lines
                }

                String name = lineSplit[0];
                if (name.equals(newName)) {
                    found = true;
                    continue; // Skip the friend to be deleted
                }

                tempContent.append(nameNumberString).append(System.lineSeparator());
            }

            if (found) {
                // Rewrite the file with the updated content
                raf.setLength(0); // Clear the file
                raf.writeBytes(tempContent.toString());
                System.out.println("Amigo Borrado.");
            } else {
                System.out.println("Nombre ingresado no existe");
            }
        }
    } catch (IOException ioe) {
        System.out.println(ioe);
    }
    }//GEN-LAST:event_EliminarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JButton Crearbtn;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JButton Leerbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
