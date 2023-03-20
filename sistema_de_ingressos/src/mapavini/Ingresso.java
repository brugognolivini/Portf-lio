/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapavini;

/**
 *
 * @author vinib
 */
public class Ingresso {
    
    protected String nome;
    protected String cpf;
    protected String eventoNome ;
    protected double valor;
    
    public Ingresso(){
        System.out.println("Instanciado");
    }
    
    public Ingresso(String nome, String cpf, String eventoNome, double valor){
        this.nome = nome;
        this.cpf = cpf;
        this.eventoNome = eventoNome;
        this.valor = valor;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEventoNome() {
        return eventoNome;
    }

    public void setEventoNome(String evento) {
        this.eventoNome = eventoNome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor= valor;
    }
    
    
        
    
      
    
    }

    
    
    

