/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prueva;
import View.view;
import java.util.Random;
import javax.swing.JTextArea;

/**
 *
 * @author angel
 */
public class logica {
    Random rand = new Random();
    public long sec;
    private JTextArea res1;
    //Proyecto_prueva  aux1 = new  Proyecto_prueva();aux1.aux;
   
  
    /*int[][] a  = {{3,1,-2},{0,4,2},{7,5,1}};  
    int[][] b = {{-1,0,8},{3,6,9},{0,0,3}};  
    int[][] c =  new int[aux][aux]; 
    */
    
    int aux ;
    int[][] d ; 
    int[][] e; 
    int[][] f;
    
   public logica (int[][] matrixA, int[][] matrixB, int[][] result,int  aux1,JTextArea  res1 ){
    this.d = matrixA;
    this.e = matrixB;
    this.f = result;
    this.res1 = res1;
    this.aux = aux1;
   }
   
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
         System.out.println(aux);
         /*  datosMatris (d);
          datosMatris (e);*/
            
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
    
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido en milisegundos en secuenciask: " + elapsedTime);
        sec =  elapsedTime;
        
         show(f,res1);
         
        
        
      /*  for(int i = 0; i< aux; i++){
            for(int j = 0 ; j < aux; j++){
                System.out.println(b[i][j]);
            }
           System.out.println("\n");
     
        }*/

  }
     
  
     public void show(int[][] x, JTextArea res1 ){
         
       for(int i = 0; i< aux; i++){
            for(int j = 0 ; j < aux; j++){
                  res1.append(Integer.toString(x[i][j]) + " ");
                  //System.out.print(x[i][j] + " " );
            }
                //  System.out.println();
                  res1.append("\n");
        }    
     }
     
}
