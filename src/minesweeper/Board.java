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
public class Board extends JPanel{
    private static Random RandomGen = new Random();
    
    int GridWidth = 15;
    int GridHeight = 15;

    Dimension CellSize = new Dimension(25, 25);

    static Font mainFont = new Font("ComicSans", Font.BOLD, 17);
    int IsMinePercentage = 50;



    Cell Grid[][];
   
    
    
    public void GenerateCells(){
        Grid = new Cell[GridWidth][GridHeight];

        for (int x = 0; x < GridWidth; x++) {
            int cellID = 0;
            for (int y = 0; y < GridHeight; y++) {
                Cell newCell = new Cell(new Point(x*CellSize.width, y*CellSize.height), CellSize);
                
                newCell.id = cellID;
                System.out.println("Cell Generated at: (" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
                cellID++;
                
                
                if (RandomGen.nextInt(100) > IsMinePercentage){
                    newCell.isMine = true;
                }

                Grid[x][y] = newCell;//Insert the cell into grid
                add(newCell);
            }
        }
    }

    public void Close(){



    }

    
    public Board(int gridWidth, int gridHeight){
        this.GridWidth = gridWidth;
        this.GridHeight = gridHeight;

        this.setBackground(new Color(35, 38, 44));
        this.setSize(GridWidth*CellSize.width, GridHeight*CellSize.height);

        this.setLocation(500/2,750/2);

        setSize(400,500);
    }
}
