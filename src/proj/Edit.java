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
import java.awt.Font;
import java.awt.Frame;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
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
public class Edit extends javax.swing.JFrame {

    public String tu="";

    /**
     * Creates new form print
     */
public String nnm;
public String [] oo=new String[]{nnm};

DefaultComboBoxModel modd=new DefaultComboBoxModel(oo);

String extension = "";
 
    int x;
    int y;
    static boolean miximum=true ;
     private JFileChooser jfc=new JFileChooser();
     public int ff;
     Statement st;
     ResultSet rs;
     byte[] person=null;
     public int iidd=0;
     public int yyy;
        byte[] bytes=null;
        public String asd="";
        public String dsa="";
        File f=null;
        
        int nid=0;
        
        
    public Edit() {
       
        
        initComponents();
    
        this.setLocationRelativeTo(this);
        kButton1.setCursor(new Cursor(HAND_CURSOR));
        kButton2.setCursor(new Cursor(HAND_CURSOR));
        kButton3.setCursor(new Cursor(HAND_CURSOR));
        kButton8.setCursor(new Cursor(HAND_CURSOR));
       
     
    
 
 jDateChooser1.setDate(null); 
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
        
        
        
 
            jRadioButton9.addActionListener(new ShowListener());
            jRadioButton10.addActionListener(new ShowListener());
            jRadioButton11.addActionListener(new ShowListener());
            jRadioButton13.addActionListener(new ShowListener());
            jRadioButton12.addActionListener(new ShowListener());
              box.addItem(" --- أختر اسم رب العائلة---");
            get();
            gett();
                TableColumn tc=jTable1.getColumnModel().getColumn(0);
              DefaultTableCellRenderer cell=new DefaultTableCellRenderer();
              cell.setHorizontalTextPosition(DefaultTableCellRenderer.RIGHT);
              tc.setCellRenderer(cell);
    
              
              Font tr=null;
     try{
        tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         tr=tr.deriveFont(Font.BOLD,24);
       
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnltitle = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        jPanel2 = new javax.swing.JPanel();
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
        lblimg = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jTextField11 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        kButton8 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        lbltitle.setFont(new java.awt.Font("DecoType Naskh Extensions", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("جمـعيــة شبـاب الخـيـر الخيـريــة");

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

        javax.swing.GroupLayout pnltitleLayout = new javax.swing.GroupLayout(pnltitle);
        pnltitle.setLayout(pnltitleLayout);
        pnltitleLayout.setHorizontalGroup(
            pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltitleLayout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnltitleLayout.setVerticalGroup(
            pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(kButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/picture-attachment-128.png"))); // NOI18N
        lblimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimgMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("صورة رب الاسرة");

        box.setEditable(true);
        box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                boxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                boxPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(box, 0, 268, Short.MAX_VALUE))
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
                            .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
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
                    .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("أسم الفرد");

        jLabel18.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("الجنس");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton7.setText("ذكر");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton8.setText("أنثى");

        jLabel22.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("المواليد");

        jLabel23.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("الوظيفة");

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setText("طالب");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setText("ربة بيت");

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setText("عامل");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setText("أخرى");

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setText("عاطل");

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton9))))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton13))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton12))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kButton8.setText("تعديل");
        kButton8.setToolTipText("");
        kButton8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kButton8.setIconTextGap(11);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(kButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(28, 28, 28)
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
            Edit.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
            Edit.this.setMaximizedBounds(ge.getMaximumWindowBounds());
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

    private void lblimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimgMouseClicked

      JFileChooser choos=new JFileChooser();
choos.showOpenDialog(null);
 f=choos.getSelectedFile();
String path=f.getAbsolutePath();
ImageIcon img=new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_SMOOTH));
lblimg.setIcon(img);
  try{  
      File ff=new File(path);
      FileInputStream fis=new FileInputStream(ff);
      ByteArrayOutputStream bos=new ByteArrayOutputStream();
      byte[] buf=new byte[1024];
      for(int readnum;(readnum=fis.read(buf))!=-1;){
          bos.write(buf,0, readnum);
      }

person=bos.toByteArray();





}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);

      }
    }//GEN-LAST:event_lblimgMouseClicked

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       
        int col=jTable1.getColumnCount();
         int selectedRowIndex = jTable1.getSelectedRow();
             selectedRowIndex=(selectedRowIndex+1)%jTable1.getRowCount();
            jTable1.changeSelection(selectedRowIndex, col, false, false);
    
          dsa=model.getValueAt(selectedRowIndex,3).toString();
          
       con=Connections.getConnection();
    String sql="SELECT SONID FROM SON WHERE name='"+dsa+"' ";
    
    try{
        
        
        st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
             yyy=rs.getInt("SONID");
     
            System.out.print(yyy);
    }
       
      
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        
        
        
        
        // get the selected row index
       
     jTextField10.setText(model.getValueAt(selectedRowIndex,3).toString());
       
        // set the selected row data into jtextfields
      
      
       
       String gander=model.getValueAt(selectedRowIndex, 2).toString();
       if(gander.equals("ذكر")){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
       }if(gander.equals("أنثى")){
           jRadioButton8.setSelected(true);
            jRadioButton7.setSelected(false);
       }
       jDateChooser1.setDate((java.util.Date) model.getValueAt(selectedRowIndex, 1));
       
        String jjb=model.getValueAt(selectedRowIndex, 0).toString();
       if(jjb.equals("طالب")){
           jRadioButton9.setSelected(true);
             jRadioButton10.setSelected(false);
               jRadioButton11.setSelected(false);
                 jRadioButton12.setSelected(false);
                   jRadioButton13.setSelected(false);
                 
       }else if(jjb.equals("ربة بيت")){
           jRadioButton10.setSelected(true);
                jRadioButton9.setSelected(false);
                 jRadioButton11.setSelected(false);
                 jRadioButton12.setSelected(false);
                   jRadioButton13.setSelected(false);
       }
        
      else if(jjb.equals("عاطل")){
           jRadioButton13.setSelected(true);
            jRadioButton10.setSelected(false);
                jRadioButton9.setSelected(false);
                 jRadioButton11.setSelected(false);
                 jRadioButton12.setSelected(false);
       }else if(jjb.equals("عامل")){
           jRadioButton11.setSelected(true);
             jRadioButton13.setSelected(false);
            jRadioButton10.setSelected(false);
                jRadioButton9.setSelected(false);
                 jRadioButton12.setSelected(false);
       }
       else {
           jRadioButton12.setSelected(true);
             jRadioButton13.setSelected(false);
            jRadioButton10.setSelected(false);
                jRadioButton9.setSelected(false);
                 jRadioButton11.setSelected(false);
           jTextField11.setText(jjb);
       }
       
      
      
   
   
    }//GEN-LAST:event_jTable1MouseClicked

    private void boxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_boxPopupMenuWillBecomeInvisible
