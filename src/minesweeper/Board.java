/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author a.ambagaspitiya
 */
public class Board extends JPanel{
    private static Random RandomGen = new Random();
    Cell Grid[][];

    int GridWidth = 15;
    int GridHeight = 15;
    int count=1;
    Dimension CellSize = new Dimension(25, 25);

    static Font mainFont = new Font("ComicSans", Font.BOLD, 17);
    int IsMinePercentage = 50;


    
    public void GenerateCells(){
        Grid = new Cell[GridWidth][GridHeight];

        for (int x = 0; x < GridWidth; x++) {
            int cellID = 0;
            for (int y = 0; y < GridHeight; y++) {
                Cell newCell = new Cell(new Point(x*CellSize.width, y*CellSize.height), CellSize);
                
                newCell.id = cellID;
                System.out.println("Cell Generated at: (" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
                cellID++;

                Grid[x][y] = newCell;//Insert the cell into grid
                add(newCell);
            }
        }
    }

    public void RevealMines(){
        for(int x=0; x<GridWidth; x++){
            for(int y=0; y<GridHeight; y++){
                Grid[x][y].Reveal();
            }
        }
    }
    public void ConcealMines(){
        for(int x=0; x<GridWidth; x++){
            for(int y=0; y<GridHeight; y++){
                Grid[x][y].Conceal();
            }
        }
    }

    
    public Board(int gridWidth, int gridHeight){
        this.GridWidth = gridWidth;
        this.GridHeight = gridHeight;

        setBackground(new Color(35, 38, 44));
        setSize(GridWidth*CellSize.width, GridHeight*CellSize.height);
        setLayout(null);
        setVisible(true);
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new Color(30, 30, 30), new Color(18, 18, 18)));


        //setBounds(0,0,GridWidth*CellSize.width+10, GridHeight*CellSize.height+10);
    }
}
