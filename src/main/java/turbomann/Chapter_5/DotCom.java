package turbomann.Chapter_5;
//chapter 6
import java.util.ArrayList;

public class DotCom{

    String name ;
    private ArrayList<String> locationCells;

public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
}

    public void setName(String n) {
        name = n;
    }

public String checkYourself(String userInput){
    String result = "Miss";
    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
        locationCells.remove(index);

        if (locationCells.isEmpty()){
            result = "POTOPIL";
            System.out.println("Oh you kill " + name + " :( ");
        }else{
            result = "POPAL";
        }
        }
    return result;
    }

}



//    public void setLocationsCells(int[] locs){
//        locaionsCells = locs;
//    }
//    public String checkYourself (String stringGuess) {
//        int guess = Integer.parseInt(stringGuess);
//        String result = "Miss";
//        for (int cell : locaionsCells) {
//            if (guess == cell) {
//                result = "POPAL";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if (numOfHits == locaionsCells.length) {
//            result = "PoTOPIL";
//        }
//
//        System.out.println(result);
//        return result;
//    }
//}



