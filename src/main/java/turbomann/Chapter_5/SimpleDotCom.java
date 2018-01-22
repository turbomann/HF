package turbomann.Chapter_5;

public class SimpleDotCom{
    int [] locaionsCells;
    int numOfHits = 0;

    public void setLocationsCells(int[] locs){
        locaionsCells = locs;
    }
    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        for (int cell : locaionsCells) {
            if (guess == cell) {
                result = "POPAL";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locaionsCells.length) {
            result = "PoTOPIL";
        }

        System.out.println(result);
        return result;
    }
}



