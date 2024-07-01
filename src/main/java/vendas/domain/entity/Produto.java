package vendas.domain.entity;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco;
}
