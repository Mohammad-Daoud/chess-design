package moveBehaviours;

public class RookMove implements MoveBehaviour {
    @Override
    public boolean isValidMove(int oldRow, int oldColumn, int newRow, int newColumn) {
        int verticalDiff = Math.abs(oldRow - newRow);
        int horizontalDiff = Math.abs(oldColumn - newColumn);

        if (horizontalDiff != 0 && verticalDiff == 0) // horizontal
            return true;
        return verticalDiff != 0 && horizontalDiff == 0; // vertical
    }
}
