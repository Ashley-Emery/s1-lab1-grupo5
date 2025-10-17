/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1.lab1.grupo5;

/**
 *
 * @author ashley
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EmailAccount {
    
    private String direccionEmail;
    private String password;
    private String nombreUsuario;
    private Email[] inbox;
    
    public EmailAccount(String direccionEmail, String password, String nombreUsuario) {
        this.direccionEmail = direccionEmail;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.inbox = new Email[10];
    }
    
    public String getDireccionEmail() {
        return direccionEmail;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

}
