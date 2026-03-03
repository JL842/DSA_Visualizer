import Controller.PageManger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    private Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("View/MainPage_View.fxml"));

    Parent root = loader.load();

     scene = new Scene(root, Color.LIGHTBLUE);
     System.out.println(root);
     PageManger pageManger = new PageManger(scene,root, loader);
     System.out.println(pageManger);

    stage.setTitle("DSA Visualizer");
    stage.setScene(scene);
    stage.show();

    }




    public static void main(String[] args) {
    launch(args);
}


}