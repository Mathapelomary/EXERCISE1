
package com.example.tutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.String.*;
import static java.lang.String.*;

public class HelloController {

    @FXML
    private Button DECREASE;

    @FXML
    private TextField Display;

    @FXML
    private Button INCREASE;

    int counter=0;
    @FXML
    void OnDecrease(ActionEvent event) {
        if(Display.getText().isBlank()){
            counter=counter-1;
            Display.setText(String.valueOf(counter));


        }else{
            counter=Integer.parseInt(Display.getText());
            counter=counter-1;
            Display.setText(String.valueOf(counter));
        }


    }

    @FXML
    void OnIncrease(ActionEvent event) {
      if(Display.getText().isBlank()){
          counter=counter+1;
          Display.setText(String.valueOf(counter));

      }else{
          counter=Integer.parseInt(Display.getText());
                  counter=counter+1;
          Display.setText(String.valueOf(counter));
      }
    }
}