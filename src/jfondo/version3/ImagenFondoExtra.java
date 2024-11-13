/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfondo.version3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sergio Teacher
 */
public class ImagenFondoExtra extends JPanel {

@Override
public void paint(Graphics g){
    ImageIcon img = new ImageIcon(getClass().getResource("/jfondo/imagenes/cielo2.jpg"));
    g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), this);

    setOpaque(false);
    super.paint(g);
}

}

