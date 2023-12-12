public class Board {
  private Piece [][] board;

  public Chess() {
    board = new Piece[8][8]; // creates an empty board

    // creating the pieces
    board[4][0] = new King(true); // BLACK KING in position E8
    board[4][7] = new King(false); // WHITE KING in position E1

    board[3][0] = new Queen(true); // BLACK QUEEN in position D8
    board[3][7] = new Queen(false); // WHITE QUEEN in position D1

    board[2][0] = new Bishop(true); //  BLACK BISHOP in position C8


  }
}
