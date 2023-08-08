package map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventosMap = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        eventosMap.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento é " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2023, 9, 1), "Evento 1", "Atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2023, 4, 21), "Evento 2", "Atracao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2023, 8, 4), "Evento 3", "Evento 3");
        agendaEvento.adicionarEvento(LocalDate.of(2023, 8, 8), "Evento 4", "Evento 4");
        agendaEvento.adicionarEvento(LocalDate.of(2023, 8, 7), "Evento 5", "Evento 5");
        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();
    }
}
