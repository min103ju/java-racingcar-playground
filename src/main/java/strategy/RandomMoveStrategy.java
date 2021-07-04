package strategy;

import utils.RandomUtils;

public class RandomMoveStrategy implements MoveStrategy {
    private final int MOVE_CONDITION_NUM = 4;

    @Override
    public boolean movable() {
        return RandomUtils.getRandomNum() > MOVE_CONDITION_NUM;
    }
}
