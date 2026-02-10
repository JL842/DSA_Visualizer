package DSA_Classes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/** // Bubble Sort //
 *
 * How it works
 *
 *
 */



public class BubbleSort implements AlgorithmMaker {

    public  Scene page; // Holds all UI elements of the bubble sort to be swapped into the stage
    public int[] startData; // What we start with
    public int[] currentData; // Pause or caning the data mid-sorting maybe in the future.
    int[] CompletedData;
    String Title;

    //config
    boolean pause = false; // For the future we need the algorithm to stop
    boolean skipShowcase = false; // For the future the demonstration of the algorithm will be skipped (possible instead
    // put this in the main class instead or manager instead of every algorithm class.

// Construct's the page
    public BubbleSort( int[] startData) {




        this.startData = startData;
        currentData = startData;
        createPage();


    }

    /** // BUBBLE SORT //
     *
     * @param data - the table of int's to be manipulated
     * @return returns the sorted array.
     */

    private int[] sort(int[] data) {
        boolean sorted = false;

        for(int i =0; i < data.length; i++) {
            if (sorted) break; // if the loop below did not sort any numbers, then conclude it's sorted
            int temp;
            sorted = true;

            for (int j = 0; j < data.length-1; j++) {
                int current = data[j];
                int next = data[j + 1];

                if (current > next) {
                    sorted = false;
                    temp = current;
                    data[j] = next;
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }





    @Override
    public Boolean startAlgorithm() {
    sort(currentData);
        // probably have an exception here when starting the algorithm just incase it fails to complete and prevent the
        // program from crashing.
        return null;
    }

    @Override
    public void changeData() {

    }

    public Scene createPage(){


        Button button = new Button("Bubble Sort");
        GridPane gridPane = new GridPane();
        gridPane.gridLinesVisibleProperty().set(true);

        HBox hBox = new HBox(button);


        gridPane.add(hBox, 0,0,2,1);



    Scene scene = new Scene(gridPane);
System.out.println("Changed page ");
    return scene;
    }


}
