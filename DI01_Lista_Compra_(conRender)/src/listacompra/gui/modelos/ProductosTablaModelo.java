package listacompra.gui.modelos;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import listacompra.dto.Producto;
import listacompra.logica.LogicaListaCompra;
import static listacompra.logica.LogicaListaCompra.getProducto;

/**
 *
 * @author Irache Mtnez.
 */
public class ProductosTablaModelo extends AbstractTableModel implements TableCellRenderer {

    private List<Producto> listaProductos = new ArrayList<>();

    String[] nombresColumnas = {"X", "Cantidad", "Nombre", "Sección", "Urgente"};
    //int[] anchoColumnas = {30, 40, 120, 90, 30};

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

        if (columnIndex == 1) {
            return Integer.class;
        }

        return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //(columnIndex == 0)
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        JCheckBox check = new JCheckBox();
        if (column == 0) {
            return check;
        }
        if (value == null) {
            return null;
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto producto = LogicaListaCompra.getProducto(rowIndex);
        /*switch (columnIndex) {
            case 0:
                producto.setSeleccion((Boolean) aValue);
            case 1:
                producto.setCantidad((Integer) aValue);
            case 2:
                producto.setNombre((String) aValue);
            case 3:
                producto.setSeccion((String) aValue);
            case 4:
                producto.setUrgente((Boolean) aValue);
        }
         */
        if (columnIndex == 0) {
            producto.setSeleccion((Boolean) aValue);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

}
