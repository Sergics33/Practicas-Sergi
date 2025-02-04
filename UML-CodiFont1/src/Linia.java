import java.util.ArrayList;

public class Linia {

    private int id;
    private ArrayList<Punt>p;

    public Linia(ArrayList<Punt> p) {
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setP(ArrayList<Punt> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Linia{" +
                "id=" + id +
                ", p=" + p +
                '}';
    }
}
