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
import javafx.scene.input.Dragboard;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import pro100.group6.applicationbase.model.abstractmodel.*;
import pro100.group6.applicationbase.model.character.Player;

import java.io.*;
import java.net.URL;
import java.util.*;


public class BoardController implements Initializable {
    private final String resourcesRoot = "src/main/resources/pro100/group6/applicationbase/";
    private Player player1;
    private Player player2;
    @FXML
    private StackPane rootPane;
    @FXML
    private ProgressBar feyreMeter, healthMeter;
    @FXML
    private HBox playerHand;

    @FXML
    private StackPane OpPane, APPane,play_board;
    @FXML
    private ImageView activePlayerImg, opponentImg;

    @FXML
    private GridPane activePlayerRow1, activePlayerRow2, opponentRow1, opponentRow2;

    @FXML
    private Button passButton, testButton;


    private final HashMap<ImageView, Player> playerHashMap = new HashMap<>();
    private final HashMap<Image, Card> cardHashMap = new HashMap<>();

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                rootPane.setPrefWidth(rootPane.getScene().getWindow().getWidth());
                rootPane.setPrefHeight(rootPane.getScene().getWindow().getHeight());
                passButton.setPrefWidth(rootPane.getPrefWidth() * ((double) 1/9));
                passButton.setPrefHeight(rootPane.getPrefHeight() * ((double) 1/10));
                passButton.setTranslateX(-rootPane.getPrefWidth()/8);
                activePlayerImg.setFitWidth(rootPane.getPrefWidth()/6);
                activePlayerImg.setFitHeight(rootPane.getPrefHeight()/3.5);
                opponentImg.setFitWidth(rootPane.getPrefWidth()/6);
                opponentImg.setFitHeight(rootPane.getPrefHeight()/3.5);

                play_board.setPrefHeight(rootPane.getHeight());
                for (Node c : play_board.getChildren()) {
                    if (c instanceof Pane) {
                        for (Node g : ((Pane) c).getChildren()) {
                            if (g instanceof GridPane) {
                                for (Node i : ((GridPane) g).getChildren()) {
                                    if (i instanceof ImageView) {
                                        ((ImageView) i).setFitHeight(rootPane.getPrefHeight() / 6);
                                        ((ImageView) i).setFitWidth(rootPane.getPrefWidth() / 10);
                                    }
                                }
                            }
                        }
                    }
                }
                play_board.setPrefHeight(rootPane.getPrefHeight());
                for (Node c : OpPane.getChildren()) {
                    if (c instanceof StackPane) {
                        ((StackPane) c).setPrefHeight(play_board.getPrefHeight()/2);
                        for (Node g : ((StackPane) c).getChildren()) {
                            if (g instanceof GridPane) {

                            }
                        }
                    }
                }

            }
        }
    });

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
        t.setDaemon(true);
        t.start();

    }

    private void boardSetup(){
        ArrayList<GridPane> rows = new ArrayList<>(Arrays.asList(activePlayerRow1, activePlayerRow2, opponentRow1, opponentRow2));

        player1.setDeck(shufflePlayerDeck(player1));
        player2.setDeck(shufflePlayerDeck(player2));
        Map<Integer, Player> turnDefinitions = new HashMap<>();

        switch (new Random().nextInt(2)){
            case 0:
                StackPane.setAlignment(activePlayerImg, Pos.BOTTOM_LEFT);
                StackPane.setAlignment(opponentImg, Pos.TOP_RIGHT);
                player1.setFeyre(1);
                feyreMeter.setProgress((double) player1.getFeyre() /15);
                healthMeter.setProgress((double) player1.getHealth() /25);
                play_board.setRotate(00);
                turnDefinitions.put(1,player1);
                turnDefinitions.put(2,player2);
                break;
            case 1:
                StackPane.setAlignment(activePlayerImg, Pos.TOP_RIGHT);
                StackPane.setAlignment(opponentImg, Pos.BOTTOM_LEFT);
                player2.setFeyre(1);
                feyreMeter.setProgress((double) player2.getFeyre() /15);
                healthMeter.setProgress((double) player2.getHealth() /25);
                play_board.setRotate(180);
                turnDefinitions.put(1,player2);
                turnDefinitions.put(2,player1);
                break;
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
        for (int i = 0; i < 3; i++) {
            List<Card> cards = new ArrayList<>();
            if (turnDefinitions.get(1).getHand() != null){
                cards.addAll(turnDefinitions.get(1).getHand());
            }
            List<Card> deck = new ArrayList<>(Arrays.asList(turnDefinitions.get(1).getDeck()));
            cards.add(deck.get(i));
            turnDefinitions.get(1).setHand(cards);
        }
        System.out.println(turnDefinitions.get(1).getHand());
        for (int i = 0; i < 4; i++) {
            List<Card> cards = new ArrayList<>();
            if (turnDefinitions.get(2).getHand() != null){
                cards.addAll(turnDefinitions.get(2).getHand());
            }
            List<Card> deck = new ArrayList<>(Arrays.asList(turnDefinitions.get(2).getDeck()));
            cards.add(deck.get(i));
            turnDefinitions.get(2).setHand(cards);
        }
        System.out.println(turnDefinitions.get(2).getHand());

    }

    public void onDragDetectedFromHand(MouseEvent e){
        if (e.getTarget() instanceof ImageView && e.getTarget() != null){
            ImageView i = (ImageView) e.getTarget();
            Dragboard db = i.startDragAndDrop(TransferMode.ANY);
            Image image = i.getImage();
            ClipboardContent content = new ClipboardContent();
            content.putImage(image);
            db.setContent(content);
        }
    }

    public void onDropDetectedFromHand(DragEvent e){
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
        if (playerHand.isVisible()) {
            playerHand.setVisible(false);
        }

        play_board.setRotate(play_board.getRotate() + 180);
        if (play_board.getRotate() == 360){
            play_board.setRotate(0);
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

    @FXML
    private void showHand(){
        Player p = null;
        if (StackPane.getAlignment(activePlayerImg) == Pos.BOTTOM_LEFT) {
            p = playerHashMap.get(activePlayerImg);
        }
        if (StackPane.getAlignment(opponentImg) == Pos.BOTTOM_LEFT) {
            p = playerHashMap.get(opponentImg);
        }
        List<Card> hand = new ArrayList<>();
        if (p != null){
            hand = p.getHand();
        }

        playerHand.getChildren().clear();
        for (Card c : hand) {
            insertCardFromHand(c);
        }
    }

    private void insertCardFromHand(Card c){
        playerHand.setVisible(true);
        ImageView iv = new ImageView();
        Image ci = new Image(new File(resourcesRoot + c.getCardImage()).toURI().toString());
        iv.setImage(ci);
        cardHashMap.put(ci, c);
        playerHand.getChildren().add(iv);
        for (Node i : playerHand.getChildren()) {
            ((ImageView) i).setFitHeight(150);
            ((ImageView) i).setFitWidth(80);
            i.setOnMouseDragged(e->{
                playerHand.setVisible(false);
                i.setOnDragDetected(de -> onDragDetectedFromHand(e));
            });
        }
    }
}