package programa7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import programa7.*;
public class Interfaz extends javax.swing.JFrame implements ActionListener{
    int filas =5;
    int columnas=5;
    int tamX;
    int tamY;
    public int[][] memorias, recuperacion,mx,mn;
    JButton[][] memoria,recuperar,max;
    ArrayList<Aprendizaje> memoriasA = new ArrayList<Aprendizaje>();
    ArrayList<int[][]> resultados= new ArrayList<int[][]>();
    
    public Interfaz() {
        initComponents();
        btnGuardar.setEnabled(false);
        btnRecuperar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    public int[][] unos(JButton[][] matrix){
        int [][] zero = new int[filas][columnas];
        for(int i =0;i<filas;i++){
                for (int j=0;j<columnas;j++){
                    zero[i][j]=1;
                    matrix[i][j].setBackground(Color.white);
                }
        }
        return zero;
    }    
    public void noPrecionar(JButton[][] matrix){
        for(int i =0;i<filas;i++){
                for (int j=0;j<columnas;j++){
                    //matrix[i][j].setEnabled(false);
                }
            }
    }
    
    
    
    public JButton[][] setMatrix( JPanel panel){
        JButton[][] matrix = new JButton[filas][columnas];
        tamX = panel.getHeight()/columnas;
        tamY = panel.getWidth()/filas;
        int x=0;
        int y=0;
        for(int i =0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                matrix[i][j]= new JButton();
                matrix[i][j].setBackground(Color.white);
                matrix[i][j].setBounds(x,y,tamX,tamY);
                panel.add(matrix[i][j]);
                x=x+tamX;
                
                
                matrix[i][j].addActionListener(this);
            }
            x=0;
            y=y+tamY;
        }
     return matrix;   
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        entrenamiento = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        ingresa = new javax.swing.JPanel();
        recuperado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRecuperar = new javax.swing.JButton();
        ancho = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        alto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MEMORIA ASOCIATIVA ALFA BETA");

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR MEMORIA");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        entrenamiento.setBackground(new java.awt.Color(245, 255, 245));
        entrenamiento.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout entrenamientoLayout = new javax.swing.GroupLayout(entrenamiento);
        entrenamiento.setLayout(entrenamientoLayout);
        entrenamientoLayout.setHorizontalGroup(
            entrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        entrenamientoLayout.setVerticalGroup(
            entrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 51));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        ingresa.setBackground(new java.awt.Color(245, 255, 245));
        ingresa.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout ingresaLayout = new javax.swing.GroupLayout(ingresa);
        ingresa.setLayout(ingresaLayout);
        ingresaLayout.setHorizontalGroup(
            ingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        ingresaLayout.setVerticalGroup(
            ingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        recuperado.setBackground(new java.awt.Color(245, 255, 245));
        recuperado.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout recuperadoLayout = new javax.swing.GroupLayout(recuperado);
        recuperado.setLayout(recuperadoLayout);
        recuperadoLayout.setHorizontalGroup(
            recuperadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        recuperadoLayout.setVerticalGroup(
            recuperadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("RECUPERADO");

        btnRecuperar.setBackground(new java.awt.Color(255, 255, 204));
        btnRecuperar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(0, 51, 51));
        btnRecuperar.setText("RECUPERAR");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });

        ancho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anchoKeyTyped(evt);
            }
        });

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        alto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                altoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ANCHO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ALTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnRecuperar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(53, 53, 53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGenerar)
                            .addComponent(btnSalir))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recuperado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(47, 47, 47)))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(65, 65, 65))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerar)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recuperado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRecuperar)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
        Aprendizaje img = new Aprendizaje(memorias,columnas, filas);
        memoriasA.add(img);
        memorias = unos(memoria);
        btnRecuperar.setEnabled(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        Recuperacion recu = new Recuperacion(recuperacion,memoriasA,filas,columnas);
        resultados = recu.getResultados();
        
        for(int i=0;i<resultados.size();i++){
            int matriz[][] = resultados.get(i);
            for(int y =0;y<filas;y++){
                for(int x=0;x<columnas;x++){
                    if(matriz[y][x]==0) max[y][x].setBackground(Color.black);
                    else max[y][x].setBackground(Color.white);
                }
            
            }
        
        }
        resultados.clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        columnas = Integer.parseInt(ancho.getText());
        filas = Integer.parseInt(alto.getText());
        memoria = setMatrix(entrenamiento);    
        recuperar= setMatrix(ingresa); 
        max = setMatrix(recuperado); 
        noPrecionar(max);
        memorias = unos(memoria);
        recuperacion = unos(recuperar);
        btnGuardar.setEnabled(true);
        btnGenerar.setEnabled(false);
        ancho.setText("");
        alto.setText("");
        ancho.setEnabled(false);
        alto.setEnabled(false);
        btnEliminar.setEnabled(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void anchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anchoKeyTyped
        //Se devuelve lo que esta escrito en el cuadro de texto
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica que no se ingresen letras
        if (!numeros)
            {
                evt.consume();
            }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_anchoKeyTyped

    private void altoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altoKeyTyped
        //Se devuelve lo que esta escrito en el cuadro de texto
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica que no se ingresen letras
        if (!numeros)
            {
                evt.consume();
            }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_altoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        memorias = unos(memoria);
        recuperacion = unos(recuperar);
        mx = unos(max);     
        resultados.clear();
        memoriasA.clear();
        
        btnGenerar.setEnabled(true);
        ancho.setEnabled(true);
        alto.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnRecuperar.setEnabled(false);
        btnEliminar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
   

        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i =0;i<filas;i++){
                for (int j=0;j<columnas;j++){
                    if(e.getSource().equals(memoria[i][j])){
                        if(memoria[i][j].getBackground()==Color.white){
                            memoria[i][j].setBackground(Color.black);
                            memorias[i][j] = 0;
                            
                        }
                        else{
                            memoria[i][j].setBackground(Color.white);
                            memorias[i][j] = 1;
                            
                        }
                         
                    }
                     if(e.getSource().equals(recuperar[i][j])){
                        if(recuperar[i][j].getBackground()==Color.white){
                            recuperar[i][j].setBackground(Color.black);
                            recuperacion[i][j]=0;
                        }
                        else{
                            recuperar[i][j].setBackground(Color.white);
                            recuperacion[i][j]=1;
                        }
                    }
                }
            }
        }
        

    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alto;
    private javax.swing.JTextField ancho;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel entrenamiento;
    private javax.swing.JPanel ingresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel recuperado;
    // End of variables declaration//GEN-END:variables
}

