/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;
public class StudentGUI extends javax.swing.JFrame {
    private Student[] students=new Student[2];
    private int currIndex=0;
    public StudentGUI() {
        initComponents();
        students[0]=new Student();
        students[1]=new Student();
        refreshFrame();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CurrIndexLabel = new javax.swing.JLabel();
        NameF = new javax.swing.JTextField();
        M1F = new javax.swing.JTextField();
        M2F = new javax.swing.JTextField();
        M3F = new javax.swing.JTextField();
        AverageF = new javax.swing.JTextField();
        FarLeft = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        Set = new javax.swing.JButton();
        FarRight = new javax.swing.JButton();
        DiceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student GUI");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Mark 1");

        jLabel3.setText("Mark 2");

        jLabel4.setText("Mark 3");

        jLabel5.setText("Average");

        CurrIndexLabel.setText("Current Index: 0");

        NameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFActionPerformed(evt);
            }
        });

        AverageF.setEditable(false);

        FarLeft.setText("<<");
        FarLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarLeftActionPerformed(evt);
            }
        });

        Right.setText(">");
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });

        Left.setText("<");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });

        Set.setText("Set");
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });

        FarRight.setText(">>");
        FarRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarRightActionPerformed(evt);
            }
        });

        DiceButton.setText("Dice");
        DiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(M3F)
                                .addComponent(M2F)
                                .addComponent(M1F)
                                .addComponent(NameF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AverageF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FarLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Left))
                            .addComponent(DiceButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CurrIndexLabel)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Right)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FarRight))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(M1F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(M2F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(M3F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AverageF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FarLeft)
                    .addComponent(Right)
                    .addComponent(Left)
                    .addComponent(Set)
                    .addComponent(FarRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrIndexLabel)
                    .addComponent(DiceButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void refreshFrame()
    {
        NameF.setText(students[currIndex].getName());
        AverageF.setText("" + students[currIndex].getAverage());
        M1F.setText("" + students[currIndex].getMark(1));
        M2F.setText("" + students[currIndex].getMark(2));
        M3F.setText("" + students[currIndex].getMark(3));
        CurrIndexLabel.setText("Current Index: " + currIndex);
    }
    private void addToStudents()
    {
        Student[] temp=new Student[students.length+1];
        for(int i=0;i<students.length;i++)
        {
            temp[i]=students[i];
        }
        students=new Student[temp.length];
        for(int i=0;i<temp.length;i++)
        {
            students[i]=temp[i];
        }
        students[students.length-1]=new Student();
    }
    private void NameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFActionPerformed

    private void FarLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarLeftActionPerformed
        currIndex=0;
        refreshFrame();
    }//GEN-LAST:event_FarLeftActionPerformed

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    }//GEN-LAST:event_formMouseWheelMoved

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
        if(currIndex==0)
        currIndex=0;
        else currIndex--;
        refreshFrame();
    }//GEN-LAST:event_LeftActionPerformed

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
        if(currIndex==(students.length-1))
        {
            addToStudents();
            currIndex=students.length-1;
        }
        else currIndex++;
        refreshFrame();
    }//GEN-LAST:event_RightActionPerformed

    private void FarRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarRightActionPerformed
        currIndex=students.length-1;
        refreshFrame();
    }//GEN-LAST:event_FarRightActionPerformed

    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        try
        {
            students[currIndex].setName(NameF.getText());
            students[currIndex].setMark(1, Integer.parseInt(M1F.getText()));
            students[currIndex].setMark(2, Integer.parseInt(M2F.getText()));
            students[currIndex].setMark(3, Integer.parseInt(M3F.getText()));
            refreshFrame();
        }
        catch(NumberFormatException ex){System.out.println(ex);}
    }//GEN-LAST:event_SetActionPerformed

    private void DiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiceButtonActionPerformed
        Dice d=new Dice(this);
        this.setVisible(false);
        d.show(true);
    }//GEN-LAST:event_DiceButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AverageF;
    private javax.swing.JLabel CurrIndexLabel;
    private javax.swing.JButton DiceButton;
    private javax.swing.JButton FarLeft;
    private javax.swing.JButton FarRight;
    private javax.swing.JButton Left;
    private javax.swing.JTextField M1F;
    private javax.swing.JTextField M2F;
    private javax.swing.JTextField M3F;
    private javax.swing.JTextField NameF;
    private javax.swing.JButton Right;
    private javax.swing.JButton Set;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
