package decorator;

import templateMethod.Orcamento;

/**
 * A instancia da classe abstrata recebendo ela mesma permite que se faça a
 * chamada do próximo imposto
 * 
 * @author lucas.silva
 *
 */
public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {

    }

    public abstract double calcula(Orcamento orcamento);

    /**
     * Busca o próximo imposto a se calcular invocando seu calcula.
     * 
     * @param orcamento
     * @return
     */
    protected double calculoDoOutroImposto(Orcamento orcamento) {
        if (outroImposto == null) {// se outro imposto for nulo nao tem outro
                                   // imposto
            return 0;
        }
        return outroImposto.calcula(orcamento);
    }
}
