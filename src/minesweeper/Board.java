/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Random;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author a.ambagaspitiya
 */
public class Board extends JFrame{
    private static Random RandomGen = new Random();
    
    static int Width = 15; 
    static int Height = 15; 
    static Font mainFont = new Font("ComicSans", Font.BOLD, 17);
    static int IsMinePercentage = 50;
    
    JFrame Board;  
    static Cell Grid[][];
   
    
    
    public void GenerateCells(){
        Grid = new Cell[Width][Height];
        
        for (int x=0;x<=Width;x++) {
            int cellID = 0;
            for (int y=0;y<=Height;y++) {
                Cell newCell = new Cell(x, y);//Create a new cell
                
                newCell.id = cellID;
                System.out.println("Cell Generated with ID: " + String.valueOf(cellID));
                cellID++;
                
                
                if (RandomGen.nextInt(100) > IsMinePercentage){
                    newCell.isMine = true;
                }
                System.out.println(newCell.isMine);
                

                Grid[x][y] = newCell;//Insert the cell into grid
            }
        }
    }
   
    
    public Board(int x, int y){
        Width = x;
        Height = y;
        
        JButton b=new JButton("click");//create button  
        b.setBounds(130,100,100, 40);  

        add(b);//adding button on frame  
        setSize(400,500);  
    }
}
