public class ChessPiece extends Piece {
    private Color color;
    
    public ChessPiece(Board board, Color color){
        //superconstrutor da minha classe
        super(board);
        this.color = color;

    }

    public Color getColor() {
        return color;
    }


}
