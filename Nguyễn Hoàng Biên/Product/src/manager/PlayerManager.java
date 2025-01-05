package manager;

import data.Ship;
import login.Menu;
import main.Scan;
import user.Player;

public class PlayerManager {
    public void putShip(Player player, Ship ship, int locationX, int locationY, String direction) {
        direction = direction.toLowerCase();
        if(direction.equals("h")) {
            for (int i = 0; i < ship.getSize(); i++) {
                player.getBoard().getGrid()[i+locationX][locationY] = "S";
                player.getBoard().setTotalPositions(player.getBoard().getTotalPositions() + 1);
            }
        } else if (direction.equals("v")) {
            for (int i = 0  ; i < ship.getSize(); i++) {
                player.getBoard().getGrid()[locationX][locationY + i] = "S";
                player.getBoard().setTotalPositions(player.getBoard().getTotalPositions() + 1);
            }
        }
    }
    public boolean isSunk(GameBoard board){
        String[][] grid = board.getGrid();
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[i].length; ++j){
                if(grid[i][j] != null && grid[i][j].equals("S")) return false;
            }
        }
        return true;
    }
    public boolean haveShip(GameBoard board,int x,int y){
        if (board.getGrid()[x][y].equals("S")) return true;
        return false;
    }
    public void markShot(Player firstPlayer, Player secondPlayer, int x, int y) {
        if(firstPlayer.getEnemyBoard().getGrid()[x][y].equals("O")
           || firstPlayer.getEnemyBoard().getGrid()[x][y].equals("X"))
        {
            System.out.println("you had been shot this coordinate:");
            return;
        }
        if(haveShip(secondPlayer.getBoard(),x,y)) {
            firstPlayer.getEnemyBoard().getGrid()[x][y] = "X";
//            secondPlayer.getBoard().getGrid()[x][y] = "X";
        }
        else firstPlayer.getEnemyBoard().getGrid()[x][y] = "O";
    }
    public void attack(Player you, Player opponent, int x, int y){
        markShot(you,opponent,x,y);
        if(haveShip(opponent.getBoard(),x,y)) {
            System.out.println  ("You have hit the enemy's boat");
            Menu.showBoard(you.getEnemyBoard());
        }
        if(haveShip(opponent.getBoard(),x,y)) opponent.getBoard().getGrid()[x][y] = "X";
        else opponent.getBoard().getGrid()[x][y] = "O";
    }

}
