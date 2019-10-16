package listacompra.dto;

/**
 *
 * @author Irache Mtnez.
 */
public class Producto {

    private boolean seleccion;
    private int cantidad;
    private String nombre;
    private String seccion;
    private boolean urgente;

    public Producto(int cantidad, String nombre, String seccion, boolean urgente) {
        this.seleccion = false;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.seccion = seccion;
        this.urgente = urgente;
    }

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

    @Override
    public String toString() {

        if (urgente == true) {
            return "\n" + cantidad + " " + nombre + " (" + seccion + ") " + "urge";
        } else {
            return "\n" + cantidad + " " + nombre + " (" + seccion + ") " + "no urge";
        }
    }

}
