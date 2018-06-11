/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_condicional1;

/**
 *
 * @author acabezaslopez
 */
public class Condicional {
  public Condicional(){
  }
  public void condicion(int n1,int n2){
      if(n1>n2){
      System.out.println("Num1 é maior ca Num2");
      }else{
        System.out.println("Num2 é maior ca Num1");
      }
  }
      //Tamén se pode 
    public void condcomp(int n1,int n2){
      
     String resposta=(n1 > n2)?"Num1 é maior ca Num2":"Num2 é maior ca Num1";
        System.out.println(resposta);
    }   
    //Tamén hai anidados
    public void condanidado(int n1,int n2){
      if(n1>n2){
      System.out.println("Num1 é maior ca Num2");
      }else if(n1<n2){
          System.out.println("Num2 é maior ca Num1");
      }else{
          System.out.println("Num1 é igual a Num2");
      }
    }
}
