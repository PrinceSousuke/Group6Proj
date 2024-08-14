/**
 * @author rmeeks
 * @createdOn 8/8/2024 at 9:38 PM
 * @projectName ApplicationBase
 * @packageName pro100.group6.applicationbase;
 */
package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.io.IOException;

public class GLController {
    @FXML
    private StackPane settingsPane, rootPane;
    @FXML
    private Button settingsButton;
    @FXML
    private ImageView selectAdventure,selectVs;

    @FXML
    private void openSettings(){
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("settings-menu.fxml"));
            settingsPane.getChildren().add(pane);
            settingsPane.setVisible(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void selectAdventure(){

    }

    @FXML
    private void selectVs(){
        try {
            StackPane newPane = FXMLLoader.load(getClass().getResource("game-board.fxml"));
            rootPane = (StackPane) selectVs.getParent().getParent();
            rootPane.getChildren().add(newPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
