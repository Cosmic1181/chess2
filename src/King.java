public class King extends Piece {
  public King(boolean isBlack) {
    super('K', "E8", isBlack);

    // change start position if a white piece
    if (!isBlack) {
      setPos("E1");
    }
  }
}
