package turbomann.Chapter_7;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma [0] = new Vampire();
        ma [1] = new Dragon();
        ma [2] = new Monster();
        for (int x = 0; x< 3; x++){
            ma[x].frighten(x);
        }
    }
}

class Monster{
    boolean frighten (int x){
        System.out.println("RRRRRR");
        return false;
    }

}

class Vampire extends Monster{
    boolean scare (int x){
        System.out.println("BIT?");
        return true;
    }
}

class Dragon extends Monster{
    boolean frighten (int degree){
        System.out.println("Fire BLOW");
        return true;
    }
}
