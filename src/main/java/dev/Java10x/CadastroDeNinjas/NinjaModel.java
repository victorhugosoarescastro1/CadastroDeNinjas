package dev.Java10x.CadastroDeNinjas;

//JPA = JAVA PERSISTENCE API
import jakarta.persistence.*;

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

    public NinjaModel(){
    }

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
