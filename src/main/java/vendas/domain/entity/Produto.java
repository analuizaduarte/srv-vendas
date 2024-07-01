package vendas.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco;
}
