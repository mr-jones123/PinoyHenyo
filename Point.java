public class Point {
    // point is the game's point system
    private int _point = 0;

    public Point(int point) {
        _point = point;
    }

    public void increase() {
        _point++;
    }

    public int getPoint() {
        return _point;
    }
}
