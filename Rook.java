public class Rook extends ChessPiece {
    public Rook(Board board, ColorPiece color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
