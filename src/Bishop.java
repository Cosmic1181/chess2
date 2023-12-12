public class Bishop extends Piece {
  public Bishop(boolean isBlack) {
    super('B', "C8", isBlack);

    if (!isBlack) {
      setPos("C1");
    }
  }
}
