package moveBehaviours;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class KingMove implements MoveBehaviour {

    @Override
    public boolean isValidMove(int oldRow, int oldColumn, int newRow, int newColumn) {
        int verticalDiff = Math.abs(oldRow - newRow);
        int horizontalDiff = Math.abs(oldColumn - newColumn);

        if (verticalDiff == 1 && horizontalDiff == 1)
            return true;
        return castling();
    }

    protected boolean castling(){
        throw new NotImplementedException();
    }
}
