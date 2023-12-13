public class Piece {
  // for creating pieces
  private char symbol;
  private String position;
  private boolean isBlack;
  private char[] xCoords = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

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

  public int[] convertPosition(String position) {
    position = this.position;
    char[] charPos = position.toCharArray();
    int piecePos[2];

    // compare x to chars
    for (int i : xCoords) {
      if (charPos[0] == xCoords[i]) {
        piecePos[0] = i + 1;
      }
      return null;
    }

    // piecePos[1] =
  }
}
