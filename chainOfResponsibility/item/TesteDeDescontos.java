package item;

/**
 * Chain of responsibility cria uma cadeia de execu��o que ira efetuar uma a��o
 * e buscar pela pr�xima a��o at� que se conclua.
 * 
 * 
 * @author lucas.silva
 *
 */
public class TesteDeDescontos {

    public static void main(String[] args) {

        CalculadorDeDesconto desconto = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("Lapis", 250.0));
        orcamento.adicionaItem(new Item("Borracha", 250.0));

        double descontoFinal = desconto.calcula(orcamento);

        System.out.println(descontoFinal);
    }

}
