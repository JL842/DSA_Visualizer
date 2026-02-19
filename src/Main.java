import java.util.Arrays;

import com.sun.javafx.scene.control.ContextMenuContent;
import javafx.animation.PauseTransition;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import DSA_Classes.BubbleSort;
import javafx.util.Duration;


public class Main extends Application {



    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        ////////////// Bubble sort UI prototype test

        GridPane root = new GridPane();
        root.setPadding(new Insets(20,20,20,20)); // Outer padding
        root.setHgap(3); // Inner horizontal padding
        root.setVgap(3); // Inner Vertical padding

        root.setGridLinesVisible(true);

        HBox graphBox = new HBox();
        graphBox.setMinSize(600,200);

        graphBox.setSpacing(10);

        TextField text = new TextField();
        Button sortButton = new Button();
        sortButton.setOnAction(e -> System.out.println("Button clicked"));

        Text complexityText = new Text("Complexity");
        Text speedText = new Text("Speed changer");
        Button backButton = new Button("Back");
        Text placeholderText = new Text("Placeholder");

        graphBox.getChildren().add(placeholderText);


        root.add(graphBox,0,0,1,2);
        root.add(sortButton,0,2);
        root.add(complexityText,1,0);
        root.add(speedText,1,1);
        root.add(backButton,1,2);


        /////////////////////////////

        Scene scene = new Scene(root,700,300);



        stage.setScene(scene);
        stage.setTitle("Bubble sort");
        stage.show();

    }
}