/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapavini;

import javax.swing.JOptionPane;

/**
 *
 * @author vinib
 */
public class MapaVini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Evento evento1 = new Evento("Lollapalooza", "23/03/2023", 500, 5000);
        
        Ingresso ingresso1 = new Ingresso("Vinicius", "435.619.298-26", evento1.getNome(), evento1.getValorUnico());
        Ingresso ingresso2 = new Ingresso("Vivian", "555.222.888-00", evento1.getNome(), evento1.getValorUnico());
        
        IngressoVip ingressovip = new IngressoVip();
        
        ingressovip.setValor(ingresso1.getValor());
        
        IngressoCamarote ingressocamarote = new IngressoCamarote();
        
        ingressocamarote.setValor(ingresso1.getValor());
        
        
        
       
        
        evento1.venderIngresso(ingresso1);
        evento1.venderIngresso(ingresso2);
        
        
        JOptionPane.showMessageDialog(null, evento1.resumoIngresso());
        
        ingressovip.imprimirValor();
        ingressocamarote.imprimirValor();
        evento1.ingressosVendidos();
       
    }
    
}
