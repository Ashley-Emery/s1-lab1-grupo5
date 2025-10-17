/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1.lab1.grupo5;

import javax.swing.*;

/**
 *
 * @author esteb
 */
public class EnviarCorreo extends JFrame{
    private JTextField txtDest, txtAsunto;
    private JTextArea txtContenido;

    public EnviarCorreo() {
        setTitle("Mandar Correo");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblDest = new JLabel("Destinatario:");
        lblDest.setBounds(100, 100, 100, 30);
        add(lblDest);

        txtDest = new JTextField();
        txtDest.setBounds(220, 100, 250, 30);
        add(txtDest);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setBounds(100, 150, 100, 30);
        add(lblAsunto);

        txtAsunto = new JTextField();
        txtAsunto.setBounds(220, 150, 250, 30);
        add(txtAsunto);

        JLabel lblContenido = new JLabel("Contenido:");
        lblContenido.setBounds(100, 200, 100, 30);
        add(lblContenido);

        txtContenido = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtContenido);
        scroll.setBounds(220, 200, 250, 200);
        add(scroll);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(240, 440, 120, 40);
        add(btnEnviar);

        btnEnviar.addActionListener(e -> {
            String dest = txtDest.getText();
            String asunto = txtAsunto.getText();
            String contenido = txtContenido.getText();

            EmailAccount destinatario = null;
            
            if (destinatario == null) {
                JOptionPane.showMessageDialog(this, "Destinatario no encontrado");
                return;
            }
        });
    }
}
