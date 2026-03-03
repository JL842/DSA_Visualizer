package Controller;


import com.sun.tools.javac.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PageManger {

private Scene scene;
private HashMap<String, Parent> pageHolder;


public PageManger(Scene scene, Parent startRoot, FXMLLoader startloader) throws  NullPointerException{
    this.scene = scene;
    this.pageHolder = new HashMap<String, Parent>();
    pageHolder.put("StartRoot", startRoot);
    Navigatable startController = startloader.getController();
    startController.setPageManger(this);
}


    public void changeRoot(Parent newRoot){
        scene.setRoot(newRoot);
    }

    // If passing the path to the fxml file to create the root.
    public void createRootFromFXMLPath(String fxmlPath) throws Exception {
    Parent root;
        if(pageHolder.get(fxmlPath) == null) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            root = loader.load();

            Navigatable pageController = loader.getController();
            pageController.setPageManger(this);
            pageHolder.put(fxmlPath, root);
        }else {
           root = pageHolder.get(fxmlPath);
        }
        this.changeRoot(root);
    }



    public boolean requestToChangeScene(){

    return true;
    }

}
