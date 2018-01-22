package turbomann.Chapter_5;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);
        int [] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationsCells(locations);
        boolean isAlive = true;


        while (isAlive == true){
            String guess = helper.getUserGInput("Enter number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("PoTOPIL")){
                isAlive =false;
                System.out.println("YOU" +numOfGuesses+"popitok" );
            }
        }
    }
}
