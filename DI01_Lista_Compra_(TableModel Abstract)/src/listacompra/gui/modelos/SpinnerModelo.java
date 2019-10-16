package listacompra.gui.modelos;

import java.awt.Color;
import javax.swing.JSpinner;

/**
 * @author Irache Mtnez.
 */
public class SpinnerModelo extends JSpinner {

    public SpinnerModelo() {
        super();
    }

    public Color getColorTexto() {
        return ((JSpinner.DefaultEditor) getEditor()).getTextField().getForeground();
    }

    public void setColorTexto(Color colorTexto) {
        ((JSpinner.DefaultEditor) getEditor()).getTextField().setForeground(colorTexto);
    }

    public Color getColorFondo() {
        return ((JSpinner.DefaultEditor) getEditor()).getTextField().getBackground();
    }

    public void setColorFondo(Color colorFondo) {
        ((JSpinner.DefaultEditor) getEditor()).getTextField().setBackground(colorFondo);
    }

}
