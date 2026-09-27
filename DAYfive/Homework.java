package DAYfive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Homework extends JFrame implements ActionListener {

    JButton on, off, exit;
    JLabel image;
    Timer timer;

    BufferedImage originalImage;
    int angle = 0;

    Homework() {

        try {
            originalImage = ImageIO.read(new File("/java hcl/DAYfive/images.jpg"));
            image = new JLabel(new ImageIcon(originalImage));
        } catch (Exception e) {
            System.out.println("Image not found");
        }

        image.setHorizontalAlignment(JLabel.CENTER);

        on = new JButton("Turn On");
        off = new JButton("Turn Off");
        exit = new JButton("Exit");

        on.setActionCommand("ON");
        off.setActionCommand("OFF");
        exit.setActionCommand("EXIT");


        JPanel panel = new JPanel();

        panel.add(on);
        panel.add(off);
        panel.add(exit);

        add(image);
        add(panel, BorderLayout.SOUTH);

        on.addActionListener(this);
        off.addActionListener(this);
        exit.addActionListener(this);

        timer = new Timer(100, e -> {

            angle += 10;

            BufferedImage rotatedImage = new BufferedImage(
                    originalImage.getWidth(),
                    originalImage.getHeight(),
                    BufferedImage.TYPE_INT_ARGB
            );

            Graphics2D g = rotatedImage.createGraphics();

            g.rotate(
                    Math.toRadians(angle),
                    originalImage.getWidth() / 2,
                    originalImage.getHeight() / 2
            );

            g.drawImage(originalImage, 0, 0, null);

            g.dispose();

            image.setIcon(new ImageIcon(rotatedImage));
        });

        setTitle("Image Rotation");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "ON":
                timer.start();
                break;

            case "OFF":
                timer.stop();
                break;

            case "EXIT":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        new Homework();
    }
}