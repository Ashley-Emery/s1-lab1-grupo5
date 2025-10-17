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
    public Inbox(EmailAccount cuenta){
        setTitle("Bandeja de Entrada");
        setSize(600,600);
        setLayout(null);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel lblFecha = new JLabel();
        lblFecha.setBounds(30, 20, 400, 30);
        add(lblFecha);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        lblFecha.setText("Fecha Actual: " + formato.format(Calendar.getInstance().getTime()));
       
        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setBounds(50, 70, 480, 450);
        add(area);
        
        Email[] inbox = getInbox(cuenta);
        int total = 0;
        int sinLeer = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append("Bandeja de Entrada");
        
    }
    
    private Email[] getInbox(EmailAccount cuenta){
        try{
            java.lang.reflect.Field f = EmailAccount.class.getDeclaredField("Inbox");
            f.setAccessible(true);
            return (Email[])
           f.get(cuenta);
        }catch(Exception e){
            e.printStackTrace();
            return new Email[0];
        }
    }
}
