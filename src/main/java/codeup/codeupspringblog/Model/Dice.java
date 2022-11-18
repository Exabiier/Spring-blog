package codeup.codeupspringblog.Model;

public class Dice {
    private int randNum;
    private int userNum;
    final static int sideOfDice=6;


//    /////////////////  Constructor  //////////////////


    public Dice(int randNum) {
        this.randNum = randNum;
    }

    public Dice(int randNum, int userNum) {
        this.randNum = randNum;
        this.userNum = userNum;
    }

//    //////////////  Setters and getters  ////////////////


    public int getRandNum() {
        return randNum;
    }

    public void setRandNum(int randNum) {
        this.randNum = randNum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public static int randomRollMethod(){
        return (int) Math.floor((Math.random()*sideOfDice) +1 );

    }
}
