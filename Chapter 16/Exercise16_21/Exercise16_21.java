import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;

public class Exercise16_21 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		TextField tf = new TextField();
		tf.setAlignment(Pos.CENTER);
		pane.getChildren().add(tf);
		
		Pane countdown = new Pane();
		pane.getChildren().add(countdown);
		countdown.setBackground(null);
		Label countdownLabel = new Label();
		int userNumber = Integer.parseInt(tf.getText());
		String countdownNumber = "";
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			countdownNumber += userNumber--;
			countdownLabel.setText(countdownNumber);
			}));
		tf.setOnAction(e -> {
			timeline.setCycleCount(userNumber);
			countdown.getChildren().add(countdownLabel);
			timeline.play();
			for (int i = 0; i < userNumber; i++) {
				System.out.println("he");
				countdownNumber += userNumber - i;
				countdownLabel.setText(countdownNumber);
				
			}
			tf.clear();
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 16-21");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();

	}

}
