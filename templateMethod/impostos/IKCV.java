package templateMethod.impostos;

import item.Item;
import item.Orcamento;
import templateMethod.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional {



    private boolean temItemMaiorQueCem(Orcamento orcamento) {
        for(Item item : orcamento.getItens()){
            if(item.getValor() > 100){
                return true;
            }
        }
        return false;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQueCem(orcamento);
    }

}
