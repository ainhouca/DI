/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaCompra;



import com.trolltech.qt.core.QModelIndex;
import com.trolltech.qt.gui.QStandardItemModel;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Irache Mtnez.
 */
public class ProductosTablaModelo extends QStandardItemModel {
    
    private List<Producto> listaProductos = new ArrayList<>();

    String[] nombresColumnas = {"X", "Cantidad", "Nombre", "Sección", "Urgente"};

    //constructor
    public ProductosTablaModelo(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public int columnCount(QModelIndex parent) {
        return nombresColumnas.length; 
    }

    @Override
    public int rowCount(QModelIndex parent) {
        return listaProductos.size(); 
    }

   
    





    
    

}
