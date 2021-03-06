/*
 * @Isaac
 */
package client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Isaac
 */
public class ReceivedMessageController implements Initializable {

     @FXML
    private ImageView image;

    @FXML
    private Label user;

    @FXML
    private Label date;

    @FXML
    private Label text;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 
    public void setText(String u, String t, String d){
        text.setText(t);
        user.setText(u);
        date.setText(d);
    }
    
}
