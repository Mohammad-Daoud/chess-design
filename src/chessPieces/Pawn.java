package chessPieces;

import moveBehaviours.PawnMove;
import weaponBehaviour.HandBehaviour;

public class Pawn extends Piece{

    public Pawn(){
        setMoveBehaviour(new PawnMove());
        setWeaponBehaviour(new HandBehaviour());
    }
}
