package pl.edu.zut.wdsi.hfunctions;

import pl.edu.zut.wdsi.puzzle.Puzzle;
import sac.State;
import sac.StateFunction;

public class HMisplacedTiles extends StateFunction {

    @Override
    public double calculate (State state) {
        Puzzle puzzle = (Puzzle) state;

        return puzzle.getMisplacedPuzzlePiece();
    }
}
