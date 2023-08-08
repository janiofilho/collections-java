package map.pesquisa;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutosMap = new HashMap<>();

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirEstoque(){
        System.out.println(estoqueProdutosMap);
    }

    public Double calculaValorTotal(){
        Double total = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto p = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto prod : estoqueProdutosMap.values()){
            if(prod.getPreco() > maiorPreco){
                p = prod;
            }
        }
        return p;
    }

    public static void main(String[] args) {

        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(1L, "Caderno", 10.0, 1);
        estoqueProduto.adicionarProduto(3L, "Cadeira", 20.0, 2);
        estoqueProduto.adicionarProduto(231L, "Short", 5.0, 15);
        estoqueProduto.adicionarProduto(341L, "Mesa", 100.0, 12);
        estoqueProduto.adicionarProduto(12L, "Noteboook", 1200.0, 1);
        estoqueProduto.exibirEstoque();
        System.out.println(estoqueProduto.calculaValorTotal());
        System.out.println(estoqueProduto.obterProdutoMaisCaro());
    }
}
