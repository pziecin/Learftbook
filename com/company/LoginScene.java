package com.company;

import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.awt.*;


/**
 * Created by Piotrek on 2017-09-27.
 */
public class LoginScene{
    Scene scene;
    GridPane grid = new GridPane();
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    private double scale = 0.3;
    private double width = gd.getDisplayMode().getWidth() * scale ;
    private double height = gd.getDisplayMode().getHeight() * scale;


    public LoginScene(){
        setGridLogin();
    }

    private void setGridLogin(){
        grid.setPadding(new Insets(10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel,0,0);

        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        TextField nameInput = new TextField();
        nameInput.setPromptText("username");
        GridPane.setConstraints(nameInput,1,0);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton,1,2);
        //loginButton.setOnAction(e -> switchScene(passInput.getText(),nameInput.getText()));

        grid.getChildren().addAll(nameLabel,nameInput,passInput,passLabel,loginButton);

        scene = new Scene(grid,width,height);
    }
    public Scene getScene(){return scene;}
   /* public void switchScene(String passinput, String nameInput){
        System.out.println(passinput);
       // if(passinput == null && nameInput == null){
            this.setScene(new MenuScene().getScene());
       //// }else
     //       System.out.println("ERROR");
    }*/
}
