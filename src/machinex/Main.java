package machinex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
/**
 *
 * @author ysfzyak
 */

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
     
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MachineX");
        primaryStage.show();
       
    }
    
    public static void main(String[] args) {
        launch(args);
        MachineXDB x = new MachineXDB();
        x.connect();
    }    
}
