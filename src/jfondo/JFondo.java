/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jfondo;

import javax.swing.JOptionPane;
import jfondo.version1.VentanaFondo;
import jfondo.version2.ImagenFondo;
import jfondo.version3.VentanaFondoExtra;

/**
 *
 * @author Sergio Teacher
 */
public class JFondo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando Fondo");


        int optionT=0;
        String[] optionesVentana={"Versión1", "Versión2","Versión3"};
        optionT = JOptionPane.showOptionDialog(null, "Control de presentación de imágenes", "Seleccione VENTANA de arranque", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionesVentana, "Básica");

//sólo creo el objto que necesito.
        if( optionT == 0 ){
            VentanaFondo VFondo = new VentanaFondo();
            VFondo.setVisible(true);
        }else if( optionT == 1 ){
            ImagenFondo iFondo = new ImagenFondo();
        }else if( optionT == 2 ){
            VentanaFondoExtra eFondo = new VentanaFondoExtra();
            eFondo.setVisible(true);
        }else{
            System.out.println("Descartado lanzar alguna ventana, se sale ...");
        }
     


    }
   
}
