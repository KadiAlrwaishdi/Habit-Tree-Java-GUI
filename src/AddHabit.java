import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

 public class AddHabit extends JFrame {
     JFrame frame = new JFrame();
 
    private JLabel lbl;
    private JLabel lblExample;
    private JTextField txtInput;
    private JButton btn;
    
    public AddHabit(){

    JPanel panel = new JPanel(); 
    panel.setBackground( new Color(248, 234, 222) );
    panel.setLayout(null);
        lbl = new JLabel("Write your habit: ");
        lbl.setFont(new Font("Serif", Font.PLAIN, 17));
        lbl.setBounds(130, 25, 130, 30);
        panel.add(lbl);

        txtInput = new JTextField(25);
        txtInput.setBounds(75, 65, 220, 30);
        txtInput.setHorizontalAlignment(JTextField.CENTER);
        panel.add(txtInput);

        lblExample = new JLabel("For example: Drink more water");
        lblExample.setFont(new Font("Serif", Font.PLAIN, 14));
        lblExample.setForeground(new Color(208,147,148));
        lblExample.setBounds(100, 95, 190, 30);
        panel.add(lblExample);

        btn = new JButton("ADD");
        btn.setBounds(300, 65, 40, 28);
        btn.setSize(new Dimension(60,27));
        btn.setBackground(new Color(224,224,224));
        panel.add(btn);
        add(panel);
        setTitle("Add a habit");
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null); 
        setResizable(false);
        getRootPane().setDefaultButton(btn); //make "Add button" automatically listen to Enter key 
        btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
          btnActionPerformed(evt); }  });               
    }

    private void btnActionPerformed(ActionEvent evt) {  
        if(txtInput.getText().equals("")){ new ErrorMsg();}
        else if(HabitTree.ImagePanel.MidPanel1.isShowing()) { //make sure MidPanel1 is not showing
               if(HabitTree.ImagePanel.MidPanel2.isShowing()){
                 if(HabitTree.ImagePanel.MidPanel3.isShowing()){
                   if(HabitTree.ImagePanel.MidPanel4.isShowing()){                    
                     if(HabitTree.ImagePanel.MidPanel5.isShowing()){
                      
                     }else{//Hide Top Panel
                          //add text to MidPanel 5
                      HabitTree.ImagePanel.MidPanel5.setVisible(true);
                      HabitTree.setOutput4(txtInput.getText());
                      txtInput.setText(""); //clear text field  
                      dispose();
                      HabitTree.ImagePanel.TopPanel.setVisible(false); //Hide Top Panel
                     }
                  }else{
                       //add text to MidPanel 4
                     HabitTree.ImagePanel.MidPanel4.setVisible(true);
                     HabitTree.setOutput3(txtInput.getText());
                      txtInput.setText(""); //clear text field  
                      dispose();
                  }
               }else{
                       //add text to MidPanel 3
                     HabitTree.ImagePanel.MidPanel3.setVisible(true);
                     HabitTree.setOutput2(txtInput.getText());
                      txtInput.setText(""); //clear text field   
                      dispose();
                     }
             }else{ //add text to MidPanel 2
                     HabitTree.ImagePanel.MidPanel2.setVisible(true);
                     HabitTree.setOutput1(txtInput.getText());
                      txtInput.setText(""); //clear text field   
                      dispose();
                     }
           
           }else{  //add text to MidPanel 1
                    HabitTree.ImagePanel.MidPanel1.setVisible(true);
                    HabitTree.setOutput0(txtInput.getText());
                     txtInput.setText(""); //clear text field   
                      dispose();
                     }
                 }
 
  class ErrorMsg extends JFrame {
    Label Msg;
   public ErrorMsg(){
    JPanel pnl = new JPanel();
     Msg = new Label("No text was Entered. Please try again.");
     Msg.setFont(new Font("Serif", Font.PLAIN, 16));
     Msg.setBounds(25, 15, 250, 30);
     pnl.add(Msg);
     pnl.setLayout(null);
     pnl.setBackground( new Color(254, 254, 191) );
     add(pnl);
     setTitle("Error");
     setSize(300, 100);
     setLocationRelativeTo(null);
     setVisible(true); 
     setResizable(false);
     Toolkit.getDefaultToolkit().beep();
}  } 
   

}
