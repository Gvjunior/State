package kasolution;

public class ExemploState {
    public static void main(String[] args) {
        ReprodutorMultimedia reprodutor = new ReprodutorMultimedia();

        reprodutor.reproduzir(); // Saída: Iniciando a reprodução.

        reprodutor.pausar(); // Saída: Não é possível pausar, a reprodução ainda não começou.

        reprodutor.parar(); // Saída: Já estou parado.

        reprodutor.reproduzir(); // Saída: Iniciando a reprodução.

        reprodutor.pausar(); // Saída: Pausando a reprodução.

        reprodutor.reproduzir(); // Saída: Retomando a reprodução.

        reprodutor.parar(); // Saída: Parando a reprodução.
    }
}
