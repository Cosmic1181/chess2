public class Rook extends Piece {
  public Rook(boolean isBlack) {
    super('R', "A8", isBlack);

    // change start position if a white piece
    if (!isBlack) {
      setPos("A1");
    }
  }
}
