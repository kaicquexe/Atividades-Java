package exerciciointerface.atividadepatinhos;

import java.util.Scanner;

public class AtividadePatinhos {
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int patinhos = input.nextInt();
        int patinhos1 = patinhos;
        
        System.out.println("Digite a quantidade de patinhos que vão passear :");
        patinhos = input.nextInt();
        while (patinhos != 1 ){
            System.out.println(patinhos+ " patinhos foram passear");
            System.out.println("Alem das montanhas \n"
                    + "Para brincar /"
                    + "A mamae gritou: Qua, qua, qua, qua");
            if (patinhos == 2){
             System.out.println("Mas so "+ --patinhos +" voltou de la");
            }else{
                 System.out.println("Mas so "+ --patinhos +" voltaram de la");
            }
            
            if (patinhos == 1){
                 System.out.println("A mamãe patinha foi proucurar \n"
                         + "Alem das montanhas \n"
                         + "na beira do mar \n"
                         + "A mamãe gritou: qua qua qua qua \n"
                         + "e os "+patinhos1 +"voltaram de la");}
        }
            
            
                
}
}
