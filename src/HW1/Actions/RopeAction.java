package HW1.Actions;

import HW1.Obstacles.Obstacle;
import HW1.Obstacles.Rope;

public class RopeAction implements PlayerAction {
    private int maxDistance;
    private ActionState actionState;

    public RopeAction(int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }

    @Override
    public void pass(Obstacle obstacle) {
        if (obstacle instanceof Rope) {
            Rope rope = (Rope) obstacle;
            if (rope.getDistance() <= maxDistance) {
                System.out.println("Игрок Залез.");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("Игрок не смог залесть. Может взабраться максимум на " + maxDistance);
                actionState = ActionState.DEFEAT;
            }
        }
    }
    @Override
    public ActionState getActionState() {
        return actionState;
    }
}
