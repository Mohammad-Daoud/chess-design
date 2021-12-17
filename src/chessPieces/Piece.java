package chessPieces;

import moveBehaviours.MoveBehaviour;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import weaponBehaviour.WeaponBehaviour;

public class Piece {

    private MoveBehaviour moveBehaviour;
    private WeaponBehaviour weaponBehaviour;
    public String move(String command){
        if (moveBehaviour.isValidMove(command.indexOf(0),command.indexOf(1),
                command.indexOf(3),command.indexOf(4))){

            weaponBehaviour.useWeapon();

            return "moved Successfully";
        }
        return "Try Again";
    }
    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
    boolean isKilled(){
        throw new NotImplementedException();
    }
}