asd=box.getSelectedItem().toString();
    String sq="SELECT PERSONID FROM PERSON WHERE name='"+box.getSelectedItem()+"'";
   
    try{
         st=con.createStatement();
        rs=st.executeQuery(sq);
        while(rs.next()){
            iidd=rs.getInt("PERSONID");
           System.out.print("ddd"+iidd);
        }
        
        
    }catch(Exception e){
         System.out.print(e);
    }
        
        
        
        
      
     jTable1.setRowHeight(25);
     jTable1.setRowMargin(6);
     
  String g="",h="",j="",a="",b="",c="",d="",ee="";
  Date i=null;
 // byte[]f=null;
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

 
    
    
        
jTable1 = new  JTable(model);
model.addColumn("المهنة");
model.addColumn("المواليد");
model.addColumn("الجنس");
model.addColumn("اسماء العائلة");




    con=Connections.getConnection();
    String sql="SELECT  PERSON.PERSONID,PERSON.name as namm, PERSON.ADDRESS,PERSON.regin, PERSON.PHONE,PERSON.HUMAN, PERSON.PHOTO,SON.SONID,SON.name as qq,SON.gander,SON.birth,SON.JOB FROM PERSON INNER JOIN SON ON PERSON.PERSONID=SON.PERSONID where PERSON.name='"+box.getSelectedItem()+"'";
    
    try{
        
        
        st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            
            
          
            a=rs.getString("namm");
            b=rs.getString("ADDRESS");
            c=rs.getString("regin");
            d=rs.getString("PHONE");
            ee=rs.getString("HUMAN");
           // f=rs.getBytes("PHOTO");
            int ii=rs.getInt("SONID");
            g=rs.getString("qq");
             h=rs.getString("gander");
             i=rs.getDate("birth");
             j=rs.getString("JOB");
            
      
           
            jTextField9.setText(b);
            jTextField8.setText(c);
            jTextField7.setText(d);
            if(ee.equals("فقراء")){
                jRadioButton3.setSelected(true);
                jRadioButton4.setSelected(false);
            } else{
                jRadioButton4.setSelected(true);
                jRadioButton3.setSelected(false); 
            }
                   
      
             BufferedImage bImage = null;
           
              File initialImage = new File("mcfi/"+box.getSelectedItem()+".png");
             bImage = ImageIO.read(initialImage);
 
           
            ImageIcon tt=new ImageIcon(bImage);
          Image  img=tt.getImage();
           Image  o=img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon mg=new ImageIcon(o);
            lblimg.setIcon(mg);
       
   
   
    
           model.addRow(new Object[]{j,i,h,g});  

    
    
    }
    }
    catch(Exception e){
      System.out.print(e);
    }
     
    Icon icon = lblimg.getIcon();
BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
Graphics2D g2d = img.createGraphics();
icon.paintIcon(null, g2d, 0, 0);
g2d.dispose();

try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
    ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
    try {
        ImageIO.write(img, "png", ios);
        // Set a flag to indicate that the write was successful
    } finally {
        ios.close();
    }
   bytes = baos.toByteArray();
} catch (IOException ex) {
    ex.printStackTrace();
}



    
   
    }//GEN-LAST:event_boxPopupMenuWillBecomeInvisible

    private void boxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_boxPopupMenuWillBecomeVisible

        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();                        
         model.setColumnCount(0);
          model.setRowCount(0);
           

lblimg.setIcon(new ImageIcon(getClass().getResource("picture-attachment-128.png")));
         
          jTextField7.setText("");
              jTextField8.setText("");
                jTextField9.setText("");
                  jTextField10.setText("");
                 buttonGroup1.clearSelection();
                buttonGroup2.clearSelection();
              buttonGroup3.clearSelection();
           jDateChooser1.setDate(null);
    
    }//GEN-LAST:event_boxPopupMenuWillBecomeVisible

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
             

        
        
        BufferedImage bImage = null;
        String name=box.getSelectedItem().toString();
        String address=jTextField9.getText();
        String phone=jTextField7.getText();
        String regin=jTextField8.getText();
        
         String h="";
       if(jRadioButton3.isSelected()){
           h="فقراء";
       }
       else if(jRadioButton4.isSelected()){
           h="أيتام";
       }

        //-------------------------//
        String namee=jTextField10.getText();
        String hh="";
       if(jRadioButton7.isSelected()){
           hh="ذكر";
       }
       else if(jRadioButton8.isSelected()){
           hh="أنثى";
       }
     //-----------------------------//
      String hhh="";
     if(jRadioButton9.isSelected()){
           hhh="طالب";
       }
       else if(jRadioButton10.isSelected()){
           hhh="ربة بيت";
       }
      else if(jRadioButton11.isSelected()){
           hhh="عامل";
       }
      else if(jRadioButton12.isSelected()){
           hhh=jTextField11.getText();
       }
      else if(jRadioButton13.isSelected()){
           hhh="عاطل";
       }
      //------------------------------------// 
      
       
        
        
         
      if(jTextField10.getText().equals("")){
           PreparedStatement pst;
          con=Connections.getConnection();
    String sql="update  PERSON set name=?, ADDRESS=?,regin=?,PHONE=?,HUMAN=? where PERSONID='"+iidd+"'";
    
    try{
        
        
      
       
        pst=con.prepareStatement(sql); 
        pst.setString(1, name);
        pst.setString(2, address);
         pst.setString(3, regin);
          pst.setString(4, phone);
           pst.setString(5, h);
         File ff= new File("mcfi/"+box.getSelectedItem()+".png");
          ff.delete();
            
 if(f == null){
     
      Icon icon = lblimg.getIcon();
     BufferedImage bi = new BufferedImage(
    icon.getIconWidth(),
    icon.getIconHeight(),
    BufferedImage.TYPE_INT_RGB);
Graphics g = bi.createGraphics();
// paint the Icon to the BufferedImage.
icon.paintIcon(null, g, 0,0);
g.dispose();
     
  ImageIO.write(bi, "png", new File("mcfi/"+box.getSelectedItem()+".png"));
 }else{
    
      bImage = ImageIO.read(f);
      ImageIO.write(bImage, "png", new File("mcfi/"+box.getSelectedItem()+".png"));
 }
           
        
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "تمتت التعديل");
       box.removeAllItems();
        box.addItem(" --- أختر اسم رب العائلة---");
       gett();
    }
    catch(Exception ex){
      System.out.print(ex);
    } 
          
      }else{
          
          
       
       
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      String date = dateFormat.format(jDateChooser1.getDate());
      java.sql.Date sqldate = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        
        con=Connections.getConnection();
    String sql="update  PERSON INNER JOIN SON ON PERSON.PERSONID=SON.PERSONID  set PERSON.name=?, PERSON.ADDRESS=?,PERSON.regin=?, PERSON.PHONE=?,PERSON.HUMAN=?,SON.name=?,SON.gander=?,SON.birth=?,SON.JOB=? where PERSON.PERSONID='"+iidd+"'";
     PreparedStatement pst;
    try{
        
        
      
       
        pst=con.prepareStatement(sql); 
        pst.setString(1, name);
        pst.setString(2, address);
         pst.setString(3, regin);
          pst.setString(4, phone);
           pst.setString(5, h);
         File fff= new File("mcfi/"+box.getSelectedItem()+".png");
          fff.delete();
            
 if(f == null){
     
      Icon icon = lblimg.getIcon();
     BufferedImage bi = new BufferedImage(
    icon.getIconWidth(),
    icon.getIconHeight(),
    BufferedImage.TYPE_INT_RGB);
Graphics g = bi.createGraphics();
// paint the Icon to the BufferedImage.
icon.paintIcon(null, g, 0,0);
g.dispose();
     
  ImageIO.write(bi, "png", new File("mcfi/"+box.getSelectedItem()+".png"));
 }else{
    
      bImage = ImageIO.read(f);
      ImageIO.write(bImage, "png", new File("mcfi/"+box.getSelectedItem()+".png"));
 }
           
            pst.setString(6, namee);
             pst.setString(7, hh);
              pst.setDate(8, sqldate);
          pst.setString(9, hhh);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "تم التعديل");
       box.removeAllItems();
        box.addItem(" --- أختر اسم رب العائلة---");
       gett();
    }
    catch(Exception e){
      System.out.print(e);
    } 
          
          
          
      }
     

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
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton8;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel pnltitle;
    // End of variables declaration//GEN-END:variables
