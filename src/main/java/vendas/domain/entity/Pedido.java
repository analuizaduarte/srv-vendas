package vendas.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class Pedido {

    private Integer id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private BigDecimal total;
}
