package desconto;

import item.Desconto;
import item.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;

    }

}
