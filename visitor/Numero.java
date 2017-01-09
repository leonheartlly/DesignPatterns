package visitor;

public class Numero implements Expressao {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }

    /**
     * cada expressão tem o metodo aceita, que invoca o metodo correto no
     * visitor passando ele mesmo
     * 
     */
    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaNumero(this);
    }

}
