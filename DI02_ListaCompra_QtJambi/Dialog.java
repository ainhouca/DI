/********************************************************************************
 ** Form generated from reading ui file 'frmAlta.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Dialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QFormLayout formLayout;
    public QGridLayout gridLayout_2;
    public QGridLayout gridLayout;
    public QLineEdit lineEdit_nombre;
    public QLabel label_seccion;
    public QCheckBox checkBox_urgente;
    public QLabel label_cantidad;
    public QComboBox comboBox_seccion;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem horizontalSpacer_3;
    public QSpacerItem horizontalSpacer_6;
    public QSpinBox spinBox_cantidad;
    public QLabel label_nombre;
    public QSpacerItem horizontalSpacer_2;
    public QSpacerItem verticalSpacer;
    public QPushButton pushButton_cestaCompra;
    public QSpacerItem verticalSpacer_2;

    public Dialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(530, 282).expandedTo(Dialog.minimumSizeHint()));
        Dialog.setWindowIcon(new QIcon(new QPixmap("recursos/cesta_imagen.png")));
        formLayout = new QFormLayout(Dialog);
        formLayout.setObjectName("formLayout");
        gridLayout_2 = new QGridLayout();
        gridLayout_2.setObjectName("gridLayout_2");
        gridLayout = new QGridLayout();
        gridLayout.setObjectName("gridLayout");
        lineEdit_nombre = new QLineEdit(Dialog);
        lineEdit_nombre.setObjectName("lineEdit_nombre");
        QFont font = new QFont();
        font.setFamily("Papyrus");
        font.setPointSize(11);
        font.setBold(true);
        font.setWeight(75);
        lineEdit_nombre.setFont(font);

        gridLayout.addWidget(lineEdit_nombre, 0, 4, 1, 3);

        label_seccion = new QLabel(Dialog);
        label_seccion.setObjectName("label_seccion");
        QFont font1 = new QFont();
        font1.setFamily("Arial");
        font1.setPointSize(11);
        label_seccion.setFont(font1);

        gridLayout.addWidget(label_seccion, 2, 0, 1, 1);

        checkBox_urgente = new QCheckBox(Dialog);
        checkBox_urgente.setObjectName("checkBox_urgente");
        QFont font2 = new QFont();
        font2.setFamily("Arial");
        font2.setPointSize(11);
        font2.setBold(false);
        font2.setWeight(50);
        checkBox_urgente.setFont(font2);

        gridLayout.addWidget(checkBox_urgente, 2, 6, 1, 1);

        label_cantidad = new QLabel(Dialog);
        label_cantidad.setObjectName("label_cantidad");
        QFont font3 = new QFont();
        font3.setFamily("Arial");
        font3.setPointSize(11);
        label_cantidad.setFont(font3);

        gridLayout.addWidget(label_cantidad, 0, 0, 1, 1);

        comboBox_seccion = new QComboBox(Dialog);
        comboBox_seccion.setObjectName("comboBox_seccion");
        QFont font4 = new QFont();
        font4.setFamily("Papyrus");
        font4.setPointSize(11);
        font4.setBold(true);
        font4.setWeight(75);
        comboBox_seccion.setFont(font4);

        gridLayout.addWidget(comboBox_seccion, 2, 1, 1, 3);

        horizontalSpacer = new QSpacerItem(168, 28, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 2, 4, 1, 2);

        horizontalSpacer_3 = new QSpacerItem(58, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_3, 0, 2, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(438, 38, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_6, 3, 0, 1, 7);

        spinBox_cantidad = new QSpinBox(Dialog);
        spinBox_cantidad.setObjectName("spinBox_cantidad");
        QFont font5 = new QFont();
        font5.setFamily("Papyrus");
        font5.setPointSize(11);
        font5.setBold(true);
        font5.setWeight(75);
        spinBox_cantidad.setFont(font5);
        spinBox_cantidad.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignRight,com.trolltech.qt.core.Qt.AlignmentFlag.AlignVCenter));
        spinBox_cantidad.setMinimum(1);
        spinBox_cantidad.setValue(1);

        gridLayout.addWidget(spinBox_cantidad, 0, 1, 1, 1);

        label_nombre = new QLabel(Dialog);
        label_nombre.setObjectName("label_nombre");
        QFont font6 = new QFont();
        font6.setFamily("Arial");
        font6.setPointSize(11);
        label_nombre.setFont(font6);

        gridLayout.addWidget(label_nombre, 0, 3, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(438, 18, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_2, 1, 0, 1, 7);


        gridLayout_2.addLayout(gridLayout, 0, 0, 1, 3);

        verticalSpacer = new QSpacerItem(20, 118, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_2.addItem(verticalSpacer, 1, 0, 1, 1);

        pushButton_cestaCompra = new QPushButton(Dialog);
        pushButton_cestaCompra.setObjectName("pushButton_cestaCompra");
        pushButton_cestaCompra.setIcon(new QIcon(new QPixmap("recursos/cesta_imagen.png")));
        pushButton_cestaCompra.setIconSize(new QSize(100, 100));
        pushButton_cestaCompra.setFlat(true);

        gridLayout_2.addWidget(pushButton_cestaCompra, 1, 1, 1, 1);

        verticalSpacer_2 = new QSpacerItem(20, 118, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_2.addItem(verticalSpacer_2, 1, 2, 1, 1);


        formLayout.addLayout(gridLayout_2);

        label_seccion.setBuddy(comboBox_seccion);
        label_cantidad.setBuddy(spinBox_cantidad);
        label_nombre.setBuddy(lineEdit_nombre);
        QWidget.setTabOrder(spinBox_cantidad, lineEdit_nombre);
        QWidget.setTabOrder(lineEdit_nombre, comboBox_seccion);
        QWidget.setTabOrder(comboBox_seccion, checkBox_urgente);
        QWidget.setTabOrder(checkBox_urgente, pushButton_cestaCompra);
        retranslateUi(Dialog);
        pushButton_cestaCompra.clicked.connect(spinBox_cantidad, "lower()");
        pushButton_cestaCompra.clicked.connect(comboBox_seccion, "clear()");
        pushButton_cestaCompra.clicked.connect(lineEdit_nombre, "clear()");
        pushButton_cestaCompra.clicked.connect(checkBox_urgente, "setDisabled(boolean)");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        lineEdit_nombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre del producto", null));
        label_seccion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Secci\u00f3n:", null));
        checkBox_urgente.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\u00bfEs urgente?", null));
        checkBox_urgente.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Urgente", null));
        label_cantidad.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cantidad:", null));
        comboBox_seccion.clear();
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Panader\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pescader\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fruter\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Carnicer\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Charcuter\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Conservas", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Perfumer\u00eda", null));
        comboBox_seccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "General", null));
        comboBox_seccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Seleccionar secci\u00f3n del supermercado", null));
        spinBox_cantidad.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "N\u00ba de unidades", null));
        label_nombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre:", null));
        pushButton_cestaCompra.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "A\u00f1adir producto a la lista", null));
        pushButton_cestaCompra.setText("");
    } // retranslateUi

}

