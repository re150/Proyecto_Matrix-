/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author angel
 */
public interface MiInterfazRemota extends Remote{
      public void MatrixFor (int[][] matrix1 , int [][] matrix2)throws RemoteException;
      public void registerClient( MiInterfazRemota client) throws RemoteException;
}
