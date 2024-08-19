package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import pro100.group6.applicationbase.model.Player;

import java.io.*;
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