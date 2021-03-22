import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import seashell.Seashell;
import seashell.ui.MainWindow;

import java.io.IOException;

public class Main extends Application {

    private Seashell seashell = new Seashell();
    private Image seashellImage = new Image(this.getClass().getResourceAsStream("/images/DaSeashell.png"));

    /**
     * Load the seashell.ui.MainWindow fxml, set the title and start the application
     * @param stage
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setSeashell(seashell);
            VBox dialogContainer = new VBox();
            stage.setTitle("Seashell, the task manager for you!");
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
