package edu.cis232.class24lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UnpaidOrderApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("UnpaidOrderView.fxml"));
		Scene s = new Scene(parent);
		
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
