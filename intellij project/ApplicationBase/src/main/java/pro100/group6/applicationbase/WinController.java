/**
 * @author rmeeks
 * @createdOn 8/28/2024 at 9:53 AM
 * @projectName ApplicationBase
 * @packageName pro100.group6.applicationbase;
 */
package pro100.group6.applicationbase;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class WinController {
    @FXML
    private Label winnerName;

    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        WinController.username = username;
    }

    public static void receiveName(){
        System.out.println(username);
    }



}
