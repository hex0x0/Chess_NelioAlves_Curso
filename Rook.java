public class Rook extends ChessPiece {
    public Rook(Board board, ColorPiece color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        //Matriz de booleanos da mesma dimensão do tabuleiro
        return mat;
    }

}
