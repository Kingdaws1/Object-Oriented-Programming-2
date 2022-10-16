import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class Connect_Four extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		VBox overallSetting = new VBox();
		overallSetting.setAlignment(Pos.CENTER);
		
		Turn newGame = new Turn();
		
		HBox buttonSpaces = new HBox();
		buttonSpaces.setAlignment(Pos.BOTTOM_CENTER);
		buttonSpaces.setSpacing(0);
		buttonSpaces.setPrefHeight(70);
		buttonSpaces.setPrefWidth(490);
		
		int[][] gameBoard = {
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0}};
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
			}
		}
		
		GridPane board = new GridPane();
		board.setAlignment(Pos.CENTER);
		board.setGridLinesVisible(true);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				Pane pieceSlot = new Pane();
				pieceSlot.setPrefHeight(70);;
				pieceSlot.setPrefWidth(70);
				pieceSlot.setVisible(true);
				board.setRowIndex(pieceSlot, i);
				board.setColumnIndex(pieceSlot, j);
				board.getChildren().add(pieceSlot);
			}
		}
		
		Pane c0Pane = new Pane();
		Circle c0 = new Circle(30);
		c0.setCenterX(35);
		c0.setCenterY(35);
		c0.setVisible(false);
		c0Pane.setOnMouseEntered(e -> {
			c0.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c0.setFill(Color.RED);
			}
			else {
				c0.setFill(Color.BLACK);
			}
		});
		c0Pane.setOnMouseExited(e -> {
			c0.setVisible(false);
		});
		c0Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 0);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][0] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][0]++;
					} else {
						gameBoard[row][0]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c0Pane.setPrefHeight(70);
		c0Pane.setPrefWidth(70);
		c0Pane.getChildren().add(c0);
		buttonSpaces.getChildren().add(c0Pane);
		
		Pane c1Pane = new Pane();
		Circle c1 = new Circle(30);
		c1.setCenterX(35);
		c1.setCenterY(35);
		c1.setVisible(false);
		c1Pane.setOnMouseEntered(e -> {
			c1.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c1.setFill(Color.RED);
			}
			else {
				c1.setFill(Color.BLACK);
			}
		});
		c1Pane.setOnMouseExited(e -> {
			c1.setVisible(false);
		});
		c1Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 1);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][1] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][1]++;
					} else {
						gameBoard[row][1]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c1Pane.setPrefHeight(70);
		c1Pane.setPrefWidth(70);
		c1Pane.getChildren().add(c1);
		buttonSpaces.getChildren().add(c1Pane);
		
		Pane c2Pane = new Pane();
		Circle c2 = new Circle(30);
		c2.setCenterX(35);
		c2.setCenterY(35);
		c2.setVisible(false);
		c2Pane.setOnMouseEntered(e -> {
			c2.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c2.setFill(Color.RED);
			}
			else {
				c2.setFill(Color.BLACK);
			}
		});
		c2Pane.setOnMouseExited(e -> {
			c2.setVisible(false);
		});
		c2Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 2);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][2] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][2]++;
					} else {
						gameBoard[row][2]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c2Pane.setPrefHeight(70);
		c2Pane.setPrefWidth(70);
		c2Pane.getChildren().add(c2);
		buttonSpaces.getChildren().add(c2Pane);
		
		Pane c3Pane = new Pane();
		Circle c3 = new Circle(30);
		c3.setCenterX(35);
		c3.setCenterY(35);
		c3.setVisible(false);
		c3Pane.setOnMouseEntered(e -> {
			c3.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c3.setFill(Color.RED);
			}
			else {
				c3.setFill(Color.BLACK);
			}
		});
		c3Pane.setOnMouseExited(e -> {
			c3.setVisible(false);
		});
		c3Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 3);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][3] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][3]++;
					} else {
						gameBoard[row][3]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c3Pane.setPrefHeight(70);
		c3Pane.setPrefWidth(70);
		c3Pane.getChildren().add(c3);
		buttonSpaces.getChildren().add(c3Pane);
		
		Pane c4Pane = new Pane();
		Circle c4 = new Circle(30);
		c4.setCenterX(35);
		c4.setCenterY(35);
		c4.setVisible(false);
		c4Pane.setOnMouseEntered(e -> {
			c4.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c4.setFill(Color.RED);
			}
			else {
				c4.setFill(Color.BLACK);
			}
		});
		c4Pane.setOnMouseExited(e -> {
			c4.setVisible(false);
		});
		c4Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 4);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][4] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][4]++;
					} else {
						gameBoard[row][4]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c4Pane.setPrefHeight(70);
		c4Pane.setPrefWidth(70);
		c4Pane.getChildren().add(c4);
		buttonSpaces.getChildren().add(c4Pane);
		
		Pane c5Pane = new Pane();
		Circle c5 = new Circle(30);
		c5.setCenterX(35);
		c5.setCenterY(35);
		c5.setVisible(false);
		c5Pane.setOnMouseEntered(e -> {
			c5.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c5.setFill(Color.RED);
			}
			else {
				c5.setFill(Color.BLACK);
			}
		});
		c5Pane.setOnMouseExited(e -> {
			c5.setVisible(false);
		});
		c5Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 5);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][5] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][5]++;
					} else {
						gameBoard[row][5]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c5Pane.setPrefHeight(70);
		c5Pane.setPrefWidth(70);
		c5Pane.getChildren().add(c5);
		buttonSpaces.getChildren().add(c5Pane);
		
		Pane c6Pane = new Pane();
		Circle c6 = new Circle(30);
		c6.setCenterX(35);
		c6.setCenterY(35);
		c6.setVisible(false);
		c6Pane.setOnMouseEntered(e -> {
			c6.setVisible(true);
			if (newGame.getTurn() % 2 == 0) {
				c6.setFill(Color.RED);
			}
			else {
				c6.setFill(Color.BLACK);
			}
		});
		c6Pane.setOnMouseExited(e -> {
			c6.setVisible(false);
		});
		c6Pane.setOnMouseClicked(e -> {
			Circle piece = new Circle(30);
			piece.setCenterX(35);
			piece.setCenterY(35);
			if (newGame.getTurn() % 2 == 0) {
				piece.setFill(Color.RED);
			} else {
				piece.setFill(Color.BLACK);
			}
			board.setColumnIndex(piece, 6);
			boolean available = false;
			int row = 6;
			while (available == false) {
				board.setRowIndex(piece, row);
				if (gameBoard[row][6] == 0) {
					if (newGame.getTurn() % 2 == 0) {
						gameBoard[row][6]++;
					} else {
						gameBoard[row][6]--;
					}
					piece.setVisible(true);
					board.getChildren().add(piece);
					newGame.changeTurn();
					available = true;
				}
				if (row == 0) {
				available = true;	
				}
				row--;
			}
		});
		c6Pane.setPrefHeight(70);
		c6Pane.setPrefWidth(70);
		c6Pane.getChildren().add(c6);
		buttonSpaces.getChildren().add(c6Pane);
		
		Pane gameTitle = new Pane();
		Label connectFour = new Label("Connect 4");
		connectFour.setAlignment(Pos.TOP_CENTER);
		connectFour.setTextFill(Color.RED);
		connectFour.setLayoutX(260);
		connectFour.setFont(new Font("Arial", 40));
		connectFour.setWrapText(true);
		gameTitle.getChildren().add(connectFour);
		
		overallSetting.getChildren().add(gameTitle);
		
		overallSetting.getChildren().add(buttonSpaces);
		
		overallSetting.getChildren().add(board);
		
		HBox playAgain = new HBox();
		Text resetBoard = new Text("Reset Board?");
		resetBoard.setFont(new Font("Arial", 20));
		playAgain.getChildren().add(resetBoard);
		Button yes = new Button("Yes");
		Button no = new Button("No");
		yes.setOnMouseClicked(e -> {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					gameBoard[i][j] = 0;
				}
			}
			board.setGridLinesVisible(false);
			board.getChildren().clear();
			board.setAlignment(Pos.CENTER);
			board.setGridLinesVisible(true);
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					Pane pieceSlot = new Pane();
					pieceSlot.setPrefHeight(70);;
					pieceSlot.setPrefWidth(70);
					pieceSlot.setVisible(true);
					board.setRowIndex(pieceSlot, i);
					board.setColumnIndex(pieceSlot, j);
					board.getChildren().add(pieceSlot);
				}
			}
			newGame.reset();
		});
		
		no.setOnMouseClicked(e -> {
			primaryStage.close();
		});
		
		playAgain.getChildren().addAll(yes, no);
		playAgain.setAlignment(Pos.CENTER);
		playAgain.setMinHeight(100);
		
		overallSetting.getChildren().add(playAgain);
		
		Scene scene = new Scene(overallSetting, 700, 700);
		primaryStage.setTitle("CONNECT 4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public class Turn {
		int whoseTurn = 1;
		public Turn() {
			int whoseTurn = 1;
		}
		public void changeTurn() {
			this.whoseTurn++;
		}
		public int getTurn() {
			return this.whoseTurn;
		}
		public void reset() {
			this.whoseTurn = 1;
		}
	}
	
	public static void main(String[] args) {
		launch();

	}

}
