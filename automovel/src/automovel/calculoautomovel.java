/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovel; 

/**
 *
 * @author Etec-User
 */
public class Calculoautomovel {
    //ATRIBUTOS
    private Double n1,n2,n3,n4;
    
    //MÉTODOS 
    // CALCULO DISTANCIA TOTAL
    public double disttotal(double n3, double n4){
         double resultado = n3*n4;
         return resultado ;
    }
    
     // CALCULO QUANTIDADE DE LITROS UTILIZADOS
    public double litros(double n3,double n4,double n1){
      double resultado = (n3*n4)/n1;
      return resultado;
      
        
        
    }

    // CALCULO COMBUSTIVEL GASTO
     public double combu(double n3,double n4,double n1,double n2){
      double resultado = ((n3*n4/n1))*n2;
      return resultado;
      
}
}
