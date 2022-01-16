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
       long time = System.currentTimeMillis();
       Board MainBoard = new Board(15, 15);
       MainBoard.setLayout(null);  
       MainBoard.setVisible(true);  
       
      
       MainBoard.GenerateCells();
    }
    
}
