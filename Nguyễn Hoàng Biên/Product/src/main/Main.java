package main;

import login.Login;
import login.Menu;
import manager.GameBoard;
import manager.PlayerManager;
import manager.SystemManager;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showTitle();
        SystemManager manager = new SystemManager();
        GameBoard board = new GameBoard(10);
//        menu.showBoard(board);
        Login login = new Login();
        while (true){
            menu.showMenu();
            int option = Integer.parseInt(Scan.sc.nextLine());
//            Scan.sc.nextLine();
            if(option == 1){
                login.choosePlayer(manager);
//                manager.startGame();
                break;
            }
            else return;
        }
    }
}
