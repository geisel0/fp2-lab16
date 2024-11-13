import java.util.*;

class Ejercito {
    private ArrayList<Soldado> soldados;

    // Constructor que genera un ejército con entre 1 y 10 soldados
    public Ejercito() {
        Random random = new Random();
        int numSoldados = random.nextInt(10) + 1; // Número entre 1 y 10
        soldados = new ArrayList<>();
        for (int i = 0; i < numSoldados; i++) {
            soldados.add(new Soldado());
        }
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }
}