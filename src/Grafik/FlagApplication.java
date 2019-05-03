package Grafik;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FlagApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
//     root.getChildren().add(Flagmaker.sweden());
//		root.getChildren().add(Flagmaker.Denmark());
//		root.getChildren().add(Flagmaker.Laos());
//		root.getChildren().add(Flagmaker.kuwait());
//		root.getChildren().add(Flagmaker.japan());
//		root.getChildren().add(Flagmaker.usa()); 
//		root.getChildren().add(Flagmaker.kongo());
//		root.getChildren().add(Flagmaker.island());
//		root.getChildren().add(Flagmaker.tjeckien());
//		root.getChildren().add(Flagmaker.Ryssland());
//		root.getChildren().add(Flagmaker.Estland());
//		root.getChildren().add(Flagmaker.England());
//		root.getChildren().add(Flagmaker.Rumanien());
//   	root.getChildren().add(Flagmaker.Tyskland());
		root.getChildren().add(Flagmaker.italien());

	}

	public static void main(String[] args) {
		launch();
	}

}
