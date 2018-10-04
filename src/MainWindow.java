
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        radioButtonGroup = new javax.swing.ButtonGroup();
        imagePanel = new javax.swing.JPanel();
        canvas = new Canvas();
        imageSelector = new javax.swing.JPanel();
        crabImage = new javax.swing.JRadioButton();
        slothImage = new javax.swing.JRadioButton();
        lemurImage = new javax.swing.JRadioButton();
        filterSelector = new javax.swing.JPanel();
        smoothing = new javax.swing.JCheckBox();
        enhancement = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        imageSelector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radioButtonGroup.add(crabImage);
        crabImage.setText("Cangrejo");
        crabImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crabImageActionPerformed(evt);
            }
        });

        radioButtonGroup.add(slothImage);
        slothImage.setText("Perezoso");
        slothImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slothImageActionPerformed(evt);
            }
        });

        radioButtonGroup.add(lemurImage);
        lemurImage.setText("Lémur");
        lemurImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemurImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imageSelectorLayout = new javax.swing.GroupLayout(imageSelector);
        imageSelector.setLayout(imageSelectorLayout);
        imageSelectorLayout.setHorizontalGroup(
            imageSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageSelectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imageSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lemurImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crabImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slothImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        imageSelectorLayout.setVerticalGroup(
            imageSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageSelectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crabImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slothImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemurImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        filterSelector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        smoothing.setText("Suavizado");
        smoothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smoothingActionPerformed(evt);
            }
        });

        enhancement.setText("Realce");
        enhancement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enhancementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterSelectorLayout = new javax.swing.GroupLayout(filterSelector);
        filterSelector.setLayout(filterSelectorLayout);
        filterSelectorLayout.setHorizontalGroup(
            filterSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterSelectorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(filterSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(smoothing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enhancement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        filterSelectorLayout.setVerticalGroup(
            filterSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterSelectorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(smoothing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enhancement)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filterSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crabImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crabImageActionPerformed
        BufferedImage bI = getImage("Images\\crab.jpg");
        bI = checkFilters(bI);
        canvas.setBufferImage(bI);
        canvas.setPath("Images\\crab.jpg");
        repaint();
    }//GEN-LAST:event_crabImageActionPerformed

    private void slothImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slothImageActionPerformed
        BufferedImage bI = getImage("Images\\sloth.jpg");
        bI = checkFilters(bI);
        canvas.setBufferImage(bI);
        canvas.setPath("Images\\sloth.jpg");
        repaint();
    }//GEN-LAST:event_slothImageActionPerformed

    private void lemurImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemurImageActionPerformed
        BufferedImage bI = getImage("Images\\lemur.jpg");
        bI = checkFilters(bI);
        canvas.setBufferImage(bI);
        canvas.setPath("Images\\lemur.jpg");
        repaint();
    }//GEN-LAST:event_lemurImageActionPerformed

    private void smoothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smoothingActionPerformed
        String path = canvas.getPath();
        BufferedImage bI = getImage(path);
        bI = checkFilters(bI);
        canvas.setBufferImage(bI);
        canvas.setPath(path);
        repaint();
    }//GEN-LAST:event_smoothingActionPerformed

    private void enhancementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enhancementActionPerformed
        String path = canvas.getPath();
        BufferedImage bI = getImage(path);
        bI = checkFilters(bI);
        canvas.setBufferImage(bI);
        canvas.setPath(path);
        repaint();
    }//GEN-LAST:event_enhancementActionPerformed

    private BufferedImage getImage(String path) {
        BufferedImage bI = null;
        try {
            bI = ImageIO.read(new File(path));
        } catch(Exception e) {}
        return bI;
    }
    
    private BufferedImage checkFilters(BufferedImage bI) {
        if (smoothing.isSelected()) {
            bI = smoothImageFilter(bI);
        }
        if (enhancement.isSelected()) bI = enhancementImageFilter(bI);
        return bI;
    }
    
    private BufferedImage smoothImageFilter(BufferedImage bI) {
        float[] difuminar = {
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,
        };
        Kernel sharpkernel = new Kernel(3, 3, difuminar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        return sop.filter(bI, null);
    }
    
    private BufferedImage enhancementImageFilter(BufferedImage bI) {
        float[] resaltar = {
            0.f, -1.f, 0.f,
            -1.f, 5.0f, -1.f,
            0.f, -1.f, 0.f
        };
        Kernel sharpkernel = new Kernel(3, 3, resaltar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        return sop.filter(bI, null);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Canvas canvas;
    private javax.swing.JRadioButton crabImage;
    private javax.swing.JCheckBox enhancement;
    private javax.swing.JPanel filterSelector;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel imageSelector;
    private javax.swing.JRadioButton lemurImage;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JRadioButton slothImage;
    private javax.swing.JCheckBox smoothing;
    // End of variables declaration//GEN-END:variables
}
