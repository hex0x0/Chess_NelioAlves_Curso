public class King extends ChessPiece{
    public King(Board board, ColorPiece color){
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        //Matriz de booleanos da mesma dimensão do tabuleiro
        return mat;
    }
}
