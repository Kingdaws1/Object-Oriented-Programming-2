import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class Exercise14_15 extends Application {

	@Override 
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		polygon.setRotate(22.5);
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(i * Math.PI / 4));
			list.add(centerY - radius * Math.sin(i * Math.PI / 4));
		}
		
		Text text1 = new Text(185, 185, "STOP");
		text1.setStroke(Color.WHITE);
		text1.setFill(Color.WHITE);
		text1.setFont(Font.font("typeface Highway Gothic", FontWeight.BOLD, FontPosture.REGULAR, 45));
		pane.getChildren().add(text1);
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("Show Polygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
