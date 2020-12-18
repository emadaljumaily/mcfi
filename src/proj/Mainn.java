/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import com.sun.java.swing.plaf.windows.WindowsScrollBarUI;
import com.sun.java.swing.plaf.windows.WindowsScrollPaneUI;
import com.sun.javafx.scene.control.TableColumnComparatorBase;
import com.sun.prism.impl.Disposer;
//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;





import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.ScrollPane;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;
import java.util.EventObject;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.transform.Scale;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
import javax.swing.SortOrder;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.TableUI;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.plaf.metal.MetalScrollPaneUI;
import javax.swing.plaf.multi.MultiTableUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import static proj.Connections.con;
import proj.TestDropShadowBorder.DropShadowBorder;



/**
 *
 * @author emadmohamed
 */
public final class Mainn extends javax.swing.JFrame {
String extension="";
   private JButton hh ;
   int x,y;
   static boolean miximum=true ;
   modeel model;
   JPanel pp=new JPanel();
   private int count = 0;
   private JFileChooser jfc=new JFileChooser();
   ResultSet rs;
   Statement st;
   public int rr;
   public String ff;
   byte[] person=null;
   byte[] bytes=null;
   public int gid=0; 
   public int giid;
   public int nm=0;
   File f=null;
   DefaultTableModel modelll;
    DefaultTableModel modell;
   
    public Mainn() {
  
        title();
        idd();
        
      
        initComponents();
    jComboBox1.addItem(" --- أختر اسم رب العائلة---");
        titleexist();
        iidd();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icona.jpg")));
        //-------------create file image --------------------//
         
   File file = new File("mcfi");
      //Creating the directory
        boolean booll = file.isDirectory();
   
      if(booll){
        
         System.out.println("Directory is exist");
      }else{
            file.mkdir();
         System.out.println("Sorry couldn’t create specified directory");
      }
      ////////////////////////////////////////////////
        lbltitle.setText(ff);
        pp.setSize(974, 584);
        pp.setBackground(Color.white);
        pp.setLayout(null);
        this.setTitle(ff);
        this.setLocationRelativeTo(this);
        kButton1.setCursor(new Cursor(HAND_CURSOR));
        kButton2.setCursor(new Cursor(HAND_CURSOR));
        kButton3.setCursor(new Cursor(HAND_CURSOR));
        kButton4.setCursor(new Cursor(HAND_CURSOR));
        kButton5.setCursor(new Cursor(HAND_CURSOR));
        kButton6.setCursor(new Cursor(HAND_CURSOR));
        kButton7.setCursor(new Cursor(HAND_CURSOR));
        kButton8.setCursor(new Cursor(HAND_CURSOR));
        kButton9.setCursor(new Cursor(HAND_CURSOR));
        kButton11.setCursor(new Cursor(HAND_CURSOR));
        kButton11.setVisible(false);
        ////////////////////////////////////////////
          RoundedPanel po=new RoundedPanel();
          TestDropShadowBorder.DropShadowBorder border = new TestDropShadowBorder.DropShadowBorder();
          border.setFillContentArea(true);
          
            jpanelbtn.setBorder(new CompoundBorder(border, new LineBorder(Color.GRAY)));
            jpanelbtn2.setBorder(new CompoundBorder(border, new LineBorder(Color.GRAY)));
            connct();
            conct();
 
        panelhm.removeAll();
        panelhm.repaint();
        panelhm.revalidate();
        panelhm.add(jlogin);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    
        Border empty = new EmptyBorder(0,0,0,0);
        jScrollPane1.setBorder(empty);
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setBorder(empty);
          jScrollPane3.getViewport().setBackground(Color.WHITE);
      //--------------------------------زر اضافة فرد الى العائلة--------------------------//
       
      kButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
      String n=jTextField10.getText();
      String nn="";
      if(jRadioButton7.isSelected()){
          nn="ذكر";
      }
      else if(jRadioButton8.isSelected()){
          nn="أنثى";
      } 
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      String date = dateFormat.format(jDateChooser1.getDate());
      java.sql.Date sqldate = new java.sql.Date(jDateChooser1.getDate().getTime());
      String job="";
       if(jRadioButton9.isSelected()){
          job="طالب";
          jTextField11.setEnabled(false);
          
      }
      else if(jRadioButton10.isSelected()){
          job="ربة بيت";
           jTextField11.setEditable(false);
      } 
      else if(jRadioButton11.isSelected()){
          job="عامل";
           jTextField11.setEditable(false);
      }
      else if(jRadioButton13.isSelected()){
          job="عاطل";
           jTextField11.setEditable(false);
      } 
       else if(jRadioButton12.isSelected()){
          job=jTextField11.getText();
      }
       String sqll="INSERT INTO SON (PERSONID,name, gander, birth,JOB)VALUES (?,?,?,?,?)";
      try{
        PreparedStatement psst=con.prepareStatement(sqll);  
       
       psst.setInt(1,gid);
       psst.setString(2, n);
       psst.setString(3, nn);
       psst.setDate(4, sqldate);
       psst.setString(5, job);
         psst.executeUpdate();
          
        JOptionPane.showMessageDialog(null,"تم أضافة فرد ");
        idd();
          jTextField10.setText("");
          jDateChooser1.setDate(null);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       } 
            }
        });
        
    //-----------------------------------------------------------//
        
        jPanel10.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "تفاصيل رب الاسرة", TitledBorder.RIGHT, TitledBorder.TOP));
        ((javax.swing.border.TitledBorder) jPanel10.getBorder()).
        setTitleFont(new Font("Arial", Font.BOLD, 18));
        jPanel10.repaint();
        /*-------------------------------------------------------*/
        jPanel12.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "تفاصيل أفراد الاسرة", TitledBorder.RIGHT, TitledBorder.TOP));
        ((javax.swing.border.TitledBorder) jPanel12.getBorder()).
        setTitleFont(new Font("Arial", Font.BOLD, 18));
        jPanel12.repaint();
        /*----------------------------------------------------------------*/
     
     
       
        JPanel p5 = new RoundedPanell(500);
        p5.setBounds(380,40,300,300);
        p5.setBackground(Color.WHITE);
        p5.setOpaque(false);
        p5.add(jLabel2);
     
        jPanel13.add(p5);
       
 

        
      
    //table.setDefaultRenderer(String.class, new LabelRenderer());
    //table1.setDefaultRenderer(String.class, new LabelRenderer());
    
    /*-----------------------------------------------------------*/
    jPanel16.removeAll();
    jPanel16.repaint();
    jPanel16.revalidate();
   
    Mainn.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gee=GraphicsEnvironment.getLocalGraphicsEnvironment();
            Mainn.this.setMaximizedBounds(gee.getMaximumWindowBounds());
            miximum=false;
   /* 
    try {
     GraphicsEnvironment ge = 
         GraphicsEnvironment.getLocalGraphicsEnvironment();
     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("SemiBold.ttf")));
} catch (IOException|FontFormatException e) {
     //Handle exception
}
   */ 
    


	
