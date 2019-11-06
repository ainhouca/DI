/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaCompra;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Metodos {

        private static List<Producto> listaProductos = new ArrayList<>();

    public static void anadirProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static List<Producto> borrarListaProductos() {
        listaProductos.removeAll(listaProductos);
        return listaProductos;
    }

    public static void setListaProductos(List<Producto> listaProductos) {
        Metodos.listaProductos = listaProductos;
    }

    public static void borrarProducto(int fila) {
        listaProductos.remove(fila);
    }

    public static String crearLista() {
        String listaCompraCompleta = "-- Lista de la compra --\n";
        for (Producto producto : listaProductos) {
            listaCompraCompleta += producto.toString();
        }
        return listaCompraCompleta;
    }

    public static Boolean listaVacia() {
        if (listaProductos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static Producto getProducto(int fila) {
        return Metodos.listaProductos.get(fila);

    }
}
