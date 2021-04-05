package Example;

        import com.company.Dialog;
        import com.company.Person;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import static Example.Window.ShowMessage;

public class mainWindow extends JFrame implements ActionListener {
    //    Declare all the items here:
    private JButton Logout;

    public mainWindow(){
        setSize(new Dimension(500,800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());





        Logout = button("logout",this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Logout){
            WindowManager.isloggedin = false;
            ShowMessage(JOptionPane.INFORMATION_MESSAGE,"Bye","Bye",null);
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
