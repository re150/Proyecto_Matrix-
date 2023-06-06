/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import proyecto_prueva.ForkjoinMatrix;
import javax.swing.JTextArea;

/**
 *
 * @author angel
 */
public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota {
    
    public String MatrixEnd;
    public long Rmiti;
    public int[][] matrixA;
    public int[][] matrixB;
    public int[][] result;
    private List<MiInterfazRemota> clients;
    public List <Long> tiempos;

    public MiClaseRemota() throws RemoteException {
        clients = new ArrayList<>();
        tiempos = new ArrayList<>();
    }

    public void registerClient(MiInterfazRemota client) throws RemoteException {
        clients.add(client);
       
        System.out.println(clients.size());
        System.out.println(client);
    }

    public int [][] MatrixFor(int[][] matrix1, int[][] matrix2) throws RemoteException {

        matrixA = matrix1;
        matrixB = matrix2;
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        result = new int[rows1][cols2];

        // Dividir la tarea en bloques y enviar a los clientes
        int numClients = clients.size();
        int blockSize = rows1 / numClients;
        int startRow = 0;
        int endRow = blockSize;

        for (int i = 0; i < numClients; i++) {
            MiInterfazRemota client = clients.get(i);
            if (i == numClients - 1) {
                // Último cliente, ajustar límite superior
                endRow = rows1;
            }

            // Obtener el bloque de la matriz
            int[][] blockA = getSubMatrix(matrixA, startRow, 0, endRow - startRow, cols1);
            int[][] blockB = matrixB;

            
            // Enviar el bloque al cliente para realizar la multiplicación de matrices
            client.multiSeccion(blockA, blockB, startRow, 0, endRow, cols2);

            // Actualizar los índices para el próximo bloque
            startRow = endRow;
            endRow += blockSize;
        }
        


       
        return result;
    }
    
    
   
  
     
    public int[][] getSubMatrix(int[][] matrix, int startRow, int startCol, int numRows, int numCols) {
        //para copiar los elementos correspondientes desde la matriz original a la submatriz
        int[][] subMatrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            System.arraycopy(matrix[startRow + i], startCol, subMatrix[i], 0, numCols);
        }
        return subMatrix;
    }

    public void multiSeccion(int[][] blockA, int[][] blockB, int startRow, int startCol, int endRow, int endCol) throws RemoteException {
        int numRows = endRow - startRow;
        int numCols = endCol - startCol;
        int[][] blockResult = new int[numRows][numCols];
        
        // Realizar la multiplicación de bloques utilizando Fork/Join
        ForkJoinPool pool = new ForkJoinPool();
        ForkjoinMatrixRMI task = new ForkjoinMatrixRMI(blockA, blockB, blockResult, 0, numRows, 0, numCols);
        pool.invoke(task);

        // Copiar el resultado del bloque a la matriz resultante
        for (int i = 0; i < numRows; i++) {
            System.arraycopy(blockResult[i], 0, result[startRow + i], startCol, numCols);
        }
        Rmiti = task.RMI;
        tiempos.add(Rmiti);
        System.out.println(tiempos);
    }
        
    
}
