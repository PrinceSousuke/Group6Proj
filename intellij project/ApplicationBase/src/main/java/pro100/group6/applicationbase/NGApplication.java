package pro100.group6.applicationbase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pro100.group6.applicationbase.model.abstractmodel.Card;
import pro100.group6.applicationbase.model.cards.earth.spells.*;
import pro100.group6.applicationbase.model.cards.earth.trap.*;
import pro100.group6.applicationbase.model.cards.earth.troops.*;
import pro100.group6.applicationbase.model.cards.earth.utility.*;
import pro100.group6.applicationbase.model.character.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NGApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NGApplication.class.getResource("ng-main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Nature's Gambit");
        stage.setScene(scene);
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        List<Card> deck = new ArrayList<>(Arrays.asList(new Banshee(), new Elves(),
                new Fairy(), new Fauns(), new Gnome(), new Golems(), new Jackalope(), new MrRock(),
                new Nymph(), new Satyr()));
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("player1.ser"))) {
            Player p = new Player("player1");
            p.setDeck(deck.toArray(new Card[deck.size()]));
            out.writeObject(p);
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("player2.ser"))) {
            Player p = new Player("player2");
            p.setDeck(deck.toArray(new Card[deck.size()]));
            out.writeObject(p);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}