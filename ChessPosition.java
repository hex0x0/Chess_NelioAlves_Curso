public class ChessPosition {
    private char column;
    private  int row;

    public ChessPosition(char column, int row){
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Numero de linha e/ou coluna invalidos!");
        }
        this.column = column;
        this.row = row;
        
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' -position.getColumn()), 8 - position.getRow());
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    @Override
    public String toString(){
        return "" + column + row;
    }

}
