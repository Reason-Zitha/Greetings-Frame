/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author REASON
 */
public class GreetingsGUI extends JFrame{
    //create panels
       private JPanel namePnl;
       private JPanel surnamePnl;
       private JPanel nameAndSurnamePnl;
       private JPanel greatingAreaPnl;
       private JPanel btnsPnl;
       private JPanel mainPnl;
       private JPanel headingPnl;
       
    //labels
       private JLabel headingLbl;
       private JLabel nameLbl;
       private JLabel surnameLbl;
       
    //TextFields
       private JTextField nameTxtFld;
       private JTextField surnameTxtFld;
       
    //textArea
       private JTextArea greetingTxtArea;
    //buttons
       private JButton greetBtn;
       private JButton clearBtn;
       private JButton exitBtn;
       
    public GreetingsGUI() {
         
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(600,600);
        setBackground(Color.yellow);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create panels 
        
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        nameAndSurnamePnl = new JPanel(new GridLayout(2, 1));
        greatingAreaPnl = new JPanel(new FlowLayout());
        greatingAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        //create textFileds
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //create the textArea 
        greetingTxtArea = new JTextArea(40,50);
        greetingTxtArea.setEditable(false);
        greetingTxtArea.setText("Hello [name] [surname]");
        
        //creating button
        
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("EXIT");
        
        // add name label and nametextfield to panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        //add surname label and surname TextField to panel 
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        //add name panel and surname panel to collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        //add the greetings area to panel 
        greatingAreaPnl.add(greetingTxtArea);
        //add buttons to the btns panel 
        
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        //add all the panels to mainPnl
        
        mainPnl.add(nameAndSurnamePnl , BorderLayout.NORTH);
        mainPnl.add(greatingAreaPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl , BorderLayout.SOUTH);
        
        //add the main panel to the frame panel
        
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        //make the frame visible
        
        setVisible(true);
        
        
        
    }
    
}
