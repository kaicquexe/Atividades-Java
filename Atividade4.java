

package com.mycompany.atividade4;


public class Atividade4 {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Kaicque", "Gomes",40);
        Empregado empregado2 = new Empregado("Bernardo", "Mayrink",2000);
        
        System.out.println("EMPREGADO : \n" + empregado1.getNome() + empregado1.getSobrenome() + "Recebe" + empregado1.getSalarioMensal());
        System.out.println("EMPREGADO : \n" + empregado2.getNome() + empregado2.getSobrenome() + "Recebe" + empregado2.getSalarioMensal());
        
        System.out.println("EMPREGADO 1" + empregado1.calcularSalarioMensal());
        System.out.println("EMPREGADO 1" + empregado2.calcularSalarioMensal());
               
        System.out.println("EMPREGADO 1 salario anual" + empregado1.calcularSalarioAnual());
        System.out.println("EMPREGADO 1 salario anual" + empregado2.calcularSalarioAnual());
        
    }
}
