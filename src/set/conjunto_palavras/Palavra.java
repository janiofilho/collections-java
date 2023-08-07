package set.conjunto_palavras;

import java.util.Objects;

public class Palavra {

    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palavra palavra1 = (Palavra) o;
        return Objects.equals(palavra, palavra1.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavra);
    }

    @Override
    public String toString() {
        return "palavra{" +
                "palavra='" + palavra + '\'' +
                "}\n";
    }
}
