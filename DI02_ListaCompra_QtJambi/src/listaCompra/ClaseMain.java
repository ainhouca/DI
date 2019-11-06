/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCompra;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author Irache Mtnez.
 */
public class ClaseMain {

    static FormularioPrincipal principal;

    public static FormularioPrincipal getPrincipal() {
        return principal;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QApplication.initialize(args);
        QMainWindow mw = new QMainWindow();
        principal = new FormularioPrincipal();
        principal.setupUi(mw);
        mw.show();
        QApplication.execStatic();
    }

}
