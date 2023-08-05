package list.pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CatagoloLivro {

    List<Livro> catalogoLivro = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogoLivro.add(livro);
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> list = new ArrayList<>();
        for(Livro livro : catalogoLivro){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                list.add(livro);
            }
        }
        return list;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> list = new ArrayList<>();
        for(Livro livro : catalogoLivro){
            if(livro.getPublicacao() >= anoInicial && livro.getPublicacao() <= anoFinal){
                list.add(livro);
            }
        }
        return list;
    }

    public String pesquisaPorTitulo(String titulo) {
        for (Livro livro : catalogoLivro) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro.toString();
            }
        }
        return "Não existe livro com este titulo";
    }

    public static void main(String[] args) {
        CatagoloLivro catagoloLivro = new CatagoloLivro();
        catagoloLivro.adicionarLivro("Star Wars", "Joao Silva", 1998);
        catagoloLivro.adicionarLivro("Star Wars II", "Marcos Filho", 2000);
        catagoloLivro.adicionarLivro("Star Wars III", "Jonas Ribeiro", 2001);
        catagoloLivro.adicionarLivro("Star Wars IV", "Joao Silva", 2005);
        catagoloLivro.adicionarLivro("Star Wars V", "Julia Neta", 2006);
        System.out.println(catagoloLivro.pesquisaPorAutor("Joao Silva"));
        System.out.println(catagoloLivro.pesquisaPorIntervaloAnos(2001, 2005));
        System.out.println(catagoloLivro.pesquisaPorIntervaloAnos(2005, 2006));
        System.out.println(catagoloLivro.pesquisaPorTitulo("Star Wars V"));
        System.out.println(catagoloLivro.pesquisaPorTitulo("Star Wars II22"));
        System.out.println(catagoloLivro.pesquisaPorTitulo("Star Wars IV"));
        System.out.println(catagoloLivro.pesquisaPorTitulo("Star Wars III"));
        System.out.println(catagoloLivro.pesquisaPorTitulo("Star Wars IIII"));
    }
}
