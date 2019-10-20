package listacompra.gui.modelos;

import java.awt.Component;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import listacompra.dto.Producto;

/**
 *
 * @author Irache Mtnez.
 */
public class TablaModelo extends DefaultTableModel {

    private List<Producto> listaProductos;
    String[] nombresColumnas = {"X", "Cantidad", "Nombre", "Sección", "Urgente"};

    public TablaModelo(List<Producto> listaProductos) {
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
        switch (columnIndex) {
            case 0:
                return Boolean.class;
            case 1:
                return Integer.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Boolean.class;
        }

        return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //(columnIndex == 0)
    }

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

    /*  if (aValue instanceof Boolean && column == 0) {

        rowData.
        fireTableCellUpdated(row, column);
      }

     */
}
