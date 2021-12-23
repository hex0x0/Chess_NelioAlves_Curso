

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

    public static ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();

        validadeSoucePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    public void validadeSoucePosition(Position position){
        if(!board.thereIsAPiece(position)){
            throw new BoardException("Não há peça nessa posição!");
        }
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
