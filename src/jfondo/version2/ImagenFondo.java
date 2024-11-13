/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfondo.version2;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Teacher
 */
public class ImagenFondo extends JPanel {

private ImageIcon img;
private int x, y;
private String ruta="/jfondo/imagenes/cielo.jpg";

    public ImagenFondo() {
        System.out.println("Iniciando ImagenFondo desde cero");

        JFrame mioVentana = new JFrame("Imagen de fondo");
        mioVentana.setContentPane(this);
        mioVentana.setSize(600, 600);
        mioVentana.setVisible(true);
        mioVentana.setLocationRelativeTo(null);
        mioVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Un par de objetos en la ventana
        JLabel eiqueta = new JLabel("Esto es una etiqueta");
        add(eiqueta);
        JTextField ttexto = new JTextField(10);
        add(ttexto);
    }

    @Override
    public void paint(Graphics g){
    ImageIcon img = new ImageIcon(getClass().getResource(ruta));
    g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), this);

    setOpaque(false);
    super.paint(g);

    }
    
}
