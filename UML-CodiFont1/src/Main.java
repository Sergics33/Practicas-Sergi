import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce una id");
        int id = sc.nextInt();

        System.out.println("Introduce un valor X");
        int x = sc.nextInt();

        System.out.println("Introduce un valor y");
        int y = sc.nextInt();

        Punt punt = new Punt(id, x, y);

        Linia L = new Linia(punt);
        Area A = new Area(punt);

        System.out.println(L);
        System.out.println(A);

    }
}
