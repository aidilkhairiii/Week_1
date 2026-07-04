public class Player {
    private String name;
    private String guess;
    private int numOfGuess=0;

    public void setName(String aName){
        name = aName;
    }

    public String getName(){
        return name;
    }

    public void setGuess(String aGuess){
        guess = aGuess;
        numOfGuess++;
    }

    public String getGuess(){
        return guess;
    }

    public void setNumOfGuess(int aNumOfGuess){
        numOfGuess = aNumOfGuess;
    }

    public int getNumOfGuess(){
        return numOfGuess;
    }


}
