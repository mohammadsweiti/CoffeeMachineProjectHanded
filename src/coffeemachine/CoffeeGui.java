/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeemachine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author ttc
 */
public class CoffeeGui extends javax.swing.JFrame  implements Serializable{
    CoffeeMachineParent m = new CoffeeMachineParent();
    
   /* public void log (){
        try{
        File file = new File("coffeMachineState");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)) ;
        oos.writeObject(m);
        oos.close();}
        catch(Exception ex){
            //JOptionPane.showMessageDialog(this , "write on file ");
        }
    }*/
    /**
     * Creates new form CoffeeGui
     */
    public CoffeeGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        singleRadioButton = new javax.swing.JRadioButton();
        doubleRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        espressoRadioButton = new javax.swing.JRadioButton();
        americanoRadioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        glinderSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        waterProgress = new javax.swing.JProgressBar();
        coffeeProgress = new javax.swing.JProgressBar();
        waterExist = new javax.swing.JLabel();
        coffeExist = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TrashExistingProgressBar = new javax.swing.JProgressBar();
        TrashLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Machine ");

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome ");

        buttonGroup1.add(singleRadioButton);
        singleRadioButton.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        singleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        singleRadioButton.setSelected(true);
        singleRadioButton.setText("single");
        singleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(doubleRadioButton);
        doubleRadioButton.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        doubleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        doubleRadioButton.setText("double ");
        doubleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("select your cup size  ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("select your coffee type  ");

        buttonGroup2.add(espressoRadioButton);
        espressoRadioButton.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        espressoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        espressoRadioButton.setSelected(true);
        espressoRadioButton.setText("Espresso");
        espressoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espressoRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(americanoRadioButton);
        americanoRadioButton.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        americanoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        americanoRadioButton.setText("Americano ");

        jButton1.setText("Make Coffee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        glinderSlider.setMajorTickSpacing(1);
        glinderSlider.setMaximum(10);
        glinderSlider.setMinimum(1);
        glinderSlider.setPaintLabels(true);
        glinderSlider.setPaintTicks(true);

        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Glinding degree");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(singleRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(espressoRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(doubleRadioButton)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(americanoRadioButton)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(glinderSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRadioButton)
                    .addComponent(doubleRadioButton))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espressoRadioButton)
                    .addComponent(americanoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(glinderSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Make Coffee", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jButton3.setText("Fill Water");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jButton4.setText("Fill Coffee");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton5.setText("Add water Quantity");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jButton6.setText("Add Coffee Quantity");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel4.setText("Existing Water ");

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel5.setText("Existing Coffee ");

        waterExist.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        waterExist.setText("0%");

        coffeExist.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        coffeExist.setText("0%");

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setText("Clear Trash");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel7.setText("Existing Trash ");

        TrashLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TrashLabel.setText("0%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(waterProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(waterExist, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(coffeeProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(coffeExist, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TrashExistingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TrashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(waterProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterExist))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coffeeProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(coffeExist))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrashExistingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );

        jTabbedPane1.addTab("Fill Coffee", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleRadioButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        m.getWater().fillWater();
        waterProgress.setMaximum((int)m.getWater().getCapacity());
        waterProgress.setMinimum(0);
        waterProgress.setValue((int)m.getWater().getLevel());
        waterExist.setText(100+" %");
        m.getLog().log("the macine is full Water ");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        m.getBeans().fillCoffee();
        coffeeProgress.setMaximum((int ) (m.getBeans().getArabic().getCapacity()+m.getBeans().getRoubusta().getCapacity()));
        coffeeProgress.setMinimum(0);
        coffeeProgress.setValue((int )(m.getBeans().getArabic().getExistingQuantity()+m.getBeans().getRoubusta().getExistingQuantity()));
        coffeExist.setText( 100+" % ");
        m.getLog().log("\nthe machine is full of Coffe \n");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
        String str = JOptionPane.showInputDialog(this, " the  quantity of water you entered in milleter  ");
        int q = Integer.parseInt(str);
         m.getWater().addWater(q);
         m.getLog().log("\n we add "+q+" millter of water \n");
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(this, "you must enter an integer value");
        }
        
       
        waterProgress.setMaximum((int)m.getWater().getCapacity());
        waterProgress.setMinimum(0);
        waterProgress.setValue((int)m.getWater().getLevel());
        waterExist.setText(m.getWater().getLevel()/m.getWater().getCapacity()*100+" %");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
         String str = JOptionPane.showInputDialog(this, " the  quantity of cofee you entered in ghram  ");
        int q = Integer.parseInt(str);
        m.getBeans().addCoffee(q);
        m.getLog().log("\nwe add "+ q+"of coffe\n ");}
        catch(Exception ex )
        {
            JOptionPane.showMessageDialog(this, "you must enter an integer value");
        }
        double  capcity = m.getBeans().getArabic().getCapacity()+m.getBeans().getRoubusta().getCapacity();
        double exist = (m.getBeans().getArabic().getExistingQuantity()+m.getBeans().getRoubusta().getExistingQuantity());
         coffeeProgress.setMaximum((int )capcity);
        coffeeProgress.setMinimum(0);
        coffeeProgress.setValue((int )exist);
        coffeExist.setText(( exist/capcity * 100)+" % ");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void espressoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espressoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espressoRadioButtonActionPerformed

    private void doubleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doubleRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (singleRadioButton.isSelected() == true   )
      
            if (espressoRadioButton.isSelected()  == true  )
                m.makeCoffee(1, 1, glinderSlider.getValue());
            else 
                m.makeCoffee(2, 1, glinderSlider.getValue());
            
            else
        {
            if (espressoRadioButton.isSelected() == true )
            {
                m.makeCoffee(1, 2, glinderSlider.getValue());
            }
            else 
            {
                m.makeCoffee(2, 2, glinderSlider.getValue());
            }
        }
        
          double  capcity = m.getBeans().getArabic().getCapacity()+m.getBeans().getRoubusta().getCapacity();
        double exist = (m.getBeans().getArabic().getExistingQuantity()+m.getBeans().getRoubusta().getExistingQuantity());
        
        coffeeProgress.setValue((int )exist);
        coffeExist.setText(( exist/capcity * 100)+" % ");
        waterProgress.setValue((int)m.getWater().getLevel());
        waterExist.setText(m.getWater().getLevel()/m.getWater().getCapacity()*100+" %");
        TrashExistingProgressBar.setValue((int)m.getTrash().getLevel());
        TrashLabel.setText(((m.getTrash().getLevel())/m.getTrash().getCapacity()*100)+" % ");
         m.getLog().log(" \nafter making a cup : \n the existing coffe is  "+ exist + "\n existing water is " + m.getWater().getLevel()+ "\n waste tray contain "+m.getTrash().getLevel()+"the giding degree "+ m.getGlind().getDegree()+"\n");
         
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        m.getTrash().clear();
        TrashExistingProgressBar.setValue((int)m.getTrash().getLevel());
         TrashLabel.setText(m.getTrash().getLevel()/m.getTrash().getCapacity()+" % ");
         m.getLog().log("\nthe trash is cleaned\n ");
    }//GEN-LAST:event_jButton2ActionPerformed
     
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
            java.util.logging.Logger.getLogger(CoffeeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar TrashExistingProgressBar;
    private javax.swing.JLabel TrashLabel;
    private javax.swing.JRadioButton americanoRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel coffeExist;
    private javax.swing.JProgressBar coffeeProgress;
    private javax.swing.JRadioButton doubleRadioButton;
    private javax.swing.JRadioButton espressoRadioButton;
    private javax.swing.JSlider glinderSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton singleRadioButton;
    private javax.swing.JLabel waterExist;
    private javax.swing.JProgressBar waterProgress;
    // End of variables declaration//GEN-END:variables
}
