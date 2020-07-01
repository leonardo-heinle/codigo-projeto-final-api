package heinle.leonardo.projetofinalapi.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Leonardo Heinle
 * @version 1.0
 */

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Component

@Entity
@Table(name = "acao")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acao")
    private long id;

    @Column(name = "empresa")
    @NotBlank(message = "Não pode! Insira o nome da empresa")
    private String company;

    @Column(name = "codigo_negociacao")
    @NotBlank(message = "Não pode! Insira o Código de negociação da ação na B3")
    private String negociationCode;

    @Column(name = "setor")
    @NotBlank(message = "Não pode! Insira o setor que a empresa atua")
    private String sector;

    @Column(name = "tipo_acao")
    @NotBlank(message = "Não pode! Insira o tipo de ação")
    private String stockType;

    @Column(name = "dividend_yield")
    @NotNull(message = "Não pode! Insira o Dividend Yield!")
    private double dividendYield;
}
