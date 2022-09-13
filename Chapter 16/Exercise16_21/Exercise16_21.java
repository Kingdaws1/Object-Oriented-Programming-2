import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Exercise16_21 extends Application{
	int i = 0;
	private static final String url = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	
	@Override
	public void start(Stage primaryStage) {
		Media media = new Media(url);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		StackPane pane = new StackPane();
		TextField tf = new TextField();
		tf.setAlignment(Pos.CENTER);
		pane.getChildren().add(tf);
		StackPane countdown = new StackPane();
		countdown.setBackground(null);
		Rectangle rectangle = new Rectangle(10, 10, 50, 25);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		Label countdownLabel = new Label("", countdown);
		countdownLabel.setAlignment(Pos.CENTER);
		countdownLabel.setBackground(null);
		countdown.getChildren().addAll(rectangle, countdownLabel);

		EventHandler<ActionEvent> eventHandler = e -> {
			pane.getChildren().clear();
			pane.getChildren().add(countdownLabel);
			int userNumber = Integer.parseInt(tf.getText());
			String countdownNumber = "" + (userNumber - i);
			countdownLabel.setText(countdownNumber);
			if (userNumber == i) {
				System.out.println("working");
				mediaPlayer.play();
			}
			i ++;
		};
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		tf.setOnAction(e -> {
			timeline.setCycleCount(Integer.parseInt(tf.getText()) + 1);
			timeline.play();
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
