package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Graphics extends JPanel {
    private BufferedImage image;
    private Person person;
    public Graphics(Person person){
//        All the stuff that needs to be done before the
        setPreferredSize(new Dimension(800,1000));

        try {
            image = ImageIO.read(new File("src/images/image.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        this.person = person;
    }

    public void paintComponent(java.awt.Graphics g) {
//        Get panel size
        Dimension d = this.getSize();
//        Loop the paint
        super.paintComponent(g);
//        Example drawing
        setBackground(Color.gray);
        g.setColor(Color.orange);
        g.drawLine(d.width, 0, 0, d.height);
        g.drawLine(0, 0, d.width, d.height);
        g.setColor(Color.BLACK);
        g.drawOval(19, 100, 101, 101);
        g.setColor(Color.red);
        g.fillOval(20, 100, 100, 100);
        if (person != null) {
            if (person.isStrong()) {
                g.drawImage(image, 140, 140, null);
            }
        }
    }

}
