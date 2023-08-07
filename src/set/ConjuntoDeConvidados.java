package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {

    Set<Convidado> listConvidado;

    public ConjuntoDeConvidados(){
        this.listConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        listConvidado.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidado convidado = null;
        for(Convidado c : listConvidado){
            if(c.getCodigoConvite() == codigo){
                convidado = c;
                System.out.println("Convidado " + codigo + " removido com sucesso");
                break;
            }
        }
        listConvidado.remove(convidado);
    }

    public void exibirTodosOsConvidados(){
        System.out.println(listConvidado);
    }

    public void contarConvidados(){
        System.out.println(listConvidado.size());
    }

    public static void main(String[] args) {
        ConjuntoDeConvidados conjuntoDeConvidados = new ConjuntoDeConvidados();

        conjuntoDeConvidados.adicionarConvidado("Janio", 1232);
        conjuntoDeConvidados.adicionarConvidado("Janio", 1893);
        conjuntoDeConvidados.adicionarConvidado("Ruebens", 1232);
        conjuntoDeConvidados.adicionarConvidado("Junior", 1938);
        conjuntoDeConvidados.adicionarConvidado("Matheus", 220);
        conjuntoDeConvidados.adicionarConvidado("Jorge", 220);
        conjuntoDeConvidados.exibirTodosOsConvidados();
        conjuntoDeConvidados.removerConvidadoPorCodigo(1232);
        conjuntoDeConvidados.exibirTodosOsConvidados();
        conjuntoDeConvidados.contarConvidados();

    }
}
