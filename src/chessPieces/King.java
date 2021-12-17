package chessPieces;

import moveBehaviours.KingMove;
import weaponBehaviour.GunBehaviour;

public class King extends Piece{
  public King(){
      setMoveBehaviour(new KingMove());
      setWeaponBehaviour(new GunBehaviour());
  }

}
