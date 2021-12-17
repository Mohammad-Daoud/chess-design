package chessPieces;

import moveBehaviours.RookMove;
import weaponBehaviour.BazookaBehaviour;

public class Rook extends Piece {
    public Rook(){
        setMoveBehaviour(new RookMove());
        setWeaponBehaviour(new BazookaBehaviour());
    }
}
