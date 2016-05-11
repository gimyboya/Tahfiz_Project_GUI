package Classes;

import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * Created by gimy on 11/05/2016.
 */
public class ParentloginController {

    public Hyperlink goBack;


    public void goBack () {
        Stage stage = (Stage) goBack.getScene().getWindow();
        stage.close();
    }
}
