/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import com.sun.java.swing.plaf.windows.WindowsScrollBarUI;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.internal.objects.NativeJava.extend;


import static proj.Connections.con;
import proj.Mainn.LabelRenderer;

/**
 *
 * @author emadmohamed
 */
public class print extends javax.swing.JFrame {


    /**
     * Creates new form print
     */
public TableCellRenderer gh=new Texttablecenter();
    int x;
    int y;
    static boolean miximum=true ;
     private JFileChooser jfc=new JFileChooser();
     public int ff;
     Statement st;
     ResultSet rs;
       private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public print() {
        
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        
        
        initComponents();
        
        
        
        
        
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(); 
       jTable1.setRowHeight(30);
 
        this.setLocationRelativeTo(this);
        kButton1.setCursor(new Cursor(HAND_CURSOR));
        kButton2.setCursor(new Cursor(HAND_CURSOR));
        kButton3.setCursor(new Cursor(HAND_CURSOR));
        kButton8.setCursor(new Cursor(HAND_CURSOR));
        getnm();
        
        jPanel10.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "تفاصيل رب الاسرة", TitledBorder.RIGHT, TitledBorder.TOP));
        ((javax.swing.border.TitledBorder) jPanel10.getBorder()).
        setTitleFont(new Font("Arial", Font.BOLD, 18));
        jPanel10.repaint();
        
        jPanel5.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "تفاصيل افراد الاسرة", TitledBorder.RIGHT, TitledBorder.TOP));
        ((javax.swing.border.TitledBorder) jPanel5.getBorder()).
        setTitleFont(new Font("Arial", Font.BOLD, 18));
        jPanel5.repaint();
        
        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.getVerticalScrollBar().setUI(new WindowsScrollBarUI());
        jTable1.setBackground(Color.WHITE);
  
    
        
        Font tr=null;
        Font tt=null;
     try{
         tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("TanseekModernProArabic-Medium.ttf"));
         tr=tr.deriveFont(Font.BOLD,22);
        jTable1.setFont(tr);
       
        
        /*
          tt=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("GaliModern-ExtraBold.otf"));
         tt=tt.deriveFont(Font.PLAIN,12);           
           jLabel8.setFont(tt);
            jLabel9.setFont(tt);
             jLabel10.setFont(tt);
              jLabel11.setFont(tt);
               jLabel12.setFont(tt);
                jLabel14.setFont(tt);
                 jComboBox1.setFont(tt);
                 jTextField7.setFont(tt);
        jTextField8.setFont(tt);
        jTextField9.setFont(tt);
        jRadioButton3.setFont(tt);
         jRadioButton4.setFont(tt); */
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     
      jComboBox1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       jTextField7.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       jTextField8.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       jTextField9.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
     
 jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
      
       
    jTable1.setOpaque(false);
        
        Font trr=null;
     try{
        trr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         trr=trr.deriveFont(Font.BOLD,24);
        
            kButton8.setFont(tr);
           
          
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
        
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
        jPanel1 = new javax.swing.JPanel();
        pnltitle = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kButton8 = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1297, 711));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnltitle.setBackground(new java.awt.Color(39, 47, 48));
        pnltitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnltitleMouseDragged(evt);
            }
        });
        pnltitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnltitleMousePressed(evt);
            }
        });

        kButton3.setBackground(new java.awt.Color(38, 128, 207));
        kButton3.setForeground(new java.awt.Color(38, 128, 207));
        kButton3.setkBackGroundColor(new java.awt.Color(38, 128, 207));
        kButton3.setkBorderRadius(45);
        kButton3.setkEndColor(new java.awt.Color(38, 128, 207));
        kButton3.setkForeGround(new java.awt.Color(38, 128, 207));
        kButton3.setkHoverColor(new java.awt.Color(38, 128, 207));
        kButton3.setkHoverEndColor(new java.awt.Color(38, 128, 207));
        kButton3.setkHoverForeGround(new java.awt.Color(38, 128, 207));
        kButton3.setkHoverStartColor(new java.awt.Color(38, 128, 207));
        kButton3.setkIndicatorColor(new java.awt.Color(38, 128, 207));
        kButton3.setkPressedColor(new java.awt.Color(38, 128, 207));
        kButton3.setkSelectedColor(new java.awt.Color(38, 128, 207));
        kButton3.setkStartColor(new java.awt.Color(38, 128, 207));
        kButton3.setOpaque(false);
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton1.setBackground(new java.awt.Color(190, 207, 38));
        kButton1.setForeground(new java.awt.Color(190, 207, 38));
        kButton1.setkBackGroundColor(new java.awt.Color(190, 207, 38));
        kButton1.setkBorderRadius(45);
        kButton1.setkEndColor(new java.awt.Color(190, 207, 38));
        kButton1.setkForeGround(new java.awt.Color(190, 207, 38));
        kButton1.setkHoverColor(new java.awt.Color(190, 207, 38));
        kButton1.setkHoverEndColor(new java.awt.Color(190, 207, 38));
        kButton1.setkHoverForeGround(new java.awt.Color(190, 207, 38));
        kButton1.setkHoverStartColor(new java.awt.Color(190, 207, 38));
        kButton1.setkIndicatorColor(new java.awt.Color(190, 207, 38));
        kButton1.setkPressedColor(new java.awt.Color(190, 207, 38));
        kButton1.setkSelectedColor(new java.awt.Color(190, 207, 38));
        kButton1.setkStartColor(new java.awt.Color(190, 207, 38));
        kButton1.setOpaque(false);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setBackground(new java.awt.Color(255, 0, 0));
        kButton2.setForeground(new java.awt.Color(255, 0, 0));
        kButton2.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton2.setkBorderRadius(45);
        kButton2.setkEndColor(new java.awt.Color(255, 0, 0));
        kButton2.setkForeGround(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton2.setkIndicatorColor(new java.awt.Color(255, 0, 0));
        kButton2.setkPressedColor(new java.awt.Color(255, 0, 0));
        kButton2.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton2.setkStartColor(new java.awt.Color(255, 0, 0));
        kButton2.setOpaque(false);
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("DecoType Naskh Extensions", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("جمـعيــة شبـاب الخـيـر الخيـريــة");

        javax.swing.GroupLayout pnltitleLayout = new javax.swing.GroupLayout(pnltitle);
        pnltitle.setLayout(pnltitleLayout);
        pnltitleLayout.setHorizontalGroup(
            pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltitleLayout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnltitleLayout.setVerticalGroup(
            pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltitleLayout.createSequentialGroup()
                .addGroup(pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnltitleLayout.createSequentialGroup()
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer-48.png"))); // NOI18N
        kButton8.setText("طباعة");
        kButton8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        kButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton8.setIconTextGap(5);
        kButton8.setkBackGroundColor(new java.awt.Color(190, 207, 38));
        kButton8.setkBorderRadius(15);
        kButton8.setkEndColor(new java.awt.Color(190, 207, 38));
        kButton8.setkHoverEndColor(new java.awt.Color(190, 207, 38));
        kButton8.setkHoverForeGround(new java.awt.Color(190, 207, 38));
        kButton8.setkHoverStartColor(new java.awt.Color(190, 207, 38));
        kButton8.setkSelectedColor(new java.awt.Color(190, 207, 38));
        kButton8.setkStartColor(new java.awt.Color(190, 207, 38));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("أسم رب الاسرة");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("رقم الهاتف");

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("المنطقة");

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("المحافظة");

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("تصنيف");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setText("فقراء");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setText("أيتام");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/picture-attachment-128.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("صورة رب الاسرة");

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 268, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 169, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnltitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        if(miximum){
            print.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
            print.this.setMaximizedBounds(ge.getMaximumWindowBounds());
            miximum=false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            miximum=true;
        }

    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
      dispose();
         
    }//GEN-LAST:event_kButton2ActionPerformed

    private void pnltitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnltitleMouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_pnltitleMouseDragged

    private void pnltitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnltitleMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_pnltitleMousePressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        int ff=jfc.showOpenDialog(null);
        if(ff==jfc.APPROVE_OPTION){
            File file=jfc.getSelectedFile();
            BufferedImage chosen_picture = null;
            try

            {

                chosen_picture = ImageIO.read(file);

            }

            catch (final IOException not_action)

            {

                not_action.printStackTrace();

            }

            jLabel13.setIcon(new ImageIcon(chosen_picture));
        }

    }//GEN-LAST:event_jLabel13MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     Font ff=null;
     try{
         ff=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("GaliModern-ExtraBold.otf"));
         ff=ff.deriveFont(Font.PLAIN,24);
         lbltitle.setFont(ff);
      
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
get();

    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                
            model.setColumnCount(0);
            model.setRowCount(0);
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
   printRecord(jPanel4);
    }//GEN-LAST:event_kButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton8;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel pnltitle;
    // End of variables declaration//GEN-END:variables

    
    public void getnm(){
        
      String sql="SELECT * FROM PERSON  ";  
        
        con=Connections.getConnection();
       try{ st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            String a=rs.getString("name");
      jComboBox1.addItem(a);
        
        
    }
       }catch(Exception e){
           
       }
    
    }
    
    public void get(){
   
   
  String g="",h="",j="";
  Date i;
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

   
   
   
        
jTable1 = new  JTable(model);
model.addColumn("المهنة");
model.addColumn("المواليد");
model.addColumn("الجنس");
model.addColumn("اسماء العائلة");



    con=Connections.getConnection();
    String sql="SELECT  PERSON.name, PERSON.ADDRESS,PERSON.regin, PERSON.PHONE,PERSON.HUMAN, PERSON.PHOTO,SON.name as qq,SON.gander,SON.birth,SON.JOB FROM PERSON INNER JOIN SON ON PERSON.PERSONID=SON.PERSONID where PERSON.name='"+jComboBox1.getSelectedItem().toString()+"'";
    
    try{
        
        
        st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            String a=rs.getString("name");
            String b=rs.getString("ADDRESS");
            String c=rs.getString("regin");
            String d=rs.getString("PHONE");
            String e=rs.getString("HUMAN");
            //byte[] f=rs.getBytes("PHOTO");
            g=rs.getString("qq");
             h=rs.getString("gander");
             i=rs.getDate("birth");
             j=rs.getString("JOB");
            
      
           
            jTextField9.setText(b);
            jTextField8.setText(c);
            jTextField7.setText(d);
            if(e.equals("فقراء")){
                jRadioButton3.setSelected(true);
                jRadioButton4.setSelected(false);
            } else{
                jRadioButton4.setSelected(true);
                jRadioButton3.setSelected(false); 
            }
            
             BufferedImage bImage = null;
           
              File initialImage = new File("mcfi/"+jComboBox1.getSelectedItem()+".png");
             bImage = ImageIO.read(initialImage);
             

             
            ImageIcon tt=new ImageIcon(bImage);
            Image img=tt.getImage();
            Image o=img.getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon mg=new ImageIcon(o);
            jLabel13.setIcon(mg);
            
   

   
 
    
 model.addRow(new Object[]{j, i,h,g});  


    }
            }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}


 private void printRecord(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("Print Record");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(0.6, 0.6);
                
                // Now paint panel as graphics2D
                jPanel4.paint(graphics2D);
                
                // return if page exists
                return Printable.PAGE_EXISTS;
            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
            }catch (PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
            }
        }
    }
  

}
