package com.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author acabezaslopez
 */
public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta1, etiqueta2;

    public Ventana() {
        marco = new JFrame("Ventana eventos boletin 23");
        panel = new JPanel();
        boton1 = new JButton("síada");
        boton2 = new JButton("despedida");
        etiqueta1 = new JLabel("un saudo a DAM");
        etiqueta2 = new JLabel("fin do probrama");
        // Se dan las características a los objetos:
        marco.setSize(500, 200);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        etiqueta1.setVisible(false);
        etiqueta2.setVisible(false);
        marco.add(panel);
        // Se añade al botón el ActionListener
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        //visibilidad
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        /*
         * Para poder diferenciar que botón es el pulsado utilizamos para el
         * ActionEvent su método .getSource.
         */
        Object boton = ae.getSource();
        if (boton == boton1) {
            etiqueta1.setVisible(true);
            etiqueta2.setVisible(false);
        } else {
            etiqueta2.setVisible(true);
            etiqueta1.setVisible(false);
        }
    }

}
