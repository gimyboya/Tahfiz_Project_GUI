package Classes;

import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * Created by gimy on 11/05/2016.
 */
public class TeacherloginController {

    public Hyperlink goBackT;


    public void goBack () {
        Stage stage = (Stage) goBackT.getScene().getWindow();
        stage.close();
    }
}
