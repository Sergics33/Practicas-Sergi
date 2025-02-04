import java.util.ArrayList;

public class Area {
        private int id;
        private ArrayList<Punt> p;

    public Area(ArrayList<Punt> p) {
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Punt> getP() {
        return p;
    }

    public void setP(ArrayList<Punt> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", p=" + p +
                '}';
    }
}

