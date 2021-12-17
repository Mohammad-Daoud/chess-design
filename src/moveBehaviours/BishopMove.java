package moveBehaviours;

public class BishopMove implements MoveBehaviour {

    @Override
    public boolean isValidMove(int oldRow, int oldColumn, int newRow, int newColumn) {
        int verticalDiff = Math.abs(oldRow - newRow);
        int horizontalDiff = Math.abs(oldColumn - newColumn);

        if (horizontalDiff == verticalDiff) // diagonal
            return verticalDiff != 0;

            return false;
    }
}
