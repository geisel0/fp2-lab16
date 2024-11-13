import java.util.*;

public class Reino {
    private ArrayList<Ejercito> ejercitos;

    public Reino() {
        Random random = new Random();
        int numEjercitos = random.nextInt(10) + 1;
        ejercitos = new ArrayList<>();
        for (int i = 0; i < numEjercitos; i++) {
            ejercitos.add(new Ejercito());
        }
    }

    public int getNumeroSoldados() {
        int totalSoldados = 0;
        for (Ejercito ejercito : ejercitos) {
            totalSoldados += ejercito.getSoldados().size();
        }
        return totalSoldados;
    }

    public int getNivelVidaTotal() {
        int totalNivelVida = 0;
        for (Ejercito ejercito : ejercitos) {
            for (Soldado soldado : ejercito.getSoldados()) {
                totalNivelVida += soldado.getNivelVida();
            }
        }
        return totalNivelVida;
    }

    public ArrayList<Ejercito> getEjercitos() {
        return ejercitos;
    }
}
