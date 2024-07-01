package vendas.domain.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ItemPedido {

    private Integer id;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;
}
