# Connect 4

## Synopsis
This is a very basic Connect 4 game that is meant to be played by two people. The players take turns dropping in pieces and try to get four pieces in a row either horizontally, 
vertically, or diagonally. You can reset or close the board when you are finished.

## Motivation
I wanted to create a fun game that is easy to understand. 

## Code Example
Here is a small snippet of code from the project that defines what happens when you click the piece to drop down.
```
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
```

## Tests
This progam uses junit4 tests to ensure that everything functions correctly. 
