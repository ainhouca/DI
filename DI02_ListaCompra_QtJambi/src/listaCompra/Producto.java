/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCompra;

/**
 *
 * @author Irache Mtnez.
 */
public class Producto {

    Boolean seleccion;
    int cantidad;
    String nombre;
    String seccion;
    Boolean urgente;

    public Producto(int cantidad, String nombre, String seccion, Boolean urgente) {
        this.seleccion = false;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.seccion = seccion;
        this.urgente = urgente;
    }

    @Override
    public String toString() {

        if (urgente == true) {
            return "\n" + cantidad + " " + nombre + " (" + seccion + ") " + "urge";
        } else {
            return "\n" + cantidad + " " + nombre + " (" + seccion + ") " + "no urge";
        }
    }

    //getters y setters
    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
}
