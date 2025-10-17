package s1.lab1.grupo5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MenuInicial extends javax.swing.JFrame{
    private int contadorCtas=0;
    private EmailAccount[] cuentas=new EmailAccount[10];
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
        
        JFrame login=new JFrame();
        JPanel panelLogin=new JPanel(null);
        login.setSize(600,400);
        login.setResizable(false);
        login.setContentPane(panelLogin);
        login.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        
        JLabel lblCorreo=new JLabel("Ingrese su correo: ");
        panelLogin.add(lblCorreo);
        lblCorreo.setFont(font);
        lblCorreo.setBounds(150,50,300,30);
        
        JLabel lblContra=new JLabel("Ingrese su contrasena: ");
        panelLogin.add(lblContra);
        lblContra.setFont(font);
        lblContra.setBounds(150,140,300,30);
        
        JTextField fldCorreo=new JTextField();
        panelLogin.add(fldCorreo);
        fldCorreo.setBounds(150,85,300,30);
        
        JTextField fldContra=new JTextField();
        panelLogin.add(fldContra);
        fldContra.setBounds(150,175,300,30);
        
        
        JButton btnAceptar=new JButton("Aceptar");
        panelLogin.add(btnAceptar);
        btnAceptar.setFont(font);
        btnAceptar.setBounds(225,250,150,40);
        
        btnAceptar.addActionListener(e->{
            login.dispose();
            this.setVisible(true);
        });
        
        JFrame crearCta=new JFrame();
        JPanel panelCta=new JPanel(null);
        crearCta.setSize(600,400);
        crearCta.setResizable(false);
        crearCta.setContentPane(panelCta);
        crearCta.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        JLabel lblNombre=new JLabel("Ingrese su nombre: ");
        panelCta.add(lblNombre);
        lblNombre.setFont(font);
        lblNombre.setBounds(150,30,300,30);
        
        JTextField fldNombre=new JTextField();
        panelCta.add(fldNombre);
        fldNombre.setBounds(150,65,300,30);
        
        JLabel lblCorreo2=new JLabel("Ingrese su correo: ");
        panelCta.add(lblCorreo2);
        lblCorreo2.setFont(font);
        lblCorreo2.setBounds(150,120,300,30);
        
        JTextField fldCorreo2=new JTextField();
        panelCta.add(fldCorreo2);
        fldCorreo2.setBounds(150,155,300,30);
        
        JLabel lblContra2=new JLabel("Ingrese su contrasena: ");
        panelCta.add(lblContra2);
        lblContra2.setBounds(150,210,300,30);
        lblContra2.setFont(font);
        
        JTextField fldContra2=new JTextField();
        panelCta.add(fldContra2);
        fldContra2.setBounds(150,245,300,30);
        fldContra2.setFont(font);
        
        JButton btnAceptar2=new JButton("Aceptar");
        crearCta.add(btnAceptar2);
        crearCta.setFont(font);
        btnAceptar2.setBounds(225,300,150,40);
        
        btnAceptar2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String nombreUsuario;
                String direccionEmail;
                String password;
                nombreUsuario=fldNombre.getText();
                direccionEmail=fldCorreo2.getText();
                password=fldContra2.getText();
                
                if(!correoExc(direccionEmail))
                {
                    JOptionPane.showMessageDialog(null, "Correo no disponible, intente con otro");
                    return;
                }
                if(!validPassword(password))
                {
                    JOptionPane.showMessageDialog(null, "Contrasena invalida, debe contener cinco caracteres"
                            + ", por lo menos un simbolo, una letra mayuscula y un numero.");
                    return;
                }
                
                EmailAccount cuenta=new EmailAccount(direccionEmail, password, nombreUsuario);
                verifEspacio(cuenta);
                
                crearCta.dispose();
                MenuInicial.this.setVisible(true);
                
                fldNombre.setText("");
                fldCorreo2.setText("");
                fldContra2.setText("");
                
            }
        });
        
        btnLogin.addActionListener(e->{
            this.setVisible(false);
            login.setVisible(true);
        });
        
        btnNuevaCta.addActionListener(e->{
            this.setVisible(false);
            crearCta.setVisible(true);
        });
        
        
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
    
    private boolean correoExc(String direccionEmail)
    {
        for(int i=0;i<contadorCtas;i++)
        {
            if(cuentas[i]!=null && cuentas[i].getDireccionEmail().equalsIgnoreCase(direccionEmail))
            {
                return false;
            }
        }
        return true;
    }
    
    private boolean validPassword(String password)
    {
        
        if(password==null)
        {
            return false;
        }
        return password.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{5,}");
    }
    
    private boolean verifEspacio(EmailAccount cuenta)
    {
        if(contadorCtas<cuentas.length)
        {
            cuentas[contadorCtas]=cuenta;
            contadorCtas++;
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio para mas cuentas");
            return false;
        }
    }
    
    private boolean verificarContra(String password, String direccionEmail)
    {
        for(int i=0;i<contadorCtas;i++)
        {
            if(cuentas[i]!=null && cuentas[i].getPassword().equals(password) && cuentas[i].getDireccionEmail().equalsIgnoreCase(direccionEmail))
            {
                return true;
            }
        }
        return false;
        
    }
}