public abstract class ChessPiece extends Piece {
    private ColorPiece color;
    
    public ChessPiece(Board board, ColorPiece color){
        //superconstrutor da minha classe
        super(board);
        this.color = color;

    }

    public ColorPiece getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
        //Verifica se existe peça e se ela é de outra cor
    }


}
