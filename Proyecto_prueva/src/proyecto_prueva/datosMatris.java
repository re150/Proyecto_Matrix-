/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prueva;

import static proyecto_prueva.Proyecto_Prueba.aux;
import static proyecto_prueva.Proyecto_Prueba.rand;

/**
 *
 * @author angel
 */
public class datosMatris implements Runnable{
    private int[][] matrixA;
    private int inicio;
    private int endrow;
    
    public datosMatris(int[][] matrixA, int inicio, int endrow){
    this.matrixA =  matrixA;
    this.inicio = inicio;
    this.endrow = endrow;
    }
    
    @Override
    public void run () {
        for(int i = inicio; i <= endrow ; i++){
             for(int j = 0; j < matrixA[i].length ; j++){
                matrixA[i][j]= rand.nextInt(100);
             }
         }
    
    }
    
    
    
    
    
}
