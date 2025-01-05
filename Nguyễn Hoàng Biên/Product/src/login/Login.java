package login;

import main.Scan;
import manager.PlayerManager;
import manager.SystemManager;
import user.Player;

public class Login  {
    Menu menu = new Menu();
    public void choosePlayer(SystemManager manager) {
        System.out.println("1. first player");
        System.out.println("2. second player");
        System.out.println("3. exit");
        System.out.println("please choose your option:");
        PlayerManager playerManager = new PlayerManager();
        int option = Integer.parseInt(Scan.sc.nextLine());
        if(option == 1){
            System.out.println("FIRST PLAYER TURN:");
            System.out.println("please enter player name:");
            String firstName = Scan.sc.nextLine();
            System.out.println("please enter size of board");
            int size = Scan.sc.nextInt();
            Player firstPlayer = new Player(firstName,size);
            manager.setupBattle(firstPlayer, playerManager);
            System.out.println("firstPlayer board:");
            menu.showBoard(firstPlayer.getBoard());
            System.out.println("SECOND PLAYER TURN:");
            System.out.println("pleas enter player name");
            Scan.sc.nextLine();
            String secondName = Scan.sc.nextLine();
            Player secondPlayer = new Player(secondName,size);
            manager.setupBattle(secondPlayer, playerManager);
            System.out.println("second player board:");
            menu.showBoard(secondPlayer.getBoard());
            manager.startGame(playerManager,firstPlayer,secondPlayer);
        }
        else if(option == 2){
            System.out.println("SECOND PLAYER TURN:");
            System.out.println("pleas enter player name");
            String secondName = Scan.sc.nextLine();
            System.out.println("please enter size of board");
            int size = Scan.sc.nextInt();
            Player secondPlayer = new Player(secondName,size);
            manager.setupBattle(secondPlayer, playerManager);
            System.out.println("second player board:");
            menu.showBoard(secondPlayer.getBoard());
            System.out.println("FIRST PLAYER TURN:");
            Scan.sc.nextLine();
            System.out.println("please enter player name:");
            String firstName = Scan.sc.nextLine();
            Player firstPlayer = new Player(firstName,size);
            manager.setupBattle(firstPlayer, playerManager);
            System.out.println("first player board:");
            menu.showBoard(firstPlayer.getBoard());
            manager.startGame(playerManager,secondPlayer,firstPlayer);
        }
        else if(option == 3) {
            return;
        }
    }

}
