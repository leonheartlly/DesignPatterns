package desconto;

import item.Desconto;
import item.Orcamento;

/**
 * Usada para finalizar a cade de próximo descontos.
 * 
 * @author lucas.silva
 *
 */
public class SemDesconto implements Desconto {

    /**
     * Não fornece nenhum desconto
     */
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    /**
     * Este metodo nesta classe nao faz nada pois não haverá proximod esconto.
     */
    @Override
    public void setProximo(Desconto proximo) {

    }


}
