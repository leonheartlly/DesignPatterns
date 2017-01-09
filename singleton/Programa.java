package singleton;

/**
 * Facade design pattern. Da uma interface unica para todos que desejam usar o
 * sistema.
 * Singleton entrega uma única instancia de uma classe no projeto.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    public static void main(String[] args) {

        /**
         * Facade é pouco usado pois sua interface tende a ficar muito grande
         * uma vez que centraliza
         * todas as chamadas externas do projeto.
         */
        EmpresaFacade facade = new EmpresaFacadeSingleton().getInstance();
        facade.buscaCliente(cpf);
        facade.criaFatura(cliente, valor);

        /**
         * Singleton é pouco usado e da a desvantagem de criar um estado global
         * semelhante a uma variavel global
         * permitindo erros no sistema.
         */
    }

}