/*-----------------------able/enable textfield by radiobutton-----------------*/
	   
            jRadioButton9.addActionListener(new ShowListener());
            jRadioButton10.addActionListener(new ShowListener());
            jRadioButton11.addActionListener(new ShowListener());
            jRadioButton13.addActionListener(new ShowListener());
            jRadioButton12.addActionListener(new ShowListenerr());

/*----------------------------------------------------------------------------*/
        jTabbedPane1.add(new DbBackUp(), "نسخ ");
        jTabbedPane1.add(new DbRestore(), "استعادة");
    
 /*——————————————————————————————————————————————*/   
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



Font tr=null;
     try{
        tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         tr=tr.deriveFont(Font.BOLD,24);
          jButton3.setFont(tr);
          kButton4.setFont(tr);
          kButton5.setFont(tr);
          kButton6.setFont(tr);
           kButton7.setFont(tr);
            kButton8.setFont(tr);
             kButton9.setFont(tr);
          
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }

     //-----------------------------------------//
     Font trr=null;
     try{
        trr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         trr=trr.deriveFont(Font.BOLD,20);
         
             kButton11.setFont(tr);
          
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     ///----------------------------///
      Font fr=null;
     try{
         fr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("GaliModern-ExtraBold.otf"));
         fr=fr.deriveFont(Font.BOLD,22);
         lbltitle.setFont(fr);        
         jButton2.setFont(fr);
         jButton1.setFont(fr);
         
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
      ///----------------------------///
      Font frr=null;
     try{
         frr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("GaliModern-ExtraBold.otf"));
         frr=frr.deriveFont(Font.BOLD,20);
       
         lblserch.setFont(frr);
       
         
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
        buttonGroup4 = new javax.swing.ButtonGroup();
        panelmn = new javax.swing.JPanel();
        pnltitle = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        lbltitle = new javax.swing.JLabel();
        panelhm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panebody = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        kButton10 = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        lblimg1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        lblserch = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jserch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        kButton4 = new keeptoo.KButton();
        kButton5 = new keeptoo.KButton();
        kButton6 = new keeptoo.KButton();
        jPanel2 = new javax.swing.JPanel();
        user1lbl = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        userlbl = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        lblimg = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
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
        kButton11 = new keeptoo.KButton();
        jPanel21 = new javax.swing.JPanel();
        kButton8 = new keeptoo.KButton();
        kButton7 = new keeptoo.KButton();
        kButton9 = new keeptoo.KButton();
        jPanel5 = new javax.swing.JPanel();
        jlogin = new javax.swing.JPanel();
        jpanelbtn = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpanelbtn2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        sting = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tftitl = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelmn.setBackground(new java.awt.Color(255, 255, 255));

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

        lbltitle.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
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

        panelhm.setBackground(new java.awt.Color(153, 153, 153));
        panelhm.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1160, 640));

        panebody.setBackground(new java.awt.Color(255, 255, 255));
        panebody.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(80);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)))
        );

        panebody.add(jPanel6, "card3");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        kButton10.setText("حذف عائلة");
        kButton10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton10.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton10.setkBorderRadius(15);
        kButton10.setkEndColor(new java.awt.Color(255, 0, 0));
        kButton10.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton10.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton10.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton10.setkStartColor(new java.awt.Color(255, 0, 0));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("أسم رب الاسرة للحذف");

        jPanel11.setBackground(new java.awt.Color(235, 235, 235));

        jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton6.setText("رجوع");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(538, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panebody.add(jPanel7, "card3");

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("أسم رب الاسرة");

        jLabel28.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("رقم الهاتف");

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel29.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("المنطقة");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel30.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("المحافظة");

        jLabel31.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("تصنيف");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton5.setText("فقراء");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setText("أيتام");

        lblimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/picture-attachment-128.png"))); // NOI18N
        lblimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg1MouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("صورة رب الاسرة");

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lblimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setEditingColumn(0);
        jTable3.setEditingRow(0);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton12.setText("رجوع");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        lblserch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblserch.setText("نتائج البحث");
        lblserch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(lblserch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addGap(27, 27, 27))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(lblserch, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        panebody.add(jPanel23, "card3");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(153, 153, 153)));

        jserch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jserch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jserch.setText("بحث/اسم رب الاسرة");
        jserch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jserchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jserchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jserchMousePressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-3-32.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        kButton4.setBorder(null);
        kButton4.setText("اضافة");
        kButton4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(38, 128, 207));
        kButton4.setkBorderRadius(15);
        kButton4.setkEndColor(new java.awt.Color(38, 128, 207));
        kButton4.setkHoverEndColor(new java.awt.Color(38, 128, 207));
        kButton4.setkHoverForeGround(new java.awt.Color(38, 128, 207));
        kButton4.setkHoverStartColor(new java.awt.Color(38, 128, 207));
        kButton4.setkSelectedColor(new java.awt.Color(38, 128, 207));
        kButton4.setkStartColor(new java.awt.Color(38, 128, 207));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton5.setText("تعديل");
        kButton5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(190, 207, 38));
        kButton5.setkBorderRadius(15);
        kButton5.setkEndColor(new java.awt.Color(190, 207, 38));
        kButton5.setkHoverEndColor(new java.awt.Color(190, 207, 38));
        kButton5.setkHoverForeGround(new java.awt.Color(190, 207, 38));
        kButton5.setkHoverStartColor(new java.awt.Color(190, 207, 38));
        kButton5.setkSelectedColor(new java.awt.Color(190, 207, 38));
        kButton5.setkStartColor(new java.awt.Color(190, 207, 38));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        kButton6.setText("حذف");
        kButton6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton6.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton6.setkBorderRadius(15);
        kButton6.setkEndColor(new java.awt.Color(255, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton6.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton6.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton6.setkStartColor(new java.awt.Color(255, 0, 0));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jserch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jserch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(117, 117, 117)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));

        user1lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user1lbl.setForeground(new java.awt.Color(102, 102, 102));
        user1lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(user1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panebody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panebody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel4, "card2");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(235, 235, 235));

        jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton5.setText("رجوع");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        userlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlbl.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("أسم رب الاسرة");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("رقم الهاتف");

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("المنطقة");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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

        lblimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("رقم العائلة");

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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
        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setText("طالب");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setText("ربة بيت");

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setText("عامل");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setText("أخرى");

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setText("عاطل");

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        kButton11.setBorder(null);
        kButton11.setText("اضافة فرد اخر");
        kButton11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        kButton11.setkBackGroundColor(new java.awt.Color(38, 128, 207));
        kButton11.setkBorderRadius(15);
        kButton11.setkEndColor(new java.awt.Color(38, 128, 207));
        kButton11.setkHoverEndColor(new java.awt.Color(38, 128, 207));
        kButton11.setkHoverForeGround(new java.awt.Color(38, 128, 207));
        kButton11.setkHoverStartColor(new java.awt.Color(38, 128, 207));
        kButton11.setkSelectedColor(new java.awt.Color(38, 128, 207));
        kButton11.setkStartColor(new java.awt.Color(38, 128, 207));
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(kButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        kButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer-48.png"))); // NOI18N
        kButton8.setText("طباعة");
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

        kButton7.setBorder(null);
        kButton7.setText("اضافة");
        kButton7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(38, 128, 207));
        kButton7.setkBorderRadius(15);
        kButton7.setkEndColor(new java.awt.Color(38, 128, 207));
        kButton7.setkHoverEndColor(new java.awt.Color(38, 128, 207));
        kButton7.setkHoverForeGround(new java.awt.Color(38, 128, 207));
        kButton7.setkHoverStartColor(new java.awt.Color(38, 128, 207));
        kButton7.setkSelectedColor(new java.awt.Color(38, 128, 207));
        kButton7.setkStartColor(new java.awt.Color(38, 128, 207));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });

        kButton9.setText("ألغاء");
        kButton9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton9.setkBorderRadius(15);
        kButton9.setkEndColor(new java.awt.Color(255, 0, 0));
        kButton9.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton9.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton9.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton9.setkStartColor(new java.awt.Color(255, 0, 0));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, "card3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1301, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, "card4");

        panelhm.add(jPanel1, "card2");

        jlogin.setBackground(new java.awt.Color(255, 255, 255));
        jlogin.setPreferredSize(new java.awt.Dimension(1160, 640));

        jpanelbtn.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Aldhabi", 3, 36)); // NOI18N
        jButton1.setText("تسجيل الدخول");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelbtnLayout = new javax.swing.GroupLayout(jpanelbtn);
        jpanelbtn.setLayout(jpanelbtnLayout);
        jpanelbtnLayout.setHorizontalGroup(
            jpanelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jpanelbtnLayout.setVerticalGroup(
            jpanelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelbtn2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Aldhabi", 3, 36)); // NOI18N
        jButton2.setText("أنشاء حساب");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelbtn2Layout = new javax.swing.GroupLayout(jpanelbtn2);
        jpanelbtn2.setLayout(jpanelbtn2Layout);
        jpanelbtn2Layout.setHorizontalGroup(
            jpanelbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jpanelbtn2Layout.setVerticalGroup(
            jpanelbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelbtn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Aldhabi", 0, 24)); // NOI18N
        jButton3.setText("الضبط");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jloginLayout = new javax.swing.GroupLayout(jlogin);
        jlogin.setLayout(jloginLayout);
        jloginLayout.setHorizontalGroup(
            jloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jloginLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jpanelbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(jpanelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
            .addGroup(jloginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jloginLayout.setVerticalGroup(
            jloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jloginLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        panelhm.add(jlogin, "card3");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj/New Project(10).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("التطبيق من أعداد  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("البرمجة من أجل العراق");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("أعـــداد فـريــق صلاح الـديــن");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(638, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        panelhm.add(jPanel13, "card4");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New Project(7).png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New Project(8).png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Marwan Ahmed");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Emad Mohamed");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("مصمم ومدير المشروع");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("مبرمج المشروع");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("فريق العمل");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(223, 223, 223))
        );

        panelhm.add(jPanel14, "card4");

        sting.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));

        jButton7.setText("أسم البرنامج");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("حول البرنامج");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setText("النسخ الاحتياطي");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.CardLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel21.setText("أسم البرنامج");

        tftitl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tftitl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton9.setBackground(new java.awt.Color(0, 153, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton9.setText("تغيير");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(tftitl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(364, 364, 364))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftitl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17, "card2");

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.CardLayout());

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 0));
        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(578, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );

        jPanel16.add(jPanel19, "card3");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(309, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        jPanel16.add(jPanel22, "card4");

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("رجوع");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout stingLayout = new javax.swing.GroupLayout(sting);
        sting.setLayout(stingLayout);
        stingLayout.setHorizontalGroup(
            stingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stingLayout.setVerticalGroup(
            stingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stingLayout.createSequentialGroup()
                .addGroup(stingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stingLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(stingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelhm.add(sting, "card6");

        javax.swing.GroupLayout panelmnLayout = new javax.swing.GroupLayout(panelmn);
        panelmn.setLayout(panelmnLayout);
        panelmnLayout.setHorizontalGroup(
            panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1301, Short.MAX_VALUE)
            .addGroup(panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelhm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmnLayout.setVerticalGroup(
            panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelmnLayout.createSequentialGroup()
                    .addComponent(pnltitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 651, Short.MAX_VALUE)))
            .addGroup(panelmnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmnLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(panelhm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        int ext=JOptionPane.showConfirmDialog(null, "الخروج","هل تريد الخروج؟",0,2);
        if(ext==0){
           System.exit(0);  
        }else{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
        
        
       
    }//GEN-LAST:event_kButton2ActionPerformed

    private void pnltitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnltitleMousePressed
      x=evt.getX();
      y=evt.getY();
    }//GEN-LAST:event_pnltitleMousePressed

    private void pnltitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnltitleMouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_pnltitleMouseDragged

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
     
        if(miximum){
            Mainn.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
            Mainn.this.setMaximizedBounds(ge.getMaximumWindowBounds());
            miximum=false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            miximum=true;
        }
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
      this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    
  /*   panelhm.removeAll();
     panelhm.repaint();
     panelhm.revalidate();
     panelhm.add(jPanel1);
     panelhm.repaint();
     panelhm.revalidate();  
        
     */
          dispose();
     login logg=new login();
     logg.setVisible(true);
   
/*
  
     panelhm.removeAll();
     panelhm.repaint();
     panelhm.revalidate();
     panelhm.add(jPanel1);
     panelhm.repaint();
     panelhm.revalidate();*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
     
      jPanel1.removeAll();
      jPanel1.repaint();
   
      jPanel1.revalidate();
      jPanel1.add(jPanel8);
      jPanel1.repaint();
      
  
  
    }//GEN-LAST:event_kButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  kButton11.setVisible(false);
        conct();
        connct();
        jComboBox1.removeAllItems();
         jComboBox1.addItem(" --- أختر اسم رب العائلة---");
      idd();
      iidd();
      backk();
     
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
 
       
     if(jTextField6.getText().equals("")){
     
         JOptionPane.showMessageDialog(null, "أدخل اسم رب الاسرة");
         
     }
     else{
          /*-------------------------------------------أسم رب الاسرة---------------------------------------*/
       BufferedImage bImage = null;
       String sql="INSERT INTO PERSON (PERSONID,name, ADDRESS, regin,PHONE,HUMAN)VALUES (?,?,?,?,?,?)";
       con=Connections.getConnection();
       try{
        PreparedStatement pst=con.prepareStatement(sql); 
        String nm=jTextField12.getText();
        int mn=Integer.parseInt(nm);
        pst.setInt(1, mn);
         String a=jTextField6.getText();
        pst.setString(2, a);
          String c=jTextField8.getText();
        pst.setString(3, c);
          String d=jTextField9.getText();
        pst.setString(4, d);
         String b=jTextField7.getText();
        pst.setString(5,b);
        String hh="";
       if(jRadioButton3.isSelected()){
           hh="فقراء";
       }
       else if(jRadioButton4.isSelected()){
           hh="أيتام";
       }
        pst.setString(6, hh);
        
     
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
     
  ImageIO.write(bi, "png", new File("mcfi/"+jTextField6.getText()+".png"));
 }else{
    
      bImage = ImageIO.read(f);
      ImageIO.write(bImage, "png", new File("mcfi/"+jTextField6.getText()+".png"));
 }



         pst.executeUpdate();
     
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
   /*---------------------------------افراد الاسرة-----------------------------*/    
     String n=jTextField10.getText();
      String nn="";
      if(jRadioButton7.isSelected()){
          nn="ذكر";
      }
      else if(jRadioButton8.isSelected()){
          nn="أنثى";
      } 
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      String date = dateFormat.format(jDateChooser1.getDate());
      java.sql.Date sqldate = new java.sql.Date(jDateChooser1.getDate().getTime());
      String job="";
       if(jRadioButton9.isSelected()){
          job="طالب";
          jTextField11.setEnabled(false);
          
      }
      else if(jRadioButton10.isSelected()){
          job="ربة بيت";
           jTextField11.setEditable(false);
      } 
      else if(jRadioButton11.isSelected()){
          job="عامل";
           jTextField11.setEditable(false);
      }
      else if(jRadioButton13.isSelected()){
          job="عاطل";
           jTextField11.setEditable(false);
      } 
       else if(jRadioButton12.isSelected()){
          job=jTextField11.getText();
      }
       String sqll="INSERT INTO SON (PERSONID,name,gander,birth,JOB)VALUES (?,?,?,?,?)";
      try{
        PreparedStatement psst=con.prepareStatement(sqll);  
       String nm=jTextField12.getText();
        int mn=Integer.parseInt(nm);
       psst.setInt(1,mn);
       psst.setString(2, n);
       psst.setString(3, nn);
       psst.setDate(4, sqldate);
       psst.setString(5, job);
         psst.executeUpdate();
          
        JOptionPane.showMessageDialog(null,"تم الحفظ");
       //  kButton7.addActionListener(updateListener);
      
        kButton11.setVisible(true);
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       } 
     
    

     }
     

     
  idd();
   conct();
  connct();
  
    }//GEN-LAST:event_kButton7ActionPerformed

    private void lblimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimgMouseClicked
      
     JFileChooser choos=new JFileChooser();
choos.showOpenDialog(null);
 f=choos.getSelectedFile();
String path=f.getAbsolutePath();
ImageIcon img=new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_SMOOTH));
lblimg.setIcon(img);

       
    }//GEN-LAST:event_lblimgMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        
        
        
     panebody.removeAll();
     panebody.repaint();
     panebody.revalidate();
     panebody.invalidate();
     panebody.add(jPanel6);
     panebody.repaint();
     panebody.revalidate(); 
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed

        
       
     panebody.removeAll();
     panebody.repaint();
     panebody.revalidate();
     panebody.add(jPanel7);
     panebody.repaint();
     panebody.revalidate(); 
    }//GEN-LAST:event_kButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     panelhm.removeAll();
     panelhm.repaint();
     panelhm.revalidate();
     panelhm.add(sting);
     panelhm.repaint();
     panelhm.revalidate(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     jPanel16.removeAll();
     jPanel16.repaint();
     jPanel16.revalidate();
     jPanel16.add(jPanel17);
     jPanel16.repaint();
     jPanel16.revalidate(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     jLabel24.setBackground(Color.GREEN);
     jPanel16.removeAll();
     jPanel16.repaint();
     jPanel16.revalidate();
     jPanel16.add(jPanel19);
     jPanel20.add(jPanel13);
     jPanel16.repaint();
     jPanel16.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     panelhm.removeAll();
     panelhm.repaint();
     panelhm.revalidate();
     panelhm.add(jlogin);
     panelhm.repaint();
     panelhm.revalidate();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
     jLabel25.setBackground(Color.GREEN);
     jLabel24.setBackground(Color.WHITE);
        
     jPanel20.removeAll();
     jPanel20.repaint();
     jPanel20.revalidate(); 
     jPanel20.add(jPanel14); 
     jPanel20.repaint();
     jPanel20.revalidate();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
     jLabel24.setBackground(Color.GREEN);
     jLabel25.setBackground(Color.WHITE);
        
     jPanel20.removeAll();
     jPanel20.repaint();
     jPanel20.revalidate(); 
     jPanel20.add(jPanel13); 
     jPanel20.repaint();
     jPanel20.revalidate();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PreparedStatement pst;
        con=Connections.getConnection();
        String sql="UPDATE TITLEE SET TTITLE = ? WHERE ID = "+rr+"";
        try{
         pst=con.prepareStatement(sql);
          
         pst.setString(1, tftitl.getText());
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "تم تغيير أسم البرنامج بنجاح");
         title();
         lbltitle.setText(ff);
        }
        catch(Exception e){
          Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, e);
    }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
      print pp=new print();
      pp.setVisible(true);
    
    
    }//GEN-LAST:event_kButton8ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
     
      
     
    idd();
      

    }//GEN-LAST:event_formMouseMoved

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
      Edit ee=new Edit();
     ee.setVisible(true);
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
      int ii=jComboBox1.getSelectedIndex();
        if(ii==0){
       
      }
      else{
         
        con=Connections.getConnection();
         String sql="DELETE FROM PERSON WHERE PERSONID="+nm+"";
     
       
      PreparedStatement psst;
      
       int i=JOptionPane.showConfirmDialog(null, "تأكيد الحذف","حذف",0,3);
       if(i==0){
        try{
          
        psst=con.prepareStatement(sql);
        psst.executeUpdate();
          File f= new File("mcfi/"+jComboBox1.getSelectedItem()+".png");
          f.delete();
      JOptionPane.showMessageDialog(null, "تم حذف العائلة");
        
  
                                
          conct();
  connct();
         
        }
        catch(Exception e){
          Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, e);
    }  
        
       }  
       jComboBox1.removeAllItems();
    jComboBox1.addItem(" --- أختر اسم رب العائلة---");
         iidd(); 

       idd();
      }
     
     
       
       
    
    }//GEN-LAST:event_kButton10ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
         String sql="SELECT * FROM PERSON WHERE name='"+jComboBox1.getSelectedItem().toString()+"'";
     con=Connections.getConnection();
     try{
     st=con.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
      nm=rs.getInt("PERSONID");
     System.out.print(nm);
     }
     }
     catch(Exception e){
         System.out.print( e);
     }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      
     jPanel16.removeAll();
     jPanel16.repaint();
     jPanel16.revalidate();
     jPanel16.add(jPanel22);
     jPanel16.repaint();
     jPanel16.revalidate(); 
        
        
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
lblimg.setIcon(new ImageIcon(getClass().getResource("picture-attachment-128.png")));
       kButton11.setVisible(false);
       jTextField12.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
       jTextField9.setText("");
       jTextField10.setText("");
       jDateChooser1.setDate(null);
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       buttonGroup4.clearSelection();
     
    }//GEN-LAST:event_kButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     register reg=new register();
     reg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    PreparedStatement pstmt1 = null;
    ResultSet rs = null;

    try {

    String userInput = jserch.getText();
    String query = "SELECT name FROM person where name=?";
    pstmt1 =con.prepareStatement(query);
    pstmt1.setString(1, userInput);

    rs = pstmt1.executeQuery();

    if(rs.next()) {
    //---------//     
        
        
        
             
DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
jTable3 = new  JTable(model);
model.addColumn("المهنة");
model.addColumn("المواليد");
model.addColumn("الجنس");
model.addColumn("اسماء العائلة");
     jTable1.setRowHeight(25);
     jTable1.setRowMargin(6);
  String g="",h="",j="";   
         Date i; 
        
        String sql="SELECT  PERSON.name, PERSON.ADDRESS,PERSON.regin, PERSON.PHONE,PERSON.HUMAN, PERSON.PHOTO,SON.name as qq,SON.gander,SON.birth,SON.JOB FROM PERSON INNER JOIN SON ON PERSON.PERSONID=SON.PERSONID where PERSON.name='"+jserch.getText()+"'";
  
     con=Connections.getConnection();
     try{
     st=con.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
      jTextField16.setText(rs.getString("name"));
      jTextField13.setText(rs.getString("phone"));
      jTextField15.setText(rs.getString("address"));
      jTextField14.setText(rs.getString("regin"));
      String e=rs.getString("human");
      if(e.equals("فقراء")){
                jRadioButton5.setSelected(true);
                jRadioButton6.setSelected(false);
            } else{
                jRadioButton6.setSelected(true);
                jRadioButton5.setSelected(false); 
            }
             BufferedImage bImage = null;
             File initialImage = new File("mcfi/"+rs.getString("name")+".png");
             bImage = ImageIO.read(initialImage);
             ImageIcon tt=new ImageIcon(bImage);
             Image img=tt.getImage();
             Image o=img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
             ImageIcon mg=new ImageIcon(o);
             lblimg.setIcon(mg);
              g=rs.getString("qq");
             h=rs.getString("gander");
             i=rs.getDate("birth");
             j=rs.getString("JOB");
             
       model.addRow(new Object[]{j, i,h,g});  
      
      
      
    
     
     }
     }catch(Exception e){
         System.out.print( e);
     }
     panebody.removeAll();
     panebody.repaint();
     panebody.revalidate();
     panebody.add(jPanel23);
     panebody.repaint();
     panebody.revalidate();   
        
        
        
        
        
   //----------------------//     
    }else{
        lblserch.setText("لاتوجد نتيجة");
          panebody.removeAll();
     panebody.repaint();
     panebody.revalidate();
     panebody.add(jPanel23);
     panebody.repaint();
     panebody.revalidate();   
        
    }
   } catch(Exception ex) {
    //add logging
   }
    
   
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void lblimg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg1MouseClicked

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
    }//GEN-LAST:event_lblimg1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

      

    }//GEN-LAST:event_jTable3MouseClicked

    private void jserchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jserchMouseClicked
       jserch.setText("");
    }//GEN-LAST:event_jserchMouseClicked

    private void jserchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jserchMouseExited
      
    }//GEN-LAST:event_jserchMouseExited

    private void jserchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jserchMousePressed
     
    }//GEN-LAST:event_jserchMousePressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
     jserch.setText("بحث/اسم رب الاسرة");
    }//GEN-LAST:event_formMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    panebody.removeAll();
     panebody.repaint();
     panebody.revalidate();
     panebody.invalidate();
     panebody.add(jPanel6);
     panebody.repaint();
     panebody.revalidate(); 
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jlogin;
    private javax.swing.JPanel jpanelbtn;
    private javax.swing.JPanel jpanelbtn2;
    private javax.swing.JTextField jserch;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton10;
    private keeptoo.KButton kButton11;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KButton kButton7;
    private keeptoo.KButton kButton8;
    private keeptoo.KButton kButton9;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JLabel lblserch;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel panebody;
    public javax.swing.JPanel panelhm;
    private javax.swing.JPanel panelmn;
    private javax.swing.JPanel pnltitle;
    private javax.swing.JPanel sting;
    private javax.swing.JTextField tftitl;
    public javax.swing.JLabel user1lbl;
    public javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables
 
    
    
    
    public void idd(){
         String sql="SELECT * FROM PERSON";
     con=Connections.getConnection();
     try{
     st=con.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
      
  
         
      gid=rs.getInt("PERSONID");
   
     
     }
     }
     catch(Exception e){
         System.out.print( e);
     }
   }
    public void iidd(){
         String aa="";
        String sql="SELECT DISTINCT name FROM PERSON";
     con=Connections.getConnection();
     try{
     st=con.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
    aa=rs.getString("name");

    jComboBox1.addItem(aa);
     
     }
     }
     catch(Exception e){
         System.out.print( e);
     }
   }
   public void  title(){
      
     
      String sql="SELECT * FROM TITLEE";
     con=Connections.getConnection();
     try{
     st=con.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
        rr=rs.getInt("ID");
      ff=rs.getString("TTITLE"); 
      
     
     }
     }
     catch(Exception e){
         System.out.print( e);
     }
      
   }
    public void  titleexist(){
      
     boolean tt;
      String sql="SELECT * FROM TITLEE where id=?";
      
     
     con=Connections.getConnection();
     try{
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setInt(1, 1);
    rs = pst.executeQuery();

if (rs.next()) {
   
} else {
   String sqll="INSERT INTO `titlee` (`id`, `ttitle`) VALUES ('1', ' '); ";
  pst=con.prepareStatement(sqll);
   pst.executeUpdate();
   
}
         
         
         
         
     }
     catch(Exception e){
         System.out.print( e);
     }
      
   }
    
  
  
 


  

