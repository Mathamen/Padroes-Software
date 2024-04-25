
package pacote;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProduto implements Iterator {

    private String categoriaAtual;
    private final ArrayList<String> categorias;
    private Produto lastProd;

    private final ListaProdutos lp;

    public IteratorProduto(ListaProdutos lp) {
        this.lp = lp;

        //Tenho que criar esse produto inicial para o Iterator não se perder
        this.lastProd = new Produto("teste1", Double.MIN_VALUE, "Vestuário");
        categorias = new ArrayList<>();

        // Poderia colocar em outro lugar, se fosse necessário
        categorias.add("Vestuário");
        categorias.add("Eletrônicos");
        categorias.add("Remédios");
        categoriaAtual = categorias.get(0);
    }


    @Override
    public boolean hasNext() {
        // loop simples categoria atual
        for (Produto p : lp.produtos) {
            if (p.categoria.equals(categoriaAtual) && p.preco > lastProd.preco) {
                return true;
            }
        }

        // Verifica agora as outras categorias
        int indice = categorias.indexOf(categoriaAtual);
        if (indice < categorias.size() - 1) {
            // Atualiza a categoria atual para a próxima categoria
            categoriaAtual = categorias.get(indice + 1);
            // Reinicia a busca na próxima categoria
            lastProd = new Produto("teste", Double.MIN_VALUE, categoriaAtual); // Produto teste só para começar a comparar, já que trocou a categoria
            return hasNext(); // hasNext para ver a próxima categoria
        }
        return false; // Retorna false se não tem mais categoria ou produto
    }



    @Override
    public Object next() {
        Produto candidato = null;
        for (Produto p : lp.produtos) {
            if (p.categoria.equals(categoriaAtual) && p.preco > lastProd.preco) {
                if (candidato == null || p.preco < candidato.preco) {
                    candidato = p;
                }
            }
        }
        if (candidato != null) {
            lastProd = candidato;
            return lastProd;
        } else {
            // Atualiza a categoria
            int indice = categorias.indexOf(categoriaAtual);
            if (indice < categorias.size() - 1) {
                categoriaAtual = categorias.get(indice + 1);
                // Usando recursão para ver se tem mais produtos em outras categorias
                return hasNext() ? next() : null;
            }
            // Retorna null se não tiver mais categorias
            return null;
        }
    }

}
