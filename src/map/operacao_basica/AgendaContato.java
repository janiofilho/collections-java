package map.operacao_basica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if(!agendaContatoMap.isEmpty()){
           numero = agendaContatoMap.get(nome);
        }
        return numero;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.adicionarContato("Janio", 1191002000);
        agendaContato.adicionarContato("Junior Silva", 1192828282);
        agendaContato.adicionarContato("Jotinha", 1229999933);
        agendaContato.adicionarContato("Janio", 1239884747);
        agendaContato.adicionarContato("Janio", 1747232323);
        agendaContato.exibirContato();
        agendaContato.removerContato("Jotinha");
        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Janio"));
    }

}
