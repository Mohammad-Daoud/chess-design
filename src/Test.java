public class Test {
    public static void main(String[] args) {
        ChessGame game = new ChessGame("fahed","ahmad");
        while (!game.isDone()){
            String move = " ";
            if (game.isWhiteTurn())
                game.playWhite(move);
            else
                game.playBlack(move);
        }
        game.printWinnerName();

    }
}
