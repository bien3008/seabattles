package manager;

import user.Player;

import java.util.ArrayList;
public class GameBoard {
    protected String[][] grid;
    protected int size;
    protected int totalPositions;
    public int getSize() {
        return size;
    }

    public GameBoard(int size) {
        this.size = size;
        this.totalPositions = 16;
        grid = new String[size+5][size+5];
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if(i == 0 && j != 0){
                    grid[i][j] = (Integer.toString(j));
                }
                else if(i != 0 && j == 0){
                    grid[i][j] = (String.valueOf((char) ('A' + i - 1)));
                }
                else if(i == 0 && j == 0) grid[i][j] = "";
                else grid[i][j] = "-";
            }
        }
    }


    public int getTotalPositions() {
        return totalPositions;
    }

    public void setTotalPositions(int totalPositions) {
        this.totalPositions = totalPositions;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }



}
