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
import javafx.stage.Stage;

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
        System.out.println(rootPane.getChildren().size());
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("settings-menu.fxml"));
            settingsPane.getChildren().add(pane);
            settingsPane.setVisible(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
