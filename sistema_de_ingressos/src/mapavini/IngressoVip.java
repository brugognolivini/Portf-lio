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
public class IngressoVip extends Ingresso {
     
    public double calcularIngresso(){
        double vip = getValor() + (0.3 * getValor());
        return vip;
    }
    
    public void imprimirValor(){
        JOptionPane.showMessageDialog(null, "O Ingresso Vip custa: " + calcularIngresso());
    }
    
 
}    
    

