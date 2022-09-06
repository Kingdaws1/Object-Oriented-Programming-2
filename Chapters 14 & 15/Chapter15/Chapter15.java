import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Chapter15 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		HBox hBox = new HBox(50);
		hBox.setSpacing(10);
		hBox.getChildren().add(btLeft);
		hBox.getChildren().add(btRight);
		hBox.getChildren().add(btUp);
		hBox.getChildren().add(btDown);
		pane.setBottom(hBox);
		
		Pane stackPane = new Pane();
		Circle circle = new Circle(20);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		stackPane.getChildren().add(circle);
		pane.setCenter(stackPane);
		circle.setLayoutX(100);
		circle.setLayoutY(100);
		
		btUp.setOnAction(e -> {
			if (circle.getLayoutY() != 20) {
				circle.setLayoutY(circle.getLayoutY() - 10);
			}
		});
		btDown.setOnAction(e -> {
			if (circle.getLayoutY() != 150) {
				circle.setLayoutY(circle.getLayoutY() + 10);
			}
		});
		btLeft.setOnAction(e -> {
			if (circle.getLayoutX() != 20) {
				circle.setLayoutX(circle.getLayoutX() - 10);
				}
		});
		btRight.setOnAction(e -> {
			if (circle.getLayoutX() != 180) {
				circle.setLayoutX(circle.getLayoutX() + 10);
				}
		});
		
		Scene scene = new Scene(pane, 205, 200);
		primaryStage.setTitle("timelineDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
