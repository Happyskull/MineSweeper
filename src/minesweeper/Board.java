/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author a.ambagaspitiya
 */
public class Board extends JFrame{
    private static Random RandomGen = new Random();
    
    static int GridWidth = 15;
    static int GridHeight = 15;
    static Font mainFont = new Font("ComicSans", Font.BOLD, 17);
    static int IsMinePercentage = 50;
    
    JFrame Board;  
    static Cell Grid[][];
   
    
    
    public void GenerateCells(){
        Grid = new Cell[GridWidth][GridHeight];
        
        for (int x = 0; x < GridWidth; x++) {
            int cellID = 0;
            for (int y = 0; y < GridHeight; y++) {
                Cell newCell = new Cell(x, y);//Create a new cell
                
                newCell.id = cellID;
                System.out.println("Cell Generated at: (" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
                cellID++;
                
                
                if (RandomGen.nextInt(100) > IsMinePercentage){
                    newCell.isMine = true;
                }
                System.out.println(newCell.isMine);
                

                Grid[x][y] = newCell;//Insert the cell into grid
                add(newCell);
            }
        }
    }

    public void Close(){



    }

    
    public Board(int x, int y){
        GridWidth = x;
        GridHeight = y;
        

        setSize(400,500);
    }
}
