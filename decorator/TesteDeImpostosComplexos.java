package decorator;

import templateMethod.Orcamento;
import templateMethod.impostos.ICMS;
import templateMethod.impostos.ISS;
import templateMethod.interfaces.Imposto;

/**
 * Decorator. responsável por decorar os impostos fazendo uso do polimorfismo.
 * Maneira de juntar comportamentos que estão quebrados em classes diferentes.
 * 
 * @author lucas.silva
 *
 */
public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}
