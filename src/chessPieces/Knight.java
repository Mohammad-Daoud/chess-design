package chessPieces;

import moveBehaviours.KnightMove;
import weaponBehaviour.AxeBehaviour;


public class Knight extends Piece{
    public Knight(){
        setMoveBehaviour(new KnightMove());
        setWeaponBehaviour(new AxeBehaviour());
    }
}
