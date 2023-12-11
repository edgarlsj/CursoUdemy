package cursonelio.comparate;

import java.util.Objects;

public class Personagem implements Comparable<Personagem> {
    private Long id;
    private String nome;
    private Integer idade;
    private String estilo;

    public Personagem(Long id, String nome, Integer idade, String estilo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.estilo = estilo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(idade, that.idade) && Objects.equals(estilo, that.estilo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, estilo);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estilo='" + estilo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Personagem outroPersonagem) {
//       metodo que  compare pelo nome
        return this.nome.compareTo(outroPersonagem.nome);

        }



}
