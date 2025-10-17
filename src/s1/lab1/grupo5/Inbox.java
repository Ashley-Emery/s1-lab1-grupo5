/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1.lab1.grupo5;

import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author esteb
 */
public class Inbox extends JFrame{
    public Inbox(){
        setTitle("Bandeja de Entrada");
        setSize(600,600);
        setLayout(null);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel lblFecha = new JLabel();
        lblFecha.setBounds(30, 20, 400, 30);
        add(lblFecha);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        lblFecha.setText("Fecha Actual: " + formato.format(Calendar.getInstance().getTime()));
        
        
    }
}
