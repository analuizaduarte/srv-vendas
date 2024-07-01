package vendas.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Cliente {
    private Integer id;
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
