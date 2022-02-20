import Actions.JumpAction;
import Actions.PlayerAction;
import Actions.RunAction;
import Actions.SwimAction;
import Obstacles.*;
import Actions.RopeAction;

import java.util.Random;
public class main {
    private static final int POOL_DISTANCE = 100;
    private static final int RACETRACK_DISTANCE = 100;
    private static final int WALL_DISTANCE = 5;
    private static final int ROPE_DISTANCE = 10;

    public static void main(String[] args) {
        Course course = new Course(makeObstacles());
        Player[] players = makePlayers();
        Team team = new Team("Tigers", players);
        course.doIt(team);
        team.printWinners();
    }
    public static Obstacle[] makeObstacles() {
        return new Obstacle[]{
                new Pool(POOL_DISTANCE),
                new Racetrack(RACETRACK_DISTANCE),
                new Wall(WALL_DISTANCE),
                new Rope(ROPE_DISTANCE)
        };
    }


    public static Player[] makePlayers() {
        return new Player[] {
                new Player("Андрей", new PlayerAction[] { getSwimAction(), getJumpAction() }),
                new Player("Ваня", new PlayerAction[] { getRunAction(), getRopeAction()}),
                new Player("Петя", new PlayerAction[] { getRunAction(), getJumpAction(), getSwimAction(),getRopeAction() }),
                new Player("Лена", new PlayerAction[] { getSwimAction(), getRopeAction()}),
                new Player("Олег", new PlayerAction[] {  getRopeAction()})
        };
    }



    public static PlayerAction getSwimAction() {
        Random random = new Random();
        SwimAction swimAction = new SwimAction(random.nextInt(POOL_DISTANCE + 50));
        return swimAction;
    }

    public static PlayerAction getJumpAction() {
        Random random = new Random();
        JumpAction jumpAction = new JumpAction(random.nextInt(WALL_DISTANCE + 2));
        return jumpAction;
    }

    public static PlayerAction getRunAction() {
        Random random = new Random();
        RunAction runAction = new RunAction(random.nextInt(RACETRACK_DISTANCE + 50));
        return runAction;
    }

    public static PlayerAction getRopeAction() {
        Random random = new Random();
        RopeAction ropeAction = new RopeAction(random.nextInt(ROPE_DISTANCE + 7));
        return ropeAction;
    }
}


