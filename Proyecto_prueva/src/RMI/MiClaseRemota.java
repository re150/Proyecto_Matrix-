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

/**
 *
 * @author angel
 */
public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota {
    public long Rmiti;
    public int[][] matrixA;
    public int[][] matrixB;
    public int[][] matrixAux;
    private List<MiInterfazRemota> clients;
  
    
    public MiClaseRemota() throws RemoteException {
        clients = new ArrayList<>();
    }
     public void registerClient( MiInterfazRemota client) throws RemoteException{
         clients.add(client);
         System.out.println(client);
     }
     
    public void MatrixFor (int [][] matrix1 ,int [][] matrix2) throws RemoteException{
    
        matrixA = matrix1;
        matrixB = matrix2;

        int rows1 = matrix1.length;
        System.out.println(rows1);
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        // Crea una instancia de ForkJoinPool y ejecuta la tarea
        ForkJoinPool pool = new ForkJoinPool();
        ForkjoinMatrix task = new ForkjoinMatrix(matrix1, matrix2, result, 0, rows1, 0, cols2);
        pool.invoke(task);
        
      
    }
    
     private  void show(int[][] result) {
         System.out.println("\nThread ");
      
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                //res2.append(Integer.toString(result[i][j]) + " ");
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
             //res2.append("\n");
        }
    }
}
