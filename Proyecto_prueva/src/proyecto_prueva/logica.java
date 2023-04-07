/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prueva;
import java.util.Random;

/**
 *
 * @author angel
 */
public class logica {
    Random rand = new Random();
    Proyecto_prueva  aux1 = new  Proyecto_prueva();
    int aux = aux1.aux;
    int[][] a  = {{3,1,-2},{0,4,2},{7,5,1}};  
    int[][] b = {{-1,0,8},{3,6,9},{0,0,3}};  
    int[][] c =  new int[aux][aux]; 
    
     int[][] d =  new int[aux][aux]; 
     int[][] e =  new int[aux][aux]; 
     int[][] f =  new int[aux][aux];
    
   
   
     public void datosMatris (int[][] x ) {
        
         for(int i = 0; i < aux ; i++){
             for(int j = 0; j < aux ; j++){
                x[i][j]= rand.nextInt(100);
             }
         }
         //show(x);      
     }
     
     
     public void matrices () {
       long startTime = System.currentTimeMillis();   
           datosMatris (d);
           datosMatris (e);
            
       for(int i = 0; i < aux; i++){
          for(int j =0; j < aux; j++){
               int suma = 0;
              for(int k = 0; k < aux ; k++){
                suma += d[i][k] * e[k][j];
               //+ a[i][1] * b[1][j] + a [i][2] * b[2][j]
              // suma(i,j);  
              }
               f[i][j] = suma;
          } 
          
    }
    
        
         show(f);
         
         long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido en milisegundos en secuencias: " + elapsedTime);
        
      /*  for(int i = 0; i< aux; i++){
            for(int j = 0 ; j < aux; j++){
                System.out.println(b[i][j]);
            }
           System.out.println("\n");
     
        }*/
    
  }
     
  
     public void show(int[][] x){
       for(int i = 0; i< aux; i++){
            for(int j = 0 ; j < aux; j++){
                  System.out.print(x[i][j] + " " );
            }
                  System.out.println();
        }    
     }
     
     
     
}
