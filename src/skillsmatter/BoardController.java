/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skillsmatter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author sjc
 */
public class BoardController implements Initializable {
    
    @FXML
    private Label title;
    
    @FXML
    private Label description;
    
    @FXML
    private ImageView background;
    
    @FXML
    private void handleButtonAction() {
        System.out.println("hello");
        title.setText("This Text Would be Another Event");
        description.setText("And this text would be a super cool description of the next talk/speaker.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransitionBuilder.create()
                .node(background)
                .byX(327)
                .duration(Duration.seconds(40))
                .cycleCount(TranslateTransition.INDEFINITE)
                .autoReverse(true)
                .build().play();
    }    
}
