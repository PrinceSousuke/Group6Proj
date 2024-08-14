/**
 * @author rmeeks
 * @createdOn 8/9/2024 at 11:07 AM
 * @projectName ApplicationBase
 * @packageName pro100.group6.applicationbase;
 */
package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import pro100.group6.applicationbase.model.*;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class BoardController implements Initializable {
    private Player player1;
    private Player player2;
    @FXML
    private StackPane rootPane;

    @FXML
    private ImageView activePlayerImg, opponentImg;

    @FXML
    private GridPane activePlayerRow1, activePlayerRow2, opponentRow1, opponentRow2;

    @FXML
    private TilePane play_board;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


//    public BoardController(Player player1, Player player2) {
//        setPlayer1(player1);
//        setPlayer2(player2);
//        player1.setDeck((Card[]) shufflePlayerDeck(player1).toArray());
//        player2.setDeck((Card[]) shufflePlayerDeck(player2).toArray());
//    }

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

    public void passTurn(){
        Image transfer1 = activePlayerImg.getImage();
        Image transfer2 = opponentImg.getImage();
        activePlayerImg.setImage(transfer2);
        opponentImg.setImage(transfer1);
        if (play_board.getRotate() == 180){
            play_board.setRotate(0);
        } else {
            play_board.setRotate(180);
        }
    }


}
