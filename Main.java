import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     

      Scanner sc = new Scanner(System.in);
      ChessMatch ch = new ChessMatch();

      


      while(true){
        UI.printBoard(ch.getPieces());
        System.out.println();
        System.out.println("Source: ");
        ChessPosition source = UI.readChessPosition(sc);

        System.out.println();
        System.out.println("Target: ");
        ChessPosition target = UI.readChessPosition(sc);

        ChessPiece capturedPiece = ch.performChessMove(source, target);

        

      }

      
      //Estou na aula dos movimentos possíveis das peças
      

    }
}