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
    public static int CellWidth = 25;
    public static int CellHeight = 25;
    public int id;
    public boolean isMine = false;
    public int SidesNumber;
    Point Pos;
    
    
    
    static void RevealAll(){
        
    }
    
    public Cell(int posx, int posy){
        this.Pos = new Point(posx*CellHeight, posy*CellHeight);
        this.setBounds(this.Pos.x,this.Pos.y,this.CellWidth, this.CellHeight);
    }
}
