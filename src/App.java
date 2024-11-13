public class App {
    public static void main(String[] args) {
        Reino reino = new Reino();
        System.out.println("Cantidad de Ejércitos en el Reino: " + reino.getEjercitos().size());
        System.out.println("Número total de Soldados en el Reino: " + reino.getNumeroSoldados());
        System.out.println("Nivel de Vida Total en el Reino: " + reino.getNivelVidaTotal());
    }
}
