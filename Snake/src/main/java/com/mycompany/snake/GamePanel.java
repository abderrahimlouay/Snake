/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author abderrahim
 */
public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
    static final int DELAY = 175;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random rnadom;
    
    public GamePanel() {
       this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
       this.setBackground(Color.BLACK);
       this.setFocusable(true);
       this.addKeyListener(new MyKeyAdapter());
       startGame();
    }
    
    public void startGame(){
     //what should the game start with ?
     //an appel
     newAppel();
     running = true ;
     // timer
     timer = new Timer(DELAY,this);
     timer.start();
     //
    
    }
    public void paintComponent(Graphics g) {
    
    }
    public void draw (Graphics g) {
    
    }
    public void newAppel () {
    
    }
    
    public void move () {
    
    }
    
    public void checkApple () {
    
    }
    public void checkCollisions() {
    
    }
    public void gameOver(Graphics g) {
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (running) {
        
        }
    }
    
    public class MyKeyAdapter extends KeyAdapter{

        /**
         *
         * @param e
         */
        @Override
        public void keyPressed (KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT :
                    if(direction != 'R') {
                        direction = 'L';
                    }
                break;
                case KeyEvent.VK_RIGHT :
                    if(direction != 'L') {
                        direction = 'R';
                    }
                break;
                case KeyEvent.VK_UP :
                    if(direction != 'D') {
                        direction = 'U';
                    }
                break;
                case KeyEvent.VK_DOWN :
                    if(direction != 'U') {
                        direction = 'D';
                    }
                break;
            }
        
        }
    
    }
}
