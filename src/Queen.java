public class Queen extends Piece{
  public Queen(boolean isBlack) {
    super('Q', "D8", isBlack);

    // change start position if a white piece
    if (!isBlack) {
      setPos("D1");
    }
  }
}
