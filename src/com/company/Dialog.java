package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog extends JDialog implements ActionListener {
    private JButton ButtonYes;
    private JButton ButtonNo;
    private JLabel Question;
    private JTextPane InputText;
    private boolean Ans;
    public Dialog(JFrame frame){
        super(frame, true);
        setSize(300, 150);
        setLayout(new FlowLayout());
        Question = new JLabel("Type something");
        add(Question);
        InputText = new JTextPane();
        add(InputText);
        ButtonYes = new JButton("Yes");
        ButtonYes.addActionListener(this);
        add(ButtonYes);
        ButtonNo = new JButton("No");
        ButtonNo.addActionListener(this);
        add(ButtonNo);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Ans = e.getSource() == ButtonYes;
        setVisible(false);
    }

    public boolean GetAns(){
        return Ans;
    }
    public String GetText() {
        return InputText.getText();
    }
}
