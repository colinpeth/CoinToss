package cointoss;

import java.util.Random;

public class CoinToss {

    
    public String tossCoin() {
        Random rand = new Random();
        
        // Get the absolute value of the next random Int, 
        // determine if it's odd or even: returns 0 or 1
        int toss = Math.abs(rand.nextInt()) % 2;
        
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        
    }
    
}
