package game;

import player.Player;
import board.Board;
import java.util.Scanner;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;

    public Game(Player[] players,Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=2;
        this.gameOver=false;

        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();

        for(int i=0;i<board.size;i++){
            z.append('0');
            c.append('X');
        }

        this.zero=z.toString();
        this.cross=c.toString();
    }

    public void printBoardConfig(){
        int sz=this.board.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(board.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void play(){
        printBoardConfig();
        int sz=board.size;
        while(gameOver==false){
            noOfMoves++;
            int idx=getIndex();

            int row=idx/sz;
            int col=idx%sz;

            board.matrix[row][col]=players[turn].getPlayerSymbol();

            if(noOfMoves>=sz*sz){
                System.out.println("Game DRAW!");
                return;
            }

            //here 1st if condition is to avoid calling checkCombination function when the board has less than min symbols (ex:3)
            if(noOfMoves>=2*sz-1 && checkCombinations()==true){
                gameOver=true;
                printBoardConfig();
                System.out.println("Winner is: "+players[turn].getPlayerName());
                return;
            }

            turn=(turn+1)%2;
            // %2 because there are just two players
            /* if (turn == 0) turn=1
                else turn =0

                instead of this we have written above logic
             */

            printBoardConfig();
        }
    }

    public int getIndex(){
        while(true){
            System.out.println("Player: "+players[turn].getPlayerName() + " give one position");
            Scanner sc=new Scanner(System.in);
            int pos=sc.nextInt()-1; //because of zero based indexing
            int sz=board.size;

            //to convert the pos value into indices of board matrix
            int row=pos/sz;
            int col=pos%sz;

            //checking for invalid position
            if(row<0 || row>=sz || col<0 || col>=sz){
                System.out.println("Invalid position!");
                continue;
            }

            //checking for vacant position
            if(board.matrix[row][col]!='-'){
                System.out.println("Position is already occupied!");
                continue;
            }

            return pos;
        }
    }

    public boolean checkCombinations(){
        int sz=board.size;
        
        //Row-wise checking
        for(int i=0;i<sz;i++){
            //We go with StringBuilder instead of String to reduce time complexity
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.matrix[i][j]);
            }
            String pattern = sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross))
                return true;
        }

        //Column-wise checking
        for(int i=0;i<sz;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.matrix[j][i]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross))
                return true;
        }

        //Diagonal-wise checking
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<sz){
            sb.append(board.matrix[i][j]);
            i++;
            j++;
        }
        String pattern=sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross))
            return true;

        //Anti-diagonal wise checking
        i=0;
        j=sz-1;
        while(i<sz){
            sb.append(board.matrix[i][j]);
            i++;
            j--;
        }
        pattern=sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross))
            return true;

        return false;
    }
}
