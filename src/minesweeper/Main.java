/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
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
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame MainGameFrame = new JFrame("Mine Sweeper");
       GridBagConstraints gbc = new GridBagConstraints();

       MainGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       MainGameFrame.setSize(500,750);
       MainGameFrame.setBackground(new Color(14, 16, 19));
       MainGameFrame.setLayout(new GridBagLayout());
       MainGameFrame.setResizable(true);

       //loads and sets the games icon
       try {
          BufferedImage img = ImageIO.read(new File("src/Assets/Icon.png"));
          MainGameFrame.setIconImage(img);
       } catch(IOException e){
          System.out.print("Couldn't fetch Icon!");
       }

       Board GameBoard = new Board(15, 15);
       GameBoard.GenerateCells();

       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 0;

       MainGameFrame.add(GameBoard, gbc);
       MainGameFrame.repaint();
       MainGameFrame.setVisible(true);
    }


    
}
