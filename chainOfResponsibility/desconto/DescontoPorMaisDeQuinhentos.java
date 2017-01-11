package desconto;

import item.Desconto;
import item.Orcamento;

public class DescontoPorMaisDeQuinhentos implements Desconto {

    private Desconto proximo;

    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.7;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
