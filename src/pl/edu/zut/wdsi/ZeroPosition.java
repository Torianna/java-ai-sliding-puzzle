package pl.edu.zut.wdsi;

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
