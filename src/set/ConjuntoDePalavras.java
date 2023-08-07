package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {

    Set<Palavra> listPalavra = new HashSet<>();

    public void adicionarPalavra(String palavra){
        listPalavra.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        for(Palavra p : listPalavra){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                listPalavra.remove(p);
                break;
            }
        }
    }

    public Boolean verificarPalavraList(String palavra){
        for(Palavra p : listPalavra){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                return true;
            }
        }
        return false;
    }

    public void exibirPalavras(){
        System.out.println(listPalavra);
    }

    public static void main(String[] args) {
        ConjuntoDePalavras conjuntoDePalavras = new ConjuntoDePalavras();

        conjuntoDePalavras.adicionarPalavra("Teste");
        conjuntoDePalavras.adicionarPalavra("Casa");
        conjuntoDePalavras.adicionarPalavra("Tempestade");
        conjuntoDePalavras.adicionarPalavra("Teste");
        conjuntoDePalavras.adicionarPalavra("Carro");
        System.out.println(conjuntoDePalavras.verificarPalavraList("Teste"));
        conjuntoDePalavras.exibirPalavras();
        conjuntoDePalavras.removerPalavra("Tempestade");
        conjuntoDePalavras.exibirPalavras();
    }
}
