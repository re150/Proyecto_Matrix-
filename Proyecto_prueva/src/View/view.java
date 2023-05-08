/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import proyecto_prueva.ForkjoinMatrix;
import proyecto_prueva.Proyecto_prueva;
import static proyecto_prueva.Proyecto_prueva.Concu;
import static proyecto_prueva.Proyecto_prueva.Concu2;
import static proyecto_prueva.Proyecto_prueva.aux;
import proyecto_prueva.datosMatris;
import proyecto_prueva.hilos;
import proyecto_prueva.logica;


/**
 *
 * @author angel
 */

public class view extends javax.swing.JFrame {
    public  long Concu, sec ;
    public int aux ;
    /**
     * Creates new form viiew
     */
    
    public view() {
        initComponents();
        styles ();
   }

    public void styles (){
     ResultadoM2.setOpaque(false);
     ResultadoM2.setBackground(Color.BLACK);
     ResultadoM1.setOpaque(false);
     ResultadoM1.setBackground(Color.BLACK);
     jLabel3.setForeground(Color.yellow);

    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        BtnM2 = new javax.swing.JButton();
        BtnM1 = new javax.swing.JButton();
        Btndata = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextDiv = new javax.swing.JTextField();
        PanelM2 = new javax.swing.JPanel();
        panel4 = new javax.swing.JScrollPane();
        ResultadoM2 = new javax.swing.JTextArea();
        FondoM2 = new javax.swing.JLabel();
        PanelM1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JScrollPane();
        ResultadoM1 = new javax.swing.JTextArea();
        FondoM1 = new javax.swing.JLabel();
        TiemM1 = new javax.swing.JLabel();
        TiemM2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnM2.setText("StarCon");
        BtnM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnM2ActionPerformed(evt);
            }
        });
        Panel1.add(BtnM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, -1, -1));

        BtnM1.setText("Star");
        BtnM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnM1ActionPerformed(evt);
            }
        });
        Panel1.add(BtnM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        Btndata.setText("Star");
        Btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndataActionPerformed(evt);
            }
        });
        Panel1.add(Btndata, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Dimensiones de la matriz");
        Panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 40));
        Panel1.add(TextDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 60, -1));

        PanelM2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultadoM2.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoM2.setColumns(20);
        ResultadoM2.setForeground(new java.awt.Color(255, 255, 255));
        ResultadoM2.setRows(5);
        ResultadoM2.setCaretColor(new java.awt.Color(255, 255, 255));
        panel4.setViewportView(ResultadoM2);

        PanelM2.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 180));

        FondoM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f1.jpeg"))); // NOI18N
        PanelM2.add(FondoM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 320, 210));

        Panel1.add(PanelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 330, 220));

        PanelM1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultadoM1.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoM1.setColumns(20);
        ResultadoM1.setForeground(new java.awt.Color(255, 255, 255));
        ResultadoM1.setRows(5);
        ResultadoM1.setCaretColor(new java.awt.Color(255, 255, 255));
        panel3.setViewportView(ResultadoM1);

        PanelM1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 180));

        FondoM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f1.jpeg"))); // NOI18N
        PanelM1.add(FondoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 320, 210));

        Panel1.add(PanelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 220));

        TiemM1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        TiemM1.setText("0:00 Ms");
        Panel1.add(TiemM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        TiemM2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        TiemM2.setText("0:00 Ms");
        Panel1.add(TiemM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 50, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiempo");
        Panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 50, 20));

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f2.jpg"))); // NOI18N
        Panel1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 530));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnM1ActionPerformed
     
        if(aux > 0){
          ResultadoM1.setText("");
          ResultadoM1.setForeground(Color.yellow);
          String TimeM;
            sec = 0;
            SecuencialMatrix();
            //System.out.println(sec + " ms ");
            
            TimeM = Long.toString(sec);
            TiemM1.setText(TimeM + " Ms ");
            TiemM1.setForeground(Color.blue);
     }
     else{
         JOptionPane.showMessageDialog(null, "data in matrix cannot be zero or less");
      }
    }//GEN-LAST:event_BtnM1ActionPerformed

    private void BtnM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnM2ActionPerformed
     if(aux > 0){
        ResultadoM2.setText("");
        ResultadoM2.setForeground(Color.yellow);
        
         String TimeM;
         Concu = 0;
         Forkjoinmatrix();
         TimeM = Long.toString(Concu);
         TiemM2.setText(TimeM + " Ms ");
         TiemM2.setForeground(Color.red);
     }
     else{
     JOptionPane.showMessageDialog(null, "data in matrix cannot be zero or less");//1334756
     }
    }//GEN-LAST:event_BtnM2ActionPerformed

    private void BtndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndataActionPerformed
        // TODO add your handling code here:
      aux =Integer.parseInt(TextDiv.getText());
          if(aux > 0){
            
           }
          else {
           JOptionPane.showMessageDialog(null, "data in matrix cannot be zero or less");
          }
    }//GEN-LAST:event_BtndataActionPerformed

    public void SecuencialMatrix (){
        sec = 0;
     long startTime = System.currentTimeMillis();   
        int[][] matrixA = new int[aux][aux]; //{{3,1,-2},{0,4,2},{7,5,1}}; 
        int[][] matrixB = new int[aux][aux]; //{{-1,0,8},{3,6,9},{0,0,3}};
        int[][] result = new int[aux][aux];
        
       
          
         
            logica  matrix1 = new logica( matrixA, matrixB, result,aux,ResultadoM1);
            matrix1.matrices(); 
            
          
            
             long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido en milisegundos en secuencias: " + elapsedTime);
        sec =  elapsedTime;
    }
    public void Forkjoinmatrix(){
    
      long startTime = System.currentTimeMillis(); 
      
        int[][] matrixA = new int[aux][aux]; //{{3,1,-2},{0,4,2},{7,5,1}}; 
        int[][] matrixB = new int[aux][aux]; //{{-1,0,8},{3,6,9},{0,0,3}};
        int[][] result = new int[aux][aux];
        
        // Inicializa las matrices con valores aleatorios

               datosMatris( matrixA);
               datosMatris (matrixB);
         
             
        // Crea una instancia de ForkJoinPool y ejecuta la tarea
        ForkJoinPool pool = new ForkJoinPool();
        ForkjoinMatrix task = new ForkjoinMatrix(matrixA, matrixB, result, 0, aux, 0, aux);
        
        pool.invoke(task);
        show(result,ResultadoM2);
        
       long endTime = System.currentTimeMillis();
       long AllTime = endTime - startTime;   
       System.out.println("Tiempo transcurrido en milisegundos en concurente Thread: " + AllTime);
       Concu = AllTime;
    
    }

    
    
     private  void show(int[][] result, JTextArea res2) {
         System.out.println("\nThread ");
      
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < aux; j++) {
                res2.append(Integer.toString(result[i][j]) + " ");
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
             res2.append("\n");
        }
    }
    
      public  void datosMatris (int[][] x ){
             int mid = aux/2;
             
            
          datosMatris runnables1 = new datosMatris(x, 0, mid-1);
          datosMatris runnables2 = new datosMatris(x, mid, aux -1);
            
          Thread thread1 = new Thread(runnables1);
          Thread thread2 = new Thread(runnables2);
          
          thread1.start();
          thread2.start();
          
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Proyecto_prueva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Proyecto_prueva.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          int[][] combina = unir(x);
          
        /* for(int i = 0; i < aux ; i++){
             for(int j = 0; j < aux ; j++){
                x[i][j]= rand.nextInt(100);
             }
         }
         //show(x); */
   
     }
   
      public  int [][] unir(int [][] x){
          int[][] cobina = new int[x.length][x[0].length];
            
              for(int i = 0; i < x.length;  i++){
                  for(int j = 0; j <x[i].length; j++){
                      
                  }
              }
            
          return cobina;
      }
      
    /**
     * @param args the command line arguments
     */
      
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnM1;
    private javax.swing.JButton BtnM2;
    private javax.swing.JButton Btndata;
    private javax.swing.JLabel FondoM1;
    private javax.swing.JLabel FondoM2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelM1;
    private javax.swing.JPanel PanelM2;
    private javax.swing.JTextArea ResultadoM1;
    private javax.swing.JTextArea ResultadoM2;
    private javax.swing.JTextField TextDiv;
    private javax.swing.JLabel TiemM1;
    private javax.swing.JLabel TiemM2;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane panel3;
    private javax.swing.JScrollPane panel4;
    private javax.swing.JScrollPane panel5;
    // End of variables declaration//GEN-END:variables
}
