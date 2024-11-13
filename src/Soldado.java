import java.util.*;

class Soldado {
    private int nivelVida;

    public Soldado() {
        Random random = new Random();
        this.nivelVida = random.nextInt(5) + 1;
    }

    public int getNivelVida() {
        return nivelVida;
    }
}

