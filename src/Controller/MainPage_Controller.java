package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainPage_Controller implements Navigatable {

    PageManger pageManger;

    public void setPageManger(PageManger pageManger) {
        this.pageManger = pageManger;
        System.out.println(pageManger);
    }

    @FXML private Button myButton;

    @FXML private void clicked(){

    myButton.setOnAction(e -> {
        try {
            pageManger.createRootFromFXMLPath("../View/BubbleSort.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });
    }
}
