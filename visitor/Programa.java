package visitor;

/**
 * Interpreter Design Pattern. Create a self evaluate expression tree.
 * This tree work in every expression created and return a operation value.
 * 
 * Visitor DesinPattern uses the interpreter genereated tree and visit each node
 * doing a desired action.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    /**
     * This is not a simple code, so lets explain a little.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Expressao conta = new Soma(new Numero(10), new Numero(15));

        // left we have 10 - 5 = 5
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));

        // right we have 2 + 10 = 12
        Expressao direita = new Soma(new Numero(2), new Numero(10));

        // finally we have 5 + 12 = 17
        Expressao soma = new Soma(esquerda, direita);



        int resultado = soma.avalia();

        System.out.println(resultado);

        ImpressoraVisitor impressora = new ImpressoraVisitor();
        soma.aceita(impressora);
    }
}
