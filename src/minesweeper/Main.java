/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author a.ambagaspitiya
 */
public class Main {
    
    public static void delay(int ms){
       try
       {
          Thread.sleep(ms);
       }
       catch(InterruptedException ex)
       {
          Thread.currentThread().interrupt();
       }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame MainGameFrame = new JFrame("Mine Sweeper");

       MainGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       MainGameFrame.setSize(500,750);
       MainGameFrame.setBackground(new Color(14, 16, 19));
       MainGameFrame.setLayout(new BorderLayout());
       MainGameFrame.setResizable(true);

       //loads and sets the games icon
       try {
          BufferedImage img = ImageIO.read(new File("src/Assets/Icon.png"));
          MainGameFrame.setIconImage(img);
       } catch(IOException e){
          System.out.println("Couldn't fetch Icon!");
       }

       Board GameBoard = new Board(15, 15);
       GameBoard.GenerateCells();

       JLabel Title = new JLabel();
       Title.setText("Mine Sweeper");

       JButton revealButton = new JButton();
       revealButton.setBounds(50, 50, 150, 20);
       revealButton.setText("Reveal Button");

       revealButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
             GameBoard.count += 1;
             System.out.println(GameBoard.count);
             if (GameBoard.count % 2 != 0) {
                GameBoard.ConcealMines();
             } else {
                GameBoard.RevealMines();
             }
          }
       });

       MainGameFrame.add(revealButton, "South");
       MainGameFrame.add(GameBoard, "Center");
       MainGameFrame.add(Title, "North");
       MainGameFrame.repaint();
       MainGameFrame.setVisible(true);



    }


    
}
