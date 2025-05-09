Project : Tic Tac Toe Game (Java Console Application)
------------------------------------------------------
This project is a Java-based implementation of the classic Tic Tac Toe game for two players, running in a console environment.
-------------------------------------------------------------------------------------------------------------------------------------
📌 Key Components:-

* Board Class (Board.java)

* Manages the game grid.

* Creates an n x n board filled with a default symbol (e.g., '-').

* Provides a method to print the current board configuration.
---------------------------------------------------------------------------------------------
1) Player Class (Player.java):

* Stores and manages player information such as:

* Name, age, address, contact number, email, and game symbol (X or O).

* Includes methods to set and retrieve player details and symbols.
-----------------------------------------------------------------------------------------------
2) Game Class (Game.java):
   
* Handles the main game loop, player turns, input validation, and win/draw logic.

* Implements methods to:
* 
* Read player move input.

* Validate positions.

* Check for winning conditions across rows, columns, and both diagonals.

* Display the board after each move.
---------------------------------------------------------------------------------------------
3) App Class (Main Entry Point) (App.java):
   
* Sets up the game by:Creating the board.

* Initializing players with hardcoded names and symbols (Anil and Archana).

* Launching the game loop via the Game class.

--------------------------------------------------------------------------------------
🎮 Game Flow:-

* Initializes a 3x3 board.

* Prompts players to input their move by selecting a cell number.

* Continues until: A player wins by aligning their symbols.

* The board fills up, resulting in a draw.

--------------------------------------------------------------------------------------------
✅ Features:-

* Input validation for out-of-bounds or already occupied positions.

* Simple and readable win-checking logic using string comparisons.

* Modular class design separating game logic, board management, and player details.

