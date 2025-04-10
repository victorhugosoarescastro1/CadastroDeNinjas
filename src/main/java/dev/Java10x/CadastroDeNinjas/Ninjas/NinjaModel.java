package dev.Java10x.CadastroDeNinjas.Ninjas;

//JPA = JAVA PERSISTENCE API
import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Ele transforma uma classe em uma entidade no Banco de Dados (BD)
@Table (name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String clube;

    private String tecnicas;

    private int rank;

    // @ManyToOne - Muitos ninjas vão fazer uma única missão;
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel(String nome, String clube, String tecnicas, int rank){
        this.nome = nome;
        this.clube = clube;
        this.tecnicas = tecnicas;
        this.rank = rank;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
