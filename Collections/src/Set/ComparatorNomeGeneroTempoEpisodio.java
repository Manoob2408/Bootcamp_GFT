package Set;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        int genero = s1.getGenero().compareTo(s2.getGenero());
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        if(nome != 0)
            return nome;
        if(genero != 0)
            return genero;
        if(tempoEpisodio != 0)
            return tempoEpisodio;

        return genero;
    }
}
