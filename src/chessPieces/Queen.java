package chessPieces;

import moveBehaviours.QueenMove;
import weaponBehaviour.GunBehaviour;

public class Queen extends Piece{
    public Queen(){
        setMoveBehaviour(new QueenMove());
        setWeaponBehaviour(new GunBehaviour());
    }
}
