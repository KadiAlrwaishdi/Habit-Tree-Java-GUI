import java.awt.*;   
import java.awt.event.*;
import javax.swing.*;

public class HabitTree extends JFrame  {

    //grouping textfields in an array
    private static JTextField[] txtOutput = new JTextField[]{
   new JTextField("",25),new JTextField("",25),new JTextField("",25),new JTextField("",25),new JTextField("",25)};


    HabitTree () {
   //create Background Panel to add ImagePanel to it     
      JPanel BackgoundPanel = new JPanel(); 
      BackgoundPanel.setLayout(new BorderLayout());  
      ImagePanel imagePanel = new ImagePanel(); //a panel which Background.png is inserted in
      BackgoundPanel.add(imagePanel);
      BackgoundPanel.setOpaque(true); 
      add(BackgoundPanel); //add BakgoroundPanel to JFrmae 
       
    
     
      //set charastristics of JFrame 
      setTitle("HABIT TREE");  
      pack();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
      setResizable(false);
   
    } 
   //static stter functions for text fields 
   public static void setOutput0(String txt){txtOutput[0].setText(txt);}
   public static void setOutput1(String txt){txtOutput[1].setText(txt);}
   public static void setOutput2(String txt){txtOutput[2].setText(txt);}
   public static void setOutput3(String txt){txtOutput[3].setText(txt);}
   public static void setOutput4(String txt){txtOutput[4].setText(txt);}


   // The entry main() method
  public static void main(String[] args) { HabitTree app = new HabitTree();}
   

//Inner class ImagePanel
   static class ImagePanel extends JPanel {
       
  //make Main & mids Panels static & protected to be accessible by AddHabit class
  protected static JPanel MainPanel = new JPanel();
  protected static JPanel TopPanel = new JPanel(); 
  protected static JPanel MidPanel1 = new JPanel(); 
  protected static JPanel MidPanel2 = new JPanel(); 
  protected static JPanel MidPanel3 = new JPanel(); 
  protected static JPanel MidPanel4 = new JPanel(); 
  protected static JPanel MidPanel5 = new JPanel(); 
  
 private JRadioButton DoneButton1 = new JRadioButton(); 
 private JRadioButton NotDoneButton1 = new JRadioButton();      
 private JRadioButton DoneButton2 = new JRadioButton(); 
 private JRadioButton NotDoneButton2 = new JRadioButton();
 private JRadioButton DoneButton3 = new JRadioButton(); 
 private JRadioButton NotDoneButton3 = new JRadioButton();      
 private JRadioButton DoneButton4 = new JRadioButton(); 
 private JRadioButton NotDoneButton4 = new JRadioButton();
 private JRadioButton DoneButton5 = new JRadioButton(); 
 private JRadioButton NotDoneButton5 = new JRadioButton();
 
