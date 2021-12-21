public class ChessPiece extends Piece {
    private ColorPiece color;
    
    public ChessPiece(Board board, ColorPiece color){
        //superconstrutor da minha classe
        super(board);
        this.color = color;

    }

    public ColorPiece getColor() {
        return color;
    }


}
