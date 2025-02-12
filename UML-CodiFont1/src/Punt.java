import java.util.ArrayList;

public class Punt extends ArrayList<Punt> {
    private int id;
    private int x;
    private int y;

    public Punt(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Punt{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
