/*
 * This program asks for a name then says hello to the user
 * @author Thomas Quigley
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JTextField inputName;
  JTextField outputGreeting;
  JButton sayHello;

  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Hello!");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel and add it to the frame
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    frame.add(mainPanel);

    // make the text fields
    inputName = new JTextField();
    inputName.setBounds(200, 100, 400, 30);

    outputGreeting = new JTextField();
    outputGreeting.setBounds(200, 300, 400, 30);
    outputGreeting.setEnabled(false);

    // make the button
    sayHello = new JButton("Say Hello");
    sayHello.setBounds(350, 450, 100, 30);
    sayHello.addActionListener(this);
    sayHello.setActionCommand("sayHello");


    // add the fields and button to the mainPanel
    mainPanel.add(inputName);
    mainPanel.add(outputGreeting);
    mainPanel.add(sayHello);
  

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if (command.equals("sayHello")) {
      // button was pressed
      // say hello
      String name = inputName.getText();
      outputGreeting.setText("Hello " + name);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
