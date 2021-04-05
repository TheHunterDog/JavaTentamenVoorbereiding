package Example;

import com.company.Dialog;
import com.company.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
//    Declare all the items here:
    private JButton Login;
    private JTextPane loginname;
    public Window(){
        setSize(new Dimension(500,800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        loginname = new JTextPane();
        add(loginname);



        Login = button("Login",this);
        setVisible(true);
    }
    public String getLoginText(){
        return loginname.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Login){
            WindowManager.isloggedin = true;
            ShowMessage(JOptionPane.INFORMATION_MESSAGE,"Congrats" + loginname.getText() + " You are logged in","Success",null);
            dispose();
        }
    }

    private JButton button(String Text,java.awt.event.ActionListener action){
        JButton b = new JButton();
        b.setText(Text);
        b.addActionListener(action);
        super.add(b);
        return b;
    }
    public static void ShowMessage(int urgency , String Text, String title, java.awt.Component parentframe){
        JOptionPane.showMessageDialog(parentframe,Text,title,urgency);


    }

}
