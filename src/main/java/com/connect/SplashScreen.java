package com.connect;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {
    private final int duration;

    public SplashScreen(int duration) {
        this.duration = duration;
    }

    public void showSplash() {
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);

        int width = 450;
        int height = 115;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        JLabel label = new JLabel(new ImageIcon("splash.jpeg"));
        content.add(label, BorderLayout.CENTER);
        content.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        setVisible(true);
        try { Thread.sleep(duration); } catch (Exception e) {}
        setVisible(false);
    }

    public void showSplashAndExit() {
        showSplash();
        // Perform any other tasks you want to do before the application starts
        // ...
        // After that, you can launch your main application window or activity.
    }
}
