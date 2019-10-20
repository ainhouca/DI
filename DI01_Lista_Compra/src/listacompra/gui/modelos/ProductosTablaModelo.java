package listacompra.gui.modelos;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import listacompra.dto.Producto;
import listacompra.logica.LogicaListaCompra;

/**
 *
 * @author Irache Mtnez.
 */
public class ProductosTablaModelo extends AbstractTableModel implements TableCellRenderer {

    private List<Producto> listaProductos = new ArrayList<>();

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

        if (columnIndex == 1) {
            return Integer.class;
        }

        return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto producto = LogicaListaCompra.getProducto(rowIndex);

        if (columnIndex == 0) {
            producto.setSeleccion((Boolean) aValue);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel etiqueta = new JLabel();
        JCheckBox casilla = new JCheckBox();

        AbstractTableModel modelo = (AbstractTableModel) table.getModel();

        if (modelo.getValueAt(row, column).getClass().equals(Boolean.class)) {
            casilla.setSelected(Boolean.parseBoolean(modelo.getValueAt(row, column).toString()));
            return casilla;
        }

        if ((column != 0)) {
            etiqueta.setText(modelo.getValueAt(row, column).toString());
        }
        return casilla;
    }

}
