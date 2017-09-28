package com.company;

        import javafx.application.Application;
        import javafx.scene.layout.GridPane;
        import javafx.stage.Stage;

        import java.awt.*;

public class Main extends Application {

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Learn from the Book");
        window.setScene(new LoginScene().getScene());
        window.setMinWidth(320);
        window.setMinHeight(240);
        window.show();
    }
}
