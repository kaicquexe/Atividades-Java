
package com.mycompany.atividade3;


public class Atividade3 {

    public static void main(String args[]) {
        
        Fatura fatura = new Fatura("12345", "teclado", 2,25.0);
        
        System.out.println("Numero:" + fatura.getNumero());
        System.out.println("Descricao:" + fatura.getDescricao());
        System.out.println("Quantidade:" + fatura.getQuantidade());
        System.out.println("Preco por item:" + fatura.getPrecoPorItem());
        System.out.println("Total da fatura" + fatura.getTotalFatura());
    }
}
