
import ij.ImagePlus;
import ij.io.FileSaver;
import ij.process.FloatProcessor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balaji
 */
public class HMapGeneGUI extends javax.swing.JDialog {

    private File dataFile;
    private float [] xData;
    private  float [] yData;

    /**
     * Creates new form HMapGeneGUI
     */
    public HMapGeneGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        dataFile = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browseButton = new javax.swing.JButton();
        FileNameText = new javax.swing.JTextField();
        PathNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        byeButton = new javax.swing.JButton();
        genHMapButton = new javax.swing.JButton();
        xMaxtxt = new javax.swing.JTextField();
        yMaxtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        FileNameText.setEditable(false);

        PathNameText.setEditable(false);

        jLabel1.setText("PathName of the selected file:");

        jLabel2.setText("FileName of the selected file:");

        byeButton.setText("Bye");
        byeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byeButtonActionPerformed(evt);
            }
        });

        genHMapButton.setText("Generate HMap");
        genHMapButton.setEnabled(false);
        genHMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genHMapButtonActionPerformed(evt);
            }
        });

        xMaxtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xMaxtxt.setText("0");
        xMaxtxt.setAutoscrolls(false);

        yMaxtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yMaxtxt.setText("0");

        jLabel3.setText("x Dimension of video");

        jLabel4.setText("y Dimension of video");

        jLabel5.setText("in pixels");

        jLabel6.setText("in pixels");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(browseButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(FileNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(byeButton)
                .addGap(18, 18, 18)
                .addComponent(genHMapButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(yMaxtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(xMaxtxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(PathNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xMaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yMaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(byeButton)
                    .addComponent(genHMapButton))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(PathNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:
        
        JFileChooser FC = new JFileChooser();
        int status = FC.showDialog(this, "Choose watermaze data file");
        
        switch(status){
            case JFileChooser.APPROVE_OPTION:
                dataFile = FC.getSelectedFile();
                //JOptionPane.showMessageDialog(null,"Name is: "+dataFile.getName()+" Pathname is: "+dataFile.getAbsolutePath());
                FileNameText.setText(dataFile.getName());
                PathNameText.setText(dataFile.getParent());
                genHMapButton.setEnabled(true);
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                JOptionPane.showMessageDialog(null, "Error opening the file");
                dataFile = null;
                genHMapButton.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void byeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_byeButtonActionPerformed

    private void genHMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genHMapButtonActionPerformed
       
         int xMax = new Integer(xMaxtxt.getText());          // Dimensions of the image that would be used to create the HMap 
         int yMax = new Integer(yMaxtxt.getText());
         
         
         readAsciiXYData( /*xData, yData, this.dataFile*/);
         int imageData[][] = null;
         imageData = createimage(xData, yData, xMax , yMax);
         ImagePlus imp;
         imp = new ImagePlus("HeatMap", new FloatProcessor(imageData));
         imp.show();
            
         FileSaver Fs = new FileSaver(imp);
         Fs.saveAsTiff();
       
    }//GEN-LAST:event_genHMapButtonActionPerformed
 /**
  * 
  * @param xData     float array to store the x-data 
  * @param yData     float array to store the x-data 
  * @param dataFile  File object from where the X , Y Co-ordinates of the ASCII file is read. 
  * @return true if successful. 
  * 
  * This function reads the ascii data from a file assuming the data are saved in the format 
  * x1 \t y1 \n. It counts the number of new line (\n) to determine the number of data points 
  * to read. 
  */
    
    
    private boolean readAsciiXYData(/*float xData[], float yData[], File dataFile*/){
        
        
         try {
            // TODO add your handling code here:
             
            
            FileReader dataReader = new FileReader(this.dataFile);
            int byteRead =0;
            String xString = "", yString = "";
            boolean isTab = false;
            int dataCount = 0; 
            int nData = 0;
            //dataReader.mark();
            while((byteRead = dataReader.read()) != -1)
                    if(byteRead == '\n') nData++;
            //dataReader.reset();
            
            dataReader.close();
            dataReader = new FileReader(this.dataFile);
            
            this.xData = new float[nData+1];
            this.yData = new float[nData+1];
            
            while((byteRead = dataReader.read()) != -1){
                if(byteRead == '\n'){
                    dataCount++;
                    xData[dataCount] = new Float(xString);
                    yData[dataCount] = new Float(yString);
                   
                    
                    isTab = false; 
                    xString = "";
                    yString = "";
                }else{
                    if(byteRead == '\t'){
                        isTab = true; 
                    }else{
                        if(isTab)
                            yString += (char)byteRead;  // if this does not work the real thing should be 
                                                        // byteread - '0';
                        else
                            xString += (char)byteRead;
                    
                    }
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HMapGeneGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Exception occurred while reading the file: Ex. # is "+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(HMapGeneGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Please enter a valid number in the dimensions field");
        }
      return true;
 }
    private int [][] createimage(float[] dataX, float[] dataY, int xMax , int yMax) {
        int [][] Image = null;
        int xlen = dataX.length;
        int ylen = dataY.length;
        int xidx, yidx = 0;

        if(xlen != ylen)
            return null;
        Image = new int [xMax][yMax];

        for (int count = 0 ; count < xlen ; count++){
            xidx = (dataX[count] > 0 && dataX[count] < 1 ) ? 1 : (int)dataX[count];
            yidx = (dataY[count] > 0 && dataY[count] < 1) ? 1 : (int)dataY[count];
            if(xidx < xMax && yidx < yMax && xidx > 0 && yidx > 0)
                Image[xidx][yidx] += 10;
        }
            

        return Image.clone();
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
            java.util.logging.Logger.getLogger(HMapGeneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HMapGeneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HMapGeneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HMapGeneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HMapGeneGUI dialog = new HMapGeneGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FileNameText;
    private javax.swing.JTextField PathNameText;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton byeButton;
    private javax.swing.JButton genHMapButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField xMaxtxt;
    private javax.swing.JTextField yMaxtxt;
    // End of variables declaration//GEN-END:variables
}
