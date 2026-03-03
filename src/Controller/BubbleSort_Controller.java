package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;

public class BubbleSort_Controller implements Navigatable {
    PageManger pageManger;
    @FXML
    Button myButton;
    @FXML
    ScrollBar speedBar;
    @FXML
    TextField userInput;
    @FXML
    void clicked(){

        myButton.setOnAction(e -> System.out.println("clicked back button"));


    }


    @Override
    public void setPageManger(PageManger pageManger) {
    this.pageManger = pageManger;
    }
}
