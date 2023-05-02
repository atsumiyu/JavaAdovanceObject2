package oop2;
import java.util.Random;
public class Dice {

    // フィールド
    int result;

    // メソッド
    public int cast() {

        var random = new Random();
        int result = random.nextInt(6) + 1;

        return result;

    }

    public int see() {

        if(result == 0) {
            return 1;
        } else {
            return result;
        }

    }


}
