package pl.edu.zut.wdsi;

import sac.graph.GraphState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle {
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

    public List<GraphState> generateChildren() {
        List<GraphState> list = new ArrayList<>();
        return new ArrayList<>();
    }

    void Shuffle(Puzzle puzzle, int steps) {

    }
}
