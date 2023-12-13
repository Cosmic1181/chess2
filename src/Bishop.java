public class Bishop extends Piece {
  public Bishop(boolean isBlack) {
    super('B', "C8", isBlack);

    // change start position if a white piece
    if (!isBlack) {
      setPos("C1");
    }
  }
}
