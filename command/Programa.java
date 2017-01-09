package command;

/**
 * Command Design Pattern. Encapsula um comando que será executado no futuro.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Lucas", 150.00);
        Pedido pedido2 = new Pedido("Joao", 250.00);

        FilaDeTrabalho fila = new FilaDeTrabalho();
        fila.adiciona(new PagaPedido(pedido1));
        fila.adiciona(new PagaPedido(pedido2));

        fila.adiciona(new ConcluiPedido(pedido1));

        fila.processa();
    }
}
