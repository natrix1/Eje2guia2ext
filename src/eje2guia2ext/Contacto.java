/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2guia2ext;

/**
 *
 * @author chexs
 */
public class Contacto {
    
    int nCel;
    String nombre;
    String apellido;
    String correoElect;

    public Contacto(int nCel, String nombre, String apellido, String correoElect) {
        this.nCel = nCel;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElect = correoElect;
    }

    public int getnCel() {
        return nCel;
    }

    public void setnCel(int nCel) {
        this.nCel = nCel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElect() {
        return correoElect;
    }

    public void setCorreoElect(String correoElect) {
        this.correoElect = correoElect;
    }
    
    
    
}
