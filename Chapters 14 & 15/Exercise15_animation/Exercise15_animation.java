import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.util.Duration;
import javafx.animation.Timeline;


public class Exercise15_animation  extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle rectangle = new Rectangle(0, 0, 25, 50);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.GREEN);
		
		Polygon pentagon = new Polygon();
		pentagon.getPoints().addAll(new Double[] {
			100.00, 50.00,
			38.354, 74.752,
			64.106, 117.61,
			135.894, 117.61,
			161.646, 74.752
		});
		pentagon.setStroke(Color.BLACK);
		pentagon.setFill(Color.WHITE);
		
		pane.getChildren().add(pentagon);
		pane.getChildren().add(rectangle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		
		pentagon.setOnMousePressed(e -> pt.pause());
		pentagon.setOnMouseReleased(e -> pt.play());
		
		FadeTransition ft = new FadeTransition(Duration.millis(5000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.play();
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise 15 Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
