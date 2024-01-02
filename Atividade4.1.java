
package com.mycompany.atividade4;


public class Empregado {

    
    
    private String Nome;
    private String sobrenome;
    private double SalarioMensal;
    private double SalarioAnual;
    
    
    public Empregado(String Nome, String sobrenome, double salarioMensal){
   this.Nome = Nome;
   this.sobrenome = sobrenome;
   this.SalarioMensal = salarioMensal;
   this.SalarioAnual = SalarioAnual;
    
    
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return SalarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.SalarioMensal = salarioMensal;
    }
    public double calcularSalarioMensal(){
    return SalarioMensal * 12;
    }

    public double getSalarioAnual() {
        return SalarioAnual;
    }

    public void setSalarioAnual(double SalarioAnual) {
        this.SalarioAnual = SalarioAnual;
    }
   public double calcularSalarioAnual(){
    return SalarioMensal * 12 * 1.1;
}
}
    
    
   



    
    
    
    
    
    
    
    
    
    
