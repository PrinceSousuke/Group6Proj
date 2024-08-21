package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import pro100.group6.applicationbase.model.abstractmodel.Card;
import pro100.group6.applicationbase.model.cards.air.spells.AirsEmbrace;
import pro100.group6.applicationbase.model.cards.air.spells.Breeze;
import pro100.group6.applicationbase.model.cards.air.traps.WindsDeception;
import pro100.group6.applicationbase.model.cards.air.troops.Aetherwing;
import pro100.group6.applicationbase.model.cards.air.troops.Harpy;
import pro100.group6.applicationbase.model.cards.air.troops.Mistara;
import pro100.group6.applicationbase.model.cards.air.utility.AerialVision;
import pro100.group6.applicationbase.model.cards.air.utility.SkyblessPendant;
import pro100.group6.applicationbase.model.cards.earth.spells.BloomBurst;
import pro100.group6.applicationbase.model.cards.earth.trap.FaerieRing;
import pro100.group6.applicationbase.model.cards.earth.troops.*;
import pro100.group6.applicationbase.model.cards.earth.utility.BlossemBell;
import pro100.group6.applicationbase.model.character.Player;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NGStartController{
    @FXML
    private StackPane rootPane;
    @FXML
    private StackPane settingsPane;

    @FXML
    private Button cancelChangesBtn, applyChangesBtn;
    @FXML
    private Label welcomeText, exitButton,minimizeButton,maximizeButton, gameTitle;
    @FXML
    private TextField wSizeHeight, wSizeWidth;

    @FXML
    private ImageView playGameButton, settingsButton;



    @FXML
    private void onSettingsButtonClick() {
        settingsPane.setVisible(true);
        openSettings();
    }

    @FXML
    private void onPlayGameButtonClick() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("player1.ser"))){
            Player p = new Player("player1");
            List<Card> cards = new ArrayList<>(Arrays.asList(new Jackalope(), new Nymph(), new BlossemBell(), new BloomBurst(), new FaerieRing(), new Elves(), new Satyr(), new MrRock()));
            p.setDeck(cards.toArray(new Card[cards.size()]));
            out.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("player2.ser"))){
            Player p = new Player("player2");
            List<Card> cards = new ArrayList<>(Arrays.asList(new AirsEmbrace(), new Breeze(), new WindsDeception(), new Aetherwing(), new Harpy(), new Mistara(), new AerialVision(), new SkyblessPendant()));
            p.setDeck(cards.toArray(new Card[cards.size()]));
            out.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        rootPane.getChildren().clear();
        try {
            StackPane newPane = FXMLLoader.load(getClass().getResource("game-launcher.fxml"));
            rootPane.getChildren().add(newPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void openSettings(){
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("settings-menu.fxml")));
            settingsPane.getChildren().add(pane);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void onApplyChangesBtnClick() {
        StackPane backpane = (StackPane) applyChangesBtn.getParent().getParent();
        int height = Integer.parseInt(wSizeHeight.getText());
        int width = Integer.parseInt(wSizeWidth.getText());
        backpane.getChildren().clear();
        backpane.setVisible(false);
        backpane.getScene().getWindow().setWidth(width);
        backpane.getScene().getWindow().setHeight(height);
    }

    @FXML
    private  void onCancelChangesBtnClick() {
        AnchorPane pane = (AnchorPane) cancelChangesBtn.getParent();
        rootPane = (StackPane) cancelChangesBtn.getParent().getParent();
        StackPane backpane = (StackPane) pane.getParent();
        backpane.getChildren().clear();
        pane.setVisible(false);
        backpane.setVisible(false);
    }


}