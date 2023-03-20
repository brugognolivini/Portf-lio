/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapavini;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinib
 */
public class Evento {
    private String nome;
    private String data;
    private double valorUnico;
    private int capacidadeMaxima;
    private List<Ingresso> ingressos;
    
   
       
    
    public Evento() {
       System.out.println("Instanciado");
    
    this.ingressos = new ArrayList<Ingresso>();
    
}
    public Evento(String nome, String data, double valorUnico, int capacidadeMaxima){
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressos = new ArrayList<Ingresso>();
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public void venderIngresso(Ingresso ingresso){
        ingressos.add(ingresso);
        
        
    }
    
    public String resumoIngresso(){
        String msg = "Data " + this.data + " \n";
        msg += "Evento " + this.nome + " \n";
        for(int i = 0; i < ingressos.size(); i++){
            String nomeIngresso = ingressos.get(i).getNome();
            msg += "Nome "  + " - " + nomeIngresso + " \n";
            String cpfIngresso = ingressos.get(i).getCpf();
            msg += "CPF " + " - " + cpfIngresso + "\n";
        }
        return msg;
        
    }
    public void ingressosVendidos(){
        JOptionPane.showMessageDialog(null, "O número de ingressos vendidos é de: " + ingressos.size());
    }
    
   
    

}