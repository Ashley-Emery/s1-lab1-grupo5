package s1.lab1.grupo5;
import javax.swing.*;
import java.awt.*;
public class MenuInicial extends javax.swing.JFrame{
    
    public MenuInicial()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel menuInicial=new JPanel(null);
        this.setContentPane(menuInicial);
        this.setSize(800, 600);
        this.setResizable(false);
        
        JLabel lblTitulo=new JLabel("Menu Inicial");
        JButton btnLogin=new JButton("Login");
        JButton btnNuevaCta=new JButton("Crear cuenta");
        
        Font font=new Font("Arial",Font.BOLD,18);
        Font font1=new Font("Arial",Font.BOLD,40);
        
        lblTitulo.setFont(font1);
        btnLogin.setFont(font);
        btnNuevaCta.setFont(font);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblTitulo.setBounds(200, 100, 400, 50);
        btnLogin.setBounds(325,200,150,60);
        btnNuevaCta.setBounds(325, 290, 150, 60);
        
        menuInicial.add(lblTitulo);
        menuInicial.add(btnLogin);
        menuInicial.add(btnNuevaCta);
        
        
        
        
        
    }
    
    public static void main(String[] args)
    {
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run()
           {
               new MenuInicial().setVisible(true);
           }
       });
    }
}