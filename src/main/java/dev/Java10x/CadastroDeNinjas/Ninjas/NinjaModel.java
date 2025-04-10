package dev.Java10x.CadastroDeNinjas.Ninjas;

//JPA = JAVA PERSISTENCE API
import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Ele transforma uma classe em uma entidade no Banco de Dados (BD)
@Table (name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}