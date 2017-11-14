package Assignment6_Sarthak_Sharma;

/**
 *
 * Sarthak Sharma PROG24178 JAVA 2 Professor Johnathan Penava Summary:
 * Assignment 6 Hashmaps user enters string and the string is converted to value stored in the hashmap
 * I was unable to get the file reading or writing to work correctly
 */
/**
 *
 * @author SarthaksComp
 *
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class cypherMain extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Encryption2.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
