package set.pesquisa;

import set.conjunto_convidado.Convidado;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContato {
    Set<Contato> agendaContato = new HashSet<>();

    public void adicionarContato(String nome, String numero){
        agendaContato.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agendaContato);
    }

    public void pesquisaPorNome(String nome){
        Set<Contato> contatos = new HashSet<>();
        for(Contato c : agendaContato){
            if(c.getNome().equalsIgnoreCase(nome)){
                contatos.add(c);
            }
        }
        System.out.println(contatos);
    }

    public void atualizarContato(String nome, String numeroAntigo, String numeroNovo){
        for(Contato c : agendaContato){
            if(c.getNome().equalsIgnoreCase(nome) && c.getNumero().equalsIgnoreCase(numeroAntigo)){
                c.setNumero(numeroNovo);
            }
        }
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Janio", "11910039540");
        agendaContato.adicionarContato("Junior", "11910039540");
        agendaContato.adicionarContato("Marcos", "11983517469");
        agendaContato.adicionarContato("Marcos", "11984625650");
        agendaContato.exibirContatos();
//        agendaContato.pesquisaPorNome("Marcos");
        agendaContato.atualizarContato("Janio", "11910039540", "11910101010");
        agendaContato.exibirContatos();

    }
}
