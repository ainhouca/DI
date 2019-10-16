package listacompra.logica;

import java.util.ArrayList;
import java.util.List;
import listacompra.dto.Producto;

/**
 *
 * @author Irache Mtnez.
 */
public class LogicaListaCompra {

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
        LogicaListaCompra.listaProductos = listaProductos;
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

}
