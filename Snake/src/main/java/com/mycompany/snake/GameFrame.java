package com.mycompany.snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    public GameFrame() {
        this.add(new GamePanel()); // fixed

        this.setTitle("Snake Game"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // sizes frame to fit panel
        this.setVisible(true);
        this.setLocationRelativeTo(null); // center on screen
    }
}
