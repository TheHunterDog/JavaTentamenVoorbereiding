package com.company;

import javax.swing.*;
import java.awt.*;

public class Graphics extends JPanel {
    public Graphics(){
//        All the stuff that needs to be done before the draw
        setPreferredSize(new Dimension(800,1000));
    }

    public void paintComponent(java.awt.Graphics g){
//        Get panel size
        Dimension d = this.getSize();
//        Loop the paint
        super.paintComponent(g);
//        Example drawing
        setBackground(Color.gray);
        g.setColor(Color.orange);
        g.drawLine(d.width,0,0,d.height);
        g.drawLine(0,0,d.width,d.height);
        g.setColor(Color.BLACK);
        g.drawOval(19,100,101,101);
        g.setColor(Color.red);
        g.fillOval(20,100,100,100);
    }

}
