public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i < pieces.length; i++){
            System.out.print((8-i) + " ");
            for(int j = 0; j < pieces.length; i++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
    }

    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.println("-");
        }else{
            System.out.println(piece);
        }
    }

}
