package visitor;

public class Soma implements Expressao {

    private Expressao direita;
    private Expressao esquerda;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();

        return valorDaEsquerda + valorDaDireita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaSoma(this);
    }
}