package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board;
    int size;
    float cellSize;
    PApplet pa;

    public LifeBoard(int size, PApplet pa)
    {
        board = new boolean[size][size];
        this.size = size;
        this.pa = pa;
        cellSize = pa.width / (float) size;
    }

    public void randomise()
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0 ; col < size ; col ++)
            {
                board[row][col] = pa.random(1.0f) > 0.5f;
            }
        }
    }

    public int countCellsAround(int row, int col)
    {
        int count = 0;

        // Your bit goes here!

        for(int i = row - 1 ; i <= row + 1 ; i ++)
        {
            for(int j = col -1 ; j <= col + 1; j ++)
            {
                if (! (i == row && j == col))
                {
                    if (isAlive(i, j))
                    {
                        count ++;
                    }
                }
            }
        }

        return count;
    }

    public boolean isAlive(int row, int col)
    {
        if (row >= 0 && row < size && col >= 0 && col < size)
        {
            return board[row][col]; 
        }
        else
        {
            return false;
        }
    }

    public void render()
    {
        pa.background(0);
        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0 ; col < size ; col ++)
            {
                float x = PApplet.map(col, 0, size, 0, pa.width);
                float y = PApplet.map(row, 0, size, 0, pa.height);
                x = cellSize * col;
                y = cellSize * row;

                if (board[row][col])
                {
                    pa.fill(0, 255, 0);
                }
                else
                {
                    pa.noFill();
                }
                pa.rect(x, y, cellSize, cellSize);
            }
        }
        
    }
}
