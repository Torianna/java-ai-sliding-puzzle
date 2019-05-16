package pl.edu.zut.wdsi;

import sac.graph.GraphState;
import sac.graph.GraphStateImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle extends GraphStateImpl {
    private static final int n=3;
    private byte[][] board;
    private int x, y;


    public Puzzle() {  //napełniamy konstruktor rozwiązaniem
        board = new byte[n][n];
        byte value = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = value++;
            }
        }
        //wspołrzędne zera
        x = 0;
        y = 0;
    }

    public Puzzle(Puzzle parent) {
        board = new byte[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(parent.board[i], 0, board[i], 0, n);
        }

        x = parent.x;
        y = parent.y;
    }



    public class ZeroPosition {
        private int x = 0;
        private int y = 0;

        public ZeroPosition(){}

        public ZeroPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public ZeroPosition(ZeroPosition zeroPositionObj) {
            x = zeroPositionObj.x;
            y = zeroPositionObj.y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "x =" + x +
                    "\ny =" + y;
        }
    }
    @Override
    public int hashCode() {
        byte[] linear = new byte[n*n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                linear[k++] = board[i][j];
            }
        }
        return Arrays.hashCode(linear);
    }

    @Override
    public List<GraphState> generateChildren() {
        List<GraphState> list = new ArrayList<>();
        return new ArrayList<>();
    }

    public enum Moves {
        GOUP,
        GODOWN,
        GOLEFT,
        GORIGHT
    }

    @Override
    public boolean isSolution() {
        return false;
    }

}
