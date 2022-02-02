package Set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.

 */
public class ExercicioSet2 {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();
           linguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
           linguagensFavoritas.add(new LinguagemFavorita("C", 1972, "Dev-C++"));
           linguagensFavoritas.add(new LinguagemFavorita("C#", 1999, "Visual Studio"));

        for(LinguagemFavorita linguagem : linguagensFavoritas){
            System.out.println(linguagem.getNome() + " - "
            + linguagem.getAnoDeCriacao() + " - "
            + linguagem.getIDE());

        }

        System.out.println("\nOrdem de Inserção: ");
        Set<LinguagemFavorita> linguagensFavoritas2 = new LinkedHashSet<>(linguagensFavoritas);
        for(LinguagemFavorita linguagem : linguagensFavoritas2){
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - "
                    + linguagem.getIDE());
        }

        System.out.println("\nOrdem Natural (Nome): ");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(linguagensFavoritas);
        for(LinguagemFavorita linguagem : linguagensFavoritas3){
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - "
                    + linguagem.getIDE());
        }

        System.out.println("\nOrdem IDE: ");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new ComparatorIDE());
        linguagensFavoritas4.addAll(linguagensFavoritas);
        for(LinguagemFavorita linguagem : linguagensFavoritas4){
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - "
                    + linguagem.getIDE());
        }

        System.out.println("\nOrdem Ano de Criação e Nome");
        Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<>(new ComparatorAnoNome());
        linguagensFavoritas5.addAll(linguagensFavoritas2);
        for(LinguagemFavorita linguagem : linguagensFavoritas5){
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - "
                    + linguagem.getIDE());
        }

        System.out.println("\nOrdem Nome, Ano de Criação e IDE");
        Set<LinguagemFavorita> linguagensFavoritas6 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagensFavoritas6.addAll(linguagensFavoritas);
        for(LinguagemFavorita linguagem : linguagensFavoritas6){
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - "
                    + linguagem.getIDE());
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(LinguagemFavorita lf) {
        return this.nome.compareTo(lf.nome);
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIDE().compareTo(lf2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int ano = lf1.getAnoDeCriacao().compareTo(lf2.getAnoDeCriacao());
        if(ano != 0)
            return ano;

        return lf1.getNome().compareTo(lf2.getNome());

    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareTo(lf2.getNome());
        int ano = lf1.getAnoDeCriacao().compareTo(lf2.getAnoDeCriacao());

        if(nome != 0)
            return nome;
        if(ano != 0)
            return ano;

        return lf1.getIDE().compareTo(lf2.getIDE());

    }
}