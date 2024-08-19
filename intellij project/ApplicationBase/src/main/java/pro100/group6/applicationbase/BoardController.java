/**
 * @author rmeeks
 * @createdOn 8/9/2024 at 11:07 AM
 * @projectName ApplicationBase
 * @packageName pro100.group6.applicationbase;
 */
package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import pro100.group6.applicationbase.model.*;
import pro100.group6.applicationbase.model.abstractmodel.*;

import java.io.*;
import java.net.URL;
import java.util.*;


public class BoardController implements Initializable {
    private String resourcesRoot = "src/main/resources/pro100/group6/applicationbase/";
    private Player player1;
    private Player player2;
    @FXML
    private StackPane rootPane;
    @FXML
    private ProgressBar feyreMeter, healthMeter;
    @FXML
    private Pane APPane, OpPane;

    @FXML
    private ImageView activePlayerImg, opponentImg;

    @FXML
    private GridPane activePlayerRow1, activePlayerRow2, opponentRow1, opponentRow2;

    @FXML
    private Button passButton;

    @FXML
    private TilePane play_board;

    private final HashMap<ImageView, Player> playerHashMap = new HashMap<>();

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (rootPane != null) {
                    rootPane.setPrefWidth(rootPane.getScene().getWindow().getWidth());
                    rootPane.setPrefHeight(rootPane.getScene().getWindow().getHeight());
                    passButton.setPrefWidth(rootPane.getWidth() * ((double) 1/9));
                    passButton.setPrefHeight(rootPane.getHeight() * ((double) 1/10));
                    passButton.setTranslateX(-rootPane.getWidth()/8);
                }
            }
        }
    });



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        t.setDaemon(true);
        t.start();
        StackPane.setAlignment(passButton, Pos.CENTER_RIGHT);
        String player, opponent;
        try (BufferedReader br = new BufferedReader(new FileReader("gamePlayers.txt"))){
            String[] data = br.readLine().split(",");
            player = data[0];
            opponent = data[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(player))){
            setPlayer1((Player) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(opponent))){
            setPlayer2((Player) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        boardSetup();

    }

    private void boardSetup(){
        ArrayList<GridPane> rows = new ArrayList<>(Arrays.asList(activePlayerRow1, activePlayerRow2, opponentRow1, opponentRow2));

        player1.setDeck(shufflePlayerDeck(player1));
        player2.setDeck(shufflePlayerDeck(player2));
        switch (new Random().nextInt(3)){
            case 0:
                StackPane.setAlignment(activePlayerImg, Pos.BOTTOM_LEFT);
                StackPane.setAlignment(opponentImg, Pos.TOP_RIGHT);
                player1.setFeyre(1);
                feyreMeter.setProgress((double) player1.getFeyre() /15);
                healthMeter.setProgress((double) player1.getHealth() /25);
                play_board.setRotate(180);
                swapActive(1);
                break;
            case 1:
                StackPane.setAlignment(activePlayerImg, Pos.TOP_RIGHT);
                StackPane.setAlignment(opponentImg, Pos.BOTTOM_LEFT);
                player2.setFeyre(1);
                feyreMeter.setProgress((double) player2.getFeyre() /15);
                healthMeter.setProgress((double) player2.getHealth() /25);
                play_board.setRotate(0);
                swapActive(2);
                break;
            default:
                boardSetup();
        }
        for (GridPane r : rows) {
            r.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
                Node clickedE = (Node) e.getTarget();
                System.out.println(clickedE.getId());
                ArrayList<String> noTouch = new ArrayList<>(Arrays.asList("APGrave","APDeck","OpDeck","OpGrave"));
                if (clickedE.getClass() == ImageView.class){
                    if (!noTouch.contains(clickedE.getId())) {
                        ((ImageView) clickedE).setImage(new Image(new File(resourcesRoot + "uiResources/cardGuy.png").toURI().toString()));
                    }
                }
            });
        }
    }


    private Card[] shufflePlayerDeck(Player player){
        ArrayList<Card> deck = new ArrayList<>(Arrays.asList(player.getDeck()));
        for (int i = 0; i < deck.size(); i++){
            int randomIndex = (int) (Math.random() * deck.size());
            Card temp = deck.get(randomIndex);
            Card Swapped = deck.get(i);
            deck.set(randomIndex, Swapped);
            deck.set(i, temp);
        }
        return deck.toArray(new Card[deck.size()]);
    }

    private void swapActive(int a){
        switch (a){
            case 1:
                for (Node c : OpPane.getChildren()) {
                    c.setDisable(true);
                }
                for (Node c : APPane.getChildren()) {
                    c.setDisable(false);
                }
                break;
            case 2:
                for (Node c : OpPane.getChildren()) {
                    c.setDisable(false);
                }
                for (Node c : APPane.getChildren()) {
                    c.setDisable(true);
                }
                break;
            default:
                return;
        }
    }

    public void setPlayer1(Player player1) {
        if (player1 != null) {
            this.player1 = player1;
            playerHashMap.put(activePlayerImg, player1);
        }

    }
    public void setPlayer2(Player player2) {
        if (player2 != null) {
            this.player2 = player2;
            playerHashMap.put(opponentImg, player2);
        }
    }

    public void passTurn(){
        if (play_board.getRotate() == 180){
            play_board.setRotate(0);
            swapActive(2);
        } else {
            play_board.setRotate(180);
            swapActive(1);
        }
        List<ImageView> players = Arrays.asList(activePlayerImg, opponentImg);
        for (ImageView p : players) {
            if (StackPane.getAlignment(p) == Pos.TOP_RIGHT){
                Player player = playerHashMap.get(p);
                player.setFeyre(player.getFeyre() + 1);
                feyreMeter.setProgress((double) player.getFeyre() /15);
                healthMeter.setProgress((double) player.getHealth() /25);
            }
            swaparoo(p);
        }

    }

    private void swaparoo(ImageView iv) {
        Pos position = StackPane.getAlignment(iv);
        if (position == Pos.BOTTOM_LEFT) {
            StackPane.setAlignment(iv, Pos.TOP_RIGHT);
            return;
        }
        if (position == Pos.TOP_RIGHT) {
            StackPane.setAlignment(iv, Pos.BOTTOM_LEFT);
        }
    }



}
