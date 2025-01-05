package user;

import data.Ship;
import login.Menu;
import main.Scan;
import manager.GameBoard;

import java.util.ArrayList;

public class Player {
    private String name;
    private GameBoard board;
    private GameBoard enemyBoard;

    public Player(String name,int size) {
        this.name = name;
        this.board = new GameBoard(size);
        this.enemyBoard = new GameBoard(size);
    }



    public GameBoard getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }

    public GameBoard getEnemyBoard() {
        return enemyBoard;
    }
}
