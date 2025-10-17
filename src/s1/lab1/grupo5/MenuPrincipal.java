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
public class MenuPrincipal extends JFrame{
    public MenuPrincipal(){
        
        setTitle("Menu Principal");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel lblBienvenida = new JLabel("Hola");
        lblBienvenida.setBounds(200,50,250,25);
        add(lblBienvenida);
        
        JButton btnInbox = new JButton("Ver Inbox");
        btnInbox.setBounds(200, 150, 200, 50);
        btnInbox.addActionListener( e -> {
            new Inbox().setVisible(true);
        });
        add(btnInbox);
        
        JButton btnMandar = new JButton("Mandar Correo");
        btnMandar.setBounds(200, 230 , 200, 50);
        btnMandar.addActionListener(e -> {
           new EnviarCorreo().setVisible(true);
        });
        add(btnMandar);
        
        JButton btnBuscar =  new JButton("Buscar Correo");
        btnBuscar.setBounds(200, 310, 200, 50);
        btnBuscar.addActionListener(e -> {
            //new Buscar.setVisible(true);
        });
        add(btnBuscar);
        
        JButton btnSalir = new JButton("Cerrar Sesion");
        btnSalir.setBounds(200, 390, 200, 50);
        btnSalir.addActionListener(e -> {
            //new login.setVisible(true);
            dispose();
        });
        add(btnSalir);
        
    }
    
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}