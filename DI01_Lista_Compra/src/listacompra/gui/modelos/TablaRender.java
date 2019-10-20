package listacompra.gui.modelos;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Irache Mtnez.
 */
public class TablaRender implements TableCellRenderer {

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
