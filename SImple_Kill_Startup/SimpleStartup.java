class SimpleStartup {
    private String name;
    private String[] cellLocation;
    private int numOfHits=0;
    private String[] activeCell;

    public void setName(String aName){
        name = aName;
    }

    public String getName(){
        return name;
    }

    public void setCellLocation(String[] aCellLocation){
        cellLocation = aCellLocation;
        activeCell = aCellLocation.clone();
    }

    public String[] getCellLocation(){
        return cellLocation;
    }

    public String checkYourself(String guess) {
        String result = "miss";

        for (int i = 0; i < cellLocation.length; i++) {
            if (guess.equals(cellLocation[i])) {

                if (activeCell[i] != null) {
                    activeCell[i] = null;
                    numOfHits++;

                    if (numOfHits == cellLocation.length) {
                        return "kill";
                    }

                    return "hit";
                } else {
                    return "already hit";
                }
            }
        }

        return result;
    }
}