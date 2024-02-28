package kasolution;

public class EstadoPausado implements EstadoReproducao {
    @Override
    public void reproduzir() {
        System.out.println("Retomando a reprodução.");
    }

    @Override
    public void pausar() {
        System.out.println("Já estou pausado.");
    }

    @Override
    public void parar() {
        System.out.println("Parando a reprodução.");
    }
}
