/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author a.ambagaspitiya
 */
public class Cell extends JButton {
    public int id;
    public boolean isMine = false;
    public int SidesNumber;
    Point Position;
    Dimension Size;

    
    
    public void Reveal(){
        Random rand = new Random();
        if (isMine){
            this.setBackground(new Color(rand.nextInt(150, 230), rand.nextInt(40, 50), rand.nextInt(40, 50)));
        }
    }
    public void Conceal(){
        Random rand = new Random();
        if (isMine){
            System.out.println("Concealing");
            this.setBackground(new Color(rand.nextInt(40, 50), rand.nextInt(40, 50), rand.nextInt(40, 50)));
        }
    }
    
    public Cell(Point position, Dimension dimension){
        Random rand = new Random();
        this.Position = position;
        this.Size = dimension;
        this.setBackground(new Color(rand.nextInt(40, 50), rand.nextInt(40, 50), rand.nextInt(40, 50)));
        this.setFocusPainted(true);
        this.setBorder(new MatteBorder(1, 1, 1, 1, new Color(58, 60, 65)));

        if (new java.util.Random().nextInt(100) < 10){
            isMine = true;
        }

        this.setBounds(this.Position.x, this.Position.y, this.Size.width, this.Size.height);
    }
}
