public class Life {
    private int _life = 0;

    public Life(int life) {
        _life = life;
    }

    public void decrease() {
        _life--;
    }

    public int getLife() {
        return _life;
    }

    public Boolean isDead() {
        return _life <= 0;
    }
}
