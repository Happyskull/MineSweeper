/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
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

       MainGameFrame.setSize(500,750);
       MainGameFrame.setBackground(new Color(24, 26, 29));
       MainGameFrame.setLayout(null);
       MainGameFrame.setResizable(false);

       //loads and sets the games icon
       try {
          BufferedImage img = ImageIO.read(new File("src/Assets/Icon.png"));
          MainGameFrame.setIconImage(img);
       } catch(IOException e){
          System.out.print("Couldn't fetch Icon!");
       }


       Board GameBoard = new Board(15, 15);
       GameBoard.setLayout(null);



       GameBoard.setVisible(true);
       GameBoard.GenerateCells();

       MainGameFrame.add(GameBoard);

       MainGameFrame.repaint();
       MainGameFrame.setVisible(true);
    }


    
}
