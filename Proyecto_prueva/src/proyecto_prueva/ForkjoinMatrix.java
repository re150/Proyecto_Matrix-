/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prueva;

import java.util.concurrent.RecursiveAction;
import static proyecto_prueva.Proyecto_prueva.Concu2;

/**
 *
 * @author angel
 */
public class ForkjoinMatrix extends RecursiveAction {
    private final int [][] matrixA;
    private final int [][] matrixB;
    private final int[][] result;
    private final int startRow;
    private final int endRow;
    private final int startCol;
    private final int endCol;
    
    public ForkjoinMatrix(int[][] matrixA, int[][] matrixB, int[][] result, int startRow, int endRow, int startCol, int endCol) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
    }
    
    @Override
    protected void compute() {
       
        
        if (endRow - startRow <= 100 || endCol - startCol <= 100) {
            // Realiza la multiplicación de matrices de manera secuencial
            for (int i = startRow; i < endRow; i++) {
                for (int j = startCol; j < endCol; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrixA[0].length; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    result[i][j] = sum;
                }
            }
        } else {
            // Divide la tarea en sub-tareas más pequeñas
            int midRow = (startRow + endRow) / 2;
            int midCol = (startCol + endCol) / 2;
            
            ForkjoinMatrix[] tasks = new ForkjoinMatrix[4];
            tasks[0] = new ForkjoinMatrix(matrixA, matrixB, result, startRow, midRow, startCol, midCol);
            tasks[1] = new ForkjoinMatrix(matrixA, matrixB, result, midRow, endRow, startCol, midCol);
            tasks[2] = new ForkjoinMatrix(matrixA, matrixB, result, startRow, midRow, midCol, endCol);
            tasks[3] = new ForkjoinMatrix(matrixA, matrixB, result, midRow, endRow, midCol, endCol);
            
            invokeAll(tasks);
        }
          
     }
}
