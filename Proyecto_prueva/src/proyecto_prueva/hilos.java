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
public class hilos  implements Runnable {
    
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;
    private int row;
    
    public hilos (int[][] matrix1, int[][] matrix2, int[][] result, int row) {
        this.matrixA = matrix1;
        this.matrixB = matrix2;
        this.result = result;
        this.row = row;
    }
  
    @Override
    public void run () {
        
          for (int i = 0; i < matrixB[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrixA[0].length; j++) {
                sum += matrixA[row][j] * matrixB[j][i];
            }
            result[row][i] = sum;
        }
                
    }
    
    
    
    
}
    
  

