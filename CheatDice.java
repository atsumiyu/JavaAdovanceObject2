package oop2;

import java.util.Random;

public class CheatDice extends Dice {

//    public CheatDice(int result) {
//        super(result);
//    }

    public int cheat(int time) {

//        return 6;

        var random = new Random();
        int result = 0;

        if(time % 6 == 0) {
            System.out.println(time + "番目");
            return result = 6;
        } else {
            result = random.nextInt(6) + 1;
            return result;
        }

    }

}
