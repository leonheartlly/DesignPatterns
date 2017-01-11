package impostos;

import strategy.Orcamento;

public interface Imposto {

    double calcula(Orcamento orcamento);
}
