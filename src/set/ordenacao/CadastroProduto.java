package set.ordenacao;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    Set<Produto> listProdutos = new HashSet<>();

    public void adicionarProduto(String nome, Long codigo, Double preco, int quantidade){
        listProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> list = new TreeSet<>(listProdutos);
        return list;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtos = new TreeSet<>(new ComparatorPorPreco());
        produtos.addAll(listProdutos);
        return produtos;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Arroz", 1232L, 12.0, 20);
        cadastroProduto.adicionarProduto("Feijao", 3423L, 32.0, 10);
        cadastroProduto.adicionarProduto("Banana", 1938L, 2.0, 90);
        System.out.println(cadastroProduto.exibirPorNome());
        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
