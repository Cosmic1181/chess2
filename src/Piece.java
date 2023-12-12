public class Piece {
  // for creating pieces
  private char symbol;
  private String position;
  private boolean isBlack;

  public Piece(char symbol, String position, boolean isBlack) {
    symbol = this.symbol;
    position = this.position;
    isBlack = this.isBlack;
  }

  public void setPos(String position) {
    // TODO validates position;
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  public boolean isValidMove() {
    if (position.equals(this.position)) {
      return false;
    }

    return true;
  }
}
