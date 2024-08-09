/**
 * @author rmeeks
 * @createdOn 8/9/2024 at 11:07 AM
 * @projectName ApplicationBase
 * @packageName pro100.group6.applicationbase;
 */
package pro100.group6.applicationbase;

import pro100.group6.applicationbase.model.*;

import java.util.ArrayList;
import java.util.Arrays;


public class BoardController {
    private Player player1;
    private Player player2;

    public BoardController(Player player1, Player player2) {
        setPlayer1(player1);
        setPlayer2(player2);
        player1.setDeck((Card[]) shufflePlayerDeck(player1).toArray());
    }

    private ArrayList<Card> shufflePlayerDeck(Player player){
        ArrayList<Card> deck = new ArrayList<>(Arrays.asList(player.getDeck()));
        for (int i = 0; i < deck.size(); i++){
            int randomIndex = (int) (Math.random() * deck.size());
            Card temp = deck.get(randomIndex);
            Card Swapped = deck.get(i);
            deck.set(randomIndex, Swapped);
            deck.set(i, temp);
        }
        return deck;
    }


    public void setPlayer1(Player player1) {
        if (player1 != null) {
            this.player1 = player1;
        }
    }
    public void setPlayer2(Player player2) {
        if (player2 != null) {
            this.player2 = player2;
        }
    }
}
