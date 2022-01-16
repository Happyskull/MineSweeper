/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author a.ambagaspitiya
 */
public class Cell extends JButton {
    public int id;
    public boolean isMine;
    public int SidesNumber;
    Point Pos;
    
    
    
    static void RevealAll(){
        
    }
    
    public Cell(int posx, int posy){
        this.Pos = new Point(posx, posy);
        this.isMine = false;
        
        
        System.out.println("Height: " + this.Pos.y);
        System.out.println("Width: " + this.Pos.x);
    }
}
