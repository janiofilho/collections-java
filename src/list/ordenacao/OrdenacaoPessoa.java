package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa(){
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> list = new ArrayList<>(listaPessoa);
        Collections.sort(list);
        return list;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> list = new ArrayList<>(listaPessoa);
        Collections.sort(list, new ComparatorPorAltura());
        return list;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Junior", 13, 1.50);
        ordenacaoPessoa.adicionarPessoa("Romero", 10, 1.40);
        ordenacaoPessoa.adicionarPessoa("Marcos", 12, 1.52);
        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
