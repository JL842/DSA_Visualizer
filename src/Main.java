import java.util.Arrays;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import DSA_Classes.BubbleSort;
import javafx.util.Duration;


public class Main extends Application {

    Stage Window;

    public static void main(String[] args) {

        Main main = new Main();

    }

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new GridPane());
        int[] data = {1,3,2,9,8,6,5,4};

        BubbleSort bubbleSort = new BubbleSort(data, stage, scene);
        System.out.println(Arrays.toString(bubbleSort.currentData));
        bubbleSort.startAlgorithm();
        System.out.println(Arrays.toString(bubbleSort.currentData));



        Button start = new Button("Start");

        HBox hbox = new HBox(); // Purpose: Simply for alignments for the button.
        hbox.getChildren().add(start);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.setPadding(new Insets(0,20,20,0)); // OFFSETS: UP, RIGHT, DOWN,LEFT

        GridPane root = new GridPane();
        root.getChildren().add(hbox);

        Scene myscene = new Scene(root,700,250); // Holds all UI components

        stage.setScene(myscene);

        stage.show();

        start.setOnAction(e -> stage.setScene(bubbleSort.scene));



//        PauseTransition delay = new PauseTransition(Duration.seconds(5));
//        delay.setOnFinished(e -> {
//            stage.setScene(bubbleSort.createPage());
//        });

      //  delay.play();


    }
}