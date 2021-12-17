import chessPieces.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ChessGame extends Player{
    Piece[][] board = new Piece[8][8];
    public ChessGame(String whitePlayer, String blackPlayer) {
        super(whitePlayer, blackPlayer);
    }

    private void reset() {

        // White Units
        board[0][0] = new Rook();
        board[0][1] = new Knight();
        board[0][2] = new Bishop();
        board[0][3] = new Queen();
        board[0][4] = new King();
        board[0][5] = new Bishop();
        board[0][6] = new Knight();
        board[0][7] = new Rook();

        board[1][0] = new Pawn();
        board[1][1] = new Pawn();
        board[1][2] = new Pawn();
        board[1][3] = new Pawn();
        board[1][4] = new Pawn();
        board[1][5] = new Pawn();
        board[1][6] = new Pawn();
        board[1][7] = new Pawn();

        // Black Units
        board[7][0] = new Rook();
        board[7][1] = new Knight();
        board[7][2] = new Bishop();
        board[7][3] = new Queen();
        board[7][4] = new King();
        board[7][5] = new Bishop();
        board[7][6] = new Knight();
        board[7][7] = new Rook();

        board[6][0] = new Pawn();
        board[6][1] = new Pawn();
        board[6][2] = new Pawn();
        board[6][3] = new Pawn();
        board[6][4] = new Pawn();
        board[6][5] = new Pawn();
        board[6][6] = new Pawn();
        board[6][7] = new Pawn();
    }

    public Piece[][] getBoard() {
        return board;
    }

    private boolean isEmptyCell(int row, int col) {
        return board[row][col] == null;
    }

    public boolean isDone() {
        return isCheckmate();
    }

    public boolean isCheckmate() {
        throw new NotImplementedException();
    }

    public void printWinnerName(){
        if (isWhiteTurn() && isDone())
            System.out.println("BLACK WIN");
        if (!isWhiteTurn()&& isDone())
            System.out.println("WHITE WIN");
    }
}
