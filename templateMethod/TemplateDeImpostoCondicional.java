package templateMethod;

import item.Orcamento;
import templateMethod.interfaces.Imposto;

/**
 * Template Method. Este padr�o identifica partes em comum de um mesmo c�digo
 * gera um template permitindo que metodos que compartilham sua implementa��o
 * costumize apenas os buracos restantes.
 * 
 * @author lucas.silva
 *
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {


    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            minimaTaxacao(orcamento);
        }
        return 0;
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
