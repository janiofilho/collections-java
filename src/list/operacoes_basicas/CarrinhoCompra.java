package list.operacoes_basicas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    List<Item> listaItens = new ArrayList<>();

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        Item item = new Item(nome, preco, quantidade);
        listaItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> list = new ArrayList<>();
        for(Item item : listaItens){
            if(item.getNome().equalsIgnoreCase(nome)){
                list.add(item);
            }
        }
        listaItens.removeAll(list);
    }

    public String calcularValorTotal(){
        double valor = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        for(Item i : listaItens){
            valor += i.getPreco() * i.getQuantidade();
        }
        return decimalFormat.format(valor);
    }

    public List<Item> exibirItens(){
        return listaItens;
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        System.out.println(carrinhoCompra.exibirItens());
        carrinhoCompra.adicionarItem("Notebook", 1999.9, 1);
        carrinhoCompra.adicionarItem("Computador Gamer", 2599.8, 1);
        carrinhoCompra.adicionarItem("Tablet", 199.9, 1);
        System.out.println(carrinhoCompra.exibirItens());
        carrinhoCompra.removerItem("Tablet");
        System.out.println(carrinhoCompra.exibirItens());
        System.out.println(carrinhoCompra.calcularValorTotal());

    }

}
