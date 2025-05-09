/*
 Project 1:- Tic Tac Toe
~~~~~~~~~~~~~~~~~~~~~~~

Requirements of Tic-Tac-Toe:-
---------------------------
 * 1 Board (n*n)
 * 2 players

Rules:-
-------
 * if any row/column/diagonal/anti-diagonal are filled with same symbol, then declare that player as winner of the game

Outcome:-
--------
 *Player 1 wins the game/ Player 2 wins the game / Draw (Neither p1 nor p2 wins the game)
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Board class:-
----------------
 * size of board (user input)
 * matrix of characters, initially filled with some default character

* Functions:-
--------------
 * Constructor (to fill matrix with default characters)
 * print board configuration
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Player class:-
---------------
 * name, age, address, contact number, email id, player symbol

* Functions:-
-------------
 * set player details, get player details, validation of player details
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Game rule class:-
---------------------
 * Player details (name,symbol)
 * Board (dimension)
 * Player turn info (p1/p2)
 * Number of moves done
 * Game over (boolean) -> to mark the end of game
 
 */

import board.Board;
import player.Player;
import java.util.Scanner;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Board b=new Board(3,'-');
        //b.printBoardConfig();

        Player p1=new Player();
        /*p1.setPlayerDetails("Anil", 'X', "Karnataka", "9753102460", "anil@gmail.com", 25);
        p1.getPlayerDatails();
        p1.changeSymbol('O');*/
        p1.setPlayerNameAndSymbol("Anil",'X');
        p1.getPlayerNameAndSymbol();

        System.out.println();

        Player p2=new Player();
        /*System.out.print("Enter the player name: ");
        String name=sc.nextLine();
        System.out.print("Enter the player symbol: ");
        char symbol=sc.nextLine().charAt(0);
        p2.setPlayerNameAndSymbol(name,symbol);*/
        p2.setPlayerNameAndSymbol("Archana",'O');
        p2.getPlayerNameAndSymbol();
        System.out.println();

        Game game = new Game(new Player[] {p1,p2}, b);
        game.play();
    }
}
