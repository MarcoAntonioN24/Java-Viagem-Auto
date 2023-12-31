/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovel;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCO ANTONIO AND ALESSANDRO PEIXOTO
 */
public class Automovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculoautomovel objauto =new Calculoautomovel();
        
        String algarismo1, algarismo2 , algarismo3, algarismo4;
        
         algarismo1 = JOptionPane.showInputDialog("Forneça quantos KM o veículo percorre por LITRO: ");
         algarismo2 = JOptionPane.showInputDialog("Forneça o valor do LITRO do COMBUSTÍVEL: ");
         algarismo3 = JOptionPane.showInputDialog("Forneça o tempo gasto para realizar a viagem(em minutos): ");
         algarismo4 = JOptionPane.showInputDialog("Forneça a velocidade em KM/H média do veículo durante a viagem: ");

          Double num1, num2, num3, num4;
          
          num1 = Double.parseDouble(algarismo1);
          num2 = Double.parseDouble(algarismo2);
          num3 = Double.parseDouble(algarismo3);
          num4 = Double.parseDouble(algarismo4);
          
          
          
      JOptionPane.showMessageDialog(null, "O veículo percorre por litro: " + num1) ;
      JOptionPane.showMessageDialog(null, "O litro do combustível custa R$: " + num2) ;
      JOptionPane.showMessageDialog(null, "A viagem gasta em minutos : " + num3) ;
      JOptionPane.showMessageDialog(null, "O veículo percorre : " + num4) ;
         
        //DISTANCIA TOTAL
        Double resudisttot = objauto.disttotal(num3,num4);
        JOptionPane.showMessageDialog(null, "A distância total percorrida é: " + resudisttot + " KM/H ");
        
        
        //QUANTIDADE LITROS UTILIZADOS
      Double resulit = objauto.litros(num3,num4,num1);
        JOptionPane.showMessageDialog(null, "Aquantidade de litros utilizados foram: " + resulit + " LITROS ");
       
        //VALOR GASTO COMBUSTIVEL
        Double valorcomb = objauto.combu(num3,num4,num1,num2);
        JOptionPane.showMessageDialog(null, "O valor total gasto em combustível para realizar a viagem é R$: " + valorcomb );
       
    } 
}
