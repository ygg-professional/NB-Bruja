package Bruja;

import java.awt.Component;
import javax.swing.JFrame;

public class Ventana {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Graficas Primitivas - Lineas");
      Panel cod = new Panel();
      ventana.add(cod);
      ventana.setDefaultCloseOperation(3);
      ventana.setSize(350, 440);
      ventana.setLocationRelativeTo((Component)null);
      ventana.setVisible(true);
   }
}
