public class Knight extends Piece {
  public Knight(boolean isBlack) {
    super('N', "B8", isBlack);

    // change start position if a white piece
    if (!isBlack) {
      setPos("B1");
    }
  }
}
