/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra.gui.tablamodelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import listacompra.dto.Producto;

/**
 *
 * @author Irache Mtnez.
 */
public class ProductosTablaModelo extends AbstractTableModel {

    private List<Producto> listaProductos;

    String[] nombresColumnas = {"X", "Cantidad", "Nombre", "Sección", "Urgente"};

    public ProductosTablaModelo(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String getColumnName(int column) {
        return nombresColumnas[column];
    }

    @Override
    public int getRowCount() {
        return listaProductos.size();
    }

    @Override
    public int getColumnCount() {
        return nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaProductos.get(rowIndex).isSeleccion();
            case 1:
                return listaProductos.get(rowIndex).getCantidad();
            case 2:
                return listaProductos.get(rowIndex).getNombre();
            case 3:
                return listaProductos.get(rowIndex).getSeccion();
            case 4:
                return listaProductos.get(rowIndex).isUrgente();
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0 || columnIndex == 4) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //(columnIndex == 0)
    }

}