public void get(){
   
    
     jTable1.setRowHeight(25);
     jTable1.setRowMargin(6);
  String g="",h="",j="";
  Date i;
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

   
    
   
        
jTable1 = new  JTable(model);
model.addColumn("المهنة");
model.addColumn("المواليد");
model.addColumn("الجنس");
model.addColumn("اسماء العائلة");




    con=Connections.getConnection();
    String sql="SELECT  PERSON.name as namm, PERSON.ADDRESS,PERSON.regin, PERSON.PHONE,PERSON.HUMAN, PERSON.PHOTO,SON.SONID,SON.name,SON.gander,SON.birth,SON.JOB FROM PERSON INNER JOIN SON ON PERSON.PERSONID=SON.PERSONID where PERSON.name='"+nnm+"'";
    
    try{
        
        
        st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            String a=rs.getString("namm");
            String b=rs.getString("ADDRESS");
            String c=rs.getString("regin");
            String d=rs.getString("PHONE");
            String e=rs.getString("HUMAN");
          //  byte[] f=rs.getBytes("PHOTO");
            int ii=rs.getInt("SONID");
            g=rs.getString("name");
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
           
              File initialImage = new File("mcfi/"+nnm+".png");
             bImage = ImageIO.read(initialImage);
             
            ImageIcon tt=new ImageIcon(bImage);
            Image img=tt.getImage();
            Image o=img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon mg=new ImageIcon(o);
            lblimg.setIcon(mg);
       
   
   
    
 model.addRow(new Object[]{j, i,h,g});  

    
    
    }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}
public void gett(){
   
   String aa="";

    con=Connections.getConnection();
    String sql="SELECT DISTINCT name FROM PERSON ";
    
    try{
        
        
        st=con.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
           nnm=rs.getString("name");
           
            
      
         box.addItem(nnm);
            
    }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}
 private void getSelectedRow() {
            getSelectedRow();
        }

 

  public class ShowListener implements ActionListener {

	        public void actionPerformed(ActionEvent e) {

	            jTextField11.setEnabled(false);

	        }

	    }
  

}
