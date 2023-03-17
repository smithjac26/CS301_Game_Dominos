package com.example.dominoes;

import java.util.ArrayList;

public class DominoGameStat {
    private ArrayList<Integer> player1Hand;
    private ArrayList<Integer> player2Hand;
    private ArrayList<Integer> player3Hand;
    private ArrayList<Integer>player4Hand;

    private ArrayList<Integer> board;
    private int currentPlayer;
    private int player1Score;
    private int player2Score;

    private int player3Score;
    private int player4Score;

    public class DominoeGameState {

        public DominoeGameState(){
            //Initialises the game state
            player1Hand = new ArrayList<>();
            player2Hand = new ArrayList<>();
            player3Hand = new ArrayList<>();
            player4Hand = new ArrayList<>();
            board = new ArrayList<Integer>();
            currentPlayer = 1;
            player1Score = 0;
            player2Score = 0;
            player3Score = 0;
            player4Score = 0;
        }

    }

    //
    //
    //These are the getters and setters for the game, which includes the
    //score, current player/turn, and each players hand.
    //

    //Gets player 1 domino hand
    public ArrayList<Integer> getPLayer1Hand(){

        return player2Hand;
    }
    //Sets player 1 domino hand
    public void setPlayer1Hand(ArrayList<Integer> player1Hand){

        this.player1Hand = player1Hand;
    }
   //Gets player 2 domino hand
    public ArrayList<Integer> getPlayer2Hand(){

        return player2Hand;
    }
    //Sets player 2 domino hand
    public void setPlayer2Hand(ArrayList<Integer> player2Hand){

        this.player2Hand = player2Hand;
    }
    //Get player 3 domino hand
    public ArrayList<Integer> getPlayer3Hand(){

        return player3Hand;
    }
    //Sets player 3 domino hands
    public void setPlayer3Hand(ArrayList<Integer> player3Hand){

        this.player3Hand = player3Hand;
    }

    //PLayer 4 domino hand
    public ArrayList<Integer> getPlayer4Hand(){

        return player4Hand;
    }
    //Player 4 domino hand when its turn
    public void setPlayer4Hand(ArrayList<Integer> player4Hand){

        this.player4Hand = player4Hand;
    }
    //Gets the board
    public ArrayList<Integer> getBoard(){

        return board;
    }
   //Initialises the board
    public void setBoard(ArrayList<Integer> board){

        this.board = board;
    }
   //Calls the current/players turn
    public int getCurrentPlayer(){

        return currentPlayer;
    }
   //Gets player 1 score
    public int getPlayer1Score(){
        return player1Score;
    }
   //Sets player 1 score
    public void setPlayer1Score(int player1Score){
        this.player1Score = player1Score;
    }
    //Gets player 2 score
    public int getPlayer2Score(){
        return player2Score;
    }
    //Sets the player 2 score
    public void setPlayer2Score(int player2Score){
        this.player2Score = player2Score;
    }
    //Gets player 3 score
    public int getPlayer3Score(){
        return player3Score;
    }
    //Sets the player 3 scores
    public void setPlayer3Score(int player3Score){
        this.player3Score = player3Score;
    }
   //Gets player 4 score
    public int getPlayer4Score(){
        return player4Score;
    }
    //Sets player 4 score
    public void setPlayer4Score(int player4Score){
        this.player4Score = player4Score;
    }
}
