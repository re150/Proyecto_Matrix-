/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author angel
 */
public class ServerRmi {
    public static void main(String[] args) {
        
        try{
            
            MiClaseRemota remoteMi =  new MiClaseRemota ();
            
            //se registara un puertto 
            Registry registry = LocateRegistry.createRegistry(1099);
            
            registry.rebind("MiInterfazRemota", remoteMi);
            
             System.out.println("Servidor RMI listo...");
        }catch(Exception e){
        System.err.println("Error en el servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
