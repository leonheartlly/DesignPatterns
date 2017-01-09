package memento;

import java.util.Calendar;

/**
 * Design Pattern Memento, used to recover the earlier object state.
 * works like a ctrl+z in a object.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "Lucas", TipoContrato.NOVO);

        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());

        Estado estadoAnterior = historico.pega(1);
        System.out.println(estadoAnterior.getEstado().getTipo());
    }
}
