/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapavini;

import javax.swing.JOptionPane;

/**
 *
 * @author vinib
 */
public class IngressoCamarote extends Ingresso {
    public double calcularIngresso(){
        double camarote = getValor() + (0.6 * getValor());
        return camarote;
    }
    
    public void imprimirValor(){
        JOptionPane.showMessageDialog(null, "O Ingresso Camarote custa: " + calcularIngresso());
    }
}
