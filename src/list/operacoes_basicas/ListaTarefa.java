package list.operacoes_basicas;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefas;

    public ListaTarefa(List<Tarefa> listaTarefas) {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> list = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas){
            if(descricao.equalsIgnoreCase(tarefa.getDescricao())){
                list.add(tarefa);
            }
        }
        listaTarefas.removeAll(list);
    }

    public Integer obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }
}
