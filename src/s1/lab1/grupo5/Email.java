/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1.lab1.grupo5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author esteb
 */
public class Email {

    private String emisor;
    private String asunto;
    private String contenido;
    private boolean leido;
    private Calendar fechaEnvio;

    public Email(String emisor, String asunto, String contenido) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.contenido = contenido;
        this.leido = false;
        this.fechaEnvio = Calendar.getInstance();
    }

    public String getEmisor() {
        return emisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido(){
        return contenido;
    }
    
    public boolean isLeido(){
        return leido;
    }
    
    
    public Calendar getFechaEnvio(){
        return fechaEnvio;
    }
    
    public void marcarLeido(){
        this.leido = true;
    }
    
    public String fechaFormateada(){
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return fecha.format(fechaEnvio.getTime());
    }
    
    public void print() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String estado = leido ? "LEÍDO" : "SIN LEER";
    }
}
