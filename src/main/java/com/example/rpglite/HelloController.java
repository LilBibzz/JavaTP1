package com.example.rpglite;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    public GameRpgTp leJeu = new GameRpgTp();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        leJeu.streetFight();
    }
}