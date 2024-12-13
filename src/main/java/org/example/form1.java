package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField cedulatxt;
    private JTextField nombretxt;
    private JTextField edadtxt;
    private JTextField direcciontxt;
    private JTextField telefonotxt;
    private JTextField correotxt;
    private JButton crearbtn;
    private JLabel resultadolbl;

    public form1() {
        crearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComunidadEpn miembroepn1= new ComunidadEpn();
                miembroepn1.setCedula(cedulatxt.getText());
                miembroepn1.setCorreo(correotxt.getText());
                miembroepn1.setDireccion(direcciontxt.getText());
                miembroepn1.setEdad(Integer.parseInt(edadtxt.getText()));
                miembroepn1.setNombrecompleto(nombretxt.getText());
                miembroepn1.setTelefono(telefonotxt.getText());
                miembroepn1.mostrarDatos();
                resultadolbl.setText(miembroepn1.mostrarDatos2());
            }
        });
    }
}