class CustomRenderer implements TableCellRenderer
{
    JScrollPane scrollPane;
    JTextArea textArea;
  
    public CustomRenderer()
    {
        Font tr=null;
     try{
         tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         tr=tr.deriveFont(Font.BOLD,18);
        
                     
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
        
        
        
        textArea = new JTextArea();
         Font f = new Font("Arial", Font.BOLD, 18);
        textArea.setFont(tr);
        textArea.setSize(200, 200);

        textArea.setBorder(new MatteBorder(1, 0, 1, 1, Color.LIGHT_GRAY)); 
     
        textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setSize(200, 200);
       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
       scrollPane.setBorder(null);
    }
  
    public Component getTableCellRendererComponent(JTable table,
                                                   Object value,
                                                   boolean isSelected,
                                                   boolean hasFocus,
                                                   int row, int column)
    {
        textArea.setText((String)value);
        return scrollPane;
    }
}
  
class CustomEditor implements TableCellEditor
{
    JTextArea textArea;
    JScrollPane scrollPane;
  
    public CustomEditor()
    {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
    }
  
    public Component getTableCellEditorComponent(JTable table,
                                                 Object value,
                                                 boolean isSelected,
                                                 int row, int column)
    {
        textArea.setText((String)value);
        return scrollPane;
    }
  
