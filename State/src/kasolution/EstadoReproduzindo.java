package kasolution;

public class EstadoReproduzindo implements EstadoReproducao {
    @Override
    public void reproduzir() {
        System.out.println("Já estou reproduzindo.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a reprodução.");
    }

    @Override
    public void parar() {
        System.out.println("Parando a reprodução.");
    }
}

