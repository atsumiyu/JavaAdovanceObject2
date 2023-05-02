package oop2;

public class DiceTest {
    public static void main(String[] args) {

        var result = 0;
        int time = 30;

        var dice = new Dice();

        for(int i = 1; i <= time; i++) {
            result = dice.cast();
            System.out.println(result);
        }

//        継承の動作確認
//        for(int i = 1; i <= time; i++) {
//            result = dice.cheat(i);
//            System.out.println(result);
//        }

        var lastresult = result;

        System.out.println("最後に出た目は　" + lastresult + "　です。");


    }
}
