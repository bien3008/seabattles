package login;

import manager.GameBoard;

public class Menu {
    public static void showTitle(){
        String art = """
         ███████╗███████╗ █████╗ ██████╗   █████╗ ████████╗██╗     ███████╗
         ██╔════╝██╔════╝██╔══██╗██╔══██╗ ██╔══██╗╚══██╔══╝██║     ██╔════╝
         ███████╗█████╗  ███████║██████╔╝ ███████║   ██║   ██║     █████╗  
         ╚════██║██╔══╝  ██╔══██║██╔═ ██╝ ██╔══██║   ██║   ██║     ██╔══╝  
         ███████║███████╗██║  ██║██████║  ██║  ██║   ██║   ███████╗███████╗
         ╚══════╝╚══════╝╚═╝  ╚═╝╚═════╝  ╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝
        """;
        System.out.println(art);
    }
    public static void showMenu(){
        System.out.println("1. start game");
        System.out.println("2. exit");

    }
    public static void showBoard(GameBoard board){
        String [][] grid = board.getGrid();
        for(int i = 0; i <= board.getSize(); i++){
            for(int j = 0; j <= board.getSize(); j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void showBoat(){
        System.out.println("please choose your boat to setup");
        System.out.println("1. patrol boat");
        System.out.println("2. destroyer boat");
        System.out.println("3. submarine");
        System.out.println("4. battle ship");
    }
    public static void showResult(int check){
        if(check == 1){
            String[] winnerArt = {
                    "██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ ",
                    "██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗",
                    "██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝",
                    "██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔██╗  ",
                    "╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║ ║██╗",
                    " ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝ ╚══╝   "
            };

            for (String line : winnerArt) {
                System.out.println(line);
            }
        }
        else {
            String[] youLoseArt = {
                    "██╗   ██╗ ██████╗ ██╗   ██╗      ██╗      ██████╗ ███████╗███████╗",
                    "██║   ██║██╔═══██╗██║   ██║      ██║     ██╔═══██╗██╔════╝██╔════╝",
                    "██║   ██║██║   ██║██║   ██║█████╗██║     ██║   ██║███████╗█████╗  ",
                    "██║   ██║██║   ██║██║   ██║╚════╝██║     ██║   ██║╚════██║██╔══╝  ",
                    "╚██████╔╝╚██████╔╝╚██████╔╝      ███████╗╚██████╔╝███████║███████╗",
                    "  ╔╝██║╝  ╚═════╝  ╚═════╝       ╚══════╝ ╚═════╝ ╚══════╝╚══════╝",
                    "  ║██║ ",
                    "╔╝██╔╝",
                    " ╚═╝"
            };

            for (String line : youLoseArt) {
                System.out.println(line);
            }
        }
    }
    public static void showOption(){
        System.out.println("1. view board:");
        System.out.println("2. view opponent board:");
        System.out.println("3. attack:");
    }
}
