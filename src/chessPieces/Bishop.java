package chessPieces;

import moveBehaviours.BishopMove;
import weaponBehaviour.AxeBehaviour;


public class Bishop extends Piece{
    public Bishop(){
        setMoveBehaviour(new BishopMove());
        setWeaponBehaviour(new AxeBehaviour());
    }
}
