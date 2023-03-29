/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prueva;

/**
 *
 * @author angel
 */
public class logica {
    
     public void matrices () {
    int k = 0,aux = 0;     
    int[][] a  = {{3,1,-2},{0,4,2},{7,5,1}};  
    int[][] b = {{-1,0,8},{3,6,9},{0,0,3}};  
    int[][] c =  new int[3][3];    
            
   
    
    
       for(int i = 0; i < 3; i++){
          for(int j =0; j < 3; j++){
              while(k < 3){
              aux = a[i][k] * b[k][j] ;//+ a[i][1] * b[1][j] + a [i][2] * b[2][j]
               
                 k++;
              }
              c[i][j] = aux;
          }   
    }
    
       
        for(int i = 0; i< 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.println(c[i][j]);
            }
           System.out.println("\n");
     
        }
    
  }
}
