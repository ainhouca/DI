package listaCompra;

/**
 * ******************************************************************************
 ** Form generated from reading ui file 'frmPrincipal.jui' * * Created by: Qt
 * User Interface Compiler version 4.8.7 * * WARNING! All changes made in this
 * file will be lost when recompiling ui file!
 * ******************************************************************************
 */
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import java.util.ArrayList;
import java.util.List;
import com.trolltech.qt.gui.QFormLayout;

/**
 *
 * @author Irache Mtnez.
 */
public class FormularioPrincipal implements com.trolltech.qt.QUiForm<QMainWindow> {

    public QWidget centralwidget;
    public QFormLayout formLayout;
    public QGridLayout gridLayout;
    public QTableView tableView_tabla;
    public QSpacerItem horizontalSpacer_6;
    public QPushButton pushButton_borrarTodo;
    public QPushButton pushButton_borrarSeleccion;
    public QLabel label;
    public QSpacerItem horizontalSpacer;
    public QPushButton pushButton_imprimir;
    public QSpacerItem horizontalSpacer_2;
    public QSpacerItem horizontalSpacer_5;
    public QPushButton pushButton_anadir;
    public QSpacerItem horizontalSpacer_3;
    public QStatusBar statusbar;

    QStandardItemModel modelo;

    public FormularioPrincipal() {
        super();
    }

    public void setupUi(QMainWindow MainWindow) {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(678, 365).expandedTo(MainWindow.minimumSizeHint()));
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        formLayout = new QFormLayout(centralwidget);
        formLayout.setObjectName("formLayout");
        gridLayout = new QGridLayout();
        gridLayout.setObjectName("gridLayout");
        tableView_tabla = new QTableView(centralwidget);
        tableView_tabla.setObjectName("tableView_tabla");
        QFont font = new QFont();
        font.setFamily("Arial");
        font.setPointSize(10);
        tableView_tabla.setFont(font);

        gridLayout.addWidget(tableView_tabla, 3, 0, 1, 6);

        horizontalSpacer_6 = new QSpacerItem(188, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_6, 0, 0, 1, 3);

        pushButton_borrarTodo = new QPushButton(centralwidget);
        pushButton_borrarTodo.setObjectName("pushButton_borrarTodo");
        QFont font1 = new QFont();
        font1.setFamily("Arial");
        font1.setPointSize(10);
        font1.setBold(true);
        font1.setWeight(75);
        pushButton_borrarTodo.setFont(font1);

        gridLayout.addWidget(pushButton_borrarTodo, 6, 0, 1, 1);

        pushButton_borrarSeleccion = new QPushButton(centralwidget);
        pushButton_borrarSeleccion.setObjectName("pushButton_borrarSeleccion");
        QFont font2 = new QFont();
        font2.setFamily("Arial");
        font2.setPointSize(10);
        font2.setBold(true);
        font2.setWeight(75);
        pushButton_borrarSeleccion.setFont(font2);

        gridLayout.addWidget(pushButton_borrarSeleccion, 6, 1, 1, 2);

        label = new QLabel(centralwidget);
        label.setObjectName("label");
        QFont font3 = new QFont();
        font3.setFamily("Papyrus");
        font3.setPointSize(18);
        font3.setBold(true);
        font3.setWeight(75);
        label.setFont(font3);

        gridLayout.addWidget(label, 0, 3, 1, 1);

        horizontalSpacer = new QSpacerItem(218, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 6, 3, 1, 1);

        pushButton_imprimir = new QPushButton(centralwidget);
        pushButton_imprimir.setObjectName("pushButton_imprimir");
        QFont font4 = new QFont();
        font4.setFamily("Arial");
        font4.setPointSize(10);
        font4.setBold(true);
        font4.setWeight(75);
        pushButton_imprimir.setFont(font4);

        gridLayout.addWidget(pushButton_imprimir, 6, 5, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(618, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_2, 4, 0, 1, 6);

        horizontalSpacer_5 = new QSpacerItem(188, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_5, 0, 4, 1, 2);

        pushButton_anadir = new QPushButton(centralwidget);
        pushButton_anadir.setObjectName("pushButton_anadir");
        QFont font5 = new QFont();
        font5.setFamily("Arial");
        font5.setPointSize(10);
        font5.setBold(true);
        font5.setWeight(75);
        pushButton_anadir.setFont(font5);

        gridLayout.addWidget(pushButton_anadir, 6, 4, 1, 1);

        pushButton_anadir.clicked.connect(this, "abrirFormularioAnadirProducto()");

        horizontalSpacer_3 = new QSpacerItem(618, 17, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_3, 2, 0, 1, 6);

        formLayout.addItem(gridLayout);
        //formLayout.addLayout(gridLayout);  --> no existe el método addLayout()

        MainWindow.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow) {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        MainWindow.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Mi lista de la compra", null));
        pushButton_borrarTodo.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Borrar Todo", null));
        pushButton_borrarSeleccion.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Borrar Selecci\u00f3n", null));
        label.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Mi lista de la compra", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Mi lista de la compra", null));
        pushButton_imprimir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Imprimir", null));
        pushButton_anadir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "A\u00f1adir", null));
    } // retranslateUi

    //método para abrir el formulario para añadir producto (desde botón Añadir)
    void abrirFormularioAnadirProducto() {
        FormularioAnadirProducto Alta = new FormularioAnadirProducto();
        QDialog dialog = new QDialog();
        Alta.setupUi(dialog);
        dialog.show();
    }

    //método para rellenar la tabla
    private void rellenarTabla() {
        //Creamos el modelo para la tabla
        modelo = new QStandardItemModel();
        //Añadimos los textos para los títulos de las columnas a una lista
        List<String> cabecera = new ArrayList<>();
        cabecera.add("X");
        cabecera.add("Nombre");
        cabecera.add("Cantidad");
        cabecera.add("Sección");
        cabecera.add("Urgente");
        //Indicamos el número de columnas
        modelo.setColumnCount(cabecera.size());
        modelo.setHorizontalHeaderLabels(cabecera);

        //refrescarTabla();
        //Añadimos los datos de la tabla al modelo
        /*modelo.setRowCount(2);
        modelo.setData(0, 0, "Pablo");
        modelo.setData(0, 1, "González");
        modelo.setData(1, 0, "Alfredo");
        modelo.setData(1, 1, "Pérez");
         */
        //Indicamos a la tabla cual es su modelo
        tableView_tabla.setModel(modelo);

    }

}