 private Image image;
 private JButton btnPlus;
 private JLabel GifImg;
 private String GifImageName = "DefaultFrame";
 private ImageIcon imgicon;
       
//constructor
    public ImagePanel ()
    {
        setOpaque(false); //set ImagePanel to be transparent 
        try{
         image = Toolkit.getDefaultToolkit().getImage( ImagePanel.class.getResource("/images/Background.png"));}
        catch(Exception e)
        {
            e.printStackTrace();
        }
        createGUI();
    }
//createGUI method 
    public void createGUI(){
     //creating Bottom panel  
      JPanel BottomPanel = new JPanel(); 

    //setting all panels' layout to null        
      MainPanel.setLayout(null);
      TopPanel.setLayout(null);
      MidPanel1.setLayout(null);
      MidPanel2.setLayout(null);
      MidPanel3.setLayout(null);
      MidPanel4.setLayout(null);
      MidPanel5.setLayout(null);
      BottomPanel.setLayout(null);
 
   //set size for Main Panel
     MainPanel.setPreferredSize( new Dimension( 550, 560 ) );
    
   //Set Bounds for all Panels inside main panel 
      TopPanel.setBounds(0, 0, 550, 70);
      MidPanel1.setBounds(0, 70, 550, 70);
      MidPanel2.setBounds(0, 140, 550, 70);
      MidPanel3.setBounds(0, 210, 550, 70);
      MidPanel4.setBounds(0, 280, 550, 70);
      MidPanel5.setBounds(0, 350, 550, 70);
      BottomPanel.setBounds(0, 420, 550, 140);
    
   //Set all Panels to be transparent      
     MainPanel.setOpaque(false);
     TopPanel.setOpaque(false);  
     MidPanel1.setOpaque(false);  
     MidPanel2.setOpaque(false);  
     MidPanel3.setOpaque(false);  
     MidPanel4.setOpaque(false);  
     MidPanel5.setOpaque(false);  
     BottomPanel.setOpaque(false);

     //create & set style for TopPanel elements           
        JLabel lblAdd = new JLabel("Add a habit"); 
        lblAdd.setFont(new Font("Serif", Font.BOLD, 19));
        lblAdd.setForeground(new Color(185,132,172));
        btnPlus = new JButton(" + ");
        btnPlus.setBackground(new Color(248,234,222));
        btnPlus.setToolTipText("You can add up to 5 habits");
 
      //Set Bounds for Top Panel elements         
        lblAdd.setBounds(195, 30, 250, 30);
        btnPlus.setBounds(300, 30, 50, 30);
 
      //Add Top Panel elements              
        TopPanel.add(lblAdd);   
        TopPanel.add(btnPlus); 
        
      //set alignment of text inside text fields   
        txtOutput[0].setEditable(false);
        txtOutput[0].setHorizontalAlignment(JTextField.CENTER);
        txtOutput[1].setEditable(false);
        txtOutput[1].setHorizontalAlignment(JTextField.CENTER);
        txtOutput[2].setEditable(false);
        txtOutput[2].setHorizontalAlignment(JTextField.CENTER);
        txtOutput[3].setEditable(false);
        txtOutput[3].setHorizontalAlignment(JTextField.CENTER);
        txtOutput[4].setEditable(false);       
        txtOutput[4].setHorizontalAlignment(JTextField.CENTER);       

        //Set font type & color for "Done" ,"Not Done" labels in MidPanel1  
        JLabel lblDone = new JLabel("Done");
        lblDone.setFont(new Font("Serif", Font.BOLD, 15));
        lblDone.setForeground(new Color(140,140,140));
        JLabel lblNotDone = new JLabel("Not Done"); 
        lblNotDone.setFont(new Font("Serif", Font.BOLD, 15));
        lblNotDone.setForeground(new Color(140,140,140));
                
        //Set Bounds for Mid Panel 1 elements 
        lblDone.setBounds(20, 1, 250, 30);
        lblNotDone.setBounds(70, 1, 250, 30);
        txtOutput[0].setBounds(150, 30, 250, 30);
        NotDoneButton1.setBounds(80, 30, 20, 30);
        DoneButton1.setBounds(30, 30, 20, 30);
        
      //Add Mid Panel 1 elements        
        MidPanel1.add(lblDone); 
        MidPanel1.add(lblNotDone);         
        MidPanel1.add(txtOutput[0]);
        MidPanel1.add(NotDoneButton1);
        MidPanel1.add(DoneButton1);

      //Set Bounds for Mid Panel 2 elements 
        txtOutput[1].setBounds(150, 20, 250, 30);
        NotDoneButton2.setBounds(80, 20, 20, 30);
        DoneButton2.setBounds(30, 20, 20, 30);
 
     //Add Mid Panel 2 elements                
        MidPanel2.add(txtOutput[1]);
        MidPanel2.add(NotDoneButton2);
        MidPanel2.add(DoneButton2);

      //Set Bounds for Mid Panel 3 elements 
        txtOutput[2].setBounds(150, 20, 250, 30);
        NotDoneButton3.setBounds(80, 20, 20, 30);
        DoneButton3.setBounds(30, 20, 20, 30);
 
     //Add Mid Panel 3 elements                
        MidPanel3.add(txtOutput[2]);
        MidPanel3.add(NotDoneButton3);
        MidPanel3.add(DoneButton3);

      //Set Bounds for Mid Panel 4 elements 
        txtOutput[3].setBounds(150, 20, 250, 30);
        NotDoneButton4.setBounds(80, 20, 20, 30);
        DoneButton4.setBounds(30, 20, 20, 30);
 
     //Add Mid Panel 4 elements                
        MidPanel4.add(txtOutput[3]);
        MidPanel4.add(NotDoneButton4);
        MidPanel4.add(DoneButton4);

      //Set Bounds for Mid Panel 5 elements 
        txtOutput[4].setBounds(150, 20, 250, 30);
        NotDoneButton5.setBounds(80, 20, 20, 30);
        DoneButton5.setBounds(30, 20, 20, 30);
 
     //Add Mid Panel 5 elements                
        MidPanel5.add(txtOutput[4]);
        MidPanel5.add(NotDoneButton5);
        MidPanel5.add(DoneButton5);
   
    //create ButtonGroups
       ButtonGroup G1 = new ButtonGroup();
        G1.add(DoneButton1);
        G1.add(NotDoneButton1);
       ButtonGroup G2 = new ButtonGroup();
        G2.add(DoneButton2);
        G2.add(NotDoneButton2);
       ButtonGroup G3 = new ButtonGroup();
        G3.add(DoneButton3);
        G3.add(NotDoneButton3);
       ButtonGroup G4 = new ButtonGroup();
        G4.add(DoneButton4);
        G4.add(NotDoneButton4);
       ButtonGroup G5 = new ButtonGroup();
        G5.add(DoneButton5);
        G5.add(NotDoneButton5);          
   //set tool tip text for radio buttons
         DoneButton1.setToolTipText("You can not change your answer");
         DoneButton2.setToolTipText("You can not change your answer");
         DoneButton3.setToolTipText("You can not change your answer");
         DoneButton4.setToolTipText("You can not change your answer");
         DoneButton5.setToolTipText("You can not change your answer");
         NotDoneButton1.setToolTipText("You can not change your answer");
         NotDoneButton2.setToolTipText("You can not change your answer");
         NotDoneButton3.setToolTipText("You can not change your answer");
         NotDoneButton4.setToolTipText("You can not change your answer");
         NotDoneButton5.setToolTipText("You can not change your answer");
      //set radio buttons to be transparent     
         DoneButton1.setOpaque(false);
         DoneButton2.setOpaque(false);
         DoneButton3.setOpaque(false);
         DoneButton4.setOpaque(false);
         DoneButton5.setOpaque(false);
         NotDoneButton1.setOpaque(false);
         NotDoneButton2.setOpaque(false);
         NotDoneButton3.setOpaque(false);
         NotDoneButton4.setOpaque(false);
         NotDoneButton5.setOpaque(false);

   //Set icon image for GifLabel which contains GIF images     
       imgicon = new ImageIcon(this.getClass().getResource("/images/" +getGifImageName()+ ".gif"));
       GifImg = new JLabel(imgicon);
       GifImg.setToolTipText("Every Habit you Do, one leaf grows in your tree.");
       //GifImg.setPreferredSize(new Dimension(177, 122));
       //set bounds for GifLabel & add it to BottomPanel
       GifImg.setBounds(190, -10, 150, 150);
       BottomPanel.add(GifImg);
   
//add action listners 
   btnPlus.addActionListener(actionListener);           
   DoneButton1.addActionListener(actionListener); 
   DoneButton2.addActionListener(actionListener); 
   DoneButton3.addActionListener(actionListener); 
   DoneButton4.addActionListener(actionListener); 
   DoneButton5.addActionListener(actionListener); 
   DoneButton1.setActionCommand("DB1");
   DoneButton2.setActionCommand("DB2");
   DoneButton3.setActionCommand("DB3");
   DoneButton4.setActionCommand("DB4");
   DoneButton5.setActionCommand("DB5");
   NotDoneButton1.addActionListener(actionListener); 
   NotDoneButton2.addActionListener(actionListener); 
   NotDoneButton3.addActionListener(actionListener); 
   NotDoneButton4.addActionListener(actionListener); 
   NotDoneButton5.addActionListener(actionListener); 
   NotDoneButton1.setActionCommand("NDB1");
   NotDoneButton2.setActionCommand("NDB2");
   NotDoneButton3.setActionCommand("NDB3");
   NotDoneButton4.setActionCommand("NDB4");
   NotDoneButton5.setActionCommand("NDB5");
   
   //add all panels to Main panel       
      MainPanel.add(TopPanel);
      MainPanel.add(MidPanel1);           
      MainPanel.add(MidPanel2);           
      MainPanel.add(MidPanel3);           
      MainPanel.add(MidPanel4);           
      MainPanel.add(MidPanel5);           
      MainPanel.add(BottomPanel);
      add(MainPanel); //add MainPanel to JFrame

   //set Mid Panels visibility to false (visibility is controlled by ADD button in AddHabit class)       
     MidPanel1.setVisible(false);
     MidPanel2.setVisible(false);
     MidPanel3.setVisible(false);
     MidPanel4.setVisible(false);
     MidPanel5.setVisible(false);
    
        
    } //end of createGUI method
    //set dimension for main JFrame 
      @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(590, 570));
    }

  @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
     public void setGifImageName(String string){
         GifImageName = string;
     }
      public String getGifImageName(){
         return GifImageName;
     }
      //Change Gif Image  
      public void setGifImg (){
      GifImg.setIcon(
              new ImageIcon(
                      this.getClass().getResource(
                              "/images/"+getGifImageName()+".gif")));
              }
      
      ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                  if(e.getSource()==btnPlus){new AddHabit();}

                else if(e.getSource()==DoneButton1||e.getSource()==DoneButton2||
                        e.getSource()==DoneButton3||e.getSource()==DoneButton4||
                        e.getSource()==DoneButton5 ) 
          {
                   
                      if(getGifImageName().equals("DefaultFrame") || getGifImageName().equals("FirstFall"))
                            { setGifImageName("FirstFrame");
                               setGifImg();
                                }
                
                           else if(getGifImageName().equals("FirstFrame") || getGifImageName().equals("SecondFall"))
                                 {setGifImageName("SecondFrame");
                                   setGifImg();}
                                
                               else if(getGifImageName().equals("SecondFrame") || getGifImageName().equals("ThirdFall"))
                                {setGifImageName("ThirdFrame");
                                  setGifImg();}
                                     
                                    else if(getGifImageName().equals("ThirdFrame") || getGifImageName().equals("FourthFall"))
                                     {setGifImageName("FourthFrame");
                                       setGifImg();}
                                    
                                         else if(getGifImageName().equals("FourthFrame"))
                                          {setGifImageName("FifthFrame");
                                            setGifImg();}           
          }
                                
                         else if(e.getSource()==NotDoneButton1||e.getSource()==NotDoneButton2||
                                 e.getSource()==NotDoneButton3||e.getSource()==NotDoneButton4||
                                 e.getSource()==NotDoneButton5)
                     {
                                           if(getGifImageName().equals("DefaultFrame"))                                       
                                          {  setGifImageName("DefaultFrame");
                                              setGifImg();
                                              }
                                             
                                             else if(getGifImageName().equals("FirstFrame"))                                                  
                                              { 
                                              setGifImageName("FirstFall");
                                            setGifImg();}
                                               
                                                  else if(getGifImageName().equals("SecondFrame"))
                                                    {setGifImageName("SecondFall");
                                                      setGifImg();}
                                                    
                                                    else if(getGifImageName().equals("ThirdFrame"))
                                                    {setGifImageName("ThirdFall");
                                                      setGifImg();}
                                                        
                                                       else if(getGifImageName().equals("FourthFrame"))
                                                      {setGifImageName("FourthFall");
                                                      setGifImg();}
                                                     
                     }
          switch(e.getActionCommand()){
                case "DB1" :
                 case "NDB1": DoneButton1.setEnabled(false); NotDoneButton1.setEnabled(false); break;
                case "DB2": 
                 case "NDB2": DoneButton2.setEnabled(false); NotDoneButton2.setEnabled(false); break;
                case "DB3":
                 case "NDB3": DoneButton3.setEnabled(false); NotDoneButton3.setEnabled(false); break;
                case "DB4":
                 case "NDB4":DoneButton4.setEnabled(false); NotDoneButton4.setEnabled(false); break;
                case "DB5":
                 case "NDB5":DoneButton5.setEnabled(false); NotDoneButton5.setEnabled(false); break;
                
                                     }                          
                                                           
            }}; //end of ActionListener
 } //end of ImagePanel inner class
} //end of GUI2 class
