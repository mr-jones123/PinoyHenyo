public class Point {
    private int _point = 0;

    public Point(int point) {
        _point = point;
    }

    public void increase(Integer point) {
        _point += point;
    }

    public int getPoint() {
        return _point;
    }

}
