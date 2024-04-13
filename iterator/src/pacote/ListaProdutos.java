package pacote;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaProdutos extends AbstractList{
    ArrayList<Produto> produtos = new ArrayList<>();
    @Override
    public void adicionar(Object o) {
        if (o instanceof Produto){
            produtos.add((Produto)o);
        }

    }

    @Override
    public Iterator iterator() {
        return new IteratorProduto(this);
    }
}
