/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.concurrent.TimeUnit;
import java.awt.*;
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
       JFrame MainGameFrame = new JFrame("MainGameFrame");
       
       MainGameFrame.setSize(400,400);
       MainGameFrame.setLayout(null);
       MainGameFrame.setVisible(true);
       MainGameFrame.setResizable(true);

       Board GameBoard = new Board(15, 15);
       GameBoard.setBackground(new Color(18, 18, 18));
       GameBoard.setLayout(null);



       GameBoard.setVisible(true);
       GameBoard.GenerateCells();

       MainGameFrame.add(GameBoard);
    }


    
}
