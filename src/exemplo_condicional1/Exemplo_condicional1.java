package exemplo_condicional1;

import java.util.Scanner;

public class Exemplo_condicional1 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduce num1");
        num1 = ler.nextInt();
        System.out.println("Introduce num2");
        num2 = ler.nextInt();
        Condicional cond=new Condicional();
        //cond.condicion(num1,num2);
        //cond.condcomp(num1,num2);
         cond.condanidado(num1,num2);
    }
    
}
