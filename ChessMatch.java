

public class ChessMatch {
    //Regras do jogo de xadrez


    private Board board;


    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){

        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

       

        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        
       

        return mat;

    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
        
    }

    public void initialSetup(){
        //board.placePiece(new King(board, ColorPiece.WHITE), new Position(3, 4));
        //board.placePiece(new King(board, ColorPiece.WHITE), new Position(3, 4));
        //Está havendo conflito porque existe uma classe como o mesmo nome

        placeNewPiece('a', 6, new Rook(board, ColorPiece.WHITE));
    }


}
