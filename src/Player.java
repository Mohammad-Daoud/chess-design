import chessPieces.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Player extends Piece{
    private final String whitePlayer,blackPlayer;
    private int turn = 0;

    public Player(String whitePlayer, String blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public boolean isWhiteTurn(){
        return turn % 2 == 0;
    }

    public void playWhite(String command){
        if (isWhiteTurn()) {
            System.out.println(move(command));
        turn++;
        }
    }
    public void playBlack(String command){
        if (!isWhiteTurn()) {
            System.out.println(move(command));
            turn++;
        }
    }
}
