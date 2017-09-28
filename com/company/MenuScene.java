package com.company;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;

/**
 * Created by Piotrek on 2017-09-27.
 */
public class MenuScene {
    private Scene scene;
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    private double scale = 0.6;
    private double width = gd.getDisplayMode().getWidth() * scale ;
    private double height = gd.getDisplayMode().getHeight() * scale;
    public MenuScene(){
        setGridLogin();
    }

    private void setGridLogin(){
        GridPane grid = new GridPane();
        grid.setPadding(new javafx.geometry.Insets(10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(8);
        grid.setHgap(10);

        scene = new Scene(grid,width,height);
    }

    public Scene getScene(){
        return scene;
    }
}
