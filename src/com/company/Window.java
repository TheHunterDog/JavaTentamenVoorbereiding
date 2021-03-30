package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
//    Declare all the items here:
    private JButton button;
    private Graphics Graph;
    private Dialog dialog;
    public Window(){
        setSize(new Dimension(800,1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
//        Create the item that you add below
//        like: button = new JButton
        Graph = new Graphics();
        button = new JButton();
//        Other stuff
        button.setText("Dialog");
        button.addActionListener(this);
//        Add new items
//        Like add(button) that is declared above as private
        add(button);
        add(Graph);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            dialog = new Dialog(this);
            if(!dialog.GetText().isEmpty() && dialog.GetAns()){
                JOptionPane.showMessageDialog(null,"You typed: " +dialog.GetText(),"Congrats",JOptionPane.PLAIN_MESSAGE);

            }
        }

    }
}
