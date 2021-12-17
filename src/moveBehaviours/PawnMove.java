package moveBehaviours;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PawnMove implements MoveBehaviour {


    @Override
    public boolean isValidMove(int oldRow, int oldColumn, int newRow, int newColumn) {
        int verticalDiff = Math.abs(oldRow - newRow);
        int horizontalDiff = Math.abs(oldColumn - newColumn);

        if (verticalDiff == 1 && horizontalDiff == 1)
            return true;

       else throw new NotImplementedException();
        //implement the other cases for pawns .i.e if first move or if the pawn has reached to end of the board.
    }
}


