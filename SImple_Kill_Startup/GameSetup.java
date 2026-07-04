import java.util.Random;

public class GameSetup {
    private int boardSize;
    private SimpleStartup[] startup;
    private String[][] board;

    public void setBoardSize(int aBoardSize){
        boardSize = aBoardSize;
    }



    public int getBoardSize(){
        return boardSize;
    }

    public String[][] setBoard(){
        this.board = new String[7][7];

        for (int i = 0; i < 7; i++) {
            char letter = (char) ('a' + i);

            for (int j = 0; j < 7; j++) {
                board[i][j] = letter + String.valueOf(j + 1);
            }
        }
        return board;
    }


    public void setGame(int aStartupNum){
        startup = new SimpleStartup[aStartupNum];
        for (int i = 0; i < aStartupNum; i++) {
            startup[i] = new SimpleStartup();
        }
        Random rand = new Random();
        for (int i =0 ; i < aStartupNum ; i++){
            int startupSize = rand.nextInt(3);
            startup[i].setCellLocation(startupSize);
        }

    }

    public void setStartupLocation(int size){
        Random rand = new Random();
        boolean placed;
        

        for(int i=0; i < startup.length ; i++){
            String[] temp = new String[size];
            placed = false;  
            
            while(!placed){
                int rowVal = rand.nextInt(7);
                int colVal = rand.nextInt(7);
                temp[0] = board[rowVal][colVal];

                int direction = rand.nextInt(4);
                boolean valid = true;

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
                
                if(chechOccupied(temp)){
                    startup[i].setCellLocation(temp);
                    placed= true;
                }
            }

        }
    }
}
