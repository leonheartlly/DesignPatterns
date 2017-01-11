package templateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import item.Item;

public class Orcamento {

    private double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
