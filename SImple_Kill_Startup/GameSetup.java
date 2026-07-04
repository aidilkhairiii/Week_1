import java.util.Random;
import java.util.Scanner;


public class GameSetup {
    private int boardSize;
    private SimpleStartup[] startup;
    private String[][] board;
    private boolean[][] occupied;
    private Player player;

    public void setBoardSize(int aBoardSize){
        boardSize = aBoardSize;
    }



    public int getBoardSize(){
        return boardSize;
    }

    public String[][] initialiseBoard(){
        this.board = new String[7][7];
        this.occupied = new boolean[7][7];

        for (int i = 0; i < 7; i++) {
            char letter = (char) ('a' + i);

            for (int j = 0; j < 7; j++) {
                board[i][j] = letter + String.valueOf(j + 1);
            }
        }
        return board;
    }


    public void setGame(int aStartupNum){
        String guess;
        startup = new SimpleStartup[aStartupNum];
        player = new Player();
        String result = "no guess";
        Scanner scan = new Scanner(System.in);
        int remaining = aStartupNum;
        
        initialiseBoard();

        for (int i = 0; i < aStartupNum; i++) {
            startup[i] = new SimpleStartup();
        }

        setStartupLocation();

        while(remaining>0){
            System.out.print("What is your guess (a1 - e7) :");
            guess = scan.nextLine();
            player.setGuess(guess);

            for(int j=0;j<aStartupNum; j++){
                result = startup[j].checkYourself(guess);
                if(result.equals("hit") || result.equals("kill") || result.equals("already hit")){
                    break;
                }           
            }

            if(result.equals("hit")){
                System.out.println("You " + result + " a startup");
            } else if (result.equals("kill")){
                remaining = remaining - 1;
                System.out.println("You " + result + " a startup," + remaining + " startups remains.");
            } else {
                System.out.println("You " + result );
            }
        }

    }

    private void markOccupied(String[] temp) {

        for (String cell : temp) {

            for (int row = 0; row < boardSize; row++) {
                for (int col = 0; col < boardSize; col++) {

                    if (board[row][col].equals(cell)) {
                        occupied[row][col] = true;
                    }

                }
            }
        }
    }

    private boolean checkOccupied(String[] temp) {

        for (String cell : temp) {

            for (int row = 0; row < boardSize; row++) {
                for (int col = 0; col < boardSize; col++) {

                    if (board[row][col].equals(cell)) {
                        if (occupied[row][col]) {
                            return false;
                        }
                    }

                }
            }
        }

        return true;
    }


    private void setStartupLocation(){
        Random rand = new Random();
        boolean placed;
        int size;
        

        for(int i=0; i < startup.length ; i++){
            size = rand.nextInt(2) + 1;
            String[] temp = new String[size];
            placed = false;  
            
            while(!placed){
                int rowVal = rand.nextInt(7);
                int colVal = rand.nextInt(7);
                temp[0] = board[rowVal][colVal];

                int direction = rand.nextInt(4);

                switch(direction){
                    case 0:
                        if((7-rowVal)>=size){
                            for(int j=1;j<temp.length; j++){
                                temp[j] = board[rowVal+j][colVal];
                            }
                            break;
                            
                        } 
                        continue;
                        
                    case 1:
                        if(rowVal >=size-1){
                            for(int j=1;j<temp.length; j++){
                                temp[j] = board[rowVal-j][colVal];
                            }
                            break;
                        }
                        continue;

                    case 2:
                        if((7-colVal)>=size){
                            for(int j=1;j<temp.length; j++){
                                temp[j] = board[rowVal][colVal+j];
                            }
                            break;
                        }
                        continue;

                    case 3:
                        if((colVal)>=size-1){
                            for(int j=1;j<temp.length; j++){
                                temp[j] = board[rowVal][colVal-j];
                            }
                            break;
                        }
                        continue;
                }
                
                if(checkOccupied(temp)){
                    startup[i].setCellLocation(temp);
                    markOccupied(temp);
                    placed= true;
                }
            }

        }
    }
}