    public void addCellEditorListener(CellEditorListener l) { }
    public void cancelCellEditing() { }
    public Object getCellEditorValue()
    {
        return textArea.getText();
    }
    public boolean isCellEditable(EventObject anEvent)
    {
        return true;
    }
    public void removeCellEditorListener(CellEditorListener l) { }
    public boolean shouldSelectCell(EventObject anEvent)
    {
        return true;
    }
    public boolean stopCellEditing()
    {
        return true;
    }
}



/* private ActionListener updateListener = new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            Icon icon = new ImageIcon("add.png");
            final JButton button = new JButton("أضافة فرد",icon); 
            button.setSize(120, 40);
            button.setBackground(Color.BLUE);
            button.setOpaque(true);
     
            button.setBounds(10, 30, 120, 50);
            jPanel12.add(button);
            button.addActionListener(new ActionListener()
            {  
                public void actionPerformed(ActionEvent event)
                {
 
      
       
                }
            });
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    
                }
            });
            
        }
    };*/
 
 
 public void backk(){
     
   
     jPanel1.removeAll();
    jPanel1.revalidate(); 
     jPanel1.repaint();
     jPanel1.add(jPanel4);
      jPanel1.revalidate(); 
     jPanel1.repaint();
    
    
 /*   panelhm.removeAll();
    panelhm.repaint();
    panelhm.revalidate();
    panelhm.add(jPanel1);
    panelhm.repaint();
    panelhm.revalidate();
     
     
 */
    
    
 }
 class RoundedPanell extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanell(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanell(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanell(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanell(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
    }
 /*----------------------------------------------------------*/

     public class LabelRenderer extends DefaultTableCellRenderer {
 
        /**
         * @see java.io.Serializable
         */
        public static final long serialVersionUID = 2l;
 
        /*
         * (non-Javadoc)
         * 
         * @see
         * javax.swing.table.DefaultTableCellRenderer#getTableCellRendererComponent
         * (javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
         */
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
            
           // LOGGER.info("Rendering (" + row + "," + column + ") - "
                 //   + value.toString() + " as a label");
            JLabel label = new JLabel(value.toString());
                Font tr=null;
     try{
         tr=Font.createFont(Font.PLAIN,getClass().getResourceAsStream("GaliModern-ExtraBold.otf"));
         tr=tr.deriveFont(Font.PLAIN,12);
        
                     
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
           //  Font f = new Font("Arial", Font.BOLD, 18);
             label.setForeground(Color.GRAY);
            label.setFont(tr);
         label.setBorder(new MatteBorder(1, 1, 1, 0, Color.LIGHT_GRAY));
            
         
            return label;
        }
    }
     public class RoundBorder implements Border {

    private int radius;

    public RoundBorder(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, getRadius(), getRadius()));
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int value = getRadius() / 2;
        return new Insets(value, value, value,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
     


public class ShowListener implements ActionListener {

	        public void actionPerformed(ActionEvent e) {

	            jTextField11.setEnabled(false);

	        }

	    }
public class ShowListenerr implements ActionListener {

	        public void actionPerformed(ActionEvent e) {

	            jTextField11.setEnabled(true);

	        }

	    }




public void ttest(){
    
    
    
    
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

     
}


   public void connct(){
           
          query1 mq = new query1();
        ArrayList<product1> list = mq.www();
        String[] columnName = {"التسلسل","الهاتف"};
        Object[][] rows = new Object[list.size()][4];
        for(int i = 0; i < list.size(); i++){
          
              rows[i][1]=list.get(i).getName();
              rows[i][0]=list.get(i).getphone();
           
     
      
           
        }
         modeel mo = new modeel(rows, columnName);
       
      jTable1.setModel(mo);
       
    
        TableColumnModel colModel = jTable1.getColumnModel();
        TableColumn col = colModel.getColumn(1);
         TableColumn coll = colModel.getColumn(0);
        col=colModel.getColumn(1);
        col.setCellRenderer(new CustomRenderer());
        col.setCellEditor(new CustomEditor());
        coll.setCellRenderer(new LabelRenderer());
        jTable1.setRowHeight(80);
        jTable1.setRowMargin(25);
        jTable1.setTableHeader(null);
            Font tr=null;
     try{
         tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         tr=tr.deriveFont(Font.BOLD,14);
        
                     
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
      
        jTable1.setFont(tr);
        jTable1.setBackground(Color.white);
        
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false); 
 
   }
 
      


   public void conct(){
           
          query11 mq = new query11();
        ArrayList<product1> list = mq.www();
        String[] columnName = {"التسلسل","الهاتف"};
        Object[][] rows = new Object[list.size()][4];
        for(int i = 0; i < list.size(); i++){
          
              rows[i][1]=list.get(i).getName();
              rows[i][0]=list.get(i).getphone();
           

     
      
           
        }
         modeel mo = new modeel(rows, columnName);
       
      jTable2.setModel(mo);
       
    
        TableColumnModel colModel = jTable2.getColumnModel();
        TableColumn col = colModel.getColumn(1);
         TableColumn coll = colModel.getColumn(0);
        col=colModel.getColumn(1);
        col.setCellRenderer(new CustomRenderer());
        col.setCellEditor(new CustomEditor());
        coll.setCellRenderer(new LabelRenderer());
        jTable2.setRowHeight(80);
        jTable2.setRowMargin(25);
           Font tr=null;
     try{
         tr=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("calibrib.ttf"));
         tr=tr.deriveFont(Font.BOLD,14);
        
                     
                       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
       
        jTable2.setFont(tr);
        jTable2.setTableHeader(null);
       
        jTable2.setBackground(Color.white);
        
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false); 
 
   }
 
      



}

     
 

 
 




